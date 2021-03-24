package AbstractFactory;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogoutBrasil extends TelaLogout{

	public TelaLogoutBrasil(){
		super("C:\\Users\\jack1\\OneDrive\\Documentos\\NetBeansProjects\\UltimaListaAPS\\src\\AbstractFactory\\brasil.png","O Banco Do Brasil agradece sua preferência...");
	}

	public void mostrarTelaLogout() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
        JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
}
