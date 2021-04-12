package mycompany.semana7;

public interface IValidaciondeDeLaInterface {
    
    public void errorCamposVacios();
    public int validacionModelo(int modelo);
    public String validacionPagoPronto(String pagoPronto);
    public String validacionTipo(String tipo);    
    public String validacionRegistroCuenta(String registroDeCuenta);
    public double validacionValorComercial(double valorComercial);    

}
