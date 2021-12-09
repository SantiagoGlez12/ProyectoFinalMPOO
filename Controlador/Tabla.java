package Controlador;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import Controlador.Trabajador;
import Modelo.Direccion;
import java.lang.NullPointerException;
public class Tabla{
  public int NumTrabajadores=5;
  public Trabajador[] trabajadores = new Trabajador[NumTrabajadores];
  
  public Tabla(){
    for(int i=1;i<NumTrabajadores;i++){
    trabajadores[i]= new Trabajador(i);
    }
  }


  

  public void imprimirTabla(){
  for(int i=1;i<NumTrabajadores;i++){
    System.out.println("**********************");
    //int aux = i+1;
    System.out.println("Trabajador: "+i);
    try{
    trabajadores[i].imprimirTrabajador();
    }catch(NullPointerException ex){
      System.out.println(ex.getMessage());
    }
    }
  }

  public void impresionFinal(){
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

  public void modificarNombre(int num, String nombre){
  trabajadores[num].setNombre(nombre);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarApellidoP(int num, String apellido){
  trabajadores[num].setApellidoP(apellido);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarApellidoM(int num, String apellido){
  trabajadores[num].setApellidoM(apellido);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarNumTrab(int num, String numT){
  trabajadores[num].setNumTrabajador(numT);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarEdad(int num, int edad){
  trabajadores[num].setEdad(edad);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarAServ(int num, int anos){
  trabajadores[num].setServicio(anos);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarNumTrabServ(int num, String numT){
  trabajadores[num].setNumTrabajador(numT);
  }

  public void modificarCalle(int num, String Calle){
  trabajadores[num].direccion.setCalle(Calle);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarNumExt(int num, String numExt){
  trabajadores[num].direccion.setNumeroExterior(numExt);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarMunicipio(int num, String municipio){
  trabajadores[num].direccion.setMunicipio(municipio);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarCoPostal(int num, String coPostal){
  trabajadores[num].direccion.setCoPostal(coPostal);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  public void modificarEstado(int num, String estado){
  trabajadores[num].direccion.setEstado(estado);
  System.out.println("Cambio realizado con exito!");
  trabajadores[num].imprimirTrabajador();
  }

  

}