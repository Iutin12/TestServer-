package Laba2;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArrayInfo {
	public static void arra() {
		JFrame arrInf = new JFrame("ArrayInfo");	// создание графического окна
		JPanel panel = new JPanel();
		panel.setLayout (new BoxLayout(panel, BoxLayout.Y_AXIS));
		arrInf.setTitle ("Информация о массиве");
		arrInf.setBounds(550,550,400,200);
		arrInf.setResizable(false); // фиксированный размер окна
		arrInf.setVisible(true);
		JLabel l[] = new JLabel[4];
		
		int ar[] = new int[5];
		ar=Mass.obv();
		
		for(int i = 0 ; i < 4; i++) {
			l[i] = new JLabel();
			l[i].setBounds(5, (30 * i) + 10 , 350, 30);
			panel.add(l[i]);
		}
		
		l[0].setText("Массив до сортировки");
		l[2].setText("Массив после сортировки");
		for (int i =0;i<5;i++) {
			l[1].setText(l[1].getText() + Integer.toString(ar[i])+ " ");
		}
		ar = Sort.sorter(ar);
		for (int i =0;i<5;i++) {
			l[3].setText(l[3].getText() + Integer.toString(ar[i])+ " ");
		}
		
		JButton button_back = new JButton("Назад");
		button_back.setBounds(5, 130, 130, 30);
		panel.add(button_back);
		
		arrInf.add(panel);
		button_back.addActionListener(actionEvent ->  {
			arrInf.setVisible(false); 
	    });
	}
}
