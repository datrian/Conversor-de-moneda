package Modulos;

import com.google.gson.annotations.SerializedName;

public class Moneda{
   private String currency;
   private String currencyFinal;
   private double monto;

    // Creo que esto es el constructor
    public Moneda(String currency,String currencyFinal, double monto){
        this.currency = currency;
        this.currencyFinal = currencyFinal;
        this.monto = monto;
    }

    // Getters
    public String getCurrency(){
        return currency;
    }

    public String getCurrencyFinal(){
        return currencyFinal;
    }

    public double getMonto(){
        return monto;
    }

    // Setters
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public void setCurrencyFinal(String currencyFinal){
        this.currencyFinal = currencyFinal;
    }

    public void  setMonto(double monto){
        this.monto = monto;
    }
}