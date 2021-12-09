package Controlador;
import Modelo.Datos;
import Modelo.Direccion;
public class Trabajador{
  private String nombre;
  private String apellido1;
  private String apellido2;
  private int edad;
  private String numTrab;
  private int servicio;
  private int numProyectos;
  private String proyectoH; 
  private String proyectoG; 
  private String proyectoV;
  private String impresion;
  private int El = 0;  
  Datos dato = new Datos();
  private int dir = (int) (Math.random()*30);
  Direccion direccion = new Direccion(dir);

  public Trabajador(int El){
    this.El = El;
    dato.setNombre();
    nombre = dato.getNombre();
    dato.setApellido1();
    apellido1 = dato.getApellido1();
    dato.setApellido2();
    apellido2 = dato.getApellido2();
    dato.setEdad();
    edad = dato.getEdad();
    dato.setServicio();
    servicio = dato.getServicio();
    dato.setProyectoH();
    dato.setNumTrabajador();
    numTrab = dato.getNumTrabajador();
    dato.setNumProyectos();
    numProyectos = dato.getNumProyectos();
    proyectoH = dato.getProyectoH();
    dato.setProyectoG();
    proyectoG = dato.getProyectoG();
    dato.setProyectoV();
    proyectoV = dato.getProyectoV();
  }
  
  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public String getApellidoP(){
    return apellido1;
  }

  public void setApellidoP(String apellido1){
    this.apellido1=apellido1;
  }
  public String getApellidoM(){
    return apellido2;
  }

  public void setApellidoM(String apellido2){
    this.apellido2=apellido2;
  }

  public int getEdad(){
    return edad;
  }

  public void setEdad(int edad){
    this.edad=edad;
  }

  public int getServicio(){
    return servicio;
  }

  public void setServicio(int servicio){
    this.servicio=servicio;
    }  

  public String getNumTrabajador(){
    return numTrab;
  }

  public void setNumTrabajador(String numTrab){
    this.numTrab=numTrab;
  }

  public int getNumProyectos(){
    return numProyectos;
  }

  public void setNumProyectos(){  
    this.numProyectos=numProyectos;
  }

  public String getProyectoH(){
    return proyectoH;
  }
  public void setProyectoH(String proyectoH){
    this.proyectoH=proyectoH;
  }
  public String getProyectoG(){
    return proyectoG;
  }
  public void setProyectoG(String proyectoG){
    this.proyectoG=proyectoG;
  }
  
  public String getProyectoV(){
    return proyectoV;
  }

  public void setProyectoV(String proyectoV){
    this.proyectoV=proyectoV;
    }

  public String getImpresion(){
    return impresion;
  }
  
  public void setImpresion(){
    if(numProyectos == 1){
    impresion = nombre+","+apellido1+","+apellido2+","+numTrab+","+edad+","+servicio+","+direccion.toString()+","+numProyectos+","+proyectoV;}
    else if(numProyectos == 2){
      impresion = nombre+","+apellido1+","+apellido2+","+numTrab+","+edad+","+servicio+","+direccion.toString()+","+numProyectos+","+proyectoG+proyectoV;}
    else if(numProyectos == 0){
    impresion = nombre+","+apellido1+","+apellido2+","+numTrab+","+edad+","+servicio+","+direccion.toString()+",0,NO TIENE PROYECTOS";}
    else{
      impresion = nombre+","+apellido1+","+apellido2+","+numTrab+","+edad+","+servicio+","+direccion.toString()+","+numProyectos+","+proyectoH+proyectoG+proyectoV;}
    }

  public String impresionFinal(){
    setImpresion();
    impresion = getImpresion();
    return impresion;
  }

  public void imprimirTrabajador(){
    if(numProyectos == 0){
      System.out.println("Nombre: "+nombre+" "+apellido1+" "+apellido2+"\nNumero de trabajador: "+numTrab+"\nEdad: "+edad+"\nAños de Servicio: "+servicio+"\nDireccion:\n"+direccion.toString()+"\nNueva contratacion, NO HAY PROYECTOS");
    }
    else if(numProyectos == 1){
      System.out.println("Nombre: "+nombre+" "+apellido1+" "+apellido2+"\nNumero de trabajador: "+numTrab+"\nEdad: "+edad+"\nAños de Servicio: "+servicio+"\nDireccion:\n"+direccion.toString()+"\nNumero de Proyectos:"+numProyectos+"\nUltimos proyectos:\n"+proyectoV);
    }else if(numProyectos == 2){
      System.out.println("Nombre: "+nombre+" "+apellido1+" "+apellido2+"\nNumero de trabajador: "+numTrab+"\nEdad: "+edad+"\nAños de Servicio: "+servicio+"\nDireccion:\n"+direccion.toString()+"\nNumero de Proyectos:"+numProyectos+"\nUltimos proyectos:\n"+proyectoG+"\n"+proyectoV);
    }
    else{
      System.out.println("Nombre: "+nombre+" "+apellido1+" "+apellido2+"\nNumero de trabajador: "+numTrab+"\nEdad: "+edad+"\nAños de Servicio: "+servicio+"\nDireccion:\n"+direccion.toString()+"\nNumero de Proyectos:"+numProyectos+"\nUltimos proyectos\n "+proyectoH+"\n"+proyectoG+"\n Vigentes\n"+proyectoV);
    }}
}