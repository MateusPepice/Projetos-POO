package controle;

import java.util.ArrayList;
import modelo.Endereco;
import persistencia.DaoEndereco;
import util.Input;

public class ControleEndereco {
    private ArrayList<Endereco> enderecos = new ArrayList();
    private DaoEndereco daoEndereco = new DaoEndereco();
    
    public void setarDados(Endereco end){
        System.out.println("CIDADE:");
        end.setCidade(Input.nextLine());
        System.out.println("RUA:");
        end.setRua(Input.nextLine());
        System.out.println("NUMERO:");
        end.setNumero(Input.nextLine());
    }
    
    public void criar(){
        Endereco end = new Endereco();
        setarDados(end);
        enderecos.add(end);
        daoEndereco.salvar(end);
    }
    
    public void remover(){
        Endereco endereco = pesquisar();
        if(endereco == null){
            System.out.println("ENDERECO NÃO ENCONTRADO!");
        }
        daoEndereco.remover(endereco);
    }
    
    public Endereco pesquisar(){
        System.out.println("INFORME O ID DO ENDERECO:");
        Integer id_endereco = Input.nextInt();
        for (Endereco endereco : enderecos) {
            if(endereco.getId().equals(id_endereco)){
                return endereco;
            }
        }
        return null;
    }
    
    public void atualizar(){
        Endereco endereco = pesquisar();
        if(endereco == null){
            System.out.println("ENDERECO NÃO ENCONTRADO!");
        }
        setarDados(endereco);
        daoEndereco.atualizar(endereco);
    }
    
    public void listar(){
        enderecos = daoEndereco.carregarEnderecos();
        for (Endereco endereco : enderecos) {
            System.out.println(endereco);
        }
    }
}
