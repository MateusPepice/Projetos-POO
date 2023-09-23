package controle;

import java.util.List;
import modelo.Funcionario;
import modelo.Pessoa;
import util.Input;

/**
 * @author Mateus
 */
public class CadastroFuncionario extends CadastroPessoa{
    Menus menu = new Menus();
    
    public void menuFuncionario(String modulo){
        super.menuPrincipal(modulo);
    }
    
    public void setarDados(Funcionario funcionario){
        super.setarDados(funcionario);
        System.out.println("Nº CTPS:");
        funcionario.setCtps(Input.nextLine());
        System.out.println("SALARIO:");
        funcionario.setSalario(Input.nextDouble());
        System.out.println("CARGO:");
        funcionario.setCargo(Input.nextLine());
    }
    
    @Override
    public void cadastrar() {
        Funcionario funcionario = new Funcionario();
        setarDados(funcionario);
        lista.add(funcionario);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }

    @Override
    public void alterar() {
        if(listaVazia()) return;
        Funcionario funcionario = new Funcionario();
        funcionario = (Funcionario) super.pesquisaUnica();
        setarDados(funcionario);
    }
  
    @Override
    public void listar() {
        if(listaVazia()) return;
        super.listar(listaDeFuncionarios(), "FUNCIONARIO TERCEIRIZADO", menu.menuCrescenteDescrente());
    }

    public ListaCadastros<Pessoa> listaDeFuncionarios(){
        List<Pessoa> funcionario = lista.filtrarInstancia(Funcionario.class);
        
        ListaCadastros<Pessoa> subLista = new ListaCadastros<>();
        subLista.addAll(funcionario);
        
        return subLista;
    }
}
