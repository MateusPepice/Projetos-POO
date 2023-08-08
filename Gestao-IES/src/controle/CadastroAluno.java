
package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import modelo.Aluno;
import modelo.Curso;
import modelo.Pessoa;
import util.Input;

public class CadastroAluno {
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static boolean vazio(){
       if(alunos.isEmpty()){
            System.out.println("SEM REGISTROS!");
            return true;
       } 
       return false;
    }
    public static void setarDados(Aluno aluno){
        CadastroPessoa.setarDados(aluno);
        
        System.out.println("RA:");
        aluno.setRa(Input.nextLine());
        System.out.println("SITUACAO:");
        aluno.setSituacao(Input.nextLine());
        System.out.println("DATA DE MATRICULA:");  
        aluno.setDataMatricula(Input.nextLocalDate());
    }
    
    public static void cadastrar(){
        Aluno aluno = new Aluno();
        setarDados(aluno);
        alunos.add(aluno);
        System.out.println("ALUNO CADASTRADO!");
    }
    
    public static void deletar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) alunos.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Aluno aluno = (Aluno) CadastroPessoa.pesquisar(pessoas);
        if(aluno == null){
            System.out.println("ALUNO NAO ENCONTRADO!");
            return;
        }     
        alunos.remove(aluno);
        System.out.println("ALUNO REMOVIDO!");
    }
    
    public static void exibir(){
        if(vazio()) return;
        
        System.out.println("INFORME O CPF A SER BUSCADO:");
        String cpf = Input.nextLine();
        Aluno aluno = alunos.stream().filter(i -> i.getCpf().equals(cpf)).findFirst().orElse(null);
        if(aluno == null){
            System.out.println("ALUNO NAO ENCONTRADO!");
            return;
        }
        System.out.println(aluno.exibirInformacoes());
    }
    
    public static void alterar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) alunos.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Aluno aluno = (Aluno) CadastroPessoa.pesquisar(pessoas);

        int opcao;
        do{
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - NOME");
            System.out.println("2 - CPF");
            System.out.println("3 - DATA DE NASCIMENTO");
            System.out.println("4 - ENDERECO");
            System.out.println("5 - RA");
            System.out.println("6 - SITUACAO");
            System.out.println("7 - DATA DE MATRICULA");
            opcao = Input.nextInt();
            if(opcao < 7 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 7 && opcao > 1);
        
        System.out.println("INFORME:");
        switch (opcao){
            case 1 -> aluno.setNome(Input.nextLine());
            case 2 -> aluno.setCpf(Input.nextLine());
            case 3 -> aluno.setDataNascimento(Input.nextLocalDate());
            case 4 -> alterarEndereco(aluno);
            case 5 -> aluno.setRa(Input.nextLine());
            case 6 -> aluno.setSituacao(Input.nextLine());
            case 7 -> aluno.setDataMatricula(Input.nextLocalDate());
        }

        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void alterarEndereco(Aluno aluno){
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
            case 1 -> aluno.getEndereco().setCidade(Input.nextLine());
            case 2 -> aluno.getEndereco().setRua(Input.nextLine());
            case 3 -> aluno.getEndereco().setNumero(Input.nextLine());
        }
        
        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void listarCadastros(){
        if(vazio()) return;
        
        System.out.println("1 - ORDEM CRESCENTE");
        System.out.println("2 - ORDEM DECRESCENTE");
        int resposta = Input.nextInt();
        
        if(resposta == 1){
            Collections.sort(alunos);
            for (Aluno aluno : alunos) {
                System.out.println(aluno.exibirInformacoes());
            }
        }else{
            Collections.sort(alunos);
            Collections.reverse(alunos);
            for (Aluno aluno : alunos) {
                System.out.println(aluno.exibirInformacoes());
            }
        }
    }
}