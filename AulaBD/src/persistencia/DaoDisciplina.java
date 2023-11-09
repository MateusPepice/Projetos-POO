package persistencia;

import java.sql.*;
import java.util.ArrayList;
import modelo.Disciplina;

public class DaoDisciplina extends DAO{
    
    private DaoCurso daoCurso;
    
    public ArrayList<String> disciplinasCurso(Integer fk_curso){
        try{
            String sql = "SELECT disciplina.nome FROM disciplina\n" 
                    +"inner join curso on curso.id_curso = disciplina.fk_curso "
                    +"where fk_curso = "+fk_curso;
            ResultSet rs = consultaSQL(sql);
            ArrayList<String> nomeDisciplinas = new ArrayList();
            while(rs.next()){    
                nomeDisciplinas.add(rs.getString("nome"));
            }
            return nomeDisciplinas;
        }catch (SQLException ex){
            System.out.println("Falha ao carregar cursos!\n"+ ex.getMessage());
        }
        return null;
    }
    
    public ArrayList<Disciplina> carregarDisciplinas(){
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        try {
            String sql = "select * from disciplina";
            ResultSet rs = consultaSQL(sql);
            while(rs.next()){
                Disciplina dis = new Disciplina();
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                dis.setNome(rs.getString("nome"));
                dis.setCargaHoraria(rs.getInt("cargaHoraria"));
                dis.setSemestre(rs.getInt("semestre"));
                
                disciplinas.add(dis);
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao carregar disciplinas!\n"+ ex.getMessage());
        }
        return disciplinas;
    }
    
    public Disciplina carregarDisciplinaPorId(int id_disciplina){
        Disciplina dis = null;
        try {
            String sql = "select * from disciplina where id_disciplina = "+id_disciplina;
            ResultSet rs = consultaSQL(sql);
            if(rs.next()){
                dis = new Disciplina();
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                dis.setNome(rs.getString("nome"));
                dis.setCargaHoraria(rs.getInt("cargaHoraria"));
                dis.setSemestre(rs.getInt("semestre"));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao carregar disciplina!\n"+ ex.getMessage());
        }
        return dis;
    }
    
    public boolean salvar(Disciplina dis){
        try {
            String sql = """
                         INSERT INTO disciplina(
                         id_disciplina, nome, cargaHoraria, semestre, fk_curso)
                         VALUES (?, ?, ?, ?, ?);""";
            
            PreparedStatement ps = criarPreparedStatement(sql);
            dis.setId_disciplina(gerarProximoId("disciplina", "id_disciplina"));
            ps.setInt(1, dis.getId_disciplina());
            ps.setString(2, dis.getNome());
            ps.setInt(3, dis.getCargaHoraria());
            ps.setInt(4, dis.getSemestre());
            
            if (dis.getFk_curso() != null) {
                if (dis.getFk_curso().getId_curso()== null || dis.getFk_curso().getId_curso() == 0) {
                    daoCurso.salvar(dis.getFk_curso());
                }
                ps.setInt(5, dis.getFk_curso().getId_curso());
            } else {
                ps.setObject(5, null);
            }
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Falha ao salvar disciplina\n" + ex.getMessage());
            return false;
        }
    }
    
    public boolean atualizar(Disciplina dis){
        try {
            String sql = """
                         UPDATE disciplina
                         SET nome=?, cargaHoraria=?, semestre=?, fk_curso=? 
                         WHERE id_disciplina ="""+dis.getId_disciplina();
            
            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, dis.getNome());
            ps.setInt(2, dis.getCargaHoraria());
            ps.setInt(3, dis.getSemestre());
            
            if (dis.getFk_curso() == null) {
                if (dis.getFk_curso().getId_curso() == null) {
                    daoCurso.salvar(dis.getFk_curso());
                } else {
                    daoCurso.atualizar(dis.getFk_curso());
                }
                ps.setInt(4, dis.getFk_curso().getId_curso());
            } else {
                ps.setObject(4, null);
            }
                        
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Falha ao editar disciplina\n" + ex.getMessage());
            return false;
        }
    }
    
    public String comandoSqlRemover(Disciplina dis){
        return "DELETE FROM disciplina WHERE id_disciplina = "+dis.getId_disciplina();
    }
    
    public boolean remover(Disciplina dis){
        try {
            executeSql(comandoSqlRemover(dis));
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover disciplina\n"+e.getMessage());
            return false;
        }
    }
}
