package modelo;

import java.util.List;
/**
 * @author MPEPICE
 */
public interface MinhaLista<E> extends List<E>{
    public void exibirLista();
    public void exibirListaOrdenada();
    public void ordenar();
    public void ordenarDecrescente();
    public E pesquisar(Object chaveBusca);
    public E pesquisarPorVariasChaves(Object chaveBusca);
    public MinhaLista filtrar(Object chaveBusca);
    public MinhaLista filtrarPorVariasChaves(Object chaveBusca);
}
