package controle;

import java.util.List;
import modelo.Pessoa;
import modelo.Professor;
import util.Input;

/**
 * @author Mateus
 */
public class CadastroProfessor extends CadastroPessoa{
    Menus menu = new Menus();
    
    public void menuProfessor(String modulo){
        super.menuPrincipal(modulo);
    }
    
    public void setarDados(Professor professor){
        super.setarDados(professor);
        System.out.println("FORMACAO:");
        professor.setFormacao(Input.nextLine());
    }
    
    @Override
    public void cadastrar() {
        Professor professor = new Professor();
        setarDados(professor);
        lista.add(professor);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }

    @Override
    public void alterar() {
        if(listaVazia()) return;
        Professor professor = new Professor();
        professor = (Professor) super.pesquisaUnica();
        setarDados(professor);
    }
  
    @Override
    public void listar() {
        if(listaVazia()) return;
        super.listar(listaDeAlunos(), "ALUNO", menu.menuCrescenteDescrente());
    }

    public ListaCadastros<Pessoa> listaDeAlunos(){
        List<Pessoa> professor = lista.filtrarInstancia(Professor.class);
        
        ListaCadastros<Pessoa> subLista = new ListaCadastros<>();
        subLista.addAll(professor);
        
        return subLista;
    }
}
