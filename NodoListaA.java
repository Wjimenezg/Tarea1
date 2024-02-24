
package arbolbinarioa;

public class NodoListaA {
    NodoBinario datos;
    NodoListaA Siguiente;
    
    
    NodoListaA(NodoBinario valor){
        datos = valor;
        Siguiente = null;
        
    }
    
    NodoListaA(NodoBinario Valor, NodoListaA Signodo)
    {
        datos = Valor;
        Siguiente = Signodo;
    }    
}
