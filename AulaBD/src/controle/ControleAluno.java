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
    private Endereco end = new Endereco();
    private Curso cur = new Curso();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public void setarDados(Aluno aluno){
        /*System.out.println("NOME:");
        aluno.setNome(Input.nextLine());
        System.out.println("CPF:");
        aluno.setCpf(Input.nextLine());*/
        
        System.out.println("ID ENDERECO:");
        end = daoEndereco.carregarEnderecoPorId(Input.nextInt());
        while(end == null){
            System.out.println("POR FAVOR, INFORME UM ID VALIDO:");
            end = daoEndereco.carregarEnderecoPorId(Input.nextInt());
        }
        aluno.setEndereco(end);
        
        System.out.println("ID CURSO:");
        cur = daoCurso.carregarCursoPorId(Input.nextInt());
        while(cur == null){
            System.out.println("POR FAVOR, INFORME UM ID VALIDO:");
            cur = daoCurso.carregarCursoPorId(Input.nextInt());
        }
        aluno.setCurso(cur);
    }
    
    public void criar(){
        Aluno al = new Aluno();
        setarDados(al);
        System.out.println(al.getEndereco().getCidade());
        alunos.add(al);
        daoAluno.salvar(al);
    }
    
    public void remover(){
        Aluno aluno = pesquisar();
        if(aluno == null){
            System.out.println("ALUNO NÃO ENCONTRADO!");
        }
        daoAluno.remover(aluno);
    }
    
    public Aluno pesquisar(){
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
