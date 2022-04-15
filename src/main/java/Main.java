public class Main {

    public static void main(String[] args) {

        System.out.println("el numero "+5+" es: "+esPositivo(5));

        //ciclo while
        int a = 0;
        while(a<3){
            System.out.println("el numero en el cliclo while es: "+a);
            a++;
        }

        //ciclo do while
        int b = 0;
        do{
            System.out.println("el numero en el cliclo do while es: "+b);
            b++;
        }while (b<1);

        //ciclo for
        for (int numeroFor = 0;numeroFor<=3;numeroFor++){
            System.out.println("el numero en el cliclo for es: "+numeroFor);
        }

        //switch
        String estacion = "primavera";
        switch (estacion){
            case "invierno":
                System.out.println("estamos en la estacion de invierno");
                break;
            case "primavera":
                System.out.println("estamos en la estacion de primavera");
                break;
            case "verano":
                System.out.println("estamos en la estacion de verano");
                break;
            case "otoño":
                System.out.println("estamos en la estacion de otoño");
                break;
            default:
                System.out.println("no es una estacion");
                break;
        }
    }

    public static String esPositivo(int number){
        if(number>=0){
            return "el numero es positivo";
        }else{
            return "el numero es negativo";
        }
    }

}
