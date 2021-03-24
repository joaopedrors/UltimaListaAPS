package AbstractFactory;

public class FabricaCaixa extends FabricaAbstrata{

	public TelaLogin gerarTelaLogin(){
		return new TelaLoginCaixa();
	};
	
	public TelaLogout gerarTelaLogout(){
		return new TelaLogoutCaixa();
	};
	
}
