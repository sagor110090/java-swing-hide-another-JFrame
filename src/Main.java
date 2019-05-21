import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Tab1 frame1 = new Tab1();
		Tab2 frame2 = new Tab2();
		Tab3 frame3 = new Tab3();
		Tab4 frame4 = new Tab4();
		Tab5 frame5 = new Tab5();
		Tab6 frame6 = new Tab6();
		Tab7 frame7 = new Tab7();
		Tab8 frame8 = new Tab8();

		
		JButton btnTab = new JButton("tab 1");
		btnTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 frame1.setVisible(true);
				 frame2.setVisible(false);
				 frame3.setVisible(false);
				 frame4.setVisible(false);
				 frame5.setVisible(false);
				 frame6.setVisible(false);
				 frame7.setVisible(false);
				 frame8.setVisible(false);
			}
		});
		btnTab.setBounds(10, 109, 89, 23);
		contentPane.add(btnTab);
		
		JButton btnTab_1 = new JButton("tab2");
		btnTab_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 frame1.setVisible(false);
				 frame2.setVisible(true);
				 frame3.setVisible(false);
				 frame4.setVisible(false);
				 frame5.setVisible(false);
				 frame6.setVisible(false);
				 frame7.setVisible(false);
				 frame8.setVisible(false);
			}
		});
		btnTab_1.setBounds(10, 143, 89, 23);
		contentPane.add(btnTab_1);
		
		JButton btnTab_2 = new JButton("tab 3");
		btnTab_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame1.setVisible(false);
				 frame2.setVisible(false);
				 frame3.setVisible(true);
				 frame4.setVisible(false);
				 frame5.setVisible(false);
				 frame6.setVisible(false);
				 frame7.setVisible(false);
				 frame8.setVisible(false);
			}
		});
		btnTab_2.setBounds(10, 177, 89, 23);
		contentPane.add(btnTab_2);
		
		JButton btnTab_3 = new JButton("tab 4");
		btnTab_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame1.setVisible(false);
				 frame2.setVisible(false);
				 frame3.setVisible(false);
				 frame4.setVisible(true);
				 frame5.setVisible(false);
				 frame6.setVisible(false);
				 frame7.setVisible(false);
				 frame8.setVisible(false);
			}
		});
		btnTab_3.setBounds(10, 211, 89, 23);
		contentPane.add(btnTab_3);
		
		JButton btnTab_4 = new JButton("tab 5");
		btnTab_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame1.setVisible(false);
				 frame2.setVisible(false);
				 frame3.setVisible(false);
				 frame4.setVisible(false);
				 frame5.setVisible(true);
				 frame6.setVisible(false);
				 frame7.setVisible(false);
				 frame8.setVisible(false);
			}
		});
		btnTab_4.setBounds(10, 239, 89, 23);
		contentPane.add(btnTab_4);
		
		JButton btnTab_5 = new JButton("tab 6");
		btnTab_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame1.setVisible(false);
				 frame2.setVisible(false);
				 frame3.setVisible(false);
				 frame4.setVisible(false);
				 frame5.setVisible(false);
				 frame6.setVisible(true);
				 frame7.setVisible(false);
				 frame8.setVisible(false);
			}
		});
		btnTab_5.setBounds(10, 273, 89, 23);
		contentPane.add(btnTab_5);
		
		JButton btnTab_6 = new JButton("tab 7");
		btnTab_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame1.setVisible(false);
				 frame2.setVisible(false);
				 frame3.setVisible(false);
				 frame4.setVisible(false);
				 frame5.setVisible(false);
				 frame6.setVisible(false);
				 frame7.setVisible(true);
				 frame8.setVisible(false);
			}
		});
		btnTab_6.setBounds(10, 308, 89, 23);
		contentPane.add(btnTab_6);
		
		JButton btnTab_7 = new JButton("tab 8");
		btnTab_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 frame1.setVisible(false);
				 frame2.setVisible(false);
				 frame3.setVisible(false);
				 frame4.setVisible(false);
				 frame5.setVisible(false);
				 frame6.setVisible(false);
				 frame7.setVisible(false);
				 frame8.setVisible(true);
			}
		});
		btnTab_7.setBounds(10, 342, 89, 23);
		contentPane.add(btnTab_7);
	}

}
