package persistencia;

import java.sql.*;
import java.util.ArrayList;
import modelo.Curso;

public class DaoCurso extends DAO{
    public ArrayList<Curso> carregarCursos(){
        ArrayList<Curso> cursos = new ArrayList<>();
        try {
            String sql = "select * from curso";
            ResultSet rs = consultaSQL(sql);
            while(rs.next()){
                Curso cur = new Curso();
                cur.setId_curso(rs.getInt("id_curso"));
                cur.setNome(rs.getString("nome"));
                cur.setCargaHoraria(rs.getString("cargaHoraria"));
                cur.setQtdSemestres(rs.getString("qtdSemestres"));
                
                cursos.add(cur);
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao carregar cursos!\n"+ ex.getMessage());
        }
        return cursos;
    }
    
    public Curso carregarCursoPorId(int id_curso){
        Curso cur = null;
        try {
            String sql = "select * from curso where id_curso = "+id_curso;
            ResultSet rs = consultaSQL(sql);
            if(rs.next()){
                cur = new Curso();
                cur.setId_curso(rs.getInt("id_curso"));
                cur.setNome(rs.getString("nome"));
                cur.setCargaHoraria(rs.getString("cargaHoraria"));
                cur.setQtdSemestres(rs.getString("qtdSemestres"));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao carregar curso!\n"+ ex.getMessage());
        }
        return cur;
    }
    
    public boolean salvar(Curso cur){
        try {
            String sql = """
                         INSERT INTO curso(
                         id_curso, nome, cargaHoraria, qtdSemestres)
                         VALUES (?, ?, ?, ?);""";
            
            PreparedStatement ps = criarPreparedStatement(sql);
            cur.setId_curso(gerarProximoId("curso", "id_curso"));
            ps.setInt(1, cur.getId_curso());
            ps.setString(2, cur.getNome());
            ps.setString(3, cur.getCargaHoraria());
            ps.setString(4, cur.getQtdSemestres());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Falha ao salvar curso\n" + ex.getMessage());
            return false;
        }
    }
    
    public boolean atualizar(Curso cur){
        try {
            String sql = """
                         UPDATE curso
                         SET nome=?, cargaHoraria=?, qtdSemestres=?
                         WHERE id_endereco ="""+cur.getId_curso();
            
            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, cur.getNome());
            ps.setString(2, cur.getCargaHoraria());
            ps.setString(3, cur.getQtdSemestres());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Falha ao editar curso\n" + ex.getMessage());
            return false;
        }
    }
    
    public String comandoSqlRemover(Curso cur){
        return "DELETE FROM curso WHERE id_curso = "+cur.getId_curso();
    }
    
    public boolean remover(Curso cur){
        try {
            executeSql(comandoSqlRemover(cur));
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover curso\n"+e.getMessage());
            return false;
        }
    }
}
