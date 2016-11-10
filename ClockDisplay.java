
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // declarar las variables de la clase NumberDisplay
    private NumberDisplay hora;
    
    private NumberDisplay minuto;

    /**
     * se crean los objetos de la clase NumberDisplay 
     */
    public ClockDisplay()
    {
        // initialise instance variables
        minuto = new NumberDisplay(60);
        
        hora = new NumberDisplay(24);
       
    }

    /**
     ahi que fijar la hora invocando el metodo getValue
     */
   public void fijarHora(int nuevaHora, int nuevoMinuto)
    {
        hora.setValue(nuevaHora);
        minuto.setValue(nuevoMinuto);
        
    }
    
   public void avanzarTiempo(){
       minuto.increment();
       if(minuto.getValue() == 0){
           hora.increment();
        }
        
       
    
    
    }
    
}
