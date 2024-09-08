import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Menu.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    Menu.agregarUsuario(usuarios, scanner);
                    break;
                case 2:
                    Menu.buscarUsuario(usuarios, scanner);
                    break;
                case 3:
                    Menu.eliminarUsuario(usuarios, scanner);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
