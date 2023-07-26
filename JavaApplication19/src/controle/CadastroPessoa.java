
package controle;

import java.util.ArrayList;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public static void SetarPessoa(Pessoa novaPessoa){
        System.out.println("NOME:");
        novaPessoa.setNome(Input.nextLine());
        System.out.println("CPF:");
        novaPessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        novaPessoa.setData(Input.nextLocalDate());
        SetarEndereco(novaPessoa);
    }
    
    public static void SetarEndereco(Pessoa novaPessoa){
        System.out.println("CIDADE:");
        novaPessoa.getEndereco().setCidade(Input.nextLine());
        System.out.println("RUA:");
        novaPessoa.getEndereco().setRua(Input.nextLine());
        System.out.println("NUMERO:");
        novaPessoa.getEndereco().setNumero(Input.nextInt());
    }
    
    public static void CadastrarPessoa(){
        Pessoa novaPessoa = new Pessoa();
        SetarPessoa(novaPessoa);
        pessoas.add(novaPessoa);
        System.out.println("PESSOA CADASTRADA COM SUCESSO!");
    }
    
    public static void PesquisarPessoaCpf(String dado){
        int contador = 0;
        System.out.println("\nRESULTADOS ENCONTRADOS:");
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getCpf().contains(dado)){
                System.out.println(pessoa);
                contador++;
            }
        }
        System.out.printf("TOTAL: " + contador);
    }
    public static void PesquisarPessoaNome(String dado){
        int contador = 0;
        System.out.println("RESULTADOS ENCONTRADOS:");
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getNome().contains(dado)){
                System.out.println(pessoa);
                contador++;
            }
        }
        System.out.printf("TOTAL: " + contador);
    }
    
    public static void Listar(int ordem){
        
    }
    
    public static Pessoa buscaPessoa(String cpf){
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getCpf().equals(cpf)){
                return pessoa;
            }
        }
        return null;
    }
    
    public static void RemoverPessoaCpf(String cpf){
        int indice = 0;
        Pessoa p = buscaPessoa(cpf);
        if(p == null){
            System.out.println("PESSOA NAO ENCONTRADA!");
            return;
        }
        
        pessoas.remove(p);
        System.out.println("PESSOA REMOVIDA!");
    }
}
