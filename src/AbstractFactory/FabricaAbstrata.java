package AbstractFactory;

import Dados.Dados;
import Dados.DadosBancos;

public abstract class FabricaAbstrata {

	public abstract TelaLogin gerarTelaLogin();
	
	public abstract TelaLogout gerarTelaLogout();
	
	public static FabricaAbstrata getInstance(String serial) throws Exception{
		
		int codigoBanco = Dados.getInstance().codigoBanco(serial);
		
		if(codigoBanco == DadosBancos.CODIGO_BRADESCO)
			return new FabricaBradesco();
		else if(codigoBanco == DadosBancos.CODIGO_ITAU)
			return new FabricaItau();
                else if(codigoBanco == DadosBancos.CODIGO_BANCO_BRASIl)
			return new FabricaBrasil();
                else if(codigoBanco == DadosBancos.CODIGO_CAIXA)
			return new FabricaCaixa();
		else{
			throw new Exception("Serial inválido!");
		}
	}
	
}
