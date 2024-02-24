
package arbolbinarioa;

public class NodoBinario {
        int dato;
    NodoBinario Hizq, Hder;
    
    NodoBinario (int Elem)
    {
     dato = Elem;
     NodoBinario Hizq, Hder = null;
    }
    
    
    public void InsertaBinario(int Elem)
    {
     if(Elem < dato)
     {
         if(Hizq == null)
             Hizq = new NodoBinario (Elem);
         else
             Hizq.InsertaBinario(Elem);
     }
     else
     {
         if(Elem > dato)
         {
             if(Hder == null)
                 Hder = new NodoBinario(Elem);
             else
                 Hder.InsertaBinario(Elem);
         }
     }
        
    }
    
}
