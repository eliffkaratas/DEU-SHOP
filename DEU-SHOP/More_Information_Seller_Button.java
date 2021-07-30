import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class More_Information_Seller_Button extends JFrame {

	public More_Information_Seller_Button(Seller S) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);		
		JList list_1 = new JList(SelectionScreen.D.toArray(S.getOrders()));
		if(S.getOrders().isEmpty()) {
			JOptionPane.showMessageDialog(getContentPane(), "Sellers orders is empty.");
		}
		list_1.setBounds(0, 40, 434, 221);
		getContentPane().add(list_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				List_Seller_Buton cw=new List_Seller_Buton();
				cw.setVisible(true);
			}
		});
		btnBack.setBounds(0, 11, 89, 23);
		getContentPane().add(btnBack);

		
	
	}

}
