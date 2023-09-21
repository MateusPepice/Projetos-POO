
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
        E busca = null;
        for (E elemento : this) {
            if(elemento.chavePrincipal().equals(chaveBusca)){
                busca = elemento;
            }
        }
        if(busca == null) return null;
        return busca;
    }

    @Override
    public E pesquisarPorVariasChaves(Object chaveBusca) {
        E busca = null;
        for (E elemento : this) {
            if(elemento.chavePrincipal().equals(chaveBusca) || elemento.chaveSecundaria().equals(chaveBusca)){
                busca = elemento;
            }
        }
        if(busca == null) return null;
        return busca;
    }

    @Override
    public ListaCadastros filtrar(Object chaveBusca) {
        ListaCadastros<E> subLista = new ListaCadastros<>();
        for (E elemento : this) {
            if(elemento.chavePrincipal().equals(chaveBusca)){
                subLista.add(elemento);
            }
        }
        if(subLista.isEmpty()) return null;
        return subLista;
    }

    @Override
    public ListaCadastros filtrarPorVariasChaves(Object chaveBusca) {
        ListaCadastros<E> subLista = new ListaCadastros<>();
        for (E elemento : this) {
            if(elemento.chavePrincipal().equals(chaveBusca) || elemento.chaveSecundaria().equals(chaveBusca)){
                subLista.add(elemento);
            }
        }
        if(subLista.isEmpty()) return null;
        return subLista;
    }

}
