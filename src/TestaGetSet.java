
public class TestaGetSet {
	
	public static void main(String[] args) {
		
		Conta novaConta = new Conta(1234, 19284);
		
		novaConta.setSaldo(500);
		novaConta.setAgencia(1234);
		novaConta.setNumero(123456);
		System.out.println("Saldo da Conta � " + novaConta.getSaldo());
		System.out.println("A ag�ncia � " + novaConta.getAgencia());
		System.out.println("O numero da Conta � " + novaConta.getNumero());
		
		Cliente fabio = new Cliente();
		novaConta.setTitular(fabio);
		fabio.setNome("fabio");
		fabio.setCpf("123.123.123-23");
		fabio.setProfissao("Analista de Sistemas");
		System.out.println("O nome do cliente � " + novaConta.getTitular().getNome());
		System.out.println("O CPF do cliente � " + novaConta.getTitular().getCpf());
		System.out.println("A Profiss�o do cliente � " + novaConta.getTitular().getProfissao());
		
	}

}
