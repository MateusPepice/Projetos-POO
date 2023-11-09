package persistencia;

import java.sql.*;
import java.util.ArrayList;
import modelo.Aluno;

public class DaoAluno extends DAO {

    private DaoPessoa daoPessoa;
    private DaoEndereco daoEndereco;
    private DaoCurso daoCurso;

    public DaoAluno() {
        daoPessoa = new DaoPessoa();
    }

    public ArrayList<Aluno> carregarAlunos() {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        try {
            String sql = """
                         SELECT p.*, a.*, ed.*, c.nome as nome_curso FROM pessoa as p
                          inner join aluno as a on a.id_pessoa = p.id_pessoa
                          left join endereco as ed on fk_endereco = ed.id_endereco
                          left join curso as c on c.id_curso = a.fk_curso""";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Aluno p = new Aluno();
                daoPessoa.lerResultSet(p, rs);
                 // Arrumar o resultset para pegar os valores do curso e setar em aluno
                if (rs.getObject("fk_curso", Integer.class) != null) {
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
            String sql = "INSERT INTO aluno\n"
                    + " (id_aluno, nome, cpf, fk_endereco, fk_curso)\n"
                    + " VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            aluno.setId(gerarProximoId("aluno", "id_aluno"));
            ps.setInt(1, aluno.getId());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getCpf());

            if (aluno.getEndereco() != null) {
                if (aluno.getEndereco().getId() == null || aluno.getEndereco().getId() == 0) {
                    daoEndereco.salvar(aluno.getEndereco());
                }
                ps.setInt(4, aluno.getEndereco().getId());
            } else {
                ps.setObject(4, null);
            }
            if (aluno.getCurso()!= null) {
                if (aluno.getCurso().getId_curso()== null || aluno.getCurso().getId_curso() == 0) {
                    daoCurso.salvar(aluno.getCurso());
                }
                ps.setInt(5, aluno.getCurso().getId_curso());
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
            String sql = "UPDATE aluno\n"
                    + "SET nome=?, cpf=?, fk_endereco=?, fk_curso=? \n"
                    + " WHERE id_aluno= " + aluno.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            
            if (aluno.getEndereco() == null) {
                if (aluno.getEndereco().getId() == null) {
                    daoEndereco.salvar(aluno.getEndereco());
                } else {
                    daoEndereco.atualizar(aluno.getEndereco());
                }
                ps.setInt(3, aluno.getEndereco().getId());
            } else {
                ps.setObject(3, null);
            }
            
            if (aluno.getCurso() == null) {
                if (aluno.getCurso().getId_curso() == null) {
                    daoCurso.salvar(aluno.getCurso());
                } else {
                    daoCurso.atualizar(aluno.getCurso());
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
            String sql = "DELETE FROM aluno WHERE id_aluno =" + aluno.getId();

            executeSql(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover aluno!\n" + e.getMessage());
            return false;
        }
    }
}
