public class TiempoAnemico {
    //Atributos de la clase
    private String nomDia;
    private int dia;
    private int mes ;
    private int anio;

    public TiempoAnemico(String nomDia ,int dia ,int mes ,int anio){
        this.nomDia = nomDia;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public void setNomDia(String nomDia) {
        this.nomDia = nomDia;
    } 
    public String getNomDia() {
        return this.nomDia;
    } 
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
