
package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
       listar(cadastros, "PESSOAS", true);
    }
    
    public void listar(List<Pessoa> cadastros, String entidade, boolean MenuOrdenacao){
       if(verificaEntidade(entidade)) return;
       int resposta = 1;
       if(MenuOrdenacao) resposta = Menus.MenuOrdenacao();
       
       switch(resposta){
           case 1 -> ordenarLista(cadastros, true);
           case 2 -> ordenarLista(cadastros, false);
           default -> System.out.println("OPCAO INVALIDA!");
       }
        
    }
    
    public void ordenarLista(List<Pessoa> cadastros, boolean ordemCrescente){
        if(ordemCrescente){
            Collections.sort(cadastros);
        } else {
            Collections.sort(cadastros, Collections.reverseOrder());
        }
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
            return false;
        }
    }
    
    public boolean verificaEntidade(String entidade){
        switch(entidade){
            case "ALUNO" -> {
                for (Pessoa cadastro : cadastros) {
                    if(cadastro instanceof Aluno){
                        return true;
                    }
                }
                return false;
            }
            case "FUNCIONARIO" -> {
                for (Pessoa cadastro : cadastros) {
                    if(cadastro instanceof Funcionario){
                        return true;
                    }
                }
                return false;
            }
            case "FUNCIONARIO TERCEIRIZADO" -> {
                for (Pessoa cadastro : cadastros) {
                    if(cadastro instanceof Funcionario){
                        return true;
                    }
                }
                return false;
            }
            case "PROFESSOR" -> {
                for (Pessoa cadastro : cadastros) {
                    if(cadastro instanceof Professor){
                        return true;
                    }
                }
                return false;
            }
            default -> System.out.println("ESTA ENTIDADE NÃO EXISTE!");
        }
        return true;
    }
}
