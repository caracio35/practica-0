
public class Main {
    
    public static void main(String[] args) {
        //iniciar tiempo No Anemico
        TiempoNoAnemico  tna = new TiempoNoAnemico(3, 4, 2020);
        //iniciar tiempo Anemico
        TiempoAnemico tiempo = new TiempoAnemico("lunes",3, 4, 2020);
        // imprime por consola tiempoAnemico formato largo “Lunes 3 de Abril de 2020"
        System.out.println("tiempo Anemico largo: "+ tiempo.getNomDia()+" "+tiempo.getDia()+" de "+tiempo.getMes()+"  de "+tiempo.getAnio());
        //imprime en formato corto del tipo: “03/04/2020”
        System.out.println("tiempo Anemico forma corta: "+tiempo.getDia()+"/"+tiempo.getMes()+"/"+tiempo.getAnio());
        /*
        En un enfoque anémico, la clase Tiempo contendría solo los datos (atributos) relacionados con la fecha y la hora,
         pero carecería de comportamiento significativo. Aquí, solo definiremos atributos para almacenar la fecha y la hora,
          sin métodos que realicen operaciones o cálculos.
        */
         //imprimir tiempo no anemico por consola formato largo "lunes 3 de abril de 2020 " 
        System.out.println("Tiempo No Anemico Formato Largo:" +tna.toString());
        //imprimir tiempo  no anemico por consola formato corto "3/4/21".
        System.out.println("Tiempo No Anemico Formato Corto:"+tna.getFechaCorta());
        /*
        En un enfoque no anémico, la clase Tiempo no solo contendría los datos, sino también métodos que realizan operaciones
        relacionadas con la fecha y la hora. Por ejemplo, podríamos tener métodos para formatear la fecha en los dos formatos requeridos.
        */
        //iniciar recor
        TiempoRecord trec =new TiempoRecord("lunes",3,4,2020);
        //imprimir por pantalla tiempoRecord foma larga
        System.out.println("tiempoRecord largo : "+ trec.nomDia()+" "+trec.dia()+"de "+trec.mes()+"de "+trec.anio());
        //imprimir por pantalla Tiempo recor En forma corta
        System.out.println("tiempo recor corto : "+trec.dia()+"/"+trec.mes()+"/"+trec.anio());

    }}