package persistencia;

import java.sql.*;
import java.util.ArrayList;
import modelo.Aluno;

public class DaoPessoa extends DAO {

    private DaoEndereco daoEndereco;

    public DaoPessoa() {
        daoEndereco = new DaoEndereco();
    }

    public ArrayList<Aluno> carregarAlunos() {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        try {
            String sql = """
                         SELECT * FROM aluno 
                         left join endereco as ed on fk_endereco = ed.id_endereco""";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Aluno p = new Aluno();
                p.setId(rs.getInt("id_aluno"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    p.getEndereco().setId(rs.getInt("id_endereco"));
                    p.getEndereco().setCidade(rs.getString("cidade"));
                    p.getEndereco().setRua(rs.getString("rua"));
                }
                listaAlunos.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar alunos!\n" + e.getMessage());
        }
        return listaAlunos;
    }

    public Aluno carregarPorId(int idAluno) {
        Aluno cl = null;
        try {
            String sql = "SELECT * FROM aluno \n"
                    + "left join endereco as ed on fk_endereco = ed.id_endereco"
                    + " where aluno.id = " + idAluno;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Aluno();
                cl.setId(rs.getInt("id_aluno"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getString("cpf"));

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    cl.getEndereco().setId(rs.getInt("id_endereco"));
                    cl.getEndereco().setCidade(rs.getString("cidade"));
                    cl.getEndereco().setRua(rs.getString("rua"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar aluno!\n"
                    + e.getMessage());
        }
        return cl;
    }

    public boolean salvar(Aluno aluno) {
        try {
            String sql = "INSERT INTO public.aluno(\n"
                    + " id, nome, cpf, id_endereco)\n"
                    + " VALUES (?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            aluno.setId(gerarProximoId("aluno"));
            ps.setInt(1, aluno.getId());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getCpf());

            if (aluno.getEndereco() != null) {
                if (aluno.getEndereco().getId() == null || aluno.getEndereco().getId() == 0) {
                    daoEndereco.salvar(aluno.getEndereco());
                }
                ps.setInt(5, aluno.getEndereco().getId());
            } else {
                ps.setObject(5, null);
            }
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Aluno\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Aluno aluno) {
        try {
            String sql = "UPDATE public.aluno\n"
                    + "SET nome=?, cpf=?, id_endereco=? \n"
                    + " WHERE id= " + aluno.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            
            if (aluno.getEndereco() != null) {
                if (aluno.getEndereco().getId() != null) {
                    daoEndereco.salvar(aluno.getEndereco());
                } else {
                    daoEndereco.atualizar(aluno.getEndereco());
                }
                ps.setInt(4, aluno.getEndereco().getId());
            } else {
                ps.setObject(4, null);
            }

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar aluno!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(Aluno aluno) {
        try {
            String sql = "DELETE FROM public.aluno\n"
                    + " WHERE id =" + aluno.getId()
                    + "; " + daoEndereco.comandoSqlRemover(aluno.getEndereco());

            executeSql(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover aluno!\n" + e.getMessage());
            return false;
        }
    }
}
