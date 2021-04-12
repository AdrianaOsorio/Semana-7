package mycompany.semana7;

import javax.swing.JOptionPane;

public class Ford extends Vehiculo{

    @Override
    public double valorLiquidacionVehiculos(){
        
        double descontando, auxiliar, auxiliar1;
        
        auxiliar = descuentoPagoPronto(getValorComercial());
        descontando = descuentoServicioPublico(auxiliar);
        auxiliar1 = descuentoTrasladoDeCuenta(descontando);
                        
        JOptionPane.showMessageDialog(null, "El valor del ford con descuentos es: "+auxiliar1);
        
        return auxiliar1;
        
    }
    
}
