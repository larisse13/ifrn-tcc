package ifrn.nc.suabios.apresentacao;


import ifrn.nc.suabios.negocio.Usuario;
import ifrn.nc.suabios.persistencia.UsuarioDAO;

import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.RootPaneContainer;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Rectangle;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JInternalFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JRadioButton;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

import java.awt.Toolkit;

public class CadastroUser extends JDialog {
	private JTextField tfNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroUser dialog = new CadastroUser(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CadastroUser(Frame dono){
		super(dono, true);
		setFont(new Font("AR DARLING", Font.PLAIN, 12));
		setTitle("Cadastro");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Larisse\\Downloads\\logo.png"));
		setResizable(false);
		setBounds(100, 100, 381, 399);

		
		JPanel contentPanel = new JPanel();
		
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 308, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(2))
		);

		
		JButton cadastrarButton = new JButton("CADASTRAR");
		cadastrarButton.setForeground(new Color(51, 153, 255));
		cadastrarButton.setFont(new Font("AR DARLING", Font.PLAIN, 14));
		cadastrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Usuario user = new Usuario();
				user.setNome(tfNome.getText());
				
				UsuarioDAO userDAO = new UsuarioDAO();
				userDAO.add(user);
	
				ImageIcon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("okb.png")));
				JOptionPane.showMessageDialog(CadastroUser.this, "O usuário foi cadastrado com sucesso. Bons estudos!", "Cadastro de Usuário", JOptionPane.INFORMATION_MESSAGE, figura);

				limparCampos(tfNome);
				
				dispose();
				
			}
		});
		panel.add(cadastrarButton);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(51, 153, 255));
		lblNome.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		
		tfNome = new JTextField();
		
		
		tfNome.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tfNome.setColumns(10);
		
		JLabel lImg = new JLabel("");
		lImg.setHorizontalTextPosition(SwingConstants.CENTER);
		lImg.setHorizontalAlignment(SwingConstants.CENTER);
		lImg.setBounds(new Rectangle(0, 0, 200, 200));
		
		ImageIcon img = new ImageIcon(CadastroUser.class.getResource("icon.png"));
		Image imag = img.getImage().getScaledInstance(lImg.getWidth(), lImg.getHeight(), Image.SCALE_SMOOTH);
		
		lImg.setIcon(new ImageIcon(imag));
		
		JLabel lbInfo = DefaultComponentFactory.getInstance().createLabel("Informe o seu nome para iniciar!");
		lbInfo.setForeground(new Color(51, 153, 255));
		lbInfo.setFont(new Font("AR DARLING", Font.PLAIN, 20));
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfNome, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap(89, Short.MAX_VALUE)
							.addComponent(lImg)))
					.addGap(86))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(52, Short.MAX_VALUE)
					.addComponent(lbInfo, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lImg)
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		getContentPane().setLayout(groupLayout);
			
		}
	
		private void limparCampos(JTextField... campos){
			for (JTextField campo : campos) {
			campo.setText("");
		}
	
	}
}
