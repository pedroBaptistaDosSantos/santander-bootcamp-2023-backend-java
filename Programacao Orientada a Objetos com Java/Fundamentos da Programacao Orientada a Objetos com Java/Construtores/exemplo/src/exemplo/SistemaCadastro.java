package exemplo;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa fulano = new Pessoa("Pedro", "3898392");
		fulano.setEndereco("Rua das Marias");
		
		System.out.println("Nome:"+ fulano.getNome());
		System.out.println("CPF:"+ fulano.getCpf());
		System.out.println("Endereco:"+ fulano.getEndereco());
		
	}
	
}
