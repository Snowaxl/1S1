import java.util.Scanner;

public class decision {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al antro");
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if(edad>18){
            System.out.println("Bienvenido al antro");
        }else{
            System.out.println("Eres menor de edad, no puedes entrar al antro");
        }









    }

}
