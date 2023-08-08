
package controle;

import java.util.ArrayList;
import modelo.Curso;
import util.Input;

public class CadastroCurso {
    public static ArrayList<Curso> cursos = new ArrayList<>();
    
    public static boolean vazio(){
       if(cursos.isEmpty()){
            System.out.println("SEM REGISTROS!");
            return true;
       } 
       return false;
    }
    public static void setarDados(Curso curso){
        System.out.println("NOME:");
        curso.setNome(Input.nextLine());
        System.out.println("CARGA HORÁRIA:");
        curso.setCargaHoraria(Input.nextInt());
        System.out.println("SEMESTRES:");  
        curso.setQtdSemestres(Input.nextInt());
    }
    
    public static void cadastrar(){
        Curso curso = new Curso();
        setarDados(curso);
        cursos.add(curso);
        System.out.println("CURSO CADASTRADO!");
    }
    
    public static void deletar(){
        if(vazio()) return;
        
        Curso curso = pesquisar();
        if (curso == null){
            System.out.println("CURSO NAO ENCONTRADO!");
            return;
        }
        cursos.remove(curso);
    }
    
    public static Curso pesquisar(){
        System.out.println("INFORME O NOME DO CURSO:");
        String nome = Input.nextLine();
        for (Curso curso : cursos) {
            if(curso.getNome().equals(nome)){
                return curso;
            }
        }
        return null;
    }
    
    public static void exibir(){
        if(vazio()) return;
        
        Curso curso = pesquisar();
        if(curso == null){
            System.out.println("CURSO NAO ENCONTRADO!");
            return;
        }
        System.out.println(curso);
    }
    
    public static void alterar(){
        if(vazio()) return;
        
        Curso curso = pesquisar();
        if(curso == null){
            System.out.println("CURSO NAO ENCONTRADO!");
            return;
        }
        int opcao;
        do{
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - NOME");
            System.out.println("2 - CARGA HORARIA");
            System.out.println("3 - QUANTIDADE DE SEMESTRES");
            opcao = Input.nextInt();
            if(opcao < 3 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 3 && opcao > 1);
        
        System.out.println("INFORME:");
        switch (opcao){
            case 1 -> curso.setNome(Input.nextLine());
            case 2 -> curso.setCargaHoraria(Input.nextInt());
            case 3 -> curso.setQtdSemestres(Input.nextInt());
        }
        System.out.println("INFORMACAO ALTERADA!");
    }
    
}
