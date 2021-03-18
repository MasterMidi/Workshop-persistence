package gui.tab;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gui.components.JHintTextField;
import model.OrderLine;
import javax.swing.JLabel;

public class pCreateOrder extends JPanel {

	private JHintTextField txtfProduct;
	private JHintTextField txtfCustomer;
	private JList<OrderLine> listProducts;
	private JScrollPane scrlCustomer;

	/**
	 * Create the panel.
	 */
	public pCreateOrder() {
		setMinimumSize(new Dimension(400, 250));
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
			}
		});
		setLayout(new BorderLayout(0, 0));

		JPanel pMain = new JPanel();
		pMain.setMinimumSize(new Dimension(600, 10));
		add(pMain, BorderLayout.CENTER);
		GridBagLayout gbl_pMain = new GridBagLayout();
		gbl_pMain.columnWidths = new int[] { 10, 200, 10, 104, 0, 10, 0 };
		gbl_pMain.rowHeights = new int[] { 10, 20, 0, 0, 0 };
		gbl_pMain.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pMain.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		pMain.setLayout(gbl_pMain);

		txtfProduct = new JHintTextField();
		txtfProduct.setHint("Produkt navn...");
		txtfProduct.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		txtfProduct.setColumns(10);
		GridBagConstraints gbc_txtfProduct = new GridBagConstraints();
		gbc_txtfProduct.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfProduct.insets = new Insets(0, 0, 5, 5);
		gbc_txtfProduct.gridx = 1;
		gbc_txtfProduct.gridy = 1;
		pMain.add(txtfProduct, gbc_txtfProduct);

		txtfCustomer = new JHintTextField();
		txtfCustomer.setHint("telefon nummer...");
		txtfCustomer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		txtfCustomer.setColumns(10);
		GridBagConstraints gbc_txtfCustomer = new GridBagConstraints();
		gbc_txtfCustomer.gridwidth = 2;
		gbc_txtfCustomer.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_txtfCustomer.gridx = 3;
		gbc_txtfCustomer.gridy = 1;
		pMain.add(txtfCustomer, gbc_txtfCustomer);

		JScrollPane scrlProducts = new JScrollPane();
		GridBagConstraints gbc_scrlProducts = new GridBagConstraints();
		gbc_scrlProducts.fill = GridBagConstraints.BOTH;
		gbc_scrlProducts.gridheight = 4;
		gbc_scrlProducts.insets = new Insets(0, 0, 0, 5);
		gbc_scrlProducts.gridx = 1;
		gbc_scrlProducts.gridy = 2;
		pMain.add(scrlProducts, gbc_scrlProducts);

		listProducts = new JList<>();
		listProducts.setMinimumSize(new Dimension(200, 0));
		listProducts.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrlProducts.setViewportView(listProducts);
		
		JLabel lblNameRow = new JLabel("Navn:");
		GridBagConstraints gbc_lblNameRow = new GridBagConstraints();
		gbc_lblNameRow.anchor = GridBagConstraints.WEST;
		gbc_lblNameRow.insets = new Insets(0, 0, 5, 5);
		gbc_lblNameRow.gridx = 3;
		gbc_lblNameRow.gridy = 2;
		pMain.add(lblNameRow, gbc_lblNameRow);
		
		JLabel lblName = new JLabel("navn...");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 4;
		gbc_lblName.gridy = 2;
		pMain.add(lblName, gbc_lblName);
		
		JLabel lblNumberRow = new JLabel("Telefon nr.:");
		GridBagConstraints gbc_lblNumberRow = new GridBagConstraints();
		gbc_lblNumberRow.anchor = GridBagConstraints.WEST;
		gbc_lblNumberRow.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberRow.gridx = 3;
		gbc_lblNumberRow.gridy = 3;
		pMain.add(lblNumberRow, gbc_lblNumberRow);
		
		JLabel lblNumber = new JLabel("telefon...");
		GridBagConstraints gbc_lblNumber = new GridBagConstraints();
		gbc_lblNumber.anchor = GridBagConstraints.EAST;
		gbc_lblNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumber.gridx = 4;
		gbc_lblNumber.gridy = 3;
		pMain.add(lblNumber, gbc_lblNumber);
		
		JLabel lblAddressRow = new JLabel("Addresse:");
		GridBagConstraints gbc_lblAddressRow = new GridBagConstraints();
		gbc_lblAddressRow.anchor = GridBagConstraints.WEST;
		gbc_lblAddressRow.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressRow.gridx = 3;
		gbc_lblAddressRow.gridy = 4;
		pMain.add(lblAddressRow, gbc_lblAddressRow);
		
		JLabel lblAddress = new JLabel("addresse...");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.anchor = GridBagConstraints.EAST;
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 4;
		gbc_lblAddress.gridy = 4;
		pMain.add(lblAddress, gbc_lblAddress);
		
		JScrollPane scrlProducts_1 = new JScrollPane();
		GridBagConstraints gbc_scrlProducts_1 = new GridBagConstraints();
		gbc_scrlProducts_1.gridwidth = 2;
		gbc_scrlProducts_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrlProducts_1.fill = GridBagConstraints.BOTH;
		gbc_scrlProducts_1.gridx = 3;
		gbc_scrlProducts_1.gridy = 5;
		pMain.add(scrlProducts_1, gbc_scrlProducts_1);
		
		JList list = new JList();
		scrlProducts_1.setViewportView(list);

		JPanel pBottom = new JPanel();
		pBottom.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		add(pBottom, BorderLayout.SOUTH);
		pBottom.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JButton btnConfirm = new JButton("Færdig");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		pBottom.add(btnConfirm);

		JButton btnCancel = new JButton("Annuller");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		pBottom.add(btnCancel);

		init();
	}

	private void init() {

	}

}
