package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 5, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblDiscos = new JLabel("Discos");
		lblDiscos.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblDiscos);
		
		JButton btnAdicionarDiscos = new JButton("Adicionar");
		btnAdicionarDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroDeDisco.main(null);
				frame.dispose();
				
			}
		});
		panel_1.add(btnAdicionarDiscos);
		
		JButton btnListarDiscos = new JButton("Listar");
		btnListarDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarDiscos.main(null);
				frame.dispose();
				
			}
		});
		panel_1.add(btnListarDiscos);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblEstoque);
		
		JButton btnAdicionarEstoque = new JButton("Adicionar");
		panel_2.add(btnAdicionarEstoque);
		
		JButton btnListarEstoque = new JButton("Listar");
		btnListarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarEstoque.main(null);
				frame.dispose();
				
			}
		});
		panel_2.add(btnListarEstoque);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblVenda = new JLabel("Venda");
		lblVenda.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblVenda);
		
		JButton btnAdicionarVenda = new JButton("Adicionar");
		btnAdicionarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroVenda.main(null);
				frame.dispose();
				
			}
		});
		panel_3.add(btnAdicionarVenda);
		
		JButton btnListarVenda = new JButton("Listar");
		btnListarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarVendas.main(null);
				frame.dispose();
				
			}
		});
		panel_3.add(btnListarVenda);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblFuncionarios = new JLabel("Funcionários");
		lblFuncionarios.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblFuncionarios);
		
		JButton btnAdicionarFuncionarios = new JButton("Adicionar");
		btnAdicionarFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroDeFuncionario.main(null);
				frame.dispose();
				
			}
		});
		panel_4.add(btnAdicionarFuncionarios);
		
		JButton btnListarFuncionarios = new JButton("Listar");
		btnListarFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarFuncionarios.main(null);
				frame.dispose();
				
			}
		});
		panel_4.add(btnListarFuncionarios);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblUsuarios = new JLabel("Usuários");
		lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblUsuarios);
		
		JButton btnAdicionarUsuarios = new JButton("Adicionar");
		btnAdicionarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroDeUsuario.main(null);
				frame.dispose();
			}
		});
		panel_5.add(btnAdicionarUsuarios);
		
		JButton btnListarUsuarios = new JButton("Listar");
		btnListarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarUsuario.main(null);
				frame.dispose();
				
			}
		});
		panel_5.add(btnListarUsuarios);
	}
}
