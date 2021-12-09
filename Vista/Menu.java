import Controlador.Tabla;
import Controlador.Trabajador;
import java.util.Scanner;  
import java.util.Random;
public class Menu{

  public Menu(){}
  
  public void imprimirMenu(){
    System.out.println("     ¡¡¡BIENVENIDO!!!");
      Scanner leer= new Scanner(System.in);
      int num;
      System.out.println("Favor de identificarse, presione 1, si usted es de recursos humanos o; 2, si usted es un trabajador");
      num = leer.nextInt();
      if (num == 1){
        Scanner read= new Scanner(System.in);
        String cont;
        System.out.println("Ingresa la contraseña");
        cont = read.nextLine();
        if (cont.equals("123")){
          Tabla tabla = new Tabla();
          int op = 0;
          while (op != 5){
          System.out.println("    Departamento de R.R.H.H.");
          Scanner lesen= new Scanner(System.in);
          System.out.println("Que desea hacer, seleccione una opcion:");
          System.out.println("1. Ver tabla");
          System.out.println("2. Modificar Registro");
          System.out.println("3. Eliminar Registro");
          System.out.println("4. Imprimir Tabla de datos");
          System.out.println("5. Salir");
          op = lesen.nextInt();
          switch(op){
              case 1: 
                tabla.imprimirTabla();
                break;
              case 2:
                int op1 = 0;
                while (op1 != 8){
                Scanner legere= new Scanner(System.in);
                System.out.println("Que desea hacer, seleccione una opcion:");
                System.out.println("1. Modificar Nombre");
                System.out.println("2. Modificar Apellido Paterno");
                System.out.println("3. Modificar Apellido Materno");
                System.out.println("4. Modificar Numero de trabajador");
                System.out.println("5. Modificar Edad");
                System.out.println("6. Modificar Años de Servicio");
                System.out.println("7. Modificar Direccion");
                System.out.println("8. Salir");
                op1 = legere.nextInt();
                switch(op1){
                  case 1:
                    System.out.println("Modificar nombre");
                    Scanner leerN = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numN = leerN.nextInt();
                    Scanner leerN2 = new Scanner(System.in);
                    System.out.println("Inserte el nuevo Nombre");
                    String nombre = leerN2.nextLine();
                    tabla.modificarNombre(numN, nombre);
                    break;
                  case 2:
                    System.out.println("Modificar apellido paterno");
                    Scanner leerAP = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numAP = leerAP.nextInt();
                    Scanner leerAP2 = new Scanner(System.in);
                    System.out.println("Inserte el nuevo Apellido Paterno");
                    String apellidoP = leerAP2.nextLine();
                    tabla.modificarApellidoP(numAP, apellidoP);
                    break;
                  case 3:
                    System.out.println("Modificar apellido materno");
                    Scanner ler = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    Scanner ler2 = new Scanner(System.in);
                    int cambio = ler2.nextInt();
                    System.out.println("Inserte el nuevo Apellido Materno");
                    String apellidom = ler.nextLine();
                    tabla.modificarApellidoM(cambio, apellidom);
                    break;
                  case 4:
                    System.out.println("Modificar numero de trabajador");
                    Scanner leitura = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numE = leitura.nextInt(); 
                    Scanner leitura1 = new Scanner(System.in);
                    System.out.println("\n Favor de digitar los numeros (1-50) previos al guion: ");
                    int num1 = leitura1.nextInt(); 
                    if (num1 > 50){System.out.println("Valor no valido favor de poner numeros entre 1 y 50");}
                    else{
                      int auxi = num1 + tabla.trabajadores[numE].getServicio();
                      if (auxi != 51){
                       System.out.println("Usted esta modificanto la seccion que ayuda a determinar los años de servicio del trabajador, para hacer esto se recomienda modificar: AÑOS DE SERVICIO");
                      }else{
                      Scanner leitura2 = new Scanner(System.in);
                      System.out.println("\n Favor de digitar los numeros (001 - 999) posteriores al guion: ");
                      int num2 = leitura.nextInt(); 
                      if(num2>999){System.out.println("Valor no valido favor de poner numeros entre 001 y 999");}
                      String numT = num1+"-"+num2;
                      tabla.modificarNumTrab(numE, numT);}}
                    break;
                  case 5:
                    System.out.println("Modificar edad");
                    Scanner llegir = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numA = llegir.nextInt(); 
                    Scanner llegir1 = new Scanner(System.in);
                    System.out.println("Inserte la nueva edad:");
                    int edad = llegir1.nextInt(); 
                    int aux1 = edad- tabla.trabajadores[numA].getServicio();
                    if (aux1<18){System.out.println("Valor no valido. El valor de los años de servicio es mayor a la edad, si desea poner este valor primero debe de cambia: AÑOS DE SERVICIO");}else{
                    tabla.modificarEdad(numA, edad);}
                    break;
                  case 6:
                    System.out.println("Modificar numero de trabajador");
                    Scanner lire = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numSer = lire.nextInt(); 
                    Scanner lire1 = new Scanner(System.in);
                    System.out.println("\n Ingrese el nuevo numero: ");
                    System.out.println("\n AVISO!!!!! ");
                    System.out.println("El numero de trabajador se modificara automaticamente");
                    int nuevo = lire1.nextInt();
                    int aux = tabla.trabajadores[numSer].getEdad() - nuevo;
                    if (aux < 18){
                      System.out.println("Valor invalido, los años de servicio son más que la edad de la persona, si desea poner este valor primero debe de cambia: EDAD");
                    }else {
                      int apoyo = 51 - nuevo;
                      int ran = (int) (Math.random()*999);
                      String numTA = apoyo+"-"+ran;
                      tabla.modificarNumTrabServ(numSer, numTA);
                      tabla.modificarAServ(numSer, nuevo);}
                    break;
                  case 7:
                    System.out.println("Modificar dirección");
                    int op2=0;
                    while (op2 != 6){
                    System.out.println("Bienvenido");
                    Scanner lesenDir= new Scanner(System.in);
                    System.out.println("Que desea hacer, seleccione una opcion:");
                    System.out.println("1. Modificar Calle ");
                    System.out.println("2. Modificar Numero Exterior");
                    System.out.println("3. Modificar Municipio");
                    System.out.println("4. Modificar Codigo Postal");
                    System.out.println("5. Modificar Estado");
                    System.out.println("6. Salir");
                    op2 = lesenDir.nextInt();
                    switch(op2){
                      case 1:
                        System.out.println("Modificar calle");
                        Scanner lesenDir1= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numC=lesenDir1.nextInt();
                        Scanner lesenDir2= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo nombre de la calle");
                        String calle =  lesenDir2.nextLine();
                        tabla.modificarCalle(numC, calle);
                      break; 
                      case 2:
                        System.out.println("Modificar numero exterior");
                        Scanner lesenDir3= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numCalle=lesenDir3.nextInt();
                        Scanner lesenDir4= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo numero exterior");
                        String numExt =  lesenDir4.nextLine();
                        tabla.modificarNumExt(numCalle, numExt);
                      break; 
                      case 3:
                        System.out.println("Modificar municipio");
                        Scanner lesenDir5= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numMun=lesenDir5.nextInt();
                        Scanner lesenDir6= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo nombre del municipio");
                        String municipio =  lesenDir6.nextLine();
                        tabla.modificarMunicipio(numMun, municipio);
                      break;
                      case 4:
                        System.out.println("Modificar codigo postal");
                        Scanner lesenDir7= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numCP=lesenDir7.nextInt();
                        Scanner lesenDir8= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo codigo Postal");
                        String coPostal =  lesenDir8.nextLine();
                        tabla.modificarCoPostal(numCP, coPostal);
                      break;
                      case 5:
                        System.out.println("Modificar estado");
                        Scanner lesenDir9= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numEst=lesenDir9.nextInt();
                        Scanner lesenDir10= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo nombre de la calle");
                        String estado =  lesenDir10.nextLine();
                        tabla.modificarEstado(numEst, estado);
                      break;
                      case 6:
                      break;  
                      default:
                      System.out.println("Opcion no valida");  
                    }
                    }
                    break;
                  case 8:
                    break; 
                  default:
                    System.out.println("Opcion no valida");                                   
                    }
                }
                break;
              case 3:
                System.out.println("Eliminar Registro");
                Scanner lire = new Scanner(System.in);
                System.out.println("Escriba el numero del registro que quiere que se elimine");
                int numEliminar = lire.nextInt(); 
                tabla.trabajadores[numEliminar] = null;
                break;
              case 4:
                tabla.impresionFinal();
                System.out.println("Archivo Guardado!!!");
                break;
              case 5:
                System.out.println("Hasta luego!!!!\n\n\nPrograma realizado por M.A.S");
                break;
              default:
                System.out.println("Opcion no valida");
            }
          }
        }else System.out.println("Error  Contraseña Incorrecta");
      }else if (num == 2) {
        Tabla tabla = new Tabla();
        int op=0;
        while (op != 3){
        System.out.println("Bienvenido");
        Scanner lesen= new Scanner(System.in);
        System.out.println("Que desea hacer, seleccione una opcion:");
        System.out.println("1. Ver tabla");
        System.out.println("2. Imprimir Tabla de datos");
        System.out.println("3. Salir");
        op = lesen.nextInt();
        switch(op){
          case 1:
            tabla.imprimirTabla();
            break;
          case 2:
            tabla.impresionFinal();
            System.out.println("Archivo Guardado!!!");
            break;
          case 3:
            System.out.println("Hasta luego!!!!\n\n\nPrograma realizado por M.A.S");
            break;
          default:
            System.out.println("Opcion no valida");}
      }
      } 
      else {
        System.out.println("ERROR  Opcion no valida");
      }
  }
}