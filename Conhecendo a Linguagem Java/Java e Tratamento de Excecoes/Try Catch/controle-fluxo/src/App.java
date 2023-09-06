import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();
            System.out.println("Digite o sobrenome:");
            String sobrenome = scanner.next();
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            /*Possíveis erros a tratar
            *Não informar o nome e sobrenome
            * valor de idade ter um caractere não númerico
            *valor de altura ter um vírgula ao invés de ponto
            */

            System.out.println("Ola, me chamo "+ nome.toUpperCase()+ " " + sobrenome);
            System.out.println("Tenho "+ idade+ " anos");
            System.out.println("Minha altura é "+ altura+ "cm");
        }catch(InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
