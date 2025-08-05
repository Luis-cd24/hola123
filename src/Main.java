import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int edad;
        System.out.print("Hello and welcome!");

        System.out.println("Hola mundo, aqui va mi primer commit");
        System.out.println("Ingrese su edad:");
        edad=lc.nextInt();
        if (edad >=18){
            System.out.println("Usted puede pasar !");

        }else{
            System.out.println("Acceso denegado.");
        }
    }
}