package controle;

import java.util.List;
import modelo.Aluno;
import modelo.Pessoa;
import util.Input;

public class CadastroAluno extends CadastroPessoa{
    Menus menu = new Menus();
    
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

    @Override
    public void alterar() {
        if(listaVazia()) return;
        Aluno aluno = new Aluno();
        aluno = (Aluno) super.pesquisaUnica();
        setarDados(aluno);
    }
  
    @Override
    public void listar() {
        if(listaVazia()) return;
        super.listar(listaDeAlunos(), "ALUNO", menu.menuCrescenteDescrente());
    }

    public ListaCadastros<Pessoa> listaDeAlunos(){
        List<Pessoa> alunos = lista.filtrarInstancia(Aluno.class);
        
        ListaCadastros<Pessoa> subLista = new ListaCadastros<>();
        subLista.addAll(alunos);
        
        return subLista;
    }
}
