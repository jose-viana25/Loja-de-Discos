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

class TelaDeCadastroDeUsuario implements ActionListener {

	private JTextField txtId = new JTextField();
	private JTextField txtLogin = new JTextField();
	private JTextField txtSenha = new JTextField();
	private JTextField txtEmail = new JTextField();

	JFrame fraPrincipal = new JFrame();
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnCancelar = new JButton("Cancelar");

	public TelaDeCadastroDeUsuario() {
		
		JPanel panPrincipal = new JPanel(new GridLayout(5, 2));
		JPanel panAuxiliar = new JPanel(new GridLayout(1, 2));

		btnGravar.addActionListener(this);
		btnCancelar.addActionListener(this);

		txtId.setText("1");
		txtId.setEnabled(false);
		panPrincipal.add(new JLabel("ID do funcionário:"));
		panPrincipal.add(txtId);
		panPrincipal.add(new JLabel("Login:"));
		panPrincipal.add(txtLogin);
		panPrincipal.add(new JLabel("Senha:"));
		panPrincipal.add(txtSenha);
		panPrincipal.add(new JLabel("Email:"));
		panPrincipal.add(txtEmail);
		panPrincipal.add(new JLabel(""));

		panAuxiliar.add(btnCancelar);
		panAuxiliar.add(btnGravar);

		panPrincipal.add(panAuxiliar);

		fraPrincipal.setContentPane(panPrincipal);
		fraPrincipal.setSize(800, 250);
		fraPrincipal.setTitle("Loja de Disco: Cadastrar Usuário");
		fraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if ("Gravar".compareTo(e.getActionCommand()) == 0) {

			UsuarioController usuarioController = new UsuarioController();
			Usuario usuario = new Usuario();

			usuario.setLogin(txtLogin.getText());
			usuario.setEmail(txtEmail.getText());
			usuario.setSenha(txtSenha.getText());
			usuarioController.gravar(usuario);
		} else {

			Menu.main(null);
			fraPrincipal.dispose();

		}
	}

}

public class CadastroDeUsuario {

	public static void main(String[] args) {
		new TelaDeCadastroDeUsuario();
	}

}
