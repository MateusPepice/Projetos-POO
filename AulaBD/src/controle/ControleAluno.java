package controle;

import modelo.Aluno;

public class ControleAluno {
    
    
    public void setarDados(Aluno aluno){
        System.out.println("NOME:");
        System.out.println("CPF:");
        System.out.println("ENDERECO:");
        System.out.println("CURSO:");
    }
    
    public void criar(){
        Aluno al = new Aluno();
        setarDados(al);
        
    }
    
    public void remover(){
    
    }
    
    public void atualizar(){
    
    }
    
}
