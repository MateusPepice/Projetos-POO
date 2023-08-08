
package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import modelo.Funcionario;
import modelo.Pessoa;
import util.Input;

public class CadastroFuncionario {
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public static boolean vazio(){
       if(funcionarios.isEmpty()){
            System.out.println("SEM REGISTROS!");
            return true;
       } 
       return false;
    }
    public static void setarDados(Funcionario funcionario){
        CadastroPessoa.setarDados(funcionario);
        
        System.out.println("CTPS:");
        funcionario.setCtps(Input.nextLine());
        System.out.println("SALARIO:");
        funcionario.setSalario(Input.nextDouble());
    }
    
    public static void cadastrar(){
        Funcionario funcionario = new Funcionario();
        setarDados(funcionario);
        funcionarios.add(funcionario);
        System.out.println("FUNCIONARIO CADASTRADO!");
    }
    
    public static void deletar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) funcionarios.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Funcionario funcionario = (Funcionario) CadastroPessoa.pesquisar(pessoas);
        if(funcionario == null){
            System.out.println("FUNCIONARIO NAO ENCONTRADO!");
            return;
        }     
        funcionarios.remove(funcionario);
        System.out.println("FUNCIONARIO REMOVIDO!");
    }
    
    public static void exibir(){
        if(vazio()) return;
        
        System.out.println("INFORME O CPF A SER BUSCADO:");
        String cpf = Input.nextLine();
        Funcionario funcionario = funcionarios.stream().filter(i -> i.getCpf().equals(cpf)).findFirst().orElse(null);
        if(funcionario == null){
            System.out.println("FUNCIONARIO NAO ENCONTRADO!");
            return;
        }
        System.out.println(funcionario.exibirInformacoes());
    }
    
    public static void alterar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) funcionarios.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Funcionario funcionario = (Funcionario) CadastroPessoa.pesquisar(pessoas);

        int opcao;
        do{
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - NOME");
            System.out.println("2 - CPF");
            System.out.println("3 - DATA DE NASCIMENTO");
            System.out.println("4 - ENDERECO");
            System.out.println("5 - CTPS");
            System.out.println("6 - SALARIO");
            opcao = Input.nextInt();
            if(opcao < 6 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 6 && opcao > 1);
        
        System.out.println("INFORME:");
        switch (opcao){
            case 1 -> funcionario.setNome(Input.nextLine());
            case 2 -> funcionario.setCpf(Input.nextLine());
            case 3 -> funcionario.setDataNascimento(Input.nextLocalDate());
            case 4 -> alterarEndereco(funcionario);
            case 5 -> funcionario.setCtps(Input.nextLine());
            case 6 -> funcionario.setSalario(Input.nextDouble());
        }

        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void alterarEndereco(Funcionario funcionario){
        int opcao;
        do{  
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - CIDADE");
            System.out.println("2 - RUA");
            System.out.println("3 - NUMERO");
            opcao = Input.nextInt();
            if(opcao < 3 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 3 && opcao > 1);
        
        System.out.println("INFORME:");
        switch(opcao){
            case 1 -> funcionario.getEndereco().setCidade(Input.nextLine());
            case 2 -> funcionario.getEndereco().setRua(Input.nextLine());
            case 3 -> funcionario.getEndereco().setNumero(Input.nextLine());
        }
        
        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void listarCadastros(){
        if(vazio()) return;
        
        System.out.println("1 - ORDEM CRESCENTE");
        System.out.println("2 - ORDEM DECRESCENTE");
        int resposta = Input.nextInt();
        
        if(resposta == 1){
            Collections.sort(funcionarios);
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.exibirInformacoes());
            }
        }else{
            Collections.sort(funcionarios);
            Collections.reverse(funcionarios);
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.exibirInformacoes());
            }
        }
    }
}
