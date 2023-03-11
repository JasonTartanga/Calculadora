package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
	private JTextField pantalla;

	private double num1 = 0, num2;

	public VMain() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\arceu\\Desktop\\Calculadora\\Calculadora\\recursos\\calculadora.png"));
		setResizable(false);
		setTitle("Calculadora Jason");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnDel = new JButton("<--");
		btnDel.setFont(new Font("Serif", Font.PLAIN, 16));
		btnDel.setForeground(new Color(0, 0, 0));
		btnDel.setBackground(SystemColor.controlHighlight);
		btnDel.setBounds(208, 333, 89, 50);
		contentPane.add(btnDel);
		btnDel.addActionListener(this);

		btn0 = new JButton("0");
		btn0.setFont(new Font("Serif", Font.PLAIN, 16));
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setBackground(SystemColor.controlHighlight);
		btn0.setBounds(10, 333, 89, 50);
		contentPane.add(btn0);
		btn0.addActionListener(this);

		btn1 = new JButton("1");
		btn1.setFont(new Font("Serif", Font.PLAIN, 16));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(SystemColor.controlHighlight);
		btn1.setBounds(10, 256, 89, 50);
		contentPane.add(btn1);
		btn1.addActionListener(this);

		btn2 = new JButton("2");
		btn2.setFont(new Font("Serif", Font.PLAIN, 16));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setBackground(SystemColor.controlHighlight);
		btn2.setBounds(109, 256, 89, 50);
		contentPane.add(btn2);
		btn2.addActionListener(this);

		btn3 = new JButton("3");
		btn3.setFont(new Font("Serif", Font.PLAIN, 16));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBackground(SystemColor.controlHighlight);
		btn3.setBounds(208, 256, 89, 50);
		contentPane.add(btn3);
		btn3.addActionListener(this);

		btn4 = new JButton("4");
		btn4.setFont(new Font("Serif", Font.PLAIN, 16));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBackground(SystemColor.controlHighlight);
		btn4.setBounds(10, 176, 89, 50);
		contentPane.add(btn4);
		btn4.addActionListener(this);

		btn5 = new JButton("5");
		btn5.setFont(new Font("Serif", Font.PLAIN, 16));
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(SystemColor.controlHighlight);
		btn5.setBounds(109, 176, 89, 50);
		contentPane.add(btn5);
		btn5.addActionListener(this);

		btn6 = new JButton("6");
		btn6.setFont(new Font("Serif", Font.PLAIN, 16));
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setBackground(SystemColor.controlHighlight);
		btn6.setBounds(208, 176, 89, 50);
		contentPane.add(btn6);
		btn6.addActionListener(this);

		btn7 = new JButton("7");
		btn7.setFont(new Font("Serif", Font.PLAIN, 16));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBackground(SystemColor.controlHighlight);
		btn7.setBounds(10, 104, 89, 50);
		contentPane.add(btn7);
		btn7.addActionListener(this);

		btn8 = new JButton("8");
		btn8.setFont(new Font("Serif", Font.PLAIN, 16));
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setBackground(SystemColor.controlHighlight);
		btn8.setBounds(109, 104, 89, 50);
		contentPane.add(btn8);
		btn8.addActionListener(this);

		btn9 = new JButton("9");
		btn9.setFont(new Font("Serif", Font.PLAIN, 16));
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setBackground(SystemColor.controlHighlight);
		btn9.setBounds(208, 104, 89, 50);
		contentPane.add(btn9);
		btn9.addActionListener(this);

		btnMas = new JButton("+");
		btnMas.setFont(new Font("Serif", Font.PLAIN, 16));
		btnMas.setForeground(new Color(0, 0, 0));
		btnMas.setBackground(SystemColor.controlHighlight);
		btnMas.setBounds(317, 256, 89, 50);
		contentPane.add(btnMas);
		btnMas.addActionListener(this);

		btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Serif", Font.PLAIN, 16));
		btnMenos.setForeground(new Color(0, 0, 0));
		btnMenos.setBackground(SystemColor.controlHighlight);
		btnMenos.setBounds(416, 256, 89, 50);
		contentPane.add(btnMenos);
		btnMenos.addActionListener(this);

		btnPor = new JButton("x");
		btnPor.setFont(new Font("Serif", Font.PLAIN, 16));
		btnPor.setForeground(new Color(0, 0, 0));
		btnPor.setBackground(SystemColor.controlHighlight);
		btnPor.setBounds(417, 176, 89, 50);
		contentPane.add(btnPor);
		btnPor.addActionListener(this);

		btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Serif", Font.PLAIN, 16));
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.setBackground(SystemColor.controlHighlight);
		btnDiv.setBounds(318, 176, 89, 50);
		contentPane.add(btnDiv);
		btnDiv.addActionListener(this);

		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Serif", Font.PLAIN, 16));
		btnIgual.setForeground(new Color(0, 0, 0));
		btnIgual.setBackground(SystemColor.controlHighlight);
		btnIgual.setBounds(318, 333, 187, 50);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(this);

		btnRaiz = new JButton("√");
		btnRaiz.setFont(new Font("Serif", Font.PLAIN, 16));
		btnRaiz.setForeground(new Color(0, 0, 0));
		btnRaiz.setBackground(SystemColor.controlHighlight);
		btnRaiz.setBounds(318, 104, 89, 50);
		contentPane.add(btnRaiz);
		btnRaiz.addActionListener(this);

		btnPotencia = new JButton("^");
		btnPotencia.setFont(new Font("Serif", Font.PLAIN, 16));
		btnPotencia.setForeground(new Color(0, 0, 0));
		btnPotencia.setBackground(SystemColor.controlHighlight);
		btnPotencia.setBounds(416, 104, 89, 50);
		contentPane.add(btnPotencia);
		btnPotencia.addActionListener(this);

		btnComa = new JButton(",");
		btnComa.setFont(new Font("Serif", Font.PLAIN, 16));
		btnComa.setForeground(new Color(0, 0, 0));
		btnComa.setBackground(SystemColor.controlHighlight);
		btnComa.setBounds(109, 333, 89, 50);
		contentPane.add(btnComa);

		pantalla = new JTextField();
		pantalla.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla.setEditable(false);
		pantalla.setFont(new Font("Serif", Font.PLAIN, 18));
		pantalla.setBounds(10, 11, 495, 82);
		contentPane.add(pantalla);
		pantalla.setColumns(10);
		btnComa.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton[] numeros = { btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnComa };
		JButton[] operadores = { btnMas, btnMenos, btnPor, btnDiv, btnPotencia };

		for (int i = 0; i < numeros.length; i++) {
			if (e.getSource().equals(numeros[i])) {
				pantalla.setText(pantalla.getText() + numeros[i].getText());
			}
		}

		for (int i = 0; i < operadores.length; i++) {
			if (e.getSource().equals(operadores[i])) {
				pantalla.setText(pantalla.getText() + operadores[i].getText());
				/*
				if (num1 == 0) {
					num1 = Integer.parseInt(pantalla.getText());
					pantalla.setText(pantalla.getText() + operadores[i].getText());
				} else {
					num2 = Integer.parseInt(
							pantalla.getText().substring(pantalla.getText().indexOf(operadores[i].getText() + 1)));
					pantalla.setText(calcular(operadores[i].getText(), num1, num2) + "");
					num1 = 0;
					num2 = 0;
				}
				 */
			}
		}
		if (e.getSource().equals(btnDel)) {
			pantalla.setText(pantalla.getText().substring(0, (pantalla.getText().length() - 1)));
		}
		if(e.getSource().equals(btnIgual)) {
			pantalla.setText("");
		}

	}

	private double calcular(String string, double num1, double num2) {
		switch (string) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "x":
			return num1 * num2;
		case "/":
			return num1 / num2;
		case "^":
			for (int i = 0; i < num2; i++) {
				num1 *= num1;
			}
			return num1;
		default:
			return 0;
		}
	}
}
