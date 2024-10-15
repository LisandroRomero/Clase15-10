//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int notas[] = new int[20];
        for (int i = 0; i <notas.length ; i++) {
            notas[i] = (int)(Math.random() *10+1);
            System.out.println(notas[i]);
        }
        System.out.println(notas.length);
        System.out.println(notas[9]);
    }
}