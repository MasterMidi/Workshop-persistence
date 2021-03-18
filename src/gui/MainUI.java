package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import db.DBConnection;
import db.DataAccessException;
import enviroment.ENV;
import gui.tab.pCreateOrder;

public class MainUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		DBConnection.setServerAddress(ENV.db_host);
		DBConnection.setDBName(ENV.db_name);
		DBConnection.setDBLogin(ENV.db_user, ENV.db_password);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws DataAccessException 
	 */
	public MainUI() throws DataAccessException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_products = new JPanel();
		tabbedPane.addTab("Produkter", null, panel_products, null);
		
		JPanel panel_customers = new JPanel();
		tabbedPane.addTab("Kunder", null, panel_customers, null);
		
		JPanel panel_orders = new pCreateOrder();
		tabbedPane.addTab("Ordrer", null, panel_orders, null);
		
		JPanel panel_invoices = new JPanel();
		tabbedPane.addTab("Invoices", null, panel_invoices, null);
	}

}
