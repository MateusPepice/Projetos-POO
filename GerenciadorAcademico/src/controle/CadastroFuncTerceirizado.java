package controle;

import java.util.List;
import modelo.FuncionarioTerceirizado;
import modelo.Pessoa;
import util.Input;

/**
 * @author Mateus
 */
public class CadastroFuncTerceirizado extends CadastroFuncionario{
    Menus menu = new Menus();
    
    public void menuTerceirizado(String modulo){
        super.menuPrincipal(modulo);
    }
    
    public void setarDados(FuncionarioTerceirizado terceirizado){
        super.setarDados(terceirizado);
        System.out.println("EMPRESA TERCEIRIZADA:");
        terceirizado.setEmpresaTerceirizada(Input.nextLine());
    }
    
    @Override
    public void cadastrar() {
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado();
        setarDados(terceirizado);
        lista.add(terceirizado);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }

    @Override
    public void alterar() {
        if(listaVazia()) return;
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado();
        terceirizado = (FuncionarioTerceirizado) super.pesquisaUnica();
        setarDados(terceirizado);
    }
  
    @Override
    public void listar() {
        if(listaVazia()) return;
        super.listar(listaDeTerceirizados(), "FUNCIONARIO TERCEIRIZADO", menu.menuCrescenteDescrente());
    }

    public ListaCadastros<Pessoa> listaDeTerceirizados(){
        List<Pessoa> terceirizado = lista.filtrarInstancia(FuncionarioTerceirizado.class);
        
        ListaCadastros<Pessoa> subLista = new ListaCadastros<>();
        subLista.addAll(terceirizado);
        
        return subLista;
    }
}
