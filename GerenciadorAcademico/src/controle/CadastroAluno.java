package controle;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Pessoa;
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
    }

}
