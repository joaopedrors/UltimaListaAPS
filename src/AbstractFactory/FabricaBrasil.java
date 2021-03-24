package AbstractFactory;

public class FabricaBrasil extends FabricaAbstrata{

	public TelaLogin gerarTelaLogin(){
		return new TelaLoginBrasil();
	};
	
	public TelaLogout gerarTelaLogout(){
		return new TelaLogoutBrasil();
	};
	
}
