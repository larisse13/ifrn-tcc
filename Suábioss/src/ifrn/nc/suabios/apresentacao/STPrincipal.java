package ifrn.nc.suabios.apresentacao;

import ifrn.nc.suabios.apresentacao.CadastroUser;
import ifrn.nc.suabios.apresentacao.fundo.Fundo;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JLabel;

import java.awt.Font;

public class STPrincipal extends JFrame {

	JFrame frmSubios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STPrincipal window1 = new STPrincipal();
					window1.frmSubios.setVisible(true);
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public STPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubios = new JFrame();
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
		//frmSubios.setUndecorated(true);  		
		frmSubios.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); 
		frmSubios.setContentPane(new Fundo());
		frmSubios.getContentPane().setBackground(new Color(245, 255, 250));
		frmSubios.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmSubios.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Larisse\\Downloads\\logo.png"));
		frmSubios.setTitle("Su\u00E1bios");
		frmSubios.setBounds(100, 100, 450, 300);
		frmSubios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmSubios.setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("MENU");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmUsurio = new JMenuItem("Adicionar Usu\u00E1rio");
		mntmUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login window = new Login();
				window.frame.setVisible(true);
				
			}
		});
		
		JMenuItem mntmMenuPrincipal = new JMenuItem("Menu Principal");
		mntmMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				STPrincipal window1 = new STPrincipal();
				window1.frmSubios.setVisible(true);
			}
		});
		mnCadastro.add(mntmMenuPrincipal);
		mnCadastro.add(mntmUsurio);
		
		JMenuItem mntmListarUsurios = new JMenuItem("Listar Usu\u00E1rios");
		mntmListarUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				Login window = new Login();
				window.frame.setVisible(true);
				
			}
		});
		
		mnCadastro.add(mntmListarUsurios);
		
		
		
		
		JMenu mnHistria = new JMenu("HIST\u00D3RIA");
		menuBar.add(mnHistria);
		
		JMenuItem mntmHistriaDaFlauta = new JMenuItem("Hist\u00F3ria da Flauta");
		mnHistria.add(mntmHistriaDaFlauta);
		
		JMenu mnTutorial = new JMenu("TUTORIAL");
		menuBar.add(mnTutorial);
		
		JMenuItem mntmTutorial = new JMenuItem("TUTORIAL");
		mnTutorial.add(mntmTutorial);
		
		JMenu mnPosies = new JMenu("POSI\u00C7\u00D5ES");
		menuBar.add(mnPosies);
		
		JMenu mnEtapa = new JMenu("Etapa 1");
		mnPosies.add(mnEtapa);
		
		JMenuItem mntmSi = new JMenuItem("Si");
		mnEtapa.add(mntmSi);
		
		JMenuItem mntmL = new JMenuItem("L\u00E1");
		mnEtapa.add(mntmL);
		
		JMenuItem mntmSol = new JMenuItem("Sol");
		mnEtapa.add(mntmSol);
		
		JMenu mnEtapa_1 = new JMenu("Etapa 2");
		mnPosies.add(mnEtapa_1);
		
		JMenuItem mntmD = new JMenuItem("D\u00F3");
		mnEtapa_1.add(mntmD);
		
		JMenuItem mntmR = new JMenuItem("R\u00E9");
		mnEtapa_1.add(mntmR);
		
		JMenu mnEtapa_2 = new JMenu("Etapa 3");
		mnPosies.add(mnEtapa_2);
		
		JMenuItem mntmF = new JMenuItem("F\u00E1");
		mnEtapa_2.add(mntmF);
		
		JMenuItem mntmMi = new JMenuItem("Mi");
		mnEtapa_2.add(mntmMi);
		
		JMenuItem mntmR_2 = new JMenuItem("R\u00E9");
		mnEtapa_2.add(mntmR_2);
		
		JMenuItem mntmD_1 = new JMenuItem("D\u00F3");
		mnEtapa_2.add(mntmD_1);
		
		JMenu mnEtapa_3 = new JMenu("Etapa 4");
		mnPosies.add(mnEtapa_3);
		
		JMenuItem mntmD_2 = new JMenuItem("D\u00F3#");
		mnEtapa_3.add(mntmD_2);
		
		JMenuItem mntmR_3 = new JMenuItem("R\u00E9#");
		mnEtapa_3.add(mntmR_3);
		
		JMenuItem mntmF_1 = new JMenuItem("F\u00E1#");
		mnEtapa_3.add(mntmF_1);
		
		JMenuItem mntmSol_1 = new JMenuItem("Sol#");
		mnEtapa_3.add(mntmSol_1);
		
		JMenuItem mntmL_1 = new JMenuItem("L\u00E1#");
		mnEtapa_3.add(mntmL_1);
		
		JMenu mnEtapa_4 = new JMenu("Etapa 5");
		mnPosies.add(mnEtapa_4);
		
		JMenuItem mntmR_1 = new JMenuItem("R\u00E9 bemol");
		mnEtapa_4.add(mntmR_1);
		
		JMenuItem mntmMiBemol = new JMenuItem("Mi bemol");
		mnEtapa_4.add(mntmMiBemol);
		
		JMenuItem mntmSolBemol = new JMenuItem("Sol bemol");
		mnEtapa_4.add(mntmSolBemol);
		
		JMenuItem mntmLBemol = new JMenuItem("L\u00E1 bemol");
		mnEtapa_4.add(mntmLBemol);
		
		JMenuItem mntmSiBemol = new JMenuItem("Si bemol");
		mnEtapa_4.add(mntmSiBemol);
		
		JMenu mnNewMenu = new JMenu("EXERC\u00CDCIOS");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmEtapa = new JMenuItem("Etapa 1");
		mnNewMenu.add(mntmEtapa);
		
		JMenuItem mntmEtapa_1 = new JMenuItem("Etapa 2");
		mnNewMenu.add(mntmEtapa_1);
		
		JMenuItem mntmEtapa_2 = new JMenuItem("Etapa 3");
		mnNewMenu.add(mntmEtapa_2);
		
		JMenuItem mntmEtapa_3 = new JMenuItem("Etapa 4");
		mnNewMenu.add(mntmEtapa_3);
		
		JMenuItem mntmEtapa_4 = new JMenuItem("Etapa 5");
		mnNewMenu.add(mntmEtapa_4);
		
		JMenu mnNewMenu_1 = new JMenu("REPERT\u00D3RIO");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmEtapa_5 = new JMenuItem("Etapa 1");
		mnNewMenu_1.add(mntmEtapa_5);
		
		JMenuItem mntmEtapa_6 = new JMenuItem("Etapa 2");
		mnNewMenu_1.add(mntmEtapa_6);
		
		JMenuItem mntmEtapa_7 = new JMenuItem("Etapa 3");
		mnNewMenu_1.add(mntmEtapa_7);
		
		JMenuItem mntmEtapa_8 = new JMenuItem("Etapa 4");
		mnNewMenu_1.add(mntmEtapa_8);
		
		JMenuItem mntmEtapa_9 = new JMenuItem("Etapa 5");
		mnNewMenu_1.add(mntmEtapa_9);
		
		JMenu mnSobre = new JMenu("SOBRE");
		menuBar.add(mnSobre);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnSobre.add(mntmSobre);
		
		JMenu mnContato = new JMenu("CONTATO");
		menuBar.add(mnContato);
		
		JMenuItem mntmContato = new JMenuItem("Contato");
		mnContato.add(mntmContato);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setPreferredSize(new Dimension(5, 5));
		panel.setForeground(Color.BLACK);
		panel.setBounds(new Rectangle(10, 0, 0, 0));
		panel.setBackground(new Color(255,255,255,0));
		
		JButton btnRepertrio = new JButton("Posi\u00E7\u00F5es");
		btnRepertrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PosicaoSi window = new PosicaoSi();
				window.frame.setVisible(true);
				
			}
		});
		btnRepertrio.setBackground(new Color(103,182,223));  
		btnRepertrio.setPreferredSize(new Dimension(100, 65));
		btnRepertrio.setMargin(new Insets(2, 14, 0, 14));
		btnRepertrio.setForeground(Color.BLACK);
		btnRepertrio.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton button_1 = new JButton("Exerc\u00EDcios");
		button_1.setBackground(new Color(103,182,223));
		button_1.setMargin(new Insets(0, 0, 0, 0));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		button_1.setAlignmentY(0.0f);
		
		JButton btnPosies = new JButton("Repert\u00F3rio");
		btnPosies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPosies.setBackground(new Color(103,182,223));
		btnPosies.setPreferredSize(new Dimension(100, 65));
		btnPosies.setMargin(new Insets(2, 14, 0, 14));
		btnPosies.setForeground(Color.BLACK);
		btnPosies.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton button_3 = new JButton("Exerc\u00EDcios");
		button_3.setBackground(new Color(103,182,223)); 
		button_3.setPreferredSize(new Dimension(100, 65));
		button_3.setMargin(new Insets(2, 14, 0, 14));
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnRepertrio_1 = new JButton("Posi\u00E7\u00F5es");
		btnRepertrio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRepertrio_1.setBackground(new Color(103,182,223));
		btnRepertrio_1.setPreferredSize(new Dimension(100, 65));
		btnRepertrio_1.setMargin(new Insets(2, 14, 0, 14));
		btnRepertrio_1.setForeground(Color.BLACK);
		btnRepertrio_1.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnPosies_1 = new JButton("Repert\u00F3rio");
		btnPosies_1.setBackground(new Color(103,182,223)); 
		btnPosies_1.setPreferredSize(new Dimension(100, 65));
		btnPosies_1.setMargin(new Insets(2, 14, 0, 14));
		btnPosies_1.setForeground(Color.BLACK);
		btnPosies_1.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnPosies_2 = new JButton("Repert\u00F3rio");
		btnPosies_2.setBackground(new Color(103,182,223));
		btnPosies_2.setPreferredSize(new Dimension(100, 65));
		btnPosies_2.setMargin(new Insets(2, 14, 0, 14));
		btnPosies_2.setForeground(Color.BLACK);
		btnPosies_2.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnRepertrio_3 = new JButton("Posi\u00E7\u00F5es");
		btnRepertrio_3.setBackground(new Color(103,182,223));
		btnRepertrio_3.setPreferredSize(new Dimension(100, 65));
		btnRepertrio_3.setMargin(new Insets(2, 14, 0, 14));
		btnRepertrio_3.setForeground(Color.BLACK);
		btnRepertrio_3.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnPosies_4 = new JButton("Repert\u00F3rio");
		btnPosies_4.setBackground(new Color(103,182,223));
		btnPosies_4.setPreferredSize(new Dimension(100, 65));
		btnPosies_4.setMargin(new Insets(2, 14, 0, 14));
		btnPosies_4.setForeground(Color.BLACK);
		btnPosies_4.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton button_10 = new JButton("Exerc\u00EDcios");
		button_10.setBackground(new Color(103,182,223));
		button_10.setPreferredSize(new Dimension(100, 65));
		button_10.setMargin(new Insets(2, 14, 0, 14));
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton button_11 = new JButton("Exerc\u00EDcios");
		button_11.setBackground(new Color(103,182,223));
		button_11.setPreferredSize(new Dimension(100, 65));
		button_11.setMargin(new Insets(2, 14, 0, 14));
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton button_12 = new JButton("Exerc\u00EDcios");
		button_12.setBackground(new Color(103,182,223));
		button_12.setPreferredSize(new Dimension(100, 65));
		button_12.setMargin(new Insets(2, 14, 0, 14));
		button_12.setForeground(Color.BLACK);
		button_12.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnRepertrio_2 = new JButton("Posi\u00E7\u00F5es");
		btnRepertrio_2.setBackground(new Color(103,182,223));
		btnRepertrio_2.setPreferredSize(new Dimension(100, 65));
		btnRepertrio_2.setMargin(new Insets(2, 14, 0, 14));
		btnRepertrio_2.setForeground(Color.BLACK);
		btnRepertrio_2.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnPosies_3 = new JButton("Repert\u00F3rio");
		btnPosies_3.setBackground(new Color(103,182,223));
		btnPosies_3.setPreferredSize(new Dimension(100, 65));
		btnPosies_3.setMargin(new Insets(2, 14, 0, 14));
		btnPosies_3.setForeground(Color.BLACK);
		btnPosies_3.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		JButton btnRepertrio_4 = new JButton("Posi\u00E7\u00F5es");
		btnRepertrio_4.setBackground(new Color(103,182,223));
		btnRepertrio_4.setPreferredSize(new Dimension(100, 65));
		btnRepertrio_4.setMargin(new Insets(2, 14, 0, 14));
		btnRepertrio_4.setForeground(Color.BLACK);
		btnRepertrio_4.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(41, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnRepertrio, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPosies, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPosies_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRepertrio_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnPosies_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRepertrio_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPosies_4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnRepertrio_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPosies_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRepertrio_4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
					.addGap(167))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnRepertrio, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnPosies_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnRepertrio_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnPosies_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnRepertrio_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
								.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
							.addGap(6)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnPosies, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnRepertrio_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(82)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_10, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPosies_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRepertrio_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPosies_2, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))
					.addGap(64))
		);
		panel.setLayout(gl_panel);
		

		ImageIcon img2 = new ImageIcon(STPrincipal.class.getResource("s_logo.png"));
		
		ImageIcon i = new ImageIcon(STPrincipal.class.getResource("l.png"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setSize(new Dimension(50, 60));
		lblNewLabel.setBounds(new Rectangle(0, 0, 50, 60));
		lblNewLabel.setPreferredSize(new Dimension(50, 60));
		Image im = i.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(im));
		
		
		ImageIcon ix = new ImageIcon(STPrincipal.class.getResource("propi.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setSize(new Dimension(150, 60));
		lblNewLabel_1.setBounds(new Rectangle(0, 0, 150, 60));
		lblNewLabel_1.setPreferredSize(new Dimension(150, 60));
		Image imagem = ix.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(imagem));		

		
		ImageIcon ia= new ImageIcon(STPrincipal.class.getResource("a.png"));
		
		JLabel la = new JLabel("");
		la.setSize(new Dimension(60, 60));
		la.setBounds(new Rectangle(0, 0, 60, 60));
		la.setPreferredSize(new Dimension(60, 60));
		Image imagee = ia.getImage().getScaledInstance(la.getWidth(), la.getHeight(), Image.SCALE_SMOOTH);
		la.setIcon(new ImageIcon(imagee));
		
		
		GroupLayout groupLayout = new GroupLayout(frmSubios.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(la, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 940, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(335, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 647, GroupLayout.PREFERRED_SIZE)
					.addGap(322))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(210)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(23))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(la, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		frmSubios.getContentPane().setLayout(groupLayout);

		
		
	}
}
