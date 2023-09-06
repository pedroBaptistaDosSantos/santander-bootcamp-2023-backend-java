import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {

        Double mesada = 50.0;
        boolean saldoSuficiente = true;
        while(saldoSuficiente == true) {
            Double valorDoce = valorAleatorio();
            
            System.out.println("Saldo mesada:" + mesada);
            System.out.println("Valor do doce"+ valorDoce);

            if(valorDoce > mesada) { 
                saldoSuficiente = false; System.out.println("Saldo insuficiente");
            } 
            else{
                mesada -= valorDoce; System.out.println("Parabéns pela compra!");
            } 

            System.out.println("-----------------------------------------");
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
