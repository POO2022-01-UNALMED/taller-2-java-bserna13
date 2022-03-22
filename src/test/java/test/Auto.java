package test.java.test;

public class Auto {
    String modelo;
    int precio;
    Asiento asientos[];
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        return this.asientos.length;
    }

    String verificarIntegridad(){
        
        for( int i=0;i<asientos.length;i++){
            if((asientos[0]).registro!= (asientos[i]).registro){
                return "Las piezas no son originales";      
            }
        }

        if(((asientos[0]).registro==registro) & (motor.registro==registro) & ((asientos[0]).registro==motor.registro)){
            return "Auto original";
        }
        return "Las piezas no son originales";
    }


    
}
