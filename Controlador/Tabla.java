package Controlador;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import Controlador.Trabajador;   //Importamos a Trabajador de su paquete para poderlos usar aqui
import Modelo.Direccion;         //Importamos a Direccion de su paquete para poderlos usar aqui
import java.lang.NullPointerException;
public class Tabla{
  //Atributos
  public int NumTrabajadores=101; //Le damos el valor al arreglo
  public Trabajador[] trabajadores = new Trabajador[NumTrabajadores]; //Inicializamos un arreglo de trabajadores
  //Constructores
  public Tabla(){
    for(int i=1;i<NumTrabajadores;i++){
    trabajadores[i]= new Trabajador(i);
    }
  }


  
  //Metodos
  public void imprimirTabla(){  //Metodo para imprimir tabla en terminal
  for(int i=1;i<NumTrabajadores;i++){  // Ciclo para imprimir la cantidad de trabajadores deseados
    System.out.println("**********************");
    //int aux = i+1;
    System.out.println("Trabajador: "+i);
    try{
    trabajadores[i].imprimirTrabajador();
    }catch(NullPointerException ex){ // Excepcion para imprimir aun cuando encuentre un null
      System.out.println(ex.getMessage());
    }
    }
  }

  public void impresionFinal(){  //Metodo para imprimir tabla en el archivo *.csv
    try{
      FileWriter fw = new FileWriter("TablaTrabajadores.csv");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter salida = new PrintWriter(bw);
      salida.println("Nombre,Apellido Paterno,Apellido Materno,No.Trabajador,Edad,Años Servicio,Direccion,No. Proyectos,Ultimos Proyectos");
      for(int i=1;i<NumTrabajadores;i++){
        salida.println(trabajadores[i].impresionFinal());
      }
      salida.close();
    }catch(IOException ex){
      System.out.println(ex.getMessage());
    }}

  public void modificarNombre(int num, String nombre){ //Metodo para modificar el Nombre
  trabajadores[num].setNombre(nombre);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarApellidoP(int num, String apellido){ //Metodo para modificar el Apellido Paterno
  trabajadores[num].setApellidoP(apellido);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarApellidoM(int num, String apellido){ //Metodo para modificar el Apellido Materno
  trabajadores[num].setApellidoM(apellido);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarNumTrab(int num, String numT){ //Metodo para modificar el Numero del trabajador
  trabajadores[num].setNumTrabajador(numT);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarEdad(int num, int edad){ //Metodo para modificar la Edad
  trabajadores[num].setEdad(edad);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarAServ(int num, int anos){ //Metodo para modificar los años de Servicio
  trabajadores[num].setServicio(anos);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarNumTrabServ(int num, String numT){ //Metodo para modificar el Numero del trabajador, espcial para cambiarlo en la funcion de cambiar año de servicio
  trabajadores[num].setNumTrabajador(numT);
  }

  public void modificarCalle(int num, String Calle){ //Metodo para modificar la Calle
  trabajadores[num].direccion.setCalle(Calle);//Modificamos .direccionya que ahi estan los seters y geters de las direcciones
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarNumExt(int num, String numExt){ //Metodo para modificar el Numero exterior
  trabajadores[num].direccion.setNumeroExterior(numExt);//Modificamos .direccionya que ahi estan los seters y geters de las direcciones
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarMunicipio(int num, String municipio){ //Metodo para modificar el Municipio
  trabajadores[num].direccion.setMunicipio(municipio);//Modificamos .direccionya que ahi estan los seters y geters de las direcciones
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarCoPostal(int num, String coPostal){ //Metodo para modificar el Codigo Postal
  trabajadores[num].direccion.setCoPostal(coPostal);//Modificamos .direccionya que ahi estan los seters y geters de las direcciones
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarEstado(int num, String estado){ //Metodo para modificar el Estado
  trabajadores[num].direccion.setEstado(estado);//Modificamos .direccionya que ahi estan los seters y geters de las direcciones
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  

}