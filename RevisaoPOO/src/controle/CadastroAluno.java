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
        novoAluno.setSituacao(Input.nextLine());
    }
    
    public static void cadastrarAluno(){
        Aluno novoAluno = new Aluno();
        setarDados(novoAluno);
        alunos.add(novoAluno);
        System.out.println("PESSOA CADASTRADA COM SUCESSO!");
    }
    
    public static void PesquisarAlunoCpf(String dado){
        int contador = 0;
        System.out.println("\nRESULTADOS ENCONTRADOS:");
        for (Aluno aluno : alunos) {
            if(aluno.getCpf().contains(dado)){
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
            for (Pessoa pessoa : alunos) {
                pessoa.exibirInformacoes();
            }
        } else {
            Collections.sort(pessoas);
            Collections.reverse(pessoas);
            for (Pessoa pessoa : pessoas) {
                pessoa.exibirInformacoes();
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
