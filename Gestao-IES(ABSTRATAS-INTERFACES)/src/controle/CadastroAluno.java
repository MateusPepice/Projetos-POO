package controle;

import modelo.Aluno;
import util.Input;

public class CadastroAluno extends CadastroPessoa{

    @Override
    public void cadastrar() {
        Aluno aluno = new Aluno();
        setarDados(aluno);
        cadastros.add(aluno);
        System.out.println("ALUNO CADASTRADO!");
    }
    
    @Override
    public void alterar(){
        super.alterar();
    }
    
    public void setarDados(Aluno aluno){
        super.setarDados(aluno);
        System.out.println("RA:");
        aluno.setRa(Input.nextLine());
    }
    
}