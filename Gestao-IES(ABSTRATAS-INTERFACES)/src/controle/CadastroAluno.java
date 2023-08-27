package controle;

import modelo.Aluno;
import util.Input;

public class CadastroAluno extends CadastroPessoa{

    @Override
    public void cadastrar() {
        Aluno aluno = new Aluno();
        setarDados(aluno);
        cadastros.add(aluno);
        System.out.println("ALUNO CADASTRADO!");
    }
    
    @Override
    public void alterar(){
        if(verificaEntidade("ALUNO")) return;
        super.alterar();
    }
    
    @Override
    public void listar(){
        listar();
    }
    
    public void setarDados(Aluno aluno){
        super.setarDados(aluno);
        System.out.println("RA:");
        aluno.setRa(Input.nextLine());
    }
    
    public String situacaoCurso(){
       do{
           System.out.println("\n1 - EM ANDAMENTO\n2 - CONCLUIDA\n3 - TRANCADA\n4 - DESISTENTE");
           System.out.println("SITUAÇÃO:");
           int resposta = Input.nextInt();
           
           switch(resposta){
               case 1 -> {return "EM ANDAMENTO";}
               case 2 -> {return "CONCLUIDA";}
               case 3 -> {return "TRANCADA";}
               case 4 -> {return "DESISTENTE";}
               default -> System.out.println("OPCAO INVALIDA!");
           } 
       }while (true);
    }
    
}