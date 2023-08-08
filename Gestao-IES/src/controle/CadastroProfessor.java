
package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import modelo.Pessoa;
import modelo.Professor;
import util.Input;

public class CadastroProfessor {
    public static ArrayList<Professor> professores = new ArrayList<>();
    
   public static boolean vazio(){
       if(professores.isEmpty()){
            System.out.println("SEM REGISTROS!");
            return true;
       } 
       return false;
    }
    public static void setarDados(Professor professor){
        CadastroPessoa.setarDados(professor);
        
        System.out.println("FORMACAO:");
        professor.setFormacao(Input.nextLine());
    }
    
    public static void cadastrar(){
        Professor professor = new Professor();
        setarDados(professor);
        professores.add(professor);
        System.out.println("PROFESSOR CADASTRADO!");
    }
    
    public static void deletar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) professores.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Professor professor = (Professor) CadastroPessoa.pesquisar(pessoas);
        if(professor == null){
            System.out.println("PROFESSOR NAO ENCONTRADO!");
            return;
        }     
        professores.remove(professor);
        System.out.println("PROFESSOR REMOVIDO!");
    }
    
    public static void exibir(){
        if(vazio()) return;
        
        System.out.println("INFORME O CPF A SER BUSCADO:");
        String cpf = Input.nextLine();
        Professor professor = professores.stream().filter(i -> i.getCpf().equals(cpf)).findFirst().orElse(null);
        if(professor == null){
            System.out.println("PROFESSOR NAO ENCONTRADO!");
            return;
        }
        System.out.println(professor.exibirInformacoes());
    }
    
    public static void alterar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) professores.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Professor professor = (Professor) CadastroPessoa.pesquisar(pessoas);

        int opcao;
        do{
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - NOME");
            System.out.println("2 - CPF");
            System.out.println("3 - DATA DE NASCIMENTO");
            System.out.println("4 - ENDERECO");
            System.out.println("5 - FORMACAO");
            opcao = Input.nextInt();
            if(opcao < 5 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 5 && opcao > 1);
        
        System.out.println("INFORME:");
        switch (opcao){
            case 1 -> professor.setNome(Input.nextLine());
            case 2 -> professor.setCpf(Input.nextLine());
            case 3 -> professor.setDataNascimento(Input.nextLocalDate());
            case 4 -> alterarEndereco(professor);
            case 5 -> professor.setFormacao(Input.nextLine());
        }

        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void alterarEndereco(Professor professor){
        int opcao;
        do{  
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - CIDADE");
            System.out.println("2 - RUA");
            System.out.println("3 - NUMERO");
            opcao = Input.nextInt();
            if(opcao < 3 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 3 && opcao > 1);
        
        System.out.println("INFORME:");
        switch(opcao){
            case 1 -> professor.getEndereco().setCidade(Input.nextLine());
            case 2 -> professor.getEndereco().setRua(Input.nextLine());
            case 3 -> professor.getEndereco().setNumero(Input.nextLine());
        }
        
        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void listarCadastros(){
        if(vazio()) return;
        
        System.out.println("1 - ORDEM CRESCENTE");
        System.out.println("2 - ORDEM DECRESCENTE");
        int resposta = Input.nextInt();
        
        if(resposta == 1){
            Collections.sort(professores);
            for (Professor professor : professores) {
                System.out.println(professor.exibirInformacoes());
            }
        }else{
            Collections.sort(professores);
            Collections.reverse(professores);
            for (Professor professor : professores) {
                System.out.println(professor.exibirInformacoes());
            }
        }
    }
}
