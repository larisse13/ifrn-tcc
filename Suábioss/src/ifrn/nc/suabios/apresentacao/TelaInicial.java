package ifrn.nc.suabios.apresentacao;

import ifrn.nc.suabios.apresentacao.fundo.FundoInicial;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;

public class TelaInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
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
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		//CustomPlayer player = new CustomPlayer();
		//player.setPath("C://Users//Larisse//workspace//Pesquisa//Suábioss//src//ifrn//nc//suabios//apresentacao//Suábios-Theme.mp3");
		//player.play(20);
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Larisse\\Documents\\Su\u00E1bios\\Projeto\\logo.png"));
		frame.setTitle("Suábios");
		try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(STPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 		
		
		frame.setUndecorated(true);  		
		frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); 
		frame.setContentPane(new FundoInicial());
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setTitle("Suábios");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JPanel panel = new JPanel();
		panel.setSize(new Dimension(10, 750));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(255,255,255,0));
		
		JButton btnNewButton = new JButton("COMECE AGORA!");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Larisse\\workspace\\Pesquisa\\Su\u00E1bioss\\src\\ifrn\\nc\\suabios\\apresentacao\\suabios.jpg"));
		
		JButton button = new JButton("COMECE AGORA!");
		button.setForeground(Color.BLACK);
		button.setBorder(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login window = new Login();
				window.frame.setVisible(true);
				
				frame.dispose();
				
				
				
			}
		});
		button.setPreferredSize(new Dimension(250, 200));
		button.setMargin(new Insets(2, 0, 2, 0));
		button.setIcon(new ImageIcon("C:\\Users\\Larisse\\Downloads\\Fotos\\y.png"));
		
		JButton button_1 = new JButton("COMECE AGORA!");
		button_1.setBorder(null);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				STPrincipal window = new STPrincipal();
				window.frmSubios.setVisible(true);
				
				frame.dispose();
				
			}
		});
		button_1.setPreferredSize(new Dimension(250, 200));
		button_1.setMargin(new Insets(2, 0, 2, 0));
		button_1.setIcon(new ImageIcon("C:\\Users\\Larisse\\Downloads\\Fotos\\x.png"));
		
		
		
		//JOptionPane.showMessageDialog(null,"Seja bem vindo ao Suábios, por favor escolha uma das opções.","Suábios",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("okb.png"));
		
		JLabel label = new JLabel("COMECE AGORA");
		label.setFont(new Font("AR DESTINE", Font.PLAIN, 20));
		
		JLabel lblCadastrese = new JLabel("CADASTRE-SE");
		lblCadastrese.setFont(new Font("AR DESTINE", Font.PLAIN, 20));
	
				
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(140)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addGap(163))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(214)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(646, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(203)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
					.addComponent(lblCadastrese)
					.addGap(282))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(165)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCadastrese))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		

	}
}
