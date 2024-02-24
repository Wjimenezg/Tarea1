
package arbolbinarioa;

public class Arbol {
    Cola Cola = new Cola();
    NodoBinario Padre;
    NodoBinario Raiz;
    
    public Arbol()
    {
        Raiz = null;
    }
    
    public void insertaNodo(int elem)
    {
        if (Raiz == null)
            Raiz = new NodoBinario(elem);
        else
            Raiz.InsertaBinario(elem);
    }
    
}
