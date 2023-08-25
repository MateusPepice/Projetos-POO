
package controle;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Funcionario;
import modelo.ICadastro;
import modelo.Pessoa;
import modelo.Professor;
import util.Input;

public abstract class CadastroPessoa implements ICadastro{
    protected static ArrayList<Pessoa> cadastros = new ArrayList<>();
    
    @Override
    public abstract void cadastrar();

    @Override
    public void alterar() {
        Pessoa pessoa = pesquisa();
        if(pessoaVazia(pessoa)) return;
        setarDados(pessoa);
        System.out.println("CADASTRO ALTERADO COM SUCESSO!");
    }

    @Override
    public void pesquisar() {
        Pessoa pessoa = pesquisa();
        System.out.println(pessoa.getInformacoes());
    }
    
    public Pessoa pesquisa(){
        System.out.println("INFORME O CPF:");
        String cpf = Input.nextLine();
        
        for (Pessoa cadastro : cadastros) {
            if(cadastro.getCpf().equals(cpf)){
                return cadastro;
            }
        }
        return null;
    }
    
    @Override
    public void remover() {
        Pessoa busca = pesquisa();
        if(pessoaVazia(busca)) return;
        cadastros.remove(busca);
        System.out.println("CADASTRO DELETADO!");
    }

    @Override
    public void listar() {
       
    }
    
    public void setarDados(Pessoa novoCadastro){
        System.out.println("NOME:");
        novoCadastro.setNome(Input.nextLine());
        System.out.println("CPF:");
        novoCadastro.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        novoCadastro.setDataNascimento(Input.nextLocalDate());
        System.out.println("EMAIL:");
        novoCadastro.setEmail(Input.nextLine());
        setarDadosEndereco(novoCadastro);
    }
    
    public void setarDadosEndereco(Pessoa novoCadastro){
        System.out.println("CIDADE:");
        novoCadastro.getEndereco().setCidade(Input.nextLine());
        System.out.println("RUA:");
        novoCadastro.getEndereco().setRua(Input.nextLine());
        System.out.println("NUMERO:");
        novoCadastro.getEndereco().setNumero(Input.nextLine());
    }
    
    public ArrayList<Pessoa> getLista(){
        return cadastros;
    }
    
    public boolean pessoaVazia(Pessoa pessoa){
        if(pessoa == null){
            System.out.println("PESSOA NAO ENCONTRADA!");
            return true;
        } else{
            System.out.println("CADASTRO ENCONTRADO!");
            return false;
        }
    }
    
    public boolean verificaVazio(String entidade){
        switch(entidade){
            case "ALUNO" -> {
                for (Pessoa cadastro : cadastros) {
                    return cadastro instanceof Aluno;
                }
            }
            case "FUNCIONARIO" -> {
                for (Pessoa cadastro : cadastros) {
                    return cadastro instanceof Funcionario;
                }
            }
            case "PROFESSOR" -> {
                for (Pessoa cadastro : cadastros) {
                    return cadastro instanceof Professor;
                }
            }
            default -> System.out.println("ESTA ENTIDADE NÃO EXISTE!");
        }
        return true;
    }
}
