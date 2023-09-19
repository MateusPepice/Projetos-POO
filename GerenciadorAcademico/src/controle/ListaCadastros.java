
package controle;

import java.util.ArrayList;
import modelo.IConsulta;
import modelo.IExibirInformacoes;
import modelo.MinhaLista;


public class ListaCadastros<E extends IExibirInformacoes & IConsulta & Comparable> extends ArrayList<E> implements MinhaLista<E>{

    @Override
    public void exibirLista() {
    }

    @Override
    public void exibirListaOrdenada() {
    }

    @Override
    public void ordenar() {
    }

    @Override
    public void ordenarDecrescente() {
    }

    @Override
    public E pesquisar(Object chaveBusca) {
        return null;
    }

    @Override
    public E pesquisarPorVariasChaves(Object chaveBusca) {
        return null;
    }

    @Override
    public MinhaLista filtrar(Object chaveBusca) {
        ListaCadastros<E> subLista = new ListaCadastros<>();
        for (E elemento : this) {
            if(elemento.equals(chaveBusca)){
                subLista.add(elemento);
            }
        }
        return subLista;
    }

    @Override
    public MinhaLista filtrarPorVariasChaves(Object chaveBusca) {
        
        return null;
    }

}
