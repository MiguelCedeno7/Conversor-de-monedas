
import java.text.DecimalFormat;

public class ObtencionDeDatos {
    private String siglas;
    private String siglas2;
    private double valorDeLaConversion;
    private String cantidad;

    public ObtencionDeDatos(String siglas, double valorDeLaConversion, String siglas2){
        this.siglas = siglas;
        this.valorDeLaConversion = valorDeLaConversion;
        this.siglas2 = siglas2;
    }

    public ObtencionDeDatos(SiglasDeLasMonedas miSiglasDeMonedas){
        this.siglas = miSiglasDeMonedas.base_code();
        this.valorDeLaConversion = Double.parseDouble(miSiglasDeMonedas.conversion_result());
        this.siglas2 = miSiglasDeMonedas.target_code();
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public double getValorDeLaConversion() {
        return valorDeLaConversion;
    }

    public void setValorDeLaConversion(double valorDeLaConversion) {
        this.valorDeLaConversion = valorDeLaConversion;
    }

    public String formato (){
        DecimalFormat df = new DecimalFormat("0.00");
        String formateado = df.format(valorDeLaConversion);
        return formateado;
    }

    @Override
    public String toString() {
        return
               " "+ siglas+" Corresponde a " +formato() +" " +siglas2
                +"\n "
                +"***************************************"
                +"\n";
    }
}
