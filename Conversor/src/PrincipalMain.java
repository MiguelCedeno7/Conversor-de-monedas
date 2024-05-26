import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        MenuDeOpciones miMenudeOpciones=new MenuDeOpciones();

        do {
            miMenudeOpciones.muestraMenu();
            miMenudeOpciones.selecciones();
            Scanner lectura = new Scanner(System.in);

            System.out.println("Introduce la cantidad que quiere cambiar");
            String cantidad = String.valueOf(lectura.nextInt());
            String direccion = miMenudeOpciones.link + cantidad;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder()
                    .create();

            SiglasDeLasMonedas miSiglasDeMonedas = gson.fromJson(json, SiglasDeLasMonedas.class);
            ObtencionDeDatos misDatos = new ObtencionDeDatos(miSiglasDeMonedas);
            System.out.println("El valor de " + cantidad + misDatos);
        }while (!miMenudeOpciones.validOption);
    }
}
