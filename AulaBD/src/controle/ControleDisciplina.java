package controle;

import java.util.ArrayList;
import modelo.Disciplina;
import persistencia.DaoCurso;
import persistencia.DaoDisciplina;
import util.Input;

public class ControleDisciplina {
    private ArrayList<Disciplina> disciplinas = new ArrayList();
    private DaoDisciplina daoDisciplina = new DaoDisciplina();
    private DaoCurso daoCurso = new DaoCurso();
    private Menu menu = new Menu();
    
    public void moduloDisciplina(String modulo){
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
    public void setarDados(Disciplina dis){
        System.out.println("NOME DA DISCIPLINA:");
        dis.setNome(Input.nextLine());
        System.out.println("CARGA HORÁRIA:");
        dis.setCargaHoraria(Input.nextInt());
        System.out.println("SEMESTRE:");
        dis.setSemestre(Input.nextInt());
        
        System.out.println("ID DO CURSO:");
        dis.setFk_curso(daoCurso.carregarCursoPorId(Input.nextInt()));
    }
    
    public void criar(){
        Disciplina dis = new Disciplina();
        setarDados(dis);
        disciplinas.add(dis);
        daoDisciplina.salvar(dis);
    }
    
    public void remover(){
        Disciplina disciplina = pesquisar();
        if(disciplina == null){
            System.out.println("DISCIPLINA NÃO ENCONTRADO!\n");
            return;
        }
        daoDisciplina.remover(disciplina);
        System.out.println("DISCIPLINA REMOVIDO!");
    }
    
    public Disciplina pesquisar(){
        disciplinas = daoDisciplina.carregarDisciplinas();
        System.out.println("INFORME O ID DA DISCIPLINA:");
        Integer id_disciplina = Input.nextInt();
        for (Disciplina disciplina : disciplinas) {
            if(disciplina.getId_disciplina().equals(id_disciplina)){
                return disciplina;
            }
        }
        return null;
    }
    
    public void atualizar(){
        Disciplina disciplina = pesquisar();
        if(disciplina == null){
            System.out.println("DISCIPLINA NÃO ENCONTRADO!\n");
            return;
        }
        setarDados(disciplina);
        daoDisciplina.atualizar(disciplina);
    }
    
    public void listar(){
        disciplinas = daoDisciplina.carregarDisciplinas();
        if (disciplinas.isEmpty() || disciplinas == null){
            System.out.println("SEM REGISTROS!\n");
            return;
        }
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }
}
