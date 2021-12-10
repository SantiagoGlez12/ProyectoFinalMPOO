package Modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
public class Direccion{
  //Atributos
  private String Calle;
  private String NumeroExterior;
  private String Municipio;
  private String CoPostal;
  private String Estado;
  //Constructores
  public Direccion(String Calle, String NumeroExterior, String Municipio, String CoPostal, String Estado){
    this.Calle = Calle;
    this.NumeroExterior = NumeroExterior;
    this.Municipio = Municipio;
    this.CoPostal = CoPostal;
    this.Estado = Estado;
  }

  public Direccion(int Elemento){
    try{
      FileReader tabla = new FileReader("Direcciones.csv"); //Llamamos el documento *.csv que contiene direcciones
      BufferedReader buffer = new BufferedReader(tabla);
      String linea =buffer.readLine();
      int count = 0,i=0;
      while(linea!=null){ //Usamos el while para que leamos hasta encontrar un null
       if(i==Elemento){
        StringTokenizer tokenizador= new StringTokenizer(linea,",");
        while(tokenizador.hasMoreTokens()){ // utilizamos el while para asignar los valores a las variables
          String aux= tokenizador.nextToken();
          if(count==0)
            Calle=aux;
            else if(count == 1)
              NumeroExterior=aux;
              else if(count == 2)
                Municipio=aux;
                else if(count == 3)
                  CoPostal=aux;
                    else if(count == 4)
                    Estado=aux;
          count++;
        }
       }
       linea=buffer.readLine();
       i++;
      }
      buffer.close();
   }catch(ArrayIndexOutOfBoundsException e){
   }catch(FileNotFoundException ex){
    System.out.println(ex.getMessage());
    }catch(NullPointerException e){     
      }catch(IOException ex){
    System.out.println(ex.getMessage());
    }
    
  }
//Metodos
//seccion set-get para la formacion de las direcciones
public void setCalle(String Calle){
  this.Calle=Calle;
}
public void setNumeroExterior(String NumeroExterior){
  this.NumeroExterior=NumeroExterior;
}
public void setMunicipio(String Municipio){
  this.Municipio=Municipio;
}
public void setCoPostal(String CoPostal){
  this.CoPostal=CoPostal;
}
public void setEstado(String Estado){
  this.Estado=Estado;
}
public String getCalle(){
return Calle;
}
public String getNumeroExterior(){
  return NumeroExterior;
}
public String getMunicipio(){
  return Municipio;
}
public String getCoPostal(){
  return CoPostal;
}
public String getEstado(){
  return Estado;
}
//Concatenaos todo en el Override
@Override
public String toString(){
    return "Calle: "+Calle+" NumeroExterior: "+NumeroExterior+" Municipio: "+Municipio+" CodigoPostal: "+CoPostal+" Estado: "+Estado;
  }
}