package Vista;
import Controlador.Tabla;         //Importamos a Tabla de su paquete para poderlos usar aqui
import Controlador.Trabajador;    //Importamos a Trabajador de su paquete para poderlos usar aqui
import java.util.Scanner;         // Importamos Scanner para poder ocupar sus funciones
import java.util.Random;          // Importamos Random para poder ocupar sus funciones
public class Menu{

  public Menu(){}
  
  //La funcion imprimirMenu() nos permitira visualizar el menu e interactuar con el en la terminal
  public void imprimirMenu(){  
    System.out.println("     ¡¡¡BIENVENIDO!!!");
      Scanner leer= new Scanner(System.in);
      int num;
      System.out.println("Favor de identificarse, presione 1, si usted es de recursos humanos o; 2, si usted es un trabajador");
      num = leer.nextInt();
      //Ocupamos el if para crear un Login la opcion 1 nos permitira acceder al perfil de RRHH y la opcion 2 a Trabajador
      if (num == 1){
        Scanner read= new Scanner(System.in);
        String cont;
        System.out.println("Ingresa la contraseña");
        cont = read.nextLine();
        //Si se selecciona a RRHH se pedira una contraseña en forma de String
        if (cont.equals("123")){
          Tabla tabla = new Tabla();   //Aqui es cuando se crea la tabla con los datos del trabajador
          int op = 0;
          while (op != 5){     //Usamos un While para que el programa muestre el menu nuevamente hasta que el usuario presione la opcion de salida
          System.out.println("    Departamento de R.R.H.H.");
          Scanner lesen= new Scanner(System.in);
          System.out.println("Que desea hacer, seleccione una opcion:");
          System.out.println("1. Ver tabla");
          System.out.println("2. Modificar Registro");
          System.out.println("3. Eliminar Registro");
          System.out.println("4. Imprimir Tabla de datos");
          System.out.println("5. Salir");
          op = lesen.nextInt();
          switch(op){    // Switch para generar un menu
              case 1: 
                tabla.imprimirTabla(); //Llamamos a la funcion de imprimirTabla() para mostrar los datos que tenemos almacenados en la tabla
                break;
              case 2:     //Como en este caso hay muchas cosas que se puden modificar decidimos usar otro Switch
                int op1 = 0;
                while (op1 != 8){ // USamos un While para que no se salga del menu hasta que el usuario seleccione la opcion 8
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
                  case 1: //Caso para Modificar nombre 
                    System.out.println("Modificar nombre");
                    Scanner leerN = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numN = leerN.nextInt(); //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                    Scanner leerN2 = new Scanner(System.in);
                    System.out.println("Inserte el nuevo Nombre");
                    String nombre = leerN2.nextLine();//Escaneamos la linea para obtener el nuevo valor de Nombre
                    tabla.modificarNombre(numN, nombre);//Llamamos la funcion para modificar el Nombre
                    break;
                  case 2: //Caso para Modificar apellido paterno
                    System.out.println("Modificar apellido paterno");
                    Scanner leerAP = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numAP = leerAP.nextInt(); //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                    Scanner leerAP2 = new Scanner(System.in);
                    System.out.println("Inserte el nuevo Apellido Paterno");
                    String apellidoP = leerAP2.nextLine(); //Escaneamos la linea para poder modifocar el apellido 
                    tabla.modificarApellidoP(numAP, apellidoP); //Llamamos la funcion para obtener el nuevo valor de Apellido Paterno
                    break;
                  case 3: //Caso para Modificar apellido materno
                    System.out.println("Modificar apellido materno");
                    Scanner ler = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    Scanner ler2 = new Scanner(System.in);
                    int cambio = ler2.nextInt();//Escaneamos numero entero recibido para indicar que persona se quiere modificar
                    System.out.println("Inserte el nuevo Apellido Materno");
                    String apellidom = ler.nextLine();//Escaneamos la linea para obtener el nuevo valor de apellido materno
                    tabla.modificarApellidoM(cambio, apellidom); //Llamamos la funcion para modificar el Apellido Materno
                    break;
                  case 4: //Caso para Modificar numero de trabajador
                    System.out.println("Modificar numero de trabajador");
                    Scanner leitura = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numE = leitura.nextInt(); //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                    Scanner leitura1 = new Scanner(System.in);
                    System.out.println("\n Favor de digitar los numeros (1-50) previos al guion: ");  //Separamos los digitos de esta forma para poder evaluar y hacer calculosmas facilmente 
                    int num1 = leitura1.nextInt(); //Escaneamos la linea para poder modifocar los prmeros digitos del numero de trabajador
                    if (num1 > 50){System.out.println("Valor no valido favor de poner numeros entre 1 y 50");}  //Restriccion para que metan valores dentro de los parametros
                    else{
                      int auxi = num1 + tabla.trabajadores[numE].getServicio(); // Auxiliar para ver que no se haya modificado el primer digito
                      if (auxi != 51){//Usamos este if para ver que no cambien el numero del principio ya que este esta relacionado con los años de servicio y es mas facil modificar el año de servicio solo ya que al cambiar los años de servicio se camnia automaticmente el numero
                       System.out.println("Usted esta modificanto la seccion que ayuda a determinar los años de servicio del trabajador, para hacer esto se recomienda modificar: AÑOS DE SERVICIO");
                      }else{
                      Scanner leitura2 = new Scanner(System.in);
                      System.out.println("\n Favor de digitar los numeros (001 - 999) posteriores al guion: ");
                      int num2 = leitura.nextInt();  // Leemos el segundo digito
                      if(num2>999){System.out.println("Valor no valido favor de poner numeros entre 001 y 999");} // IF para que pongan valores dentro de los parametros
                      String numT = num1+"-"+num2; //Unimos los dos valores en forma de String para poder asignarselo a la funcion de modificacion
                      tabla.modificarNumTrab(numE, numT);}} //Llamamos la funcion para modificar el Numero del trabajador
                    break;
                  case 5: //Caso para Modificar edad
                    System.out.println("Modificar edad");
                    Scanner llegir = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numA = llegir.nextInt(); //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                    Scanner llegir1 = new Scanner(System.in);
                    System.out.println("Inserte la nueva edad:");
                    int edad = llegir1.nextInt();  //Escaneamos la linea para poder obtener el nuevo valor de edad
                    int aux1 = edad- tabla.trabajadores[numA].getServicio(); // Usamos este auxiliar para restarle los años de servicio a edad
                    if (aux1<18){System.out.println("Valor no valido. El valor de los años de servicio es mayor a la edad, si desea poner este valor primero debe de cambia: AÑOS DE SERVICIO");}else{ // El if restinge a que la persona no pueda tener menos de 18 años y que la diferencia entre sus años de servicio y su edad no sea menor a 18 
                    tabla.modificarEdad(numA, edad);} //Llamamos a la funcion para modificar la Edad 
                    break;
                  case 6: //Caso para Modificar años de servicio
                    System.out.println("Modificar numero de trabajador");
                    Scanner lire = new Scanner(System.in);
                    System.out.println("\nInserte el numero del empleado que desea cambiar");
                    int numSer = lire.nextInt(); //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                    Scanner lire1 = new Scanner(System.in);
                    System.out.println("\n Ingrese el nuevo numero: ");
                    System.out.println("\n AVISO!!!!! ");
                    System.out.println("El numero de trabajador se modificara automaticamente");
                    int nuevo = lire1.nextInt(); //Escaneamos la linea para poder obtener el nuevo valor de años de Servicio
                    int aux = tabla.trabajadores[numSer].getEdad() - nuevo;
                    if (aux < 18){ // If para evitar que los años de servicio sean mayores que los años de la persona 
                      System.out.println("Valor invalido, los años de servicio son más que la edad de la persona, si desea poner este valor primero debe de cambia: EDAD");
                    }else {
                      int apoyo = 51 - nuevo;
                      int ran = (int) (Math.random()*999); // Aqui modificamos automaticamente en numero de trabajador ya que los años de servicio van relacionados con el primer digito del numero de trabajador
                      String numTA = apoyo+"-"+ran;
                      tabla.modificarNumTrabServ(numSer, numTA); //Funcion especial para esta operacion, para modificar el numero de trabajador
                      tabla.modificarAServ(numSer, nuevo);} // LLamamos funcion para modificar los años de servicio
                    break;
                  case 7: //Como en este caso hay muchas cosas que se puden modificar decidimos usar otro Switch
                    System.out.println("Modificar dirección");
                    int op2=0;
                    while (op2 != 6){ // While para que no se salga del menu hasta que el usuario ocupe la opcion 6
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
                      case 1:  //Caso para modificar calle
                        System.out.println("Modificar calle");
                        Scanner lesenDir1= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numC=lesenDir1.nextInt();//Escaneamos numero entero recibido para indicar que persona se quiere modificar
                        Scanner lesenDir2= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo nombre de la calle");
                        String calle =  lesenDir2.nextLine();//Escaneamos la linea para poder obtener el nuevo valor de calle
                        tabla.modificarCalle(numC, calle);//Llamamos la funcion de modificar Calle
                      break; 
                      case 2:  //Caso para modificar numero exterior
                        System.out.println("Modificar numero exterior");
                        Scanner lesenDir3= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numCalle=lesenDir3.nextInt();//Escaneamos numero entero recibido para indicar que persona se quiere modificar
                        Scanner lesenDir4= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo numero exterior");
                        String numExt =  lesenDir4.nextLine();//Escaneamos la linea para poder obtener el nuevo valor de numero exterior
                        tabla.modificarNumExt(numCalle, numExt);//Llamamos la funcion de modificar Numero Exterior
                      break; 
                      case 3:  //Caso para modificar municipio
                        System.out.println("Modificar municipio");
                        Scanner lesenDir5= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numMun=lesenDir5.nextInt();//Escaneamos numero entero recibido para indicar que persona se quiere modificar
                        Scanner lesenDir6= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo nombre del municipio");
                        String municipio =  lesenDir6.nextLine();//Escaneamos la linea para poder obtener el nuevo valor de municipio
                        tabla.modificarMunicipio(numMun, municipio);//Llamamos la funcion de modificar Municipio
                      break;
                      case 4:  //Caso para modificar codigo postal
                        System.out.println("Modificar codigo postal");
                        Scanner lesenDir7= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numCP=lesenDir7.nextInt();  //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                        Scanner lesenDir8= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo codigo Postal");
                        String coPostal =  lesenDir8.nextLine();//Escaneamos la linea para poder obtener el nuevo valor de codigo postal
                        tabla.modificarCoPostal(numCP, coPostal);//Llamamos la funcion de modificar Codigo Postal
                      break;
                      case 5:  //Caso para modificar estado
                        System.out.println("Modificar estado");
                        Scanner lesenDir9= new Scanner(System.in);
                        System.out.println("\nInserte el numero del empleado que desea cambiar");
                        int numEst=lesenDir9.nextInt();  //Escaneamos numero entero recibido para indicar que persona se quiere modificar
                        Scanner lesenDir10= new Scanner(System.in);
                        System.out.println("\nInserte el nuevo nombre de la calle");
                        String estado =  lesenDir10.nextLine();//Escaneamos la linea para poder obtener el nuevo valor de estado
                        tabla.modificarEstado(numEst, estado);//Llamamos la funcion de modificar Estado
                      break;
                      case 6: //Caso de salida
                      break;  
                      default:
                      System.out.println("Opcion no valida");  
                    }
                    }
                    break;
                  case 8: //Caso de salida
                    break; 
                  default:
                    System.out.println("Opcion no valida");                                   
                    }
                }
                break;
              case 3: //Caso para Eliminar Registros
                System.out.println("Eliminar Registro");
                Scanner lire = new Scanner(System.in);
                System.out.println("Escriba el numero del registro que quiere que se elimine");
                int numEliminar = lire.nextInt();//Escaneamos la linea para obtener el numero de identificacion del trabajador que se desea eliminar 
                tabla.trabajadores[numEliminar] = null; //igualamos al trabajador a null para eliminarlo
                break;
              case 4: //Caso para imprimir Archivo *.csv
                tabla.impresionFinal(); //Llamamos al metodo para que imprima la tabla en el archivo *.csv 
                System.out.println("Archivo Guardado!!!");
                break;
              case 5: //Caso para Salir
                System.out.println("Hasta luego!!!!\n\n\nPrograma realizado por M.A.S");
                break;
              default:
                System.out.println("Opcion no valida");
            }
          }
        }else System.out.println("Error  Contraseña Incorrecta");
      }else if (num == 2) {
        Tabla tabla = new Tabla(); //Aqui es cuando se crea la tabla con los datos del trabajador
        int op=0;
        while (op != 3){
        System.out.println("Bienvenido");//Menu, se despliega para los trabajadores, unicamente para consulta
        Scanner lesen= new Scanner(System.in);
        System.out.println("Que desea hacer, seleccione una opcion:");
        System.out.println("1. Ver tabla");
        System.out.println("2. Imprimir Tabla de datos");
        System.out.println("3. Salir");
        op = lesen.nextInt();
        switch(op){
          case 1: //Caso de Impresion en Terminal
            tabla.imprimirTabla();//Llamamos a la funcion de imprimirTabla() para mostrar los datos que tenemos almacenados en la tabla
            break;
          case 2: //Caso de impresion en archivo *.csv
            tabla.impresionFinal(); //Llamamos al metodo para que imprima la tabla en el archivo *.csv 
            System.out.println("Archivo Guardado!!!");
            break;
          case 3: //Caso para la salida
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