
package controle;

import java.util.ArrayList;
import java.util.Collections;
import modelo.IConsulta;
import modelo.IExibirInformacoes;
import modelo.MinhaLista;


public class ListaCadastros<E extends IExibirInformacoes & IConsulta & Comparable> extends ArrayList<E> implements MinhaLista<E>{

    @Override
    public void exibirLista() {
        for (E elemento : this) {
            elemento.exibirInformacoes();
        }
    }

    @Override
    public void exibirListaOrdenada() {
        ordenar();
        for (E elemento : this) {
            elemento.exibirInformacoes();
        }
    }

    @Override
    public void ordenar() {
        Collections.sort(this);
    }

    @Override
    public void ordenarDecrescente() {
       Collections.sort(this, Collections.reverseOrder()); 
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
