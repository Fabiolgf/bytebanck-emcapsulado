
public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 19284);
		conta.deposita(200);
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		System.out.println(conta.getAgencia()); 
		
		System.out.println("O total de contas é " + Conta.getTotal());
		
	}

}
