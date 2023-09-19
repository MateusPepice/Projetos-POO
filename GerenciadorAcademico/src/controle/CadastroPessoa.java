
package controle;

import modelo.Pessoa;
import util.Input;

public class CadastroPessoa implements ICadastro{
    public ListaCadastros<Pessoa> lista = new ListaCadastros<>();

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
    public void cadastrar() {
    
    }

    @Override
    public void alterar() {
    }

    @Override
    public void pesquisar() {
    }

    @Override
    public void remover() {
    }

    @Override
    public void listar() {
    }
    
}
