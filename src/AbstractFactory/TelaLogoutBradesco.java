package AbstractFactory;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogoutBradesco extends TelaLogout{

	public TelaLogoutBradesco(){
		super("C:\\Users\\jack1\\OneDrive\\Documentos\\NetBeansProjects\\UltimaListaAPS\\src\\AbstractFactory\\bradesco.png","O Bradesco agradece sua preferência...");
	}

	public void mostrarTelaLogout() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
        JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
}
