package functionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
	
	
		// Usar o Consumer com expressão lambda para imprimir numeros pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		
		numeros.stream().forEach(imprimirNumeroPar);
		
		//Lambda
		numeros.stream().forEach(n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		});
		
	}
}
