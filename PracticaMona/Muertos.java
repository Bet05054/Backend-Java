package PracticaMona;

class Mona3 {
    String name ="Octacat de los muertos";
    void Hobby(){
        System.out.println("Mi hobby: Hacer bromas  a los vivos");
    }

}

class Muertos3 extends Mona3 {
    String color ="Tricolor naranjoso";
    void printColor (){
        System.out.println("Mis colores son: "+color);
        System.out.println("Mi nombre es: "+ super.name);
    }
    void Hobby(){
        System.out.println("Mi hobby: Hacer bromas  a los vivos ");
    }
    void Rango(){
        System.out.println("Mi Rango es: Oficial 2do seccion los perdidos");
    }
    void Frase(){
        System.out.println("No es  mas grande aquel que ocupa mas espacio, sino aquel que mas vacio deja en su ausencia");
    }
    void call(){
        super.Hobby();
        Rango();
        Frase();
    }

}
public class Muertos {
    public static void main(String[] args) {
        new Muertos3().printColor();
        //new Goreocat().Hobby();
        new Muertos3().call();

    }
}

