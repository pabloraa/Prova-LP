import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ExemploJanela extends JFrame {

    private JTextField textField1, textField2;

    public ExemploJanela(){

        JPanel panel = new JPanel();

        JFrame frame = new JFrame("Calculadora");

        frame.setSize(700,700);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Calculadora");

        JLabel label = new JLabel("<html>            ---MENU DE OPÇÕES--- <br><br> 1 - SOMA <br> 2 - SUBTRAÇÃO <br>3 - MULTIPLICAÇÃO <br>4 -DIVISÃO<br><br><br><br><br><br><br><br><html>");

        textField1 = new JTextField(20);

        textField2 = new JTextField(20);

        String input1 = textField1.getText();

        String input2 = textField2.getText();

        try{

            int numero1 = Integer.parseInt(input1);

            int numero2 = Integer.parseInt(input2);

            int soma = numero1 + numero2;

            System.out.println(soma);

        } catch (NumberFormatException exception){

            JOptionPane.showMessageDialog(null,"ERRO");
        }

        setVisible(true);
        panel.add(label);
        panel.add(textField2);
        frame.add(panel);
        panel.add(textField1);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new ExemploJanela();
    }
}