package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TelaDeCadastroDeFuncionario implements ActionListener{
	
	private final String LISTACIDADE[] = {"C1","C2"};
	private final String LISTAUF[] = {"UF1","UF2"};
	private final String LISTAFUNCAO[] = {"F1","F2"};
	private final String LISTASTATUS[] = {"S1","S2"};
	
	
	JFrame fraPrincipal = new JFrame();
	private JTextField txtId = new JTextField();
	private JTextField txtNome = new JTextField();
	private JTextField txtCpf = new JTextField();
	private JTextField txtLogradouro = new JTextField();
	private JTextField txtNumero = new JTextField();
	private JTextField txtComplemento = new JTextField();
	private JTextField txtCep = new JTextField();
	private JComboBox<String> cmbCidade = new JComboBox<>(LISTACIDADE);
	private JComboBox<String> cmbUf = new JComboBox<>(LISTAUF);
	private JComboBox<String> cmbFuncao = new JComboBox<>(LISTAFUNCAO);
	private JTextField txtSalario = new JTextField();
	private JComboBox<String> cmbStatus = new JComboBox<>(LISTASTATUS);
	
	
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnCancelar = new JButton("Cancelar");
	
	
			
	public TelaDeCadastroDeFuncionario() {
		
		JPanel panPrincipal = new JPanel(new GridLayout(2, 1));
		JPanel panAuxiliar = new JPanel(new GridLayout(12, 2));
		
		JPanel panAuxiliar1 = new JPanel(new GridLayout(1, 2));
		
		btnGravar.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		panAuxiliar.add(new JLabel("ID:"));
		panAuxiliar.add(txtId);
		panAuxiliar.add(new JLabel("Nome:"));
		panAuxiliar.add(txtNome);
		panAuxiliar.add(new JLabel("CPF:"));
		panAuxiliar.add(txtCpf);
		
		panAuxiliar.add(new JLabel("Logradouro:"));
		panAuxiliar.add(txtLogradouro);
		panAuxiliar.add(new JLabel("Nº:"));
		panAuxiliar.add(txtNumero);
		
		panAuxiliar.add(new JLabel("Complemento:"));
		panAuxiliar.add(txtComplemento);
		panAuxiliar.add(new JLabel("CEP:"));
		panAuxiliar.add(txtCep);
		
		panAuxiliar.add(new JLabel("Cidade:"));
		panAuxiliar.add(cmbCidade);
		panAuxiliar.add(new JLabel("UF:"));
		panAuxiliar.add(cmbUf);
		
		panAuxiliar.add(new JLabel("Função"));
		panAuxiliar.add(cmbFuncao);
		panAuxiliar.add(new JLabel("Salário"));
		panAuxiliar.add(txtSalario);
		
		panAuxiliar.add(new JLabel("Status"));
		panAuxiliar.add(cmbStatus);
		
		panAuxiliar1.add(btnCancelar);
		panAuxiliar1.add(btnGravar);
		
		panPrincipal.add(panAuxiliar);
		panPrincipal.add(panAuxiliar1);
		
		
		fraPrincipal.setContentPane(panPrincipal);
		fraPrincipal.setSize(800, 500);
		fraPrincipal.setTitle("Loja de Disco: Cadastro De Funcionário");
		fraPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraPrincipal.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()=="Gravar") {
			
		} else {
			
			Menu.main(null);
			fraPrincipal.dispose();
			
		}
	}
	
}

public class CadastroDeFuncionario {

	
	
	public static void main(String[] args) {
		new TelaDeCadastroDeFuncionario();
	}

}
