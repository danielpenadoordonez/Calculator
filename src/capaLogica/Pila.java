
package capaLogica;


public class Pila {
   private int tope;
  
    private Object[] elementos;
    
    public Pila(int cantElementos){
        elementos = new Object[cantElementos];
        tope = -1;
    }

   
    public boolean isEmpty(){           
        return tope == -1;
    }
    
    public boolean isFull(){
        return this.elementos.length-1 == tope;
    }
    
    public boolean push(Object dato){        
        if(!isFull()){
            tope++;
            this.elementos[this.tope] = dato; 
            return true;
        }
        else{
            return false;
        }
 
    }
   
   public Object pop(){
        Object dato=null;
        if(!isEmpty()){
          dato = elementos[tope]  ;
          tope--;            
        }
        return dato;
    }
    
    
    public void clear(){
        tope = -1;
    }
   
    public String toString() {
        String cadena = "_______\n";
        for(int i=this.tope;i>=0;i--)
            cadena += (this.elementos[i] + "\n_______\n");
        return cadena;
    } 
}
