import java.util.Scanner;

public class foreach1 {
    public static void main(String[] args) {
        double acumulador = 0, promedio;
        double []temperatura = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <temperatura.length ; i++) {
            temperatura[i] = sc.nextDouble();
        }

        for(double t : temperatura){
        acumulador += t;
        }
        promedio = acumulador/temperatura.length;
        System.out.println("El promedio es " + promedio);
    }
}
