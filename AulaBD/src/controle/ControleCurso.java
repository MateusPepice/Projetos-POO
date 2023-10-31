package controle;

import java.util.ArrayList;
import modelo.Curso;
import persistencia.DaoCurso;
import util.Input;

public class ControleCurso {
    private ArrayList<Curso> cursos = new ArrayList();
    private DaoCurso daoCurso = new DaoCurso();
    private Menu menu = new Menu();
    
    public void moduloCurso(String modulo){
        int resposta;
        do{
            menu.MenuModulos(modulo);
            resposta = Input.nextInt();
            switch(resposta){
                case 1 -> criar();
                case 2 -> System.out.println(pesquisar());
                case 3 -> atualizar();
                case 4 -> remover();
                case 5 -> listar();
                case 0 -> System.out.println("");
                default -> System.out.println("OPCAO INVALIDA!"); 
            }
        }while(resposta !=0);
    }
    public void setarDados(Curso cur){
        System.out.println("NOME DO CURSO:");
        cur.setNome(Input.nextLine());
        System.out.println("CARGA HORÁRIA:");
        cur.setCargaHoraria(Input.nextLine());
        System.out.println("QUANTIDADE DE SEMESTRES:");
        cur.setQtdSemestres(Input.nextLine());
    }
    
    public void criar(){
        Curso cur = new Curso();
        setarDados(cur);
        cursos.add(cur);
        daoCurso.salvar(cur);
    }
    
    public void remover(){
        Curso curso = pesquisar();
        if(curso == null){
            System.out.println("CURSO NÃO ENCONTRADO!");
        }
        daoCurso.remover(curso);
        System.out.println("CURSO REMOVIDO!");
    }
    
    public Curso pesquisar(){
        cursos = daoCurso.carregarCursos();
        System.out.println("INFORME O ID DO CURSO:");
        Integer id_curso = Input.nextInt();
        for (Curso curso : cursos) {
            if(curso.getId_curso().equals(id_curso)){
                return curso;
            }
        }
        return null;
    }
    
    public void atualizar(){
        Curso curso = pesquisar();
        if(curso == null){
            System.out.println("CURSO NÃO ENCONTRADO!");
        }
        setarDados(curso);
        daoCurso.atualizar(curso);
    }
    
    public void listar(){
        cursos = daoCurso.carregarCursos();
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
}
