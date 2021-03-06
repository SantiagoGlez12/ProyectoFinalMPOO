package Modelo;
import java.util.Random;//Libreria en Java para datos aleatorios
public class Datos{ //clase datos, se declaran sus con
  //Atributos
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

  //Constructores
  public Datos(){}

  //Metodos
  public String getNombre(){
    return nombre;
  }

  public void setNombre() { //Le damos valor a la variable con un nombre aleatorio del arreglo de nombres que tenemos
    String nom [] = {"ANTONIO","JOSE","MANUEL", "FRANCISCO","JUAN","DAVID","JOSE ANTONIO","JOSE LUIS","JAVIER", "JESUS", "FRANCISCO JAVIER", "CARLOS", "DANIEL", "MIGUEL", "RAFAEL", "JOSE MANUEL", "PEDRO", "ALEJANDRO", "ANGEL", "MIGUEL ANGEL", "JOSE MARIA", "FERNANDO", "LUIS", "PABLO", "SERGIO", "JORGE", "ALBERTO","JUAN CARLOS", "JUAN JOSE", "RAMON", "ENRIQUE", "DIEGO", "JUAN ANTONIO", "VICENTE", "ALVARO", "RAUL", "ADRIAN", "JOAQUIN", "IVAN", "ANDRES", "OSCAR", "RUBEN", "JUAN MANUEL", "SANTIAGO", "MARIA CARMEN","MARIA","CARMEN","JOSEFA","ISABEL", "ANA MARIA", "MARIA PILAR", "MARIA TERESA", "ANA", "LAURA", "FRANCISCA", "ANTONIA", "DOLORES","MARIA ANGELES", "CRISTINA","MARTA","MARIA JOSE","MARIA ISABEL","PILAR","LUCIA","CONCEPCION","ELENA","MERCEDES","MANUELA", "ROSA MARIA", "RAQUEL","SARA","PAULA","TERESA","ROSARIO","BEATRIZ","ROSA","SILVIA","MONTSERRAT","JULIA","PATRICIA","IRENE","MONICA","ANDREA","ROCIO","ANGELA","MAR","MARGARITA","SONIA"};
    Random ran = new Random();
    int select = ran.nextInt(nom.length); 
    nombre = nom[select];
  }

  public String getApellido1(){
    return apellido1;
  }

  public void setApellido1(){ //Le damos valor a la variable con un apellido aleatorio del arreglo de apellidos que tenemos
    String ape [] = {"GARCIA","GONZALEZ","RODRIGUEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","RUIZ","HERNANDEZ","DIAZ","MORENO","ALVAREZ","MU??OZ","ROMERO","ALONSO","GUTIERREZ","NAVARRO","TORRES","DOMINGUEZ","VAZQUEZ","RAMOS","GIL","RAMIREZ","SERRANO","BLANCO","SUAREZ","MOLINA","MORALES","ORTEGA","DELGADO","CASTRO","ORTIZ","RUBIO","MARIN","SANZ","NU??EZ","IGLESIAS","MEDINA","GARRIDO","SANTOS","CASTILLO","CORTES","LOZANO","GUERRERO","CANO","PRIETO","MENDEZ","CALVO","CRUZ","GALLEGO","VIDAL","LEON","HERRERA","MARQUEZ","PE??A","CABRERA","FLORES","CAMPOS","VEGA","DIEZ","FUENTES","CARRASCO","CABALLERO","NIETO","REYES","AGUILAR","PASCUAL","HERRERO","SANTANA","LORENZO","HIDALGO","MONTERO","IBA??EZ","GIMENEZ","FERRER","DURAN","VICENTE","BENITEZ","MORA","SANTIAGO","ARIAS","VARGAS","CARMONA","CRESPO","ROMAN","PASTOR","SOTO","SAEZ","VELASCO","SOLER","MOYA","ESTEBAN","PARRA","BRAVO","GALLARDO","ROJAS","PARDO","MERINO","FRANCO","ESPINOSA","IZQUIERDO","LARA","RIVAS","SILVA","RIVERA","CASADO","ARROYO","REDONDO","CAMACHO","REY"};
    Random ran = new Random();
    int select = ran.nextInt(ape.length); 
    apellido1 = ape[select];
  }
  public String getApellido2(){
    return apellido2;
  }

  public void setApellido2(){ //Le damos valor a la variable con un apellido aleatorio del arreglo de apellidos que tenemos
    String ape [] = {"GARCIA","GONZALEZ","RODRIGUEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ","PEREZ","GOMEZ","MARTIN","JIMENEZ","RUIZ","HERNANDEZ","DIAZ","MORENO","ALVAREZ","MU??OZ","ROMERO","ALONSO","GUTIERREZ","NAVARRO","TORRES","DOMINGUEZ","VAZQUEZ","RAMOS","GIL","RAMIREZ","SERRANO","BLANCO","SUAREZ","MOLINA","MORALES","ORTEGA","DELGADO","CASTRO","ORTIZ","RUBIO","MARIN","SANZ","NU??EZ","IGLESIAS","MEDINA","GARRIDO","SANTOS","CASTILLO","CORTES","LOZANO","GUERRERO","CANO","PRIETO","MENDEZ","CALVO","CRUZ","GALLEGO","VIDAL","LEON","HERRERA","MARQUEZ","PE??A","CABRERA","FLORES","CAMPOS","VEGA","DIEZ","FUENTES","CARRASCO","CABALLERO","NIETO","REYES","AGUILAR","PASCUAL","HERRERO","SANTANA","LORENZO","HIDALGO","MONTERO","IBA??EZ","GIMENEZ","FERRER","DURAN","VICENTE","BENITEZ","MORA","SANTIAGO","ARIAS","VARGAS","CARMONA","CRESPO","ROMAN","PASTOR","SOTO","SAEZ","VELASCO","SOLER","MOYA","ESTEBAN","PARRA","BRAVO","GALLARDO","ROJAS","PARDO","MERINO","FRANCO","ESPINOSA","IZQUIERDO","LARA","RIVAS","SILVA","RIVERA","CASADO","ARROYO","REDONDO","CAMACHO","REY"};
    Random ran = new Random();
    int select = ran.nextInt(ape.length); 
    apellido2 = ape[select];
  }

  public int getEdad(){
    return edad;
  }

  public void setEdad(){ //Generamos un numero aleatorio para la edad
    int numero = (int) (Math.random()*70);
      while (numero < 18){ // Ocupamos un While para que la persona no tenga una edad de menos de 18 a??os
        numero = (int) (Math.random()*70);; 
    }  
    edad = numero;
  }

  public int getServicio(){
    return servicio;
  }

  public void setServicio(){ //Generamos un numero aleatorio para dar valor a los a??os de Servicio
    int numero = (int) (Math.random()*50);
    int aux = edad - numero; // Ocupamos un auxiliar que reste la edad menos el numero random que genera la operacion anterior
    while (aux < 18){ // Usamos el cilo para que el numero aleatorio siempre nos de un numero en el cual el auxiliar nos de un nomero mayor a 18 para que en la practica tenga logica
      numero = (int) (Math.random()*50);
      aux = edad - numero;
      }
      servicio = numero;
    }  

  public String getNumTrabajador(){
    return numTrab;
  }

  public void setNumTrabajador(){ //Generamos un par de numeros  uno aleatorio y otro en base a los a??os de servicio para dar valor a el numero de trabajador
    int ntab = 51 - servicio; //Usamos esta operacion para que el primer digito del numero de trabajador este directamente relacionado con los a??os de servicio, cuando una persona lleva el numero 1 antes del guion significa que lleva 50 a??os en la empresa y cuando lleva un 50 significa que apenas lleva 1 a??o
    int aux = (int) (Math.random()*999); //Random para completar el numero de empleado
    numTrab = ntab+"-"+aux; //Unimos los 2 numeros y lo asignamos a la variable String 
  }

  public String getProyectoH(){
    return proyectoH;
  }
  public void setProyectoH(){//Le damos valor a la variable con un proyecto historico del arreglo de proyectos historicos que tenemos
    String pro [] = { "1. Producci??n de electricidad solar mediante sistemas de disco parab??lico, a partir de fotoceldas de alta eficiencia.", "2. Mecanismos de se??alizaci??n celular y blancos moleculares de nanobiocompositos de quitosano sobre la respuesta de estr??s.", "3. Desarrollo y fabricaci??n de m??dulos de celdas solares.", "4. Estudio de nanorreactores coloidales en la fabricaci??n de nanofluidos.", "5. Desarrollo de m??todos de imagenolog??a t??rmica din??mica tridimensional.", "6. Red tem??tica de qu??mica supramolecular.", "7. Dise??o termof??sico de componentes constructivos aligerados con caracter??sticas t??rmicas para elaborar muros.", "8. Procesamiento, caracterizaci??n y optimizaci??n de las propiedades el??ctricas y ??pticas de recubrimientos cer??micos.", "9. Efectos de interacci??n de ondas en problemas esencialmente no-integrables.", "10. Medici??n de los flujos de calor, vapor, carbono, metano y radiaci??n neta dentro de los humedales.", "11. Cristales fot??nicos y fon??nicos no lineales.", "12. Wearable and self-powered electromagnetic radiation detectors based on II-VI semiconductors.", "13. Simulaci??n num??rica de actividad el??ctrica cardiaca en dos y tres dimensiones.", "14. Entendimiento y control de algunas arritmias cardiacas.", "15. Equipamiento para la determinaci??n de las demandas h??dricas de los principales cultivos.", "16. Fortalecimiento a la infraestructura experimental en microscopia electr??nica.", "17. Cristales fot??nicos y fon??nicos no lineales.", "18. Resinas funcionalizadas para retener iones met??licos de aguas contaminadas.", "19. Enfoque tipol??gico de los m??ltiples rasgos de la coherencia discursiva en lenguas amerindias.", "20. Laboratorio de dispersi??n de rayos x a ??ngulos peque??os (SAXS).", "21. S??ntesis y estudio de nano estructuras de INXGAI XN.", "22. Aplicaciones en l??mparas electroluniscentes y celdas solares.", "23. Fortalecimiento de la infraestructura en espectroscopia biom??dica.", "24. Renovaci??n y actualizaci??n de la infraestructura experimental para la s??ntesis y estudios de sistemas y nano sistemas.", "25. Interacci??n molecular entre p??ptidos funcionales de col??geno con quitosano.", "26. Mecanismos de incorporaci??n y caracterizaci??n molecular del col??geno e dosidicus gigas.", "27. M??todos finitos y geom??tricos en sistemas din??micos.", "28. Detecci??n y correci??n de errores derivados de caracter??sticas geom??tricas en componentes.", "29. Especiaci??n de ars??nico en material particulado.", "30. Generaci??n de receptores macroc??clicos tipo triazol.", "31. Fenomenolog??a asociada a la s??ntesis por DVQSIH y al comportamiento optoelectr??nico. ","32. Mochilas cohetes WIR11.", "33. Procesamiento de termograf??as para detecci??n temprana de c??ncer de mama.", "34. Estudio de la redistribuci??n del agua del gluten de masa congelada y su efecto en los cambios proteicos y viscoelasticos.", "35. Impacto en la glomalina en el almacenamiento de carbono y estabilidad de los agregados en los suelos ??ridos.", "36. Difusi??n en membranas fluidas heterog??neas.", "37. Difusi??n en membranas fluidas heterog??neas", "38. An??lisis, diagn??stico y desarrollo de estrategias para el aprovechamiento sostenible de agua y energ??a en la industria minera","39. Materiales nanoestructurados con aplicaciones a la salud y el medio ambiente.","40. Fortalecimiento del cuerpo acad??mico biotecnolog??a."};


  }
  public String getProyectoG(){
    return proyectoG;
  }
  public void setProyectoG(){//Le damos valor a la variable con un proyecto general (historicos y vigentes) del arreglo de proyectos generales que tenemos
    String pro [] = { "1. Producci??n de electricidad solar mediante sistemas de disco parab??lico, a partir de fotoceldas de alta eficiencia.", "2. Mecanismos de se??alizaci??n celular y blancos moleculares de nanobiocompositos de quitosano sobre la respuesta de estr??s.", "3. Desarrollo y fabricaci??n de m??dulos de celdas solares.", "4. Estudio de nanorreactores coloidales en la fabricaci??n de nanofluidos.", "5. Desarrollo de m??todos de imagenolog??a t??rmica din??mica tridimensional.", "6. Red tem??tica de qu??mica supramolecular.", "7. Dise??o termof??sico de componentes constructivos aligerados con caracter??sticas t??rmicas para elaborar muros.", "8. Procesamiento, caracterizaci??n y optimizaci??n de las propiedades el??ctricas y ??pticas de recubrimientos cer??micos.", "9. Efectos de interacci??n de ondas en problemas esencialmente no-integrables.", "10. Medici??n de los flujos de calor, vapor, carbono, metano y radiaci??n neta dentro de los humedales.", "11. Cristales fot??nicos y fon??nicos no lineales.", "12. Wearable and self-powered electromagnetic radiation detectors based on II-VI semiconductors.", "13. Simulaci??n num??rica de actividad el??ctrica cardiaca en dos y tres dimensiones.", "14. Entendimiento y control de algunas arritmias cardiacas.", "15. Equipamiento para la determinaci??n de las demandas h??dricas de los principales cultivos.", "16. Fortalecimiento a la infraestructura experimental en microscopia electr??nica.", "17. Cristales fot??nicos y fon??nicos no lineales.", "18. Resinas funcionalizadas para retener iones met??licos de aguas contaminadas.", "19. Enfoque tipol??gico de los m??ltiples rasgos de la coherencia discursiva en lenguas amerindias.", "20. Laboratorio de dispersi??n de rayos x a ??ngulos peque??os (SAXS).", "21. S??ntesis y estudio de nano estructuras de INXGAI XN., 22. Aplicaciones en l??mparas electroluniscentes y celdas solares.", "23. Fortalecimiento de la infraestructura en espectroscopia biom??dica.", "24. Renovaci??n y actualizaci??n de la infraestructura experimental para la s??ntesis y estudios de sistemas y nano sistemas.", "25. Interacci??n molecular entre p??ptidos funcionales de col??geno con quitosano.", "26. Mecanismos de incorporaci??n y caracterizaci??n molecular del col??geno e dosidicus gigas.", "27. M??todos finitos y geom??tricos en sistemas din??micos.", "28. Detecci??n y correci??n de errores derivados de caracter??sticas geom??tricas en componentes.", "29. Especiaci??n de ars??nico en material particulado.", "30. Generaci??n de receptores macroc??clicos tipo triazol.", "31. Fenomenolog??a asociada a la s??ntesis por DVQSIH y al comportamiento optoelectr??nico. ","32. Mochilas cohetes WIR11.", "33. Procesamiento de termograf??as para detecci??n temprana de c??ncer de mama.", "34. Estudio de la redistribuci??n del agua del gluten de masa congelada y su efecto en los cambios proteicos y viscoelasticos.", "35. Impacto en la glomalina en el almacenamiento de carbono y estabilidad de los agregados en los suelos ??ridos.", "36. Difusi??n en membranas fluidas heterog??neas.", "37. Difusi??n en membranas fluidas heterog??neas", "38. An??lisis, diagn??stico y desarrollo de estrategias para el aprovechamiento sostenible de agua y energ??a en la industria minera","39. Materiales nanoestructurados con aplicaciones a la salud y el medio ambiente.","40. Fortalecimiento del cuerpo acad??mico biotecnolog??a.","41. VIGENTE Bioactivaci??n de pol??meros electroconductores para aplicaciones biom??dicas", "42. VIGENTE Inducci??n de la actividad enzim??tica digestiva de RHYZOPERTHA DOMINICA y su relaci??n con la resistencia del grano de trigo", "43. VIGENTE UNISON_COVID-19: comportamiento del brote epid??mico COVID-19 en sonora, bajo diferentes escenarios de control", "44. VIGENTE Dispositivo para disminuci??n de contagio aerotransportado de virus COVID19", "45. VIGENTE Predictores psicol??gicos, demogr??ficos y contextuales de las conductas preventivas del COVID-19: un modelo estructural", "46. VIGENTE Identificaci??n y clasificaci??n del movimiento de los dedos de la mano humana en escenarios estructurados", "47. VIGENTE Estudio qu??mico-estructural, molecular y biol??gico de compuestos con actividad quimiopreventiva purificados a partir de organismos marinos", "48. VIGENTE Estudio del efecto sers en nanopart??culas met??licas y nanoestructuras de carbono", "49. VIGENTE Estudio in vitro de las interacciones moleculares del receptor hep??tico ASHWELL- MORELL", "50. VIGENTE Variables ecol??gicas predictoras de la resiliencia acad??mica de estudiantes de bachillerato: un estudio longitudinal."};

    Random ran = new Random();
    int select = ran.nextInt(pro.length); 
    proyectoG = pro[select];
  }
  
  public String getProyectoV(){
    return proyectoV;
  }

  public void setProyectoV(){ //Le damos valor a la variable con un proyecto vigente del arreglo de proyectos vigentes que tenemos
    String pro [] = { "41. VIGENTE Bioactivaci??n de pol??meros electroconductores para aplicaciones biom??dicas", "42. VIGENTE Inducci??n de la actividad enzim??tica digestiva de RHYZOPERTHA DOMINICA y su relaci??n con la resistencia del grano de trigo", "43. VIGENTE UNISON_COVID-19: comportamiento del brote epid??mico COVID-19 en sonora, bajo diferentes escenarios de control", "44. VIGENTE Dispositivo para disminuci??n de contagio aerotransportado de virus COVID19", "45. VIGENTE Predictores psicol??gicos, demogr??ficos y contextuales de las conductas preventivas del COVID-19: un modelo estructural", "46. VIGENTE Identificaci??n y clasificaci??n del movimiento de los dedos de la mano humana en escenarios estructurados", "47. VIGENTE Estudio qu??mico-estructural, molecular y biol??gico de compuestos con actividad quimiopreventiva purificados a partir de organismos marinos", "48. VIGENTE Estudio del efecto sers en nanopart??culas met??licas y nanoestructuras de carbono", "49. VIGENTE Estudio in vitro de las interacciones moleculares del receptor hep??tico ASHWELL- MORELL", "50. VIGENTE Variables ecol??gicas predictoras de la resiliencia acad??mica de estudiantes de bachillerato: un estudio longitudinal."};

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
        numero = (int) (Math.random()*50);
        if (numero == 0){
          numero = (int) (Math.random()*50);
        }
    } 
    numProyectos = numero;}
  }

}