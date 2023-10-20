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
    /* o idAluno e id_endereco está como auto increment. Considerando que a atividade não exige 
    altas complexidades de código, as funções CRUD foram feitas manualmente.
    */
    public static void main(String[] args) {  
        List<Aluno> alunos = new ArrayList<>();
        try{
            DatabaseConnection.getConnection();
            Statement st = DatabaseConnection.getConnection().createStatement();
            
            // INSERINDO ENDEREÇOS
            /*st.executeUpdate("insert into endereco (cidade, rua, numero) "
                    + "values ('Cascavel', 'Voluntario da Patria', '1234')");
            st.executeUpdate("insert into endereco (cidade, rua, numero) "
                    + "values ('Curitiba', 'Sei la', '4321')");
            st.executeUpdate("insert into endereco (cidade, rua, numero) "
                    + "values ('Cascavel', 'Nao sei', '1122')");*/
            
            // INSERINDO ALUNOS
            /*st.executeUpdate("insert into aluno (nome, cpf, fk_endereco)"
                    + "values ('Mateus', '123456789', 1)");
            st.executeUpdate("insert into aluno (nome, cpf, fk_endereco)"
                    + "values ('Pepice', '987654321', 3)");
            st.executeUpdate("insert into aluno (nome, cpf, fk_endereco)"
                    + "values ('Mateus Pepice', '112233445', 1)");*/
            
            // EXCLUINDO ALUNOS QUE MORAM NO ENDEREÇO DE ID 1
            // st.executeUpdate("delete from aluno where fk_endereco = 1");
            
            // ALTERANDO O NOME DA CIDADE ONDE O ID É 1
            /*st.executeUpdate("update endereco set cidade = 'Cidade Alterada'"
                    + "where (id_endereco = 1)");*/
            //ResultSet rs = st.executeQuery("select * from ");
            st.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            System.out.println("Erro!\n"+ex.getMessage());
        }
        System.out.println("\n=======================");
    }

    
}
