
package controle;

import modelo.Pessoa;
import util.Input;

public abstract class CadastroPessoa implements ICadastro{
    public ListaCadastros<Pessoa> lista = new ListaCadastros<>();

     public void menuPrincipal(String entidade){
        Menus menu = new Menus();
        int escolha;
        do{
            escolha = menu.menuModuloEspecifico(entidade);
            
            switch (escolha){
                case 1 -> cadastrar();
                case 2 -> alterar();
                case 3 -> pesquisar();
                case 4 -> remover();
                case 5 -> listar();
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
    public void alterar() {
    }

    @Override
    public void pesquisar() {
        int op = 0;
        System.out.println("BUSCAR POR:"
                + "1 - UM VALOR"
                + "2 - DOIS VALORES");
        op = Input.nextInt();
        do{
            switch(op){
                case 1 -> pesquisaUnica();
                case 2 -> pesquisaMultipla();
                default -> System.out.println("OPCAO INVALIDA!");
            }
        }while(op != 1 || op != 2);
    }
    
    public void pesquisaUnica(){
        
    }
    
    public void pesquisaMultipla(){
        
    }

    @Override
    public void remover() {
    }

    @Override
    public void listar() {
        
    }
    
}
