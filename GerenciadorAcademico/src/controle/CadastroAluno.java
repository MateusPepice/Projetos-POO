package controle;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import util.Input;

public class CadastroAluno extends CadastroPessoa{

    public void menuAluno(String modulo){
        super.menuPrincipal(modulo);
    }
    
    public void setarDados(Aluno aluno){
        super.setarDados(aluno);
        System.out.println("RA:");
        aluno.setRa(Input.nextLine());
    }
    
    @Override
    public void cadastrar() {
        Aluno aluno = new Aluno();
        setarDados(aluno);
        lista.add(aluno);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }

}
