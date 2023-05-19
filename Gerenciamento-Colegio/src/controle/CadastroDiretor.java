package controle;

import java.util.ArrayList;
import modelo.Diretor;
import util.Input;

public class CadastroDiretor {
    public static ArrayList<Diretor> listaDiretores = new ArrayList<>();
    
    public static void setarDados(Diretor diretor){
        CadastroPessoa.setarDados(diretor);
        System.out.println("MATRÍCULA:");
        diretor.setMatricula(Input.nextLine());
       
    }

    public static void cadastrar(){
        Diretor diretor = new Diretor();
        setarDados(diretor);
        listaDiretores.add(diretor);
    }
    
    public static void excluir(){
        Diretor diretor = pesquisar();
        
        if(diretor == null){
            System.out.println("\nSaindo do método...");
            return;
        }
        
        listaDiretores.remove(diretor);
        System.out.println("\nCadastrado excluido.");
    }
    
    public static Diretor pesquisar(){
        System.out.println("Informe a matrícula de quem deseja excluir:");
        String matricula = Input.nextLine();
        
        for (Diretor listaDiretor : listaDiretores) {
            if(listaDiretor.getMatricula().equals(matricula)){
                return listaDiretor;
            }
        }
        
        System.out.println("\nRegistro não encontrado!");
        return null;
    }
    
    public static void listarCadastrados(){
        if(listaDiretores == null || listaDiretores.isEmpty()){
            System.out.println("\nNão há registros de diretores cadastrados!");
            return;
        }

        for (Diretor listaDiretor : listaDiretores) {
            System.out.println(listaDiretor);
        }
    }
    
    public static void editar(){
        Diretor novo_diretor = pesquisar();
        
        if(novo_diretor == null){
            return;
        }
        
        setarDados(novo_diretor);
        listaDiretores.add(listaDiretores.indexOf(novo_diretor), novo_diretor);
        listaDiretores.remove(novo_diretor);
        
    }
}
