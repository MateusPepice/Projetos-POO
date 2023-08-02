package controle;

import static controle.CadastroPessoa.SetarPessoa;
import static controle.CadastroPessoa.pessoas;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Aluno;
import modelo.Pessoa;
import util.Input;

public class CadastroAluno {
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static void setarDados(Aluno novoAluno){
        CadastroPessoa.SetarPessoa(novoAluno);
        System.out.println("RA:");
        novoAluno.setRA(Input.nextLine());
        System.out.println("CURSO:");
        novoAluno.setCurso(Input.nextLine());
        System.out.println("DATA DA MATRICULA:");
        novoAluno.setDataMatricula(Input.nextLocalDate());
        System.out.println("SITUACAO:");
        System.out.println("1 - EM ANDAMENTO");
        System.out.println("2 - CONCLUIDO");
        System.out.println("3 - TRANCADA");
        System.out.println("4 - DESISTENTE");
        int situacao = Input.nextInt();
            switch(situacao){
                case 1 -> novoAluno.setSituacao("EM ANDAMENTO");
                case 2 -> novoAluno.setSituacao("CONCLUIDO");
                case 3 -> novoAluno.setSituacao("TRANCADA");
                case 4 -> novoAluno.setSituacao("DESISTENTE");
                default -> System.out.println("OPCAO INVALIDA!");
            }

    }
    
    public static void cadastrarAluno(){
        Aluno novoAluno = new Aluno();
        setarDados(novoAluno);
        alunos.add(novoAluno);
        System.out.println("PESSOA CADASTRADA COM SUCESSO!");
    }
    
    public static void PesquisarAlunoRa(String dado){
        int contador = 0;
        System.out.println("\nRESULTADOS ENCONTRADOS:");
        for (Aluno aluno : alunos) {
            if(aluno.getRA().contains(dado)){
                System.out.println(aluno);
                contador++;
            }
        }
        System.out.printf("TOTAL: " + contador);
    }
    public static void PesquisarAlunoNome(String dado){
        int contador = 0;
        System.out.println("RESULTADOS ENCONTRADOS:");
        for (Aluno aluno : alunos) {
            if(aluno.getNome().contains(dado)){
                System.out.println(aluno);
                contador++;
            }
        }
        System.out.printf("TOTAL: " + contador);
    }
    
    public static void listarAluno(int ordem){
        if (ordem == 1){
            Collections.sort(alunos);
            for (Aluno aluno : alunos) {
                aluno.exibirInformacoes();
            }
        } else {
            Collections.sort(alunos);
            Collections.reverse(alunos);
            for (Aluno aluno : alunos) {
                aluno.exibirInformacoes();
            }
            
        }
    }
    
    public static Aluno buscaAluno(String ra){
        for (Aluno aluno : alunos) {
            if(aluno.getRA().equals(ra)){
                return aluno;
            }
        }
        return null;
    }
    
    public static void RemoverAlunoRa(String ra){
        int indice = 0;
        Aluno a = buscaAluno(ra);
        if(a == null){
            System.out.println("ALUNO NAO ENCONTRADO!");
            return;
        }
        
        alunos.remove(a);
        System.out.println("ALUNO REMOVIDO!");
    }
}
