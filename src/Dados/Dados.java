package Dados;

public class Dados {

	private static Dados util = new Dados();
	
	public static Dados getInstance() {
		return util;
	}
	
	public boolean validarSerial(String serial) {
		return serial.length()>14;
	}
	
	public int codigoBanco(String serial) {
		String data[] = serial.split("-");
		return (data.length>0)? Integer.parseInt(data[0]):-1;
	}
	
}
