
package controle;

import java.util.ArrayList;
import java.util.stream.Collectors;
import modelo.Coordenador;
import modelo.Pessoa;
import util.Input;

public class CadastroCoordenador {
    public static ArrayList<Coordenador> coordenadores = new ArrayList<>();
    
    public static boolean vazio(){
       if(coordenadores.isEmpty()){
            System.out.println("SEM REGISTROS!");
            return true;
       } 
       return false;
    }
    public static void setarDados(Coordenador coordenador){
        CadastroPessoa.setarDados(coordenador);
        
        /*System.out.println("RA:");
        System.out.println("SITUACAO:");
        System.out.println("DATA DE MATRICULA:");  */
    }
    
    public static void cadastrar(){
        Coordenador coordenador = new Coordenador();
        setarDados(coordenador);
        coordenadores.add(coordenador);
        System.out.println("COORDENADOR CADASTRADO!");
    }
    
    public static void deletar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) coordenadores.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Coordenador coordenador = (Coordenador) CadastroPessoa.pesquisar(pessoas);
        if(coordenador == null){
            System.out.println("COORDENADOR NAO ENCONTRADO!");
            return;
        }     
        coordenadores.remove(coordenador);
        System.out.println("COORDENADOR REMOVIDO!");
    }
    
    public static void exibir(){
        if(vazio()) return;
        
        System.out.println("INFORME O CPF A SER BUSCADO:");
        String cpf = Input.nextLine();
        Coordenador coordenador = coordenadores.stream().filter(i -> i.getCpf().equals(cpf)).findFirst().orElse(null);
        if(coordenador == null){
            System.out.println("COORDENADOR NAO ENCONTRADO!");
            return;
        }
        System.out.println(coordenador.exibirInformacoes());
    }
    
    public static void alterar(){
        if(vazio()) return;
        
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) coordenadores.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Coordenador coordenador = (Coordenador) CadastroPessoa.pesquisar(pessoas);

        int opcao;
        do{
            System.out.println("O QUE DESEJA ALTERAR?");
            System.out.println("1 - NOME");
            System.out.println("2 - CPF");
            System.out.println("3 - DATA DE NASCIMENTO");
            System.out.println("4 - ENDERECO");
            opcao = Input.nextInt();
            if (opcao < 5 && opcao > 1) System.out.println("OPCAO INVALIDA!");
        } while (opcao < 5 && opcao > 1);
        
        System.out.println("INFORME:");
        switch (opcao){
            case 1 -> coordenador.setNome(Input.nextLine());
            case 2 -> coordenador.setCpf(Input.nextLine());
            case 3 -> coordenador.setDataNascimento(Input.nextLocalDate());
            case 4 -> alterarEndereco(coordenador);
        }
        
        System.out.println("INFORMACAO ALTERADA!");
    }
    
    public static void alterarEndereco(Coordenador coordenador){
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
            case 1 -> coordenador.getEndereco().setCidade(Input.nextLine());
            case 2 -> coordenador.getEndereco().setRua(Input.nextLine());
            case 3 -> coordenador.getEndereco().setNumero(Input.nextLine());
        }
        
        System.out.println("INFORMACAO ALTERADA!");
    }
}
