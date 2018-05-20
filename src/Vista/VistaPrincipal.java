package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	protected JTextArea txtArea;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel lblNumeroPagina;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setTitle("Lector");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtArea = new JTextArea();
		txtArea.setFont(new Font("Miriam Fixed", Font.BOLD, 13));
		txtArea.setBackground(Color.LIGHT_GRAY);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		contentPane.add(txtArea, BorderLayout.NORTH);
		
		//Panel de botones
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		lblNumeroPagina = new JLabel("0");
		lblNumeroPagina.setForeground(Color.WHITE);
		btnAtras = new JButton("<<");		
		btnAtras.setBackground(Color.CYAN);
		btnAtras.setForeground(Color.BLACK);
		btnAlante = new JButton(">>");		
		btnAlante.setBackground(Color.CYAN);
		btnMarcar = new JButton("Marcar");		
		btnMarcar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		btnMarcar.setBackground(Color.GREEN);
		btnIrAMarca = new JButton("Ir a Marca");
		btnIrAMarca.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		btnIrAMarca.setBackground(Color.RED);
		
		panel.add(btnAtras);
		panel.add(btnMarcar);
		panel.add(btnIrAMarca);
		panel.add(btnAlante);		
		panel.add(lblNumeroPagina);	
		StringBuilder Cadena = new StringBuilder();
		Cadena.append("a");
		
	}	

}
