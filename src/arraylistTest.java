import java.util.ArrayList;

public class arraylistTest {
    public static void main(String[] args) {
        ArrayList<String> pelis = new ArrayList<>();
        pelis.add("The Joker");
        pelis.add("Titanic");
        pelis.add("El caballero oscuro");
        for (String peli:pelis){
            System.out.println(peli);
        }
    }
}
