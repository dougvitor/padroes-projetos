public class TesteInvestimento {
	public static void main(String[] args) {
		testeInvestimento();
	}
	
	public static void testeInvestimento(){
		Conta conta = new Conta();
		conta.deposita(100);
		
		Investimento investimento = new Conservador();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realiza(conta, investimento);
		
		realizadorDeInvestimentos.realiza(conta, new Moderado());
		
		realizadorDeInvestimentos.realiza(conta, new Arrojado());
	}
}