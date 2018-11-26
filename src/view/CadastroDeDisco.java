package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.DiscosController;
import entity.Discos;

class TelaDeCadastroDeDisco implements ActionListener{
	
	private final String LISTATIPO[] = {"K7", "CD", "LP", "DVD"};
	private final String LISTAFORMATO[] = {"Single","Full",};
	
	JFrame fraPrincipal = new JFrame();
	private JTextField txtId = new JTextField();
	private JTextField txtTitulo = new JTextField();
	private JTextField txtArtista = new JTextField();
	private JTextField txtValor = new JTextField();
	private JComboBox<String> cmbTipo = new JComboBox<>(LISTATIPO);
	private JTextField txtDataDeLancamento = new JTextField();
	private JComboBox<String> cmbFormato = new JComboBox<>(LISTAFORMATO);
	
	
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnCancelar = new JButton("Cancelar");
	
	public TelaDeCadastroDeDisco() {
		
		JPanel panPrincipal = new JPanel(new GridLayout(1, 2));
		
		JPanel panAuxiliar = new JPanel(new GridLayout(7, 2));
		JPanel panAuxiliar1 = new JPanel(new GridLayout(2, 1));
		JPanel panAuxiliar2 = new JPanel(new GridLayout(1, 2));
		
		btnGravar.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		
		txtId.setText("1");
		panAuxiliar.add(new JLabel("ID:"));
		panAuxiliar.add(txtId);
		panAuxiliar.add(new JLabel("Título:"));
		panAuxiliar.add(txtTitulo);
		panAuxiliar.add(new JLabel("Artista:"));
		panAuxiliar.add(txtArtista);
		panAuxiliar.add(new JLabel("Valor:"));
		panAuxiliar.add(txtValor);
		panAuxiliar.add(new JLabel("Tipo:"));
		panAuxiliar.add(cmbTipo);
		panAuxiliar.add(new JLabel("Data de Lançamento:"));
		panAuxiliar.add(txtDataDeLancamento);
		panAuxiliar.add(new JLabel("Formato:"));
		panAuxiliar.add(cmbFormato);
		
		panAuxiliar2.add(btnGravar);
		panAuxiliar2.add(btnCancelar);
		
		panAuxiliar1.add(new JLabel("Imagem"));
		panAuxiliar1.add(panAuxiliar2);		
		
		
		panPrincipal.add(panAuxiliar);
		panPrincipal.add(panAuxiliar1);
		
		fraPrincipal.setContentPane(panPrincipal);
		fraPrincipal.setSize(800, 250);
		fraPrincipal.setTitle("Loja de Disco: Cadastro De Disco");
		fraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraPrincipal.setVisible(true);
		txtId.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()=="Gravar") {
			DiscosController dc = new DiscosController();
			Discos discos = new Discos();
			
			discos.setTitulo(txtTitulo.getText());
			discos.setArtista(txtArtista.getText());
			discos.setDtLanc(formatarData(txtDataDeLancamento.getText()));
			discos.setFormato(cmbFormato.getSelectedItem().toString());
			discos.setTipo(cmbTipo.getSelectedItem().toString());
			discos.setValor(Double.parseDouble(txtValor.getText()));
			System.out.println(discos.toString());
			dc.gravar(discos);
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


public class CadastroDeDisco {

	
	
	public static void main(String[] args) {
		new TelaDeCadastroDeDisco();
	}

}
