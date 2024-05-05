package Principal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

public class Moneda {


    @SerializedName("conversion_rate")
    private String Moneda;

    @SerializedName("base_code")
    private String Origen;



    public String getMoneda() {

        return Moneda;
    }

    public String getOrigen() {
        return Origen;
    }


    public String muestraLink(String link) throws IOException, InterruptedException {

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();

        HttpResponse<String> response = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


        URL url = new URL(link);
        HttpURLConnection request2 = (HttpURLConnection) url.openConnection();
        request2.connect();

        JsonParser jp = new JsonParser();

        JsonElement root = jp.parse(new InputStreamReader((InputStream) request2.getContent() ));
        JsonObject jsonobj = root.getAsJsonObject();

        String req_result = jsonobj.get("result").getAsString();
        //System.out.println(jsonobj);

        Gson gson = new Gson();
        Moneda miMoneda = gson.fromJson(json, Moneda.class);


        return miMoneda.getMoneda();
    }


}
