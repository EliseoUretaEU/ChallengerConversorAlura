package Principal;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Scanner;

public class Principal_Conversor {

    public static void main(String[] args) throws IOException, InterruptedException {


       Scanner scanner = new Scanner(System.in);
       Scanner scannermonto = new Scanner(System.in);

        int monto = 0;

       int opcion = 0;

       while(opcion != 7){
           System.out.println("");
           System.out.println("<<MENÚ>>");
           System.out.println("1. Dolar => Peso Chileno");
           System.out.println("2. Peso Chileno => Dolar");
           System.out.println("3. Dolar => Libra Egipcia");
           System.out.println("4. Libra Egipcia => Dolar");
           System.out.println("5. Dolar => Peso Argentino");
           System.out.println("6. Peso Argentino => Dolar");
           System.out.println("7. SALIR");
           System.out.println("Seleccione una opcion: ");

           opcion = scanner.nextInt();

           switch (opcion){

               case 1:
                   Moneda moneda = new Moneda();
                   String link = "https://v6.exchangerate-api.com/v6/081efcae0015e7b22086345a/pair/USD/CLP";
                   moneda.muestraLink(link);

                   System.out.println("Ingrese un monto a convertir: ");
                   monto = scannermonto.nextInt();
                   System.out.println(" ");


                   double total= monto * Double.parseDouble(moneda.muestraLink(link));
                   System.out.println("El valor de " + monto + " [USD] " + "corresponde al valor total de : "+total+ " [CLP]");

                   break;
               case 2:

                   Moneda moneda2 = new Moneda();
                   String link2 = "https://v6.exchangerate-api.com/v6/081efcae0015e7b22086345a/pair/USD/CLP";
                   moneda2.muestraLink(link2);
                   // System.out.println("AQUí " + moneda.muestraLink(link));
                   System.out.println("Ingrese un monto a convertir: ");
                   monto = scannermonto.nextInt();
                   System.out.println(" ");

                   double total2= monto / Double.parseDouble(moneda2.muestraLink(link2)) ;
                   System.out.println("El valor de " + monto + " [CLP] " + "corresponde al valor total de : "+total2+ " [USD]");



                   break;
               case 3 :
                   Moneda moneda3 = new Moneda();
                   String link3 = "https://v6.exchangerate-api.com/v6/081efcae0015e7b22086345a/pair/USD/EGP";
                   moneda3.muestraLink(link3);

                   System.out.println("Ingrese un monto a convertir: ");
                   monto = scannermonto.nextInt();
                   System.out.println(" ");

                   double total3=  monto * Double.parseDouble(moneda3.muestraLink(link3)) ;
                   System.out.println("El valor de " + monto + " [USD] " + "corresponde al valor total de : "+total3+ " [EGP]");

                   break;
               case 4 :

                   Moneda moneda4 = new Moneda();
                   String link4 = "https://v6.exchangerate-api.com/v6/081efcae0015e7b22086345a/pair/USD/EGP";
                   moneda4.muestraLink(link4);
                   System.out.println("Ingrese un monto a convertir: ");
                   monto = scannermonto.nextInt();
                   System.out.println(" ");

                   double total4= monto / Double.parseDouble(moneda4.muestraLink(link4)) ;
                   System.out.println("El valor de " + monto + " [EGP] " + "corresponde al valor total de : "+total4+ " [USD]");

                   break;

               case 5 :
                   Moneda moneda5 = new Moneda();
                   String link5 = "https://v6.exchangerate-api.com/v6/081efcae0015e7b22086345a/pair/USD/ARS";
                   moneda5.muestraLink(link5);
                   System.out.println("Ingrese un monto a convertir: ");
                   monto = scannermonto.nextInt();
                   System.out.println(" ");

                   double total5=  monto * Double.parseDouble(moneda5.muestraLink(link5)) ;
                   System.out.println("El valor de " + monto + " [USD] " + "corresponde al valor total de : "+total5+ " [ARS]");

                   break;

               case 6 :
                   Moneda moneda6 = new Moneda();
                   String link6 = "https://v6.exchangerate-api.com/v6/081efcae0015e7b22086345a/pair/USD/ARS";
                   moneda6.muestraLink(link6);

                   System.out.println("Ingrese un monto a convertir: ");
                   monto = scannermonto.nextInt();
                   System.out.println(" ");

                   double total6=  monto / Double.parseDouble(moneda6.muestraLink(link6)) ;
                   System.out.println("El valor de " + monto + " [ARS] " + "corresponde al valor total de : "+total6+ " [USD]");

                   break;

               default:
                   System.out.println("opcion no válida");
                   break;
           }

       }




    }
}
