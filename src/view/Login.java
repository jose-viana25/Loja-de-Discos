package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.UsuarioController;
import entity.Usuario;

class TelaDeLogin implements ActionListener {

	private JTextField txtLogin = new JTextField();
	private JTextField txtSenha = new JTextField();

	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JButton btnEsqueceuASenha = new JButton("Esqueci minha senha");

	private UsuarioController usuarioController = new UsuarioController();

	public TelaDeLogin() {
		JFrame fraPrincipal = new JFrame();
		JPanel panPrincipal = new JPanel(new GridLayout(4, 2));
		JPanel panAuxiliar = new JPanel(new GridLayout(2, 2));

		btnEntrar.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnEsqueceuASenha.addActionListener(this);

		panPrincipal.add(new JLabel("Login:"));
		panPrincipal.add(txtLogin);
		panPrincipal.add(new JLabel("Senha:"));
		panPrincipal.add(txtSenha);
		panPrincipal.add(new JLabel(""));

		panAuxiliar.add(btnCancelar);
		panAuxiliar.add(btnEntrar);
		panAuxiliar.add(btnEsqueceuASenha);

		panPrincipal.add(panAuxiliar);

		fraPrincipal.setContentPane(panPrincipal);
		fraPrincipal.setSize(800, 250);
		fraPrincipal.setTitle("Loja de Disco: Login");
		fraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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

}

public class Login {

	public static void main(String[] args) {
		new TelaDeLogin();
	}		

}
