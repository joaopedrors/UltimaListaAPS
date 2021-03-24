package Cliente;


import AbstractFactory.FabricaAbstrata;
import AbstractFactory.TelaLogin;
import AbstractFactory.TelaLogout;



public class Cliente {
	
	public static void testarAbstractFactory() throws Exception{
		/**Fornecer uma interface para cria��o de fam�lias de objetos relacionados ou dependentes
		   sem especificar suas classes concretas.*/
		FabricaAbstrata fbs = FabricaAbstrata.getInstance("3"); 
		TelaLogin tlgn = fbs.gerarTelaLogin();
		tlgn.mostrarTelaLogin();
		TelaLogout tlgt = fbs.gerarTelaLogout();
		tlgt.mostrarTelaLogout();
		
		//codigo swing para gerar tela;
	}
	public static void main(String[] args) throws Exception{
		testarAbstractFactory();
		
	}
}
