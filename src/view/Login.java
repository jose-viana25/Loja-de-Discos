package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

<<<<<<< HEAD
import controller.UsuarioController;
import entity.Usuario;

class TelaDeLogin implements ActionListener {

	private JTextField txtLogin = new JTextField();
	private JTextField txtSenha = new JTextField();

	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JButton btnEsqueceuASenha = new JButton("Esqueci minha senha");

	private UsuarioController usuarioController = new UsuarioController();

=======
class TelaDeLogin implements ActionListener{
	
	private JTextField txtLogin = new JTextField();
	private JTextField txtSenha = new JTextField();
	
	
	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JButton btnEsqueceuASenha = new JButton("Esqueci minha senha");
	
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
	public TelaDeLogin() {
		JFrame fraPrincipal = new JFrame();
		JPanel panPrincipal = new JPanel(new GridLayout(4, 2));
		JPanel panAuxiliar = new JPanel(new GridLayout(2, 2));
<<<<<<< HEAD

		btnEntrar.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnEsqueceuASenha.addActionListener(this);

=======
		
		btnEntrar.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnEsqueceuASenha.addActionListener(this);
		
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
		panPrincipal.add(new JLabel("Login:"));
		panPrincipal.add(txtLogin);
		panPrincipal.add(new JLabel("Senha:"));
		panPrincipal.add(txtSenha);
		panPrincipal.add(new JLabel(""));

		panAuxiliar.add(btnCancelar);
		panAuxiliar.add(btnEntrar);
		panAuxiliar.add(btnEsqueceuASenha);
<<<<<<< HEAD

		panPrincipal.add(panAuxiliar);

=======
		
		panPrincipal.add(panAuxiliar);
		
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
		fraPrincipal.setContentPane(panPrincipal);
		fraPrincipal.setSize(800, 250);
		fraPrincipal.setTitle("Loja de Disco: Login");
		fraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
		fraPrincipal.setVisible(true);
=======
		fraPrincipal.setVisible(true);		
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
	}

	@Override
	public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
		if ("Entrar".compareTo(e.getActionCommand()) == 0) {

			Usuario usuario = new Usuario();

			usuario.setLogin(txtLogin.getText());
			usuario.setSenha(txtSenha.getText());

			usuarioController.autenticar(usuario);

		} else if ("Cancelar".compareTo(e.getActionCommand()) == 0) {

			txtLogin.setText("");
			txtSenha.setText("");

		} else {

		}

	}

=======
		// TODO Auto-generated method stub
		
	}
	
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
}

public class Login {

<<<<<<< HEAD
	public static void main(String[] args) {
		new TelaDeLogin();
	}		
=======
	public Login() {
		new TelaDeLogin();
	}
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266

}
