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


    public void realizarPeticion() {
        String direccion = "https://v6.exchangerate-api.com/v6/58cbb2a8c751180d6f5aa453/latest/" ; //+ currency
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            Moneda moneda = gson.fromJson(json, Moneda.class);
// La sig linea deberá imprimir el valor deseado:
//            System.out.println("Tasa de cambio para " + baseCurrency + ": " + moneda.getConversion_rates());


        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al realizar la petición HTTP: ");
            System.out.println(e.getMessage());
        }
    }
}