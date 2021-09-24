import Persona.Persona;
import java.util.Scanner;
public class main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tus apellidos: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu dni sin letra: ");
        p.setDnisinletra(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tu edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tu nacionalidad: ");
        p.setNacionalidad(sc.nextLine());

        System.out.println("Hola "+ p.getNombre()+" "+p.getApellidos()+" con DNI:  "+String.valueOf(p.getDnisinletra())+" y "+String.valueOf(p.getEdad())+" años, de nacionalidad "+p.getNacionalidad());

    }
}
