/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practhps;

/**
 *
 * @author jorge
 */
public class PractHPS {
    
    class Nodo{
        String info;
        Nodo izq, der;
    }
    Nodo raiz;
    
    public PractHPS(){
        raiz = null;
    }
    
    public void insertar (String info)
      {
          Nodo nuevo;
          nuevo = new Nodo ();
          nuevo.info = info;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null) {
              raiz = nuevo;
          }
          else
          {
              Nodo anterior = null;
              Nodo reco = raiz;
              /*while (reco != null)
              {
                  anterior = reco;
                  if (info < reco.info) {
                      reco = reco.izq;
                  }
                  else {
                      reco = reco.der;
                  }
              }
              if (info < anterior.info) {
                  anterior.izq = nuevo;
              }
              else {
                  anterior.der = nuevo;
              }*/
          }
      }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
