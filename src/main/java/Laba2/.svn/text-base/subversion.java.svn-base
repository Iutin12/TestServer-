package Laba2; //пакет Java классов

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import Laba2.inform_button.*;

import javax.imageio.ImageIO;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;




public class subversion {
	public static String s;
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,500,400,400);
	main_GUI.setResizable(false); // фиксированный размер окна
	

	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	
	JLabel task_1 = new JLabel("Subversion and Eclipse and Mantis"); 
	task_1.setBounds(70,85,250,30);
	main_panel.add(task_1);
	
	
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,125,150,30);
	main_panel.add(laba_info);
	
	
	JButton button_inform = new JButton("Информация"); // Добавление кнопки Информация
	button_inform.setBounds(20,290,140,40); // задаём ей координаты
	ActionListener inform_listener = new inform_button(); //создаем слушатель кнопки
	button_inform.addActionListener(inform_listener); //добавляем слушатель к кнопке
	main_panel.add(button_inform);
	

	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(270,290,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JTextField textfield = new JTextField(""); // Добавление первого текстового поля
	textfield.setBounds(75,190,150,30); // выставление местоположени
	main_panel.add(textfield); // Добавление на панель
	
	JLabel laba_info1 = new JLabel("Сторона А:"); // Отображение текста или изображения
	laba_info1.setBounds(10,190,150,30);
	main_panel.add(laba_info1);
	
	JTextField textfield1 = new JTextField(""); // Добавление второго текстового поля
	textfield1.setBounds(75,230,150,30); // выставление местоположения
	main_panel.add(textfield1); // Добавление на панель
	
	JLabel laba_info2 = new JLabel("Сторона Б:"); // Отображение текста или изображения
	laba_info2.setBounds(10,230,150,30);
	
	main_panel.add(laba_info2);
	
	JTextArea  laba_info3 = new JTextArea("Вывод: " ); // Отображение текста или изображения
	laba_info3.setBounds(230,185,150,30);
	laba_info3.setOpaque(false);
	laba_info3.setEditable(false);
	laba_info3.setLineWrap(true);
	main_panel.add(laba_info3);
	
	ActionListener actionListenerCalc = new ActionListener() { //слушатель для расчета площади
		public void actionPerformed(ActionEvent e) {
			try{ // отлавливание ошибки при переводе строки в число 
				double a = Double.parseDouble(textfield.getText());
				double b = Double.parseDouble(textfield1.getText());
				if (a <= 0 || b <= 0) { //проверка правильности ввода чисел
					laba_info3.setText("Числа\n должны быть > 0");
				}
				else {
				String result = Double.toString(a*b);
				laba_info3.setText("Вывод: " + result);
				}
		    }
			catch (NumberFormatException nfe) { 
				laba_info3.setText("ERROR: Введите число"); //вывод сообщения в случае ошибки
			}
		}
	};
	JButton button_calc = new JButton("Расчет"); // Добавление кнопки расчета
	button_calc.setBounds(230,230,140,30); // задаём ей координаты
	button_calc.addActionListener(actionListenerCalc); //добавляем слушатель к кнопке
	main_panel.add(button_calc); //добавление кнопки расчета на главную панель
	
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("Меню");
    menuBar.add(fileMenu);
    //String path = "src\\main\\resources\\логотип.jpg";
    BufferedImage image = null;
    
    try {
    image= ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));} //добавление изображения с интернета
    		catch (IOException e){
    			System.out.println (e);
    		}	
    		
	JLabel label = new JLabel(new ImageIcon(image));
    JMenuItem menuItem1 = new JMenuItem("Добавить логотип УГАТУ");
    
    menuItem1.addActionListener(actionEvent ->  {
    	main_panel.add(label);
        label.setVisible(false);
	    label.setBounds(245,10,138,69);  
	    label.setVisible(true);
    });
    String[] items = { // создание элементов для jcombobox
			"Переместить логотип УГАТУ в левый верхний угол",
			"Переместить логотип УГАТУ в середину",
			"Переместить логотип УГАТУ в верхний правый угол",
			"Отсортировать данные в проекте12"
	};
	JComboBox jcomboBox = new JComboBox(items);//создание jcombobox

	jcomboBox.setBounds(35, 150,330,30);// задаём координаты jcombobox
    ActionListener actionListenerLabelMove = new ActionListener() { //слушатель для выподающего списка
		public void actionPerformed(ActionEvent e) {
			JComboBox box = (JComboBox)e.getSource();
			String item = (String)box.getSelectedItem();//запись значения из выпадающего списка в строку
			switch (item){ //перемещение лого, в зависимости от выбора
				case ("Переместить логотип УГАТУ в левый верхний угол"):
					label.setBounds(0, 10,138,69);
					break;
				case ("Переместить логотип УГАТУ в верхний правый угол"):
					label.setBounds(245, 10,138,69);
					break;
				case ("Переместить логотип УГАТУ в середину"):
					label.setBounds(125, 10,138,69);
					break;
				case ("Отсортировать данные в проекте12"):
					ArrayInfo.arra();
					break;
					
			}

		}
	};
	
	 JMenuItem menuItem3 = new JMenuItem("Загрузить файл в проект 12");
	 menuItem3.addActionListener(actionEvent ->  {
		 FileFilter filter = new FileNameExtensionFilter("txt","TXT");
	        inform_button.check = true; // поле check становится true
	         JFileChooser fileopen = new JFileChooser();
	         fileopen.setFileFilter(filter);
	         int ret = fileopen.showDialog(null, "Открыть файл");
	         if (ret == JFileChooser.APPROVE_OPTION) {
	            File file = fileopen.getSelectedFile();
	            s = file.getAbsolutePath();
	         }
         
	
		});
	jcomboBox.addActionListener(actionListenerLabelMove);// добавляем слушатель к jcombobox
	main_panel.add(jcomboBox);// добавление jcombobox на main_panel
    JMenuItem menuItem2 = new JMenuItem("Выход");
    fileMenu.add(menuItem1);
    fileMenu.add(menuItem3);
    fileMenu.add(menuItem2);
    ActionListener actionListener2 = new ListenerButton(); //создаем слушатель
    menuItem2.addActionListener(actionListener2); // добавляем слушатель к кнопке
    main_GUI.setJMenuBar(menuBar);
	main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	public static void main(String[] args) { 
		subversion student = new subversion();
	}
	
}

