package AbstractFactory;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLoginCaixa extends TelaLogin {

	public TelaLoginCaixa() {
		super("C:\\Users\\jack1\\OneDrive\\Documentos\\NetBeansProjects\\UltimaListaAPS\\src\\AbstractFactory\\caixa.png", "Bem vindo a Caixa.");
	}

	public void mostrarTelaLogin() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
		JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGON", JOptionPane.INFORMATION_MESSAGE, icon);
	}

}
