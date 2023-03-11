package ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VMain extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnIgual;
	private JButton btnMas;
	private JButton btnMenos;
	private JButton btnPor;
	private JButton btnDiv;
	private JButton btnRaiz;
	private JButton btnPotencia;
	private JButton btnComa;
	private JButton btnDel;

	public VMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnDel = new JButton("<--");
		btnDel.setBounds(208, 333, 89, 50);
		contentPane.add(btnDel);
		btnDel.addActionListener(this);

		JTextPane pantalla = new JTextPane();
		pantalla.setEditable(false);
		pantalla.setBounds(10, 11, 495, 70);
		contentPane.add(pantalla);

		btn0 = new JButton("0");
		btn0.setBounds(10, 333, 89, 50);
		contentPane.add(btn0);
		btn0.addActionListener(this);

		btn1 = new JButton("1");
		btn1.setBounds(10, 256, 89, 50);
		contentPane.add(btn1);
		btn1.addActionListener(this);

		btn2 = new JButton("2");
		btn2.setBounds(109, 256, 89, 50);
		contentPane.add(btn2);
		btn2.addActionListener(this);

		btn3 = new JButton("3");
		btn3.setBounds(208, 256, 89, 50);
		contentPane.add(btn3);
		btn3.addActionListener(this);

		btn4 = new JButton("4");
		btn4.setBounds(10, 176, 89, 50);
		contentPane.add(btn4);
		btn4.addActionListener(this);

		btn5 = new JButton("5");
		btn5.setBounds(109, 176, 89, 50);
		contentPane.add(btn5);
		btn5.addActionListener(this);

		btn6 = new JButton("6");
		btn6.setBounds(208, 176, 89, 50);
		contentPane.add(btn6);
		btn6.addActionListener(this);

		btn7 = new JButton("7");
		btn7.setBounds(10, 104, 89, 50);
		contentPane.add(btn7);
		btn7.addActionListener(this);

		btn8 = new JButton("8");
		btn8.setBounds(109, 104, 89, 50);
		contentPane.add(btn8);
		btn8.addActionListener(this);

		btn9 = new JButton("9");
		btn9.setBounds(208, 104, 89, 50);
		contentPane.add(btn9);
		btn9.addActionListener(this);

		btnMas = new JButton("+");
		btnMas.setBounds(317, 256, 89, 50);
		contentPane.add(btnMas);
		btnMas.addActionListener(this);

		btnMenos = new JButton("-");
		btnMenos.setBounds(416, 256, 89, 50);
		contentPane.add(btnMenos);
		btnMenos.addActionListener(this);

		btnPor = new JButton("X");
		btnPor.setBounds(417, 176, 89, 50);
		contentPane.add(btnPor);
		btnPor.addActionListener(this);

		btnDiv = new JButton("/");
		btnDiv.setBounds(318, 176, 89, 50);
		contentPane.add(btnDiv);
		btnDiv.addActionListener(this);

		btnIgual = new JButton("=");
		btnIgual.setBounds(318, 333, 187, 50);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(this);

		btnRaiz = new JButton("\t√");
		btnRaiz.setBounds(318, 104, 89, 50);
		contentPane.add(btnRaiz);
		btnRaiz.addActionListener(this);

		btnPotencia = new JButton("^");
		btnPotencia.setBounds(416, 104, 89, 50);
		contentPane.add(btnPotencia);
		btnPotencia.addActionListener(this);

		btnComa = new JButton(",");
		btnComa.setBounds(109, 333, 89, 50);
		contentPane.add(btnComa);
		btnComa.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
