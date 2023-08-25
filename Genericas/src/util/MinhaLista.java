
package util;

public class MinhaLista<E> {
    private E vetor[];
    private int quantidade;

    public MinhaLista() {
        this.vetor = (E[]) new Object[100];
    }
    
    public MinhaLista(int tamanho) {
        this.vetor = (E[]) new Object[tamanho];
    }
    
    public void adicionar(E elemento){
        if(quantidade < vetor.length-1){
            vetor[quantidade] = elemento;
            quantidade++;
        } else {
            System.out.println("Lista cheia!");
        }
    }
    
    public void remover(E elemento){
        int posicao = posicaoDoElemento(elemento);
        if(posicao == -1){
            System.out.println("Elemento não foi encontrado!");
            return;
        }
        vetor[posicao] = null;
        if(posicao < quantidade){
            for (int i = posicao+1; i < quantidade; i++) {
                vetor[i-1] = vetor[i];
            }
        }
        quantidade--;
    }
    
    public int posicaoDoElemento(E elemento){
        for (int i = 0; i <= quantidade; i++) {
            E element = vetor[i];
            if(element.equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public E buscarElemento(int posicao){
        if(posicao > quantidade || posicao < 0){
            System.out.println("Posicao invalida!");
            return null;
        }
        return vetor[posicao];
    }
}
