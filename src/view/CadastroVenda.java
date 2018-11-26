package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.VendaController;
import entity.Venda;

class TelaDeVenda implements ActionListener {

	JFrame fraPrincipal = new JFrame();
	private JTextField txtId = new JTextField();
	private JTextField txtDataDaVenda = new JTextField();
	private JTextField txtCpf = new JTextField();

	private String tabVendaColunas[] = { "ID", "Título", "Valor", "Quantidade", "Subtotal", "Editar", "Deletar" };

	private String tabVendaLinhas[][] = {

			{ "*", "*", "*", "*", "*", "Editar", "Deletar" }

	};

	private JTable tabVenda = new JTable(tabVendaLinhas, tabVendaColunas);

	private JButton btnGravar = new JButton("Finalizar");
	private JButton btnCancelar = new JButton("Cancelar");

	public TelaDeVenda() {
		
		JPanel panPrincipal = new JPanel(new GridLayout(3, 1));

		JPanel panAuxiliar = new JPanel(new GridLayout(3, 2));
		JPanel panAuxiliar1 = new JPanel(new GridLayout(1, 2));

		tabVenda.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent evt) {
				int coluna = tabVenda.columnAtPoint(evt.getPoint());
				if (coluna == 5) {
					// Editar
				} else if (coluna == 6) {
					// Deletar
				}
			}

		});

		btnGravar.addActionListener(this);
		btnCancelar.addActionListener(this);

		panAuxiliar.add(new JLabel("ID:"));
		panAuxiliar.add(txtId);
		panAuxiliar.add(new JLabel("Data:"));
		panAuxiliar.add(txtDataDaVenda);
		panAuxiliar.add(new JLabel("CPF Do cliente:"));
		panAuxiliar.add(txtCpf);

		panAuxiliar1.add(btnGravar);
		panAuxiliar1.add(btnCancelar);

		panPrincipal.add(panAuxiliar);
		panPrincipal.add(new JScrollPane(tabVenda));
		panPrincipal.add(panAuxiliar1);

		fraPrincipal.setContentPane(panPrincipal);
		fraPrincipal.setSize(800, 250);
		fraPrincipal.setTitle("Loja de Disco: Venda");
		fraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("Finalizar".compareTo(e.getActionCommand()) == 0) {

			VendaController vendaController = new VendaController();
			Venda venda = new Venda();
			
			venda.setId(1);
			venda.setDtVenda(formatarData(txtDataDaVenda.getText()));
			venda.setCpfCliente(txtCpf.getText());
			//Terminar
			
			vendaController.gravar(venda);
		} else {
			
			Menu.main(null);
			fraPrincipal.dispose();

		}

	}

	private Date formatarData(String data) {

		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		try {
			date = parser.parse(data);
		} catch (ParseException e) {
			System.out.println("Data invalida");
		}

		return date;

	}

}

public class CadastroVenda {

	public static void main(String[] args) {
		new TelaDeVenda();
	}

}