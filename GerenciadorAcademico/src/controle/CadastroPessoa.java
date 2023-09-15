
package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import modelo.IExibirInformacoes;
import modelo.Pessoa;

public class CadastroPessoa implements ICadastro{
    public List<Pessoa> cadastros = new ListaCadastros<>();

    public CadastroPessoa() {
    }
   
    @Override
    public void cadastrar() {
        int i = 0;
        i++;
        String aux;
        aux = String.valueOf(i);
        Aluno aluno = new Aluno();
        aluno.setCpf(aux);
        cadastros.add(aluno);
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
