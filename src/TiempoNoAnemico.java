import java.time.*;
import java.time.format.DateTimeFormatter;
public class TiempoNoAnemico {
    private LocalDate fecha ; 
    
    public TiempoNoAnemico(int dia ,int mes,int  anio) {
    this.fecha =LocalDate.of(anio,mes,dia); 
     
     
    }
    
    //Metodo que devuelve fecha formato largo “Lunes 3 de Abril de 2020"
    @Override
    public String toString() {
        return fecha.format(DateTimeFormatter.ofPattern("EE dd MMMM uuuu"));
    }
    // Metodo que devuelve la fecha en formato corto  del tipo String : “03/04/2020” 
    public String getFechaCorta(){
       return  fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
}
