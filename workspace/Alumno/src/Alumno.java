import java.util.Scanner;

public class Alumno {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Ingrese el nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
       
        System.out.print("La persona es mayor de edad:");
       
            System.out.print(nombre);
            if (edad>18) {
                System.out.print("es mayor de edad");
           if (edad>18){
                System.out.print("es menor de edad");
        }
    
    }}}
    
