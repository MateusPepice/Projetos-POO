package controle;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Pessoa;
import util.Input;

public class CadastroAluno {
    public static ArrayList<Aluno> listaAlunos = new ArrayList<>();
    
    public static void setarDados(Aluno aluno){
        CadastroPessoa.setarDados(aluno);
        System.out.println("MATRÍCULA:");
        aluno.setMatricula(Input.nextLine());
        System.out.println("NOTA.....:");
       
    }

    public static void cadastrar(){
        Aluno aluno = new Aluno();
        setarDados(aluno);
        listaAlunos.add(aluno);
    }
    
    public static void excluir(){
        Aluno aluno = pesquisar();
        
        if(aluno == null){
            System.out.println("\nSaindo do método...");
            return;
        }
        
        listaAlunos.remove(aluno);
        System.out.println("\nCadastrado excluido.");
    }
    
    public static Aluno pesquisar(){
        System.out.println("Informe a matrícula de quem deseja excluir:");
        String matricula = Input.nextLine();
        
        for (Aluno listaAluno : listaAlunos) {
            if(listaAluno.getMatricula().equals(matricula)){
                return listaAluno;
            }
        }
        
        System.out.println("\nRegistro não encontrado!");
        return null;
    }
    
    public static void listarCadastrados(){
        if(listaAlunos == null || listaAlunos.isEmpty()){
            System.out.println("\nNão há registros de alunos cadastrados!");
            return;
        }
        
        for (Aluno listaAluno : listaAlunos) {
            System.out.println(listaAluno);
        }
    }
    
    public static void editar(){
        Aluno novo_aluno = pesquisar();
        
        if(novo_aluno == null){
            return;
        }
        
        setarDados(novo_aluno);
        listaAlunos.add(listaAlunos.indexOf(novo_aluno), novo_aluno);
        listaAlunos.remove(novo_aluno);
        
    }
}
