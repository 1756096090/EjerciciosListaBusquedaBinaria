import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lista coleccion= new Lista();
        for(int i=0;i<=100000; i++){
            coleccion.agregar(new Random().nextInt(5000));
        }
        System.out.println("La suma de los elemento "+coleccion.sumar());
        System.out.println(coleccion.toString());
        System.out.println("Valor Maximo"+Integer.MAX_VALUE);
        System.out.println(coleccion.buscar(324));
        System.out.println(coleccion.buscarNormal(324));
    }
}