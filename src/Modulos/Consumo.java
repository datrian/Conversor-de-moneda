package Modulos;
import Principal.Principal;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Consumo extends Principal {
    private Moneda currency;

    public  Consumo(Moneda currency){
        this.currency = currency;
    }

    public void mostrarMoneda(){
        System.out.println("La moneda es: " + currency.getCurrency());
        System.out.println("Ingresó la cantidad de: " + currency.getMonto());
    }
}