package Modulos;

import com.google.gson.annotations.SerializedName;

public class Moneda{
   private String currency;
    private double monto;

    // Creo que esto es el constructor
    public Moneda(String currency, double monto){
        this.currency = currency;
        this.monto = monto;
    }

    // Getters
    public String getCurrency(){
        return currency;
    }

    public double getMonto(){
        return monto;
    }

    // Setters
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public void  setMonto(double monto){
        this.monto = monto;
    }
}