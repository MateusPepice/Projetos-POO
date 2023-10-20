package main;

import persistencia.DatabaseConnection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import util.Input;

public class Main {
    public static DatabaseConnection.getConnection();
    Statement st = DatabaseConnection.getConnection().createStatement();
    
    public static void main(String[] args) {  
        List<Aluno> alunos = new ArrayList<>();
        try{
            ResultSet rs = st.executeQuery("select ");
            while(rsEndereco.next()){
                /*int id_aluno = rs.getInt("id_aluno");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                
                Aluno al = new Aluno();
                al.setId_aluno(id_aluno);
                al.setNome(nome);
                al.setCpf(cpf);

                alunos.add(al);
                
                System.out.println("\nID_ALUNO: "+id_aluno);
                System.out.println("NOME: "+nome);
                System.out.println("CPF: "+cpf);*/
                
                System.out.println(rsEndereco.getInt("id_endereco"));
            }
            st.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            System.out.println("Erro!\n"+ex.getMessage());
        }
        
        System.out.println("\n=======================");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    public static void inserir(){
        System.out.println("NOME:");
        String nome = Input.nextLine();
        System.out.println("CPF:");
        String cpf = Input.nextLine();
        System.out.println("CIDADE:");
        String cidade = Input.nextLine();
        System.out.println("RUA:");
        String rua = Input.nextLine();
        System.out.println("NUMERO:");
        String numero = Input.nextLine();
    }

}
