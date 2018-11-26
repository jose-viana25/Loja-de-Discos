package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarFuncionarios {

	private JFrame frmLojaDeDiscos;
	private JPanel panel_1;
	private JTable table;
	private JLabel lblPesquisar;
	private JTextField txtfPesquisar;
	private JButton btnLupinha;
	private JPanel panel_2;
	private JButton btnEditar;
	private JButton btnDeletar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarFuncionarios window = new ListarFuncionarios();
					window.frmLojaDeDiscos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListarFuncionarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLojaDeDiscos = new JFrame();
		frmLojaDeDiscos.setTitle("Loja de Discos: Listar funcionarios");
		frmLojaDeDiscos.setBounds(100, 100, 450, 300);
		frmLojaDeDiscos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEFT);
		frmLojaDeDiscos.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu.main(null);
				frmLojaDeDiscos.dispose();
				
			}
		});
		panel.add(btnVoltar);
		
		panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setHgap(50);
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel.add(panel_2);
		
		btnEditar = new JButton("Editar");
		panel_2.add(btnEditar);
		
		btnDeletar = new JButton("Deletar");
		panel_2.add(btnDeletar);
		
		panel_1 = new JPanel();
		frmLojaDeDiscos.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		lblPesquisar = DefaultComponentFactory.getInstance().createLabel("Pesquisar:");
		panel_1.add(lblPesquisar);
		
		txtfPesquisar = new JTextField();
		panel_1.add(txtfPesquisar);
		txtfPesquisar.setColumns(10);
		
		btnLupinha = new JButton("\"Lupinha\"");
		panel_1.add(btnLupinha);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Função", "Status", "Email"
			}
		));
		frmLojaDeDiscos.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
	}

}
