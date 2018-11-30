package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.DiscosController;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListarDiscos {

	private JFrame frmLojaDeDiscos;
	private JButton btnVoltar;
	private JPanel panel_1;
	private JLabel lblPesquisar;
	private JTextField txtfPesquisar;
	private JButton btnLupinha;
	private JTable table;
	private JPanel panel_2;
	private JButton btnEditar;
	private JButton btnDeletar;

	
	private DiscosController discosController;
	/**
	 * Launch the application.
	 */
	//EDT Event Dispatch Thread
	// e1 e2 e3 e4 e5...en
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarDiscos window = new ListarDiscos();
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
	public ListarDiscos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLojaDeDiscos = new JFrame();
		frmLojaDeDiscos.setTitle("Loja De Discos: Listar discos");
		frmLojaDeDiscos.setBounds(100, 100, 450, 300);
		frmLojaDeDiscos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEADING);
		frmLojaDeDiscos.getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Menu.main(null);
				frmLojaDeDiscos.dispose();
				
			}
		});
		panel.add(btnVoltar);
		
		panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		flowLayout_1.setHgap(50);
		panel.add(panel_2);
		
		btnEditar = new JButton("Editar");
		panel_2.add(btnEditar);
		
		btnDeletar = new JButton("Deletar");
		panel_2.add(btnDeletar);
		
		panel_1 = new JPanel();
		frmLojaDeDiscos.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		lblPesquisar = new JLabel("Pesquisar:");
		panel_1.add(lblPesquisar);
		
		txtfPesquisar = new JTextField();
		panel_1.add(txtfPesquisar);
		txtfPesquisar.setColumns(10);
		
		btnLupinha = new JButton("\"Lupinha\"");
		btnLupinha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				discosController.listar(txtfPesquisar.getText());
				
			}
		});
		panel_1.add(btnLupinha);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Título", "Artista", "Valor", "Tipo", "Lançamento","Formato"
			}
		));
		frmLojaDeDiscos.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
	}

}
