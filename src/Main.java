import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to this game.");

    //Crear objeto
        UsuarioJuego juegoUno = new UsuarioJuego("Liliana", "miClave");
        System.out.println("Hello, " + juegoUno.getNombre()+ "!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your password: ");
        juegoUno.setClave(scanner.nextLine());
        System.out.println("Your password is: " + juegoUno.getClave());
        System.out.println("Let's start!");
        System.out.println("Your score is: " + juegoUno.getPuntaje());
        System.out.println("Your level is: " + juegoUno.getNivel());

    //Probar métodos
        juegoUno.aumentarPuntaje();
        juegoUno.subirNivel();
        System.out.println("Your score is: " + juegoUno.getPuntaje());
        System.out.println("Your level is: " + juegoUno.getNivel());

        juegoUno.bonus(3);
        System.out.println("Your score is: " + juegoUno.getPuntaje());



    }
}