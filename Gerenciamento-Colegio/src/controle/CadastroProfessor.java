package controle;

import java.util.ArrayList;
import modelo.Professor;
import util.Input;

public class CadastroProfessor {
    private static ArrayList<Professor> listaProfessores = new ArrayList<>();
    
    public static void setarDados(Professor professor){
        CadastroPessoa.setarDados(professor);
        System.out.println("DISCIPLINA:");
        professor.setDisciplina(Input.nextLine());
    }
    
    public static void cadastrar(){
        Professor professor = new Professor();
        setarDados(professor);
        listaProfessores.add(professor);
    }
    
    public static void excluir(){
        Professor professor = pesquisar();
        
        if(professor == null){
            System.out.println("\nSaindo do método...");
            return;
        }
        
        listaProfessores.remove(professor);
        System.out.println("\nCadastro excluido.");
    }
    
    public static Professor pesquisar(){
        System.out.println("Informe a matrícula do professor que deseja excluir:");
        String matricula = Input.nextLine();
        
        for (Professor listaProfessor: listaProfessores) {
            if(listaProfessor.getMatricula().equals(matricula)){
                return listaProfessor;
            }
        }
        
        System.out.println("\nRegistro não encontrado!");
        return null;
    }
        
    public static void listarCadastrados(){
    
    }
    
    public static void mostrarCadastrados(){
        if(listaProfessores == null || listaProfessores.isEmpty()){
            System.out.println("\nNão há registros de prfoessores cadastrados!");
            return;
        }

        for (Professor listaProfessores : listaProfessores) {
            System.out.println(listaProfessores);
        }
    }
    
    public static void editar(){
        Professor novo_professor = pesquisar();
        
        if(novo_professor == null){
            return;
        }
        
        setarDados(novo_professor);
        listaProfessores.add(listaProfessores.indexOf(novo_professor), novo_professor);
        listaProfessores.remove(novo_professor);
        
    }
}
