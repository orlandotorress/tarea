import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Buscar Usuario");
        System.out.println("3. Eliminar Usuario");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void agregarUsuario(ArrayList<Usuario> usuarios, Scanner scanner) {
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Ingrese el nickname: ");
        String nickname = scanner.nextLine();
        System.out.print("Ingrese la clave: ");
        String clave = scanner.nextLine();
        System.out.print("Ingrese el tipo de usuario: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese la fecha de creación: ");
        String fechaCreacion = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombreCompleto, nickname, clave, tipo, fechaCreacion);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario agregado exitosamente.");
    }

    public static void buscarUsuario(ArrayList<Usuario> usuarios, Scanner scanner) {
        System.out.print("Ingrese el valor a buscar: ");
        String valor = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreCompleto().equals(valor) || 
                usuario.getNickname().equals(valor) || 
                usuario.getClave().equals(valor) || 
                usuario.getTipo().equals(valor) || 
                usuario.getFechaCreacion().equals(valor)) {

                System.out.println("Usuario encontrado: " + usuario);
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    public static void eliminarUsuario(ArrayList<Usuario> usuarios, Scanner scanner) {
        System.out.print("Ingrese el valor a eliminar: ");
        String valor = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreCompleto().equals(valor) || 
                usuario.getNickname().equals(valor) || 
                usuario.getClave().equals(valor) || 
                usuario.getTipo().equals(valor) || 
                usuario.getFechaCreacion().equals(valor)) {

                usuarios.remove(usuario);
                System.out.println("Usuario eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }
}

