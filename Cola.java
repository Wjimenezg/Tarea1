
package arbolbinarioa;

public class Cola {
        NodoListaA PrimerNodo;
    NodoListaA UltimoNodo;
    String Nombre;
    
    public Cola()
    {
        this("Lista");
    }
    
    public Cola(String s)
    {
        Nombre = s;
        PrimerNodo = UltimoNodo = null;
    }
    
    public boolean VaciaLista()
    {
        return PrimerNodo == null;
    }
    
    public void InsertaInicio (NodoBinario ElemInser)
    {
        if(VaciaLista())
        {
            PrimerNodo = UltimoNodo = new NodoListaA(ElemInser);
            
        }
        else
        {
            PrimerNodo = new NodoListaA(ElemInser, PrimerNodo);
        }
    }
    
    public void InsertaFinal (NodoBinario ElemInser)
    {
     if(VaciaLista())
     {
        PrimerNodo = UltimoNodo = new NodoListaA(ElemInser); 
     }
     else
     {
        UltimoNodo = UltimoNodo.Siguiente = new NodoListaA(ElemInser); 
     }
    }
    
    public void EliminaInicio()
    {
    if (VaciaLista())
        System.out.println("No Hay Elementos");
    if(PrimerNodo.equals(UltimoNodo))
        PrimerNodo = UltimoNodo = null;
    else
        PrimerNodo = PrimerNodo.Siguiente;
   }
    
    
    public void EliminaFinal()
    {
        if (VaciaLista())
            System.out.println("No Hay Elementos");
        if (PrimerNodo.equals(UltimoNodo))
            PrimerNodo = UltimoNodo = null;
        else{
            
            NodoListaA Actual = PrimerNodo;
            while (Actual.Siguiente!= UltimoNodo)
                Actual = Actual.Siguiente;
            
            UltimoNodo = Actual;
            Actual.Siguiente = null;
    }
    
}
    
}
