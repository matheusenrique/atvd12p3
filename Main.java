import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Livro livro = new Livro("Scream", 1994, 5, "Wes Craven");
        DVD dvd =  new DVD("Ultraviolence", 2014, 2, 51);
        Revista revista = new Revista("Sanrio", 1990, 0, "90");

        livro.emprestar();
        dvd.emprestar();;
        revista.emprestar();

        System.out.println("Data de entrega: ");
        String entrega = s.nextLine();

        livro.calcularMulta(0);
        
    }
}
