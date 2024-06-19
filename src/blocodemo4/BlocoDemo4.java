package blocodemo4;

public class BlocoDemo4 {

    public static void main(String[] args) {
        // Escopo externo.
        int n1 = 2;
        {
            // Escopo interno.
            System.out.println("O valor de n1 é " + n1); // Compila.
        }
    }

}
