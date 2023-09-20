package controle;

import modelo.Aluno;
import util.Input;

public class CadastroAluno extends CadastroPessoa{
    
    public void menuAluno(){
         
    }
    
    public void setarDados(Aluno aluno){
        super.setarDados(aluno);
       /* System.out.println("RA:");
        aluno.setRa(Input.nextLine());*/
    }
    
    @Override
    public void cadastrar() {
        Aluno aluno = new Aluno();
        setarDados(aluno);
        lista.add(aluno);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
        lista.exibirLista();
        System.out.println("\n");
        lista.ordenar();
        lista.exibirLista();
        System.out.println("\n");
        lista.ordenarDecrescente();
        lista.exibirLista();
        
    }

}
