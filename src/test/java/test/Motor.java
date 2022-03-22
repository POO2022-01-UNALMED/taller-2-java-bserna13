package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int regis){
        this.registro=regis;    
    }

    void asignarTipo(String tipo){
        if (tipo.equals("electrico")){
            this.tipo= "electrico";
        }
        else if(tipo.equals("gasolina")){
            this.tipo= "gasolina";
        }
    }
}
