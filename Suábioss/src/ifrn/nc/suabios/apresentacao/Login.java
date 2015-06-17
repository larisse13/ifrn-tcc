package ifrn.nc.suabios.apresentacao;

import ifrn.nc.suabios.apresentacao.fundo.FundoLogin;
import ifrn.nc.suabios.negocio.Usuario;
import ifrn.nc.suabios.persistencia.UsuarioDAO;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Login {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Larisse\\workspace\\Pesquisa\\Su\u00E1bioss\\src\\ifrn\\nc\\suabios\\apresentacao\\ok.png"));
		frame.setTitle("Su\u00E1bios");
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
		//frame.setUndecorated(true);  		
		frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); 
		FundoLogin fundoLogin = new FundoLogin();
		frame.setContentPane(fundoLogin);
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		
		
		JLabel lImg = new JLabel("");
		lImg.setBackground(Color.WHITE);
		lImg.setBounds(new Rectangle(0, 0, 200, 200));
		
		ImageIcon img = new ImageIcon(CadastroUser.class.getResource("icon.png"));
		Image imag = img.getImage().getScaledInstance(lImg.getWidth(), lImg.getHeight(), Image.SCALE_SMOOTH);
		
		lImg.setIcon(new ImageIcon(imag));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("AR DESTINE", Font.PLAIN, 23));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				Usuario user = new Usuario();
				user.setNome(textField.getText());
				
				UsuarioDAO userDAO = new UsuarioDAO();
				userDAO.add(user);
	
				JOptionPane.showMessageDialog(null, "O usuário foi cadastrado com sucesso. Bons estudos!", "Cadastro de Usuário", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("okb.png"));

				limparCampos(textField);
			
				frame.dispose();
				
				STPrincipal window = new STPrincipal();
				window.frmSubios.setVisible(true);
		
				
			}
			
			
		});
		
		
		
		btnNewButton.setFont(new Font("AR DESTINE", Font.PLAIN, 22));
		
		
		GroupLayout gl_fundoLogin = new GroupLayout(fundoLogin);
		gl_fundoLogin.setHorizontalGroup(
			gl_fundoLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fundoLogin.createSequentialGroup()
					.addGap(89)
					.addComponent(lImg)
					.addGroup(gl_fundoLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fundoLogin.createSequentialGroup()
							.addGap(59)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(btnNewButton))
						.addGroup(gl_fundoLogin.createSequentialGroup()
							.addGap(110)
							.addComponent(lblNome)))
					.addContainerGap(641, Short.MAX_VALUE))
		);
		gl_fundoLogin.setVerticalGroup(
			gl_fundoLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fundoLogin.createSequentialGroup()
					.addGap(140)
					.addGroup(gl_fundoLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(lImg)
						.addGroup(gl_fundoLogin.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNome)
							.addGap(18)
							.addGroup(gl_fundoLogin.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(372, Short.MAX_VALUE))
		);
		fundoLogin.setLayout(gl_fundoLogin);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Larisse\\Downloads\\logo.png"));
		frame.setTitle("Su\u00E1bios");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
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
			public void actionPerformed(ActionEvent e) {
				
				STPrincipal window1 = new STPrincipal();
				window1.frmSubios.setVisible(true);
			}
		});
		mnCadastro.add(mntmMenuPrincipal);
		mnCadastro.add(mntmUsurio);
		
		JMenuItem mntmListarUsurios = new JMenuItem("Listar Usu\u00E1rios");
		mntmListarUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				ListUsers dialog = new ListUsers(frame);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
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
		
	}
		private void limparCampos(JTextField... campos){
			for (JTextField campo : campos) {
			campo.setText("");
		}
		
		
	}
}
