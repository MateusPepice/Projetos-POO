package controle;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Curso;
import modelo.Endereco;
import persistencia.DaoAluno;
import persistencia.DaoCurso;
import persistencia.DaoEndereco;
import util.Input;

public class ControleAluno {
    
    private DaoAluno daoAluno = new DaoAluno();
    private DaoEndereco daoEndereco = new DaoEndereco();
    private DaoCurso daoCurso = new DaoCurso();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Menu menu = new Menu();
    private int resposta;
    
    public void moduloAluno(String modulo){
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
    
    public void setarDados(Aluno aluno){
        System.out.println("NOME:");
        aluno.setNome(Input.nextLine());
        System.out.println("CPF:");
        aluno.setCpf(Input.nextLine());
        
        System.out.println("ID ENDERECO:");
        aluno.setEndereco(daoEndereco.carregarEnderecoPorId(Input.nextInt()));
        
        System.out.println("ID CURSO:");
        aluno.setCurso(daoCurso.carregarCursoPorId(Input.nextInt()));
    }
    
    public void criar(){
        Aluno al = new Aluno();
        setarDados(al);
        alunos.add(al);
        daoAluno.salvar(al);
    }
    
    public void remover(){
        Aluno aluno = pesquisar();
        if(aluno == null){
            System.out.println("ALUNO NÃO ENCONTRADO!");
        }
        daoAluno.remover(aluno);
        System.out.println("ALUNO REMOVIDO!");
    }
    
    public Aluno pesquisar(){
        alunos = daoAluno.carregarAlunos();
        System.out.println("INFORME O ID DO ALUNO:");
        Integer id_aluno = Input.nextInt();
        for (Aluno aluno : alunos) {
            if(aluno.getId().equals(id_aluno)){
                return aluno;
            }
        }
        return null;
    }
    
    public void atualizar(){
        Aluno aluno = pesquisar();
        if(aluno == null){
            System.out.println("ALUNO NÃO ENCONTRADO!");
        }
        setarDados(aluno);
        daoAluno.atualizar(aluno);
    }
    
    public void listar(){
        alunos = daoAluno.carregarAlunos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
