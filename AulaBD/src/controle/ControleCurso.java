package controle;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Disciplina;
import persistencia.DaoCurso;
import persistencia.DaoDisciplina;
import util.Input;

public class ControleCurso {
    private ArrayList<Curso> cursos = new ArrayList();
    private DaoCurso daoCurso = new DaoCurso();
    private DaoDisciplina daoDisciplina = new DaoDisciplina();
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
            System.out.println("\n=====CURSO "+curso.getNome()+"=====");
            System.out.println(curso);
            System.out.println("ALUNOS MATRICULADOS: "+daoCurso.alunosCurso(curso.getId_curso()));
            System.out.println("=====DISCIPLINAS=====");
            listarDisciplinas(curso.getId_curso());
        }
    }
    
    public void listarDisciplinas(Integer id_curso){
        ArrayList<String> nomeDisciplinas = daoDisciplina.disciplinasCurso(id_curso);
        if(nomeDisciplinas == null || nomeDisciplinas.isEmpty()){
            System.out.println("SEM DISCIPLINAS VINCULADAS.");
            return;
        }
        for (String nomes : nomeDisciplinas) {
            System.out.println(nomes);
        }
    }
}
