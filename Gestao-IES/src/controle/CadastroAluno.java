
package controle;

import java.util.ArrayList;
import java.util.stream.Collectors;
import modelo.Aluno;
import modelo.Pessoa;
import util.Input;

public class CadastroAluno {
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static void setarDados(Aluno aluno){
        CadastroPessoa.setarDados(aluno);
        System.out.println("RA:");
        System.out.println("SITUACAO:");
        System.out.println("DATA DE MATRICULA:");
    }
    
    public static void cadastrar(){
        Aluno aluno = new Aluno();
        setarDados(aluno);
        alunos.add(aluno);
        System.out.println("ALUNO CADASTRADO!");
    }
    
    public static void deletar(){
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) alunos.stream().map(e -> (Pessoa) e).collect(Collectors.toList());
        Aluno aluno = (Aluno) CadastroPessoa.pesquisar(pessoas);
        if(aluno == null){
            System.out.println("ALUNO NAO ENCONTRADO!");
            return;
        } 
        
        String cpf;
        cpf = Input.nextLine();
        alunos.stream().filter(i -> i.getCpf().equals(cpf));
        System.out.println(alunos.stream().filter(i -> i.getCpf().equals(cpf)).findFirst().get().exibirInformacoes());
       
        alunos.remove(aluno);
    }
    
}