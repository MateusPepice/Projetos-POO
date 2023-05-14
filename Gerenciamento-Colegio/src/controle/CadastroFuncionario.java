package controle;

import java.util.ArrayList;
import modelo.Funcionario;
import util.Input;

public class CadastroFuncionario {
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    
    public static void setarDados(Funcionario funcionario){
        CadastroPessoa.setarDados(funcionario);
        System.out.println("SALÁRIO...:");
        funcionario.setSalario(Input.nextDouble());
        System.out.println("MATRÍCULA.:");
        funcionario.setMatricula(Input.nextLine());
        
    }
    
    public static void cadastrar(){
        Funcionario funcionario = new Funcionario();
        setarDados(funcionario);
        listaFuncionarios.add(funcionario);
    }
    
    public static void excluir(){
        Funcionario funcionario = pesquisar();
        
        if(funcionario == null){
            System.out.println("\nSaindo do método...");
            return;
        }
        listaFuncionarios.remove(funcionario);
        System.out.println("\nCadastri excluido.");
    }
    
    public static Funcionario pesquisar(){
        System.out.println("Informe a matrícula do funcionário que deseja excluir:");
        String matricula = Input.nextLine();
        
        for (Funcionario listaFuncionario : listaFuncionarios) {
            if(listaFuncionario.getMatricula().equals(matricula)){
                return listaFuncionario;
            }
        }
        
        System.out.println("\nRegistro não encontrado!");
        return null;
    }
    
    public static void listarCadastrados(){
        if(listaFuncionarios == null || listaFuncionarios.isEmpty()){
            System.out.println("\nNão há registros de funcionários cadastrados!");
            return;
        }

        for (Funcionario listaFuncionario : listaFuncionarios) {
            System.out.println(listaFuncionario);
        }
    }
    
    public static void editar(){
        Funcionario novo_funcionario = pesquisar();
        
        if(novo_funcionario == null){
            return;
        }
        
        setarDados(novo_funcionario);
        listaFuncionarios.add(listaFuncionarios.indexOf(novo_funcionario), novo_funcionario);
        listaFuncionarios.remove(novo_funcionario);
        
    }
}
