package Modulos;
import Principal.Principal;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Consumo extends Principal {
    private Moneda currency;

    public Consumo(Moneda currency) throws IOException, InterruptedException {
        this.currency = currency;
    }

    public void mostrarMoneda(){
        System.out.println("La moneda es: " + currency.getCurrency());
        System.out.println("Ingresó la cantidad de: " + currency.getMonto());

        // Dirección de la API
        String direccion = "https://v6.exchangerate-api.com/v6/58cbb2a8c751180d6f5aa453/latest/" + currency.getCurrency();

        // Llama a la API
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Almacena la respuesta de la API
            String json = response.body();
            //System.out.println(json);

            // Parseo del JSON
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            // Acceso al objeto "conversion_rates"
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            String conversion = conversionRates.get("MXN").getAsString();

            // Muestra la conversión
            System.out.println("Conversión: " + conversion);

        }catch (NumberFormatException | IOException | InterruptedException e){
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        }


    }




}