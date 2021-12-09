package Modelo;
import java.util.Random;
public class Datos{
  private String nombre;
  private String apellido1;
  private String apellido2;
  private int edad;
  private String numTrab;
  private int servicio;
  private String direccion;
  private int numProyectos;
  private String proyectoH; 
  private String proyectoG; 
  private String proyectoV;


  public Datos(){
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(){
    String nom [] = {"ANTONIO","JOSE","MANUEL", "FRANCISCO","JUAN","DAVID","JOSE ANTONIO","JOSE LUIS","JAVIER", "JESUS", "FRANCISCO JAVIER", "CARLOS", "DANIEL", "MIGUEL", "RAFAEL", "JOSE MANUEL", "PEDRO", "ALEJANDRO", "ANGEL", "MIGUEL ANGEL", "JOSE MARIA", "FERNANDO", "LUIS", "PABLO", "SERGIO", "JORGE", "ALBERTO","JUAN CARLOS", "JUAN JOSE", "RAMON", "ENRIQUE", "DIEGO", "JUAN ANTONIO", "VICENTE", "ALVARO", "RAUL", "ADRIAN", "JOAQUIN", "IVAN", "ANDRES", "OSCAR", "RUBEN", "JUAN MANUEL", "SANTIAGO", "MARIA CARMEN","MARIA","CARMEN","JOSEFA","ISABEL", "ANA MARIA", "MARIA PILAR", "MARIA TERESA", "ANA", "LAURA", "FRANCISCA", "ANTONIA", "DOLORES","MARIA ANGELES", "CRISTINA","MARTA","MARIA JOSE","MARIA ISABEL","PILAR","LUCIA","CONCEPCION","ELENA","MERCEDES","MANUELA", "ROSA MARIA", "RAQUEL","SARA","PAULA","TERESA","ROSARIO","BEATRIZ","ROSA","SILVIA","MONTSERRAT","JULIA","PATRICIA","IRENE","MONICA","ANDREA","ROCIO","ANGELA","MAR","MARGARITA","SONIA"};
    Random ran = new Random();
    int select = ran.nextInt(nom.length); 
    nombre = nom[select];
  }

  public String getApellido1(){
    return apellido1;
  }

  public void setApellido1(){
    String ape [] = {"GARCIA","GONZALEZ","RODRIGUEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","RUIZ","HERNANDEZ","DIAZ","MORENO","ALVAREZ","MUÑOZ","ROMERO","ALONSO","GUTIERREZ","NAVARRO","TORRES","DOMINGUEZ","VAZQUEZ","RAMOS","GIL","RAMIREZ","SERRANO","BLANCO","SUAREZ","MOLINA","MORALES","ORTEGA","DELGADO","CASTRO","ORTIZ","RUBIO","MARIN","SANZ","NUÑEZ","IGLESIAS","MEDINA","GARRIDO","SANTOS","CASTILLO","CORTES","LOZANO","GUERRERO","CANO","PRIETO","MENDEZ","CALVO","CRUZ","GALLEGO","VIDAL","LEON","HERRERA","MARQUEZ","PEÑA","CABRERA","FLORES","CAMPOS","VEGA","DIEZ","FUENTES","CARRASCO","CABALLERO","NIETO","REYES","AGUILAR","PASCUAL","HERRERO","SANTANA","LORENZO","HIDALGO","MONTERO","IBAÑEZ","GIMENEZ","FERRER","DURAN","VICENTE","BENITEZ","MORA","SANTIAGO","ARIAS","VARGAS","CARMONA","CRESPO","ROMAN","PASTOR","SOTO","SAEZ","VELASCO","SOLER","MOYA","ESTEBAN","PARRA","BRAVO","GALLARDO","ROJAS","PARDO","MERINO","FRANCO","ESPINOSA","IZQUIERDO","LARA","RIVAS","SILVA","RIVERA","CASADO","ARROYO","REDONDO","CAMACHO","REY"};
    Random ran = new Random();
    int select = ran.nextInt(ape.length); 
    apellido1 = ape[select];
  }
  public String getApellido2(){
    return apellido2;
  }

  public void setApellido2(){
    String ape [] = {"GARCIA","GONZALEZ","RODRIGUEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","RUIZ","HERNANDEZ","DIAZ","MORENO","ALVAREZ","MUÑOZ","ROMERO","ALONSO","GUTIERREZ","NAVARRO","TORRES","DOMINGUEZ","VAZQUEZ","RAMOS","GIL","RAMIREZ","SERRANO","BLANCO","SUAREZ","MOLINA","MORALES","ORTEGA","DELGADO","CASTRO","ORTIZ","RUBIO","MARIN","SANZ","NUÑEZ","IGLESIAS","MEDINA","GARRIDO","SANTOS","CASTILLO","CORTES","LOZANO","GUERRERO","CANO","PRIETO","MENDEZ","CALVO","CRUZ","GALLEGO","VIDAL","LEON","HERRERA","MARQUEZ","PEÑA","CABRERA","FLORES","CAMPOS","VEGA","DIEZ","FUENTES","CARRASCO","CABALLERO","NIETO","REYES","AGUILAR","PASCUAL","HERRERO","SANTANA","LORENZO","HIDALGO","MONTERO","IBAÑEZ","GIMENEZ","FERRER","DURAN","VICENTE","BENITEZ","MORA","SANTIAGO","ARIAS","VARGAS","CARMONA","CRESPO","ROMAN","PASTOR","SOTO","SAEZ","VELASCO","SOLER","MOYA","ESTEBAN","PARRA","BRAVO","GALLARDO","ROJAS","PARDO","MERINO","FRANCO","ESPINOSA","IZQUIERDO","LARA","RIVAS","SILVA","RIVERA","CASADO","ARROYO","REDONDO","CAMACHO","REY"};
    Random ran = new Random();
    int select = ran.nextInt(ape.length); 
    apellido2 = ape[select];
  }

  public int getEdad(){
    return edad;
  }

  public void setEdad(){
    int numero = (int) (Math.random()*70);
      while (numero < 18){
        numero = (int) (Math.random()*70);; 
    }  
    edad = numero;
  }

  public int getServicio(){
    return servicio;
  }

  public void setServicio(){
    int numero = (int) (Math.random()*50);
    int aux = edad - numero;
    while (aux < 18){
      numero = (int) (Math.random()*50); 
      aux = edad - numero;
      if(numero==0){
        numero=1;
      }
    } 
    servicio = numero;
    }  

  public String getNumTrabajador(){
    return numTrab;
  }

  public void setNumTrabajador(){
    int ntab = 51 - servicio;
    int aux = (int) (Math.random()*999);
    numTrab = ntab+"-"+aux;
  }

  public String getProyectoH(){
    return proyectoH;
  }
  public void setProyectoH(){
    String pro [] = { "1. Producción de electricidad solar mediante sistemas de disco parabólico, a partir de fotoceldas de alta eficiencia.", "2. Mecanismos de señalización celular y blancos moleculares de nanobiocompositos de quitosano sobre la respuesta de estrés.", "3. Desarrollo y fabricación de módulos de celdas solares.", "4. Estudio de nanorreactores coloidales en la fabricación de nanofluidos.", "5. Desarrollo de métodos de imagenología térmica dinámica tridimensional.", "6. Red temática de química supramolecular.", "7. Diseño termofísico de componentes constructivos aligerados con características térmicas para elaborar muros.", "8. Procesamiento, caracterización y optimización de las propiedades eléctricas y ópticas de recubrimientos cerámicos.", "9. Efectos de interacción de ondas en problemas esencialmente no-integrables.", "10. Medición de los flujos de calor, vapor, carbono, metano y radiación neta dentro de los humedales.", "11. Cristales fotónicos y fonónicos no lineales.", "12. Wearable and self-powered electromagnetic radiation detectors based on II-VI semiconductors.", "13. Simulación numérica de actividad eléctrica cardiaca en dos y tres dimensiones.", "14. Entendimiento y control de algunas arritmias cardiacas.", "15. Equipamiento para la determinación de las demandas hídricas de los principales cultivos.", "16. Fortalecimiento a la infraestructura experimental en microscopia electrónica.", "17. Cristales fotónicos y fonónicos no lineales.", "18. Resinas funcionalizadas para retener iones metálicos de aguas contaminadas.", "19. Enfoque tipológico de los múltiples rasgos de la coherencia discursiva en lenguas amerindias.", "20. Laboratorio de dispersión de rayos x a ángulos pequeños (SAXS).", "21. Síntesis y estudio de nano estructuras de INXGAI XN.", "22. Aplicaciones en lámparas electroluniscentes y celdas solares.", "23. Fortalecimiento de la infraestructura en espectroscopia biomédica.", "24. Renovación y actualización de la infraestructura experimental para la síntesis y estudios de sistemas y nano sistemas.", "25. Interacción molecular entre péptidos funcionales de colágeno con quitosano.", "26. Mecanismos de incorporación y caracterización molecular del colágeno e dosidicus gigas.", "27. Métodos finitos y geométricos en sistemas dinámicos.", "28. Detección y correción de errores derivados de características geométricas en componentes.", "29. Especiación de arsénico en material particulado.", "30. Generación de receptores macrocíclicos tipo triazol.", "31. Fenomenología asociada a la síntesis por DVQSIH y al comportamiento optoelectrónico. ","32. Mochilas cohetes WIR11.", "33. Procesamiento de termografías para detección temprana de cáncer de mama.", "34. Estudio de la redistribución del agua del gluten de masa congelada y su efecto en los cambios proteicos y viscoelasticos.", "35. Impacto en la glomalina en el almacenamiento de carbono y estabilidad de los agregados en los suelos áridos.", "36. Difusión en membranas fluidas heterogéneas.", "37. Difusión en membranas fluidas heterogéneas", "38. Análisis, diagnóstico y desarrollo de estrategias para el aprovechamiento sostenible de agua y energía en la industria minera","39. Materiales nanoestructurados con aplicaciones a la salud y el medio ambiente.","40. Fortalecimiento del cuerpo académico biotecnología."};

    Random ran = new Random();
    int select = ran.nextInt(pro.length); 
    proyectoH = pro[select];
  }
  public String getProyectoG(){
    return proyectoG;
  }
  public void setProyectoG(){
    String pro [] = { "1. Producción de electricidad solar mediante sistemas de disco parabólico, a partir de fotoceldas de alta eficiencia.", "2. Mecanismos de señalización celular y blancos moleculares de nanobiocompositos de quitosano sobre la respuesta de estrés.", "3. Desarrollo y fabricación de módulos de celdas solares.", "4. Estudio de nanorreactores coloidales en la fabricación de nanofluidos.", "5. Desarrollo de métodos de imagenología térmica dinámica tridimensional.", "6. Red temática de química supramolecular.", "7. Diseño termofísico de componentes constructivos aligerados con características térmicas para elaborar muros.", "8. Procesamiento, caracterización y optimización de las propiedades eléctricas y ópticas de recubrimientos cerámicos.", "9. Efectos de interacción de ondas en problemas esencialmente no-integrables.", "10. Medición de los flujos de calor, vapor, carbono, metano y radiación neta dentro de los humedales.", "11. Cristales fotónicos y fonónicos no lineales.", "12. Wearable and self-powered electromagnetic radiation detectors based on II-VI semiconductors.", "13. Simulación numérica de actividad eléctrica cardiaca en dos y tres dimensiones.", "14. Entendimiento y control de algunas arritmias cardiacas.", "15. Equipamiento para la determinación de las demandas hídricas de los principales cultivos.", "16. Fortalecimiento a la infraestructura experimental en microscopia electrónica.", "17. Cristales fotónicos y fonónicos no lineales.", "18. Resinas funcionalizadas para retener iones metálicos de aguas contaminadas.", "19. Enfoque tipológico de los múltiples rasgos de la coherencia discursiva en lenguas amerindias.", "20. Laboratorio de dispersión de rayos x a ángulos pequeños (SAXS).", "21. Síntesis y estudio de nano estructuras de INXGAI XN., 22. Aplicaciones en lámparas electroluniscentes y celdas solares.", "23. Fortalecimiento de la infraestructura en espectroscopia biomédica.", "24. Renovación y actualización de la infraestructura experimental para la síntesis y estudios de sistemas y nano sistemas.", "25. Interacción molecular entre péptidos funcionales de colágeno con quitosano.", "26. Mecanismos de incorporación y caracterización molecular del colágeno e dosidicus gigas.", "27. Métodos finitos y geométricos en sistemas dinámicos.", "28. Detección y correción de errores derivados de características geométricas en componentes.", "29. Especiación de arsénico en material particulado.", "30. Generación de receptores macrocíclicos tipo triazol.", "31. Fenomenología asociada a la síntesis por DVQSIH y al comportamiento optoelectrónico. ","32. Mochilas cohetes WIR11.", "33. Procesamiento de termografías para detección temprana de cáncer de mama.", "34. Estudio de la redistribución del agua del gluten de masa congelada y su efecto en los cambios proteicos y viscoelasticos.", "35. Impacto en la glomalina en el almacenamiento de carbono y estabilidad de los agregados en los suelos áridos.", "36. Difusión en membranas fluidas heterogéneas.", "37. Difusión en membranas fluidas heterogéneas", "38. Análisis, diagnóstico y desarrollo de estrategias para el aprovechamiento sostenible de agua y energía en la industria minera","39. Materiales nanoestructurados con aplicaciones a la salud y el medio ambiente.","40. Fortalecimiento del cuerpo académico biotecnología.","41. VIGENTE Bioactivación de polímeros electroconductores para aplicaciones biomédicas", "42. VIGENTE Inducción de la actividad enzimática digestiva de RHYZOPERTHA DOMINICA y su relación con la resistencia del grano de trigo", "43. VIGENTE UNISON_COVID-19: comportamiento del brote epidémico COVID-19 en sonora, bajo diferentes escenarios de control", "44. VIGENTE Dispositivo para disminución de contagio aerotransportado de virus COVID19", "45. VIGENTE Predictores psicológicos, demográficos y contextuales de las conductas preventivas del COVID-19: un modelo estructural", "46. VIGENTE Identificación y clasificación del movimiento de los dedos de la mano humana en escenarios estructurados", "47. VIGENTE Estudio químico-estructural, molecular y biológico de compuestos con actividad quimiopreventiva purificados a partir de organismos marinos", "48. VIGENTE Estudio del efecto sers en nanopartículas metálicas y nanoestructuras de carbono", "49. VIGENTE Estudio in vitro de las interacciones moleculares del receptor hepático ASHWELL- MORELL", "50. VIGENTE Variables ecológicas predictoras de la resiliencia académica de estudiantes de bachillerato: un estudio longitudinal."};

    Random ran = new Random();
    int select = ran.nextInt(pro.length); 
    proyectoG = pro[select];
  }
  
  public String getProyectoV(){
    return proyectoV;
  }

  public void setProyectoV(){
    String pro [] = { "41. VIGENTE Bioactivación de polímeros electroconductores para aplicaciones biomédicas", "42. VIGENTE Inducción de la actividad enzimática digestiva de RHYZOPERTHA DOMINICA y su relación con la resistencia del grano de trigo", "43. VIGENTE UNISON_COVID-19: comportamiento del brote epidémico COVID-19 en sonora, bajo diferentes escenarios de control", "44. VIGENTE Dispositivo para disminución de contagio aerotransportado de virus COVID19", "45. VIGENTE Predictores psicológicos, demográficos y contextuales de las conductas preventivas del COVID-19: un modelo estructural", "46. VIGENTE Identificación y clasificación del movimiento de los dedos de la mano humana en escenarios estructurados", "47. VIGENTE Estudio químico-estructural, molecular y biológico de compuestos con actividad quimiopreventiva purificados a partir de organismos marinos", "48. VIGENTE Estudio del efecto sers en nanopartículas metálicas y nanoestructuras de carbono", "49. VIGENTE Estudio in vitro de las interacciones moleculares del receptor hepático ASHWELL- MORELL", "50. VIGENTE Variables ecológicas predictoras de la resiliencia académica de estudiantes de bachillerato: un estudio longitudinal."};

    Random ran = new Random();
    int select = ran.nextInt(pro.length); 
    proyectoV = pro[select];
    }

  public int getNumProyectos(){
    return numProyectos;
  }

  public void setNumProyectos(){
    if (servicio == 1){numProyectos = 1;}
    else{
    int numero = (int) (Math.random()*50);
      while (numero > servicio){
        numero = (int) (Math.random()*50);; 
    } 
    numProyectos = numero;}
  }

}