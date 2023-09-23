
package controle;

import java.util.List;
import main.Main;
import modelo.Pessoa;
import util.Input;

public abstract class CadastroPessoa implements ICadastro{
    public ListaCadastros<Pessoa> lista = new ListaCadastros<>();
    public ListaCadastros<Pessoa> listaAuxiliar = new ListaCadastros<>();
    public Pessoa pessoa = null;
    public int escolha = 0;
    public String cpf = null;

     public void menuPrincipal(String entidade){
        Menus menu = new Menus();
        do{
            escolha = menu.menuModuloEspecifico(entidade);
            switch (escolha){
                case 1 -> cadastrar();
                case 2 -> alterar();
                case 3 -> pesquisar();
                case 4 -> remover();
                case 5 -> listar();
                case 0 -> Main.principal();
                default -> System.out.println("OPCAO INVALIDA!");
            }
        }while (escolha != 0);
    }
    
    public void setarDados(Pessoa pessoa){
        System.out.println("NOME:");
        pessoa.setNome(Input.nextLine());
        System.out.println("CPF:");
        pessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        pessoa.setDataNascimento(Input.nextLocalDate());
        System.out.println("E-MAIL:");
        pessoa.setEmail(Input.nextLine());
        CadastroEndereco.setarDados(pessoa);
    }

    @Override
    public abstract void cadastrar();

    @Override
    public abstract void alterar();

    public boolean listaVazia(){
        if(lista.isEmpty()){
            System.out.println("LISTA VAZIA");
            return true;
        }
        return false;
    }
    
    @Override
    public void pesquisar() {
        if(listaVazia()) return;
        System.out.println("BUSCAR POR:"
                + " 1 - UMA CHAVE"
                + " 2 - VARIAS CHAVES");
        escolha = Input.nextInt();
        switch(escolha){
            case 1 -> pesquisaUnica();
            case 2 -> pesquisaMultipla();
            default -> System.out.println("OPCAO INVALIDA!");
        }
    }
    
    public String perguntaCpf(){
        System.out.println("INFORME O CPF:");
        return Input.nextLine();
    }
    public String perguntaCpfNome(){
        System.out.println("INFORME O CPF OU O NOME:");
        return Input.nextLine();
    }
    
    public Object pesquisaUnica(){
        cpf = perguntaCpf();
        pessoa = lista.pesquisar(cpf);
        if(pessoa == null){
            System.out.println("CADASTRO NÃO ENCONTRADO!");
            return null;
        }
        pessoa.exibirInformacoes();
        return pessoa;
        
    }
    
    public Object pesquisaMultipla(){
        cpf = perguntaCpfNome();
        pessoa = lista.pesquisarPorVariasChaves(cpf);
        if(pessoa == null){
            System.out.println("CADASTRO NÃO ENCONTRADO!");
            return null;
        }
        pessoa.exibirInformacoes();
        return pessoa;
    }

    @Override
    public void remover() {
        if(listaVazia()) return;
        Pessoa pessoa = (Pessoa) pesquisaMultipla();
        lista.remove(pessoa);
    }

    @Override
    public abstract void listar();

    public void listar(ListaCadastros<Pessoa> lista, String entidade, boolean crescente) {
        if(listaVazia()) return;
        System.out.println("-----LISTA DE "+entidade+"-----");
        if(crescente){
            lista.exibirListaOrdenada();
        }else{
            lista.exibirLista();
        }
    }
    
}
