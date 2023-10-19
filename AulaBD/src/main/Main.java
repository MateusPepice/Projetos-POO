package main;

import persistencia.DatabaseConnection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

public class Main {
    
    
    public static void main(String[] args) {  
        List<Aluno> alunos = new ArrayList<>();
        try{
            DatabaseConnection.getConnection();
            Statement st = DatabaseConnection.getConnection().createStatement();
            //st.executeUpdate("delete from aluno where (id_aluno = 1)");
            /*st.executeUpdate("insert into aluno (id_aluno, nome, cpf)"
                    + "values (3, 'João', '987654')");*/
            ResultSet rs = st.executeQuery("select * from aluno");
            while(rs.next()){
                int id_aluno = rs.getInt("id_aluno");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                
                Aluno al = new Aluno();
                al.setId_aluno(id_aluno);
                al.setNome(nome);
                al.setCpf(cpf);

                alunos.add(al);
                
                System.out.println("\nID_ALUNO: "+id_aluno);
                System.out.println("NOME: "+nome);
                System.out.println("CPF: "+cpf);
            }
            st.close();
            //DatabaseConnection.getConnection().commit();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            System.out.println("Erro!\n"+ex.getMessage());
        }
        
        System.out.println("\n=======================");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
}
