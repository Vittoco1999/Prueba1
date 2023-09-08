import java.util.Scanner;

/**
 *
 * @author Victor Loyola
 */
public class menuPricipal {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner (System.in);
         
    
       //Primer menu
       
          while (true) {
              
              System.out.println("--------------Menu-------------");
              System.out.println("     ");
              System.out.println("Bienvenido al menu ,que desea hacer : ");
              System.out.println("1.-Registrar Cliente.. ");
              System.out.println("2.-Registrar Vehiculo.. ");
              System.out.println("3.-Solicitar Datos del clientes.. ");
              System.out.println("4.-Salir.. ");
              System.out.println("    ");
              System.out.println("-------------------------------");
              
              int opcion = scanner.nextInt();
              
              switch (opcion) {
                  
                   case 1: 
                       System.out.println("Registrando al cliente..");
                       scanner.nextLine();
                       
                       System.out.println("Ingrese un Nombre: ");
                       String Nombre = scanner.nextLine();
                       
                       System.out.println("Ingrese un Apellido: ");
                       String Apellido = scanner.nextLine();
                       
                       System.out.println("Ingrese un correo: ");
                       String Correo = scanner.nextLine();
                       
                       System.out.println("ingrese un telefono ");
                       int Telefono = scanner.nextInt();
                       
                       System.out.println("¿ El Cliente es nuevo ? ");
                       String Nuevo = scanner.nextLine();
                       
                       System.out.println("Valores ingresados de manera valida, precione intro para continuar. ");
                       scanner.nextLine();
                      
                      break;
                      
                   case 2:
                       
                       System.out.println("Registrando el vehiculo..");
                       scanner.nextLine();
                       
                       System.out.println("Ingrese el Modelo del vehiculo ");
                       String modelo = scanner.nextLine();
                       
                       System.out.println("Ingrese el tipo de rueda ");
                       String tipoRuedas = scanner.nextLine();
                       
                       System.out.println("El color del automovil: ");
                       String Color = scanner.nextLine();
                       
                       System.out.println("Ingrese la patente:");
                       int patente = scanner.nextInt();
                       
                       System.out.println("Ingrese que tipo de combustible usa.. ");
                       String combustible = scanner.nextLine();
                       
                       System.out.println("Valores ingresados de manera valida, presione intro para continuar. ");
                       scanner.nextLine();
                      
                      break;
                      
                   case 3: // INCOMPLETO //
                       
                       
                             System.out.println("------------------------------------");
                             System.out.println("Los ultimos datos ingresados son");
                             System.out.println("los datos del cliente " ) ;
                             System.out.println("    ");
                             System.out.println("los datos del vehiculo ");
                             System.out.println("    ");
                             System.out.println("------------------------------------");
                      
                      break; 
                      
                    case 4:
                        System.out.println("Gracias por usar nuestro servicio.... ");
                        scanner.close();
                      
                      break;
                      
                  default:
                      
                      System.out.println("La opcion escogida es incorrecta... ");
                      throw new AssertionError();

              }
              
              
        }
    
    }
    
}
