package PracticaMona;

class Mona {
        String name ="GoreocatSF";
        void Hobby(){
            System.out.println("Mi hobby: Futbol Americano");
        }
        void Posicion(){

        }
}

class Goreocat1 extends Mona {
    String color ="golden & Red";
    void printColor (){
        System.out.println("Mis colores son: "+color);
        System.out.println("Mi nombre es: "+ super.name);
    }
    void Hobby(){
        System.out.println("");
    }
    void Posicion(){
        System.out.println("Mi posicion: soy Corredor");
    }

    void Frase(){
        System.out.println("Los verdaderos competidores son los que siempre juegan para ganar");
    }
    void call(){
        super.Hobby();
        Posicion();
        Frase();
    }

}
public class Goreocat {
    public static void main(String[] args) {
        new Goreocat1().printColor();
        //new Goreocat().Hobby();
        new Goreocat1().call();

    }
}
