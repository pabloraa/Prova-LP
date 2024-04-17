import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica extends JFrame {

    private JTextField textField;

    JFrame janela = new JFrame();

    public InterfaceGrafica(){ //construtor da classe InterfaceGráfica, construtor vazio

        JLabel label = new JLabel("Olá mundo", JLabel.CENTER);

        setTitle("TELA PARA A PROVA");

        setSize(700,700);

        janela.getContentPane().setBackground(new Color(200,30,50));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        janela.add(label);

        setVisible(true);

    }

}
