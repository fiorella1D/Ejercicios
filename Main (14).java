import java. util.Scanner;
class Main {
  
  public static void main(String[] args) {
    String nombre,clave;
    Scanner Entrada = new Scanner(System.in);
    System.out.println("Ingrese el nombre del usuario: ");
    nombre = Entrada.nextLine();
    System.out.println("Ingrese Clave de usuario: ");
    clave = Entrada.nextLine();
    if(nombre.equals("juan") && clave.equals("123456")) {
    System.out.println("Bienvenido al Sistema");     }
    else{
    System.out.println("Nombre de Usuario o contraseña Incorrecto");  
    }
    }
}