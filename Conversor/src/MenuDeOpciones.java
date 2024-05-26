import java.util.Scanner;

public class MenuDeOpciones {
    public void muestraMenu() {
        System.out.println("********************************************\n");
        System.out.println("Sea Bienvenido a nuestro conversor de monedas\n");
        System.out.println("Pulse la opcion deseada:");
        System.out.println("1) Dolar a pesos Argentinos");
        System.out.println("2) Pesos Argentinos a Dolar");
        System.out.println("3) Dolar a Real Brasileño");
        System.out.println("4) Real Brasileño a Dolar ");
        System.out.println("5) Dolar a peso Colombiano ");
        System.out.println("6) Peso Colombiano a Dolar ");
        System.out.println("7) Salir");
    }

    public String obternerResultado(){
        return link;
    }
    String link;
    boolean validOption = true;

   public void selecciones()
    {
        do {
            Scanner lectura = new Scanner(System.in);
            int opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    link = "https://v6.exchangerate-api.com/v6/05dcb7d377a7f26726af04ab/pair/USD/ARS/";
                    validOption = false;
                    break;

                case 2:
                    link = "https://v6.exchangerate-api.com/v6/05dcb7d377a7f26726af04ab/pair/ARS/USD/";
                    validOption = false;
                    break;

                case 3:
                    link = "https://v6.exchangerate-api.com/v6/05dcb7d377a7f26726af04ab/pair/USD/BRL/";
                    validOption = false;
                    break;
                case 4:
                    link = "https://v6.exchangerate-api.com/v6/05dcb7d377a7f26726af04ab/pair/BRL/USD/";
                    validOption = false;
                    break;
                case 5:
                    link = "https://v6.exchangerate-api.com/v6/05dcb7d377a7f26726af04ab/pair/USD/COP/";
                    validOption = false;
                    break;
                case 6:
                    link = "https://v6.exchangerate-api.com/v6/05dcb7d377a7f26726af04ab/pair/COP/USD/";
                    validOption = false;
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    validOption = true;
                    break;
            }
        }while (validOption);
    }
}

