import java.util.Scanner;


public class Dados{
    public static void main(String args[]){

    char opcao='s';
    
    Scanner teclado = new Scanner(System.in);
    while (opcao == 's' || opcao == 'S') {
        System.out.println("| [Lançando Dado]" + "\n");
        int dado = (int) (Math.random() * 6 + 1);
        System.out.println("| [Face:] " + dado + "\n");

        if (dado == 1) {
            System.out.println("|       |\n" + 
                               "|   *   |\n" + 
                               "|       |");
        }

        if (dado == 2) {
            System.out.println("| *     |\n" + 
                               "|       |\n" + 
                               "|     * |");
        }

        if (dado == 3) {
            System.out.println("| *     |\n" + 
                               "|   *   |\n" + 
                               "|     * |");
        }

        if (dado == 4) {
            System.out.println("| *   * |\n" + 
                               "|       |\n" + 
                               "| *   * |");
        }

        if (dado == 5) {
            System.out.println("| *   * |\n" + 
                               "|   *   |\n" + 
                               "| *   * |");
        }

        if (dado == 6) {
            System.out.println("| *   * |\n" + 
                               "| *   * |\n" + 
                               "| *   * |");
        }

        System.out.println("\n" + "| [Deseja lançar de novo (S/N)?]");
        opcao=teclado.next().charAt(0);
        
        if (opcao == 'n' || opcao == 'N') {
            System.out.println("| [Sistema finalizado!]");
        }
    }
 }
}