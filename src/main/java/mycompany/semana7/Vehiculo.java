package mycompany.semana7;

import javax.swing.JOptionPane;

public abstract class Vehiculo implements IValidaciondeDeLaInterface{
    
    public int modeloAño;
    public double valorComercial;
    public String marca, tipo, registroCuenta, pagoPronto, marcaLinea;
  
    /*
    
    Hacer descuento por el modeloAño
    
    tipo privado o publico 
    registroCuenta es donde registro las placas o el carro, ej: bogota
   
    el descuento por el trasladoDeCuenta debe ser mayor que el decuento de pronto de pago
    
    Hacer descuento por pagar mas rapido del valor comercial del vahiculo
    si es de servicio publico hacer descuento
    
    primero se descuenta el porcentaje por pronto pago
    segundo el descuento de servicio público
    tercero el descuento por traslado
    
    hacer un check list
    
    */

    public Vehiculo(){
    }

    public Vehiculo(int modeloAño, double valorComercial, String marca, String tipo, String registroCuenta, String pagoPronto, String marcaLinea){
        this.modeloAño = modeloAño;
        this.valorComercial = valorComercial;
        this.marca = marca;
        this.tipo = tipo;
        this.registroCuenta = registroCuenta;
        this.pagoPronto = pagoPronto;
        this.marcaLinea = marcaLinea;
    }

    public int getModeloAño(){
        return modeloAño;
    }

    public void setModeloAño(int modeloAño) {
        this.modeloAño = modeloAño;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegistroCuenta() {
        return registroCuenta;
    }

    public void setRegistroCuenta(String registroCuenta) {
        this.registroCuenta = registroCuenta;
    }

    public String getPagoPronto() {
        return pagoPronto;
    }

    public void setPagoPronto(String pagoPronto) {
        this.pagoPronto = pagoPronto;
    }

    public String getMarcaLinea() {
        return marcaLinea;
    }

    public void setMarcaLinea(String marcaLinea) {
        this.marcaLinea = marcaLinea;
    }

    public double descuentoPagoPronto(double valorComercial){
        
        double resultado = valorComercial;

        if(getPagoPronto().equals("si") || getPagoPronto().equals("Si")){
            
            resultado = valorComercial*0.03;
            resultado= valorComercial-resultado;
            return resultado;
            
        }
        else{
                        
            return valorComercial;
                        
        }
    
    }
    public double descuentoServicioPublico(double valorComercial){
        
        double resultado = valorComercial;
        
        if(getTipo().equals("público") || getTipo().equals("Público")){
                    
            resultado = valorComercial*0.02;
            resultado = valorComercial-resultado;      
            return resultado;
            
        }
        else{
         
            return valorComercial;
            
        }
        
    }
    public double descuentoTrasladoDeCuenta(double valorComercial){
          
        double resultado = valorComercial;
        
        if(getRegistroCuenta().equals("si") || getRegistroCuenta().equals("Si")){
                    
            resultado = valorComercial*0.05;
            resultado = valorComercial-resultado;      
            return resultado;
            
        }
        else{
         
            return valorComercial;
            
        }
    }
    
    @Override
    public void errorCamposVacios() {
        
        JOptionPane.showMessageDialog(null, "ningun  campo debe ir vacio");
        
    }

    @Override
    public int validacionModelo(int modelo){
        
        if(modelo >= 1908){
            
            return modelo;
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Fecha invalida, porfavor digite una fecha valida");
            
            return modelo;
            
        }
        
    }

    @Override
    public String validacionPagoPronto(String pagoPronto){

        if(pagoPronto.equals("si") || pagoPronto.equals("Si")){
            
            return pagoPronto;
            
        }
        else{
            
            if(pagoPronto.equals("no") || pagoPronto.equals("No")){
            
                return pagoPronto;
            
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Opción puesta en pago pronto no valida, porfavor digite si/Si o no/No");
                return null;
                
            }
            
        }
        
    }

    @Override
    public String validacionTipo(String tipo){
        
        if(tipo.equals("privado") || tipo.equals("Privado")){
            
            return tipo;
            
        }
        else{
            
            if(tipo.equals("público") || tipo.equals("Público")){
            
                return tipo;
            
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Opción puesta en tipo no valida, porfavor digite privado/Privado o público/Público");
                return null;
                
            }
            
        }
    }

    @Override
    public String validacionRegistroCuenta(String registroDeCuenta){

        if(registroDeCuenta.equals("si") || registroDeCuenta.equals("Si")){
            
            return registroDeCuenta;
            
        }
        else{
            
            if(registroDeCuenta.equals("no") || registroDeCuenta.equals("No")){
            
                return registroDeCuenta;
            
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Opción puesta en Registro de Cuenta no valida, porfavor digite si/Si o no/No");
                return null;
                
            }
            
        }        
    }

    @Override
    public double validacionValorComercial(double valorComercial){
        
       if(valorComercial > 0){
            
            return valorComercial;
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "precio comercial no valido, digite un valor comercial permitido");
            
            return 0.0;
            
        }
    }
    
    public abstract double valorLiquidacionVehiculos(); 
        
}