public class Main {

    public static void main (String [] args){

        Coche miCoche = new Coche();
        miCoche.ContarPuertas();
        miCoche.ContarPuertas();
        miCoche.ContarPuertas();
        miCoche.ContarPuertas();
        System.out.println("El carro tiene :"+miCoche.puertas+"puertas");

        sumar(20,30,40);
    }

    public static void sumar(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static class Coche{

        public int puertas =0;

        public void ContarPuertas(){
            this.puertas++;
        }
    }
}
