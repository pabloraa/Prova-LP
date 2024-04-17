import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceGrafica extends JFrame {


    private JPanel painel = new JPanel();

    JFrame frame = new JFrame();

    private TextField textField1;

    JButton botao = new JButton("Enviar");

    ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();

    public InterfaceGrafica(){


        JLabel label1 = new JLabel("<html>MENU DE OPÇÕES<br><br> 1 - CADASTRAR NOVO CONTATO<br> 2 - MOSTRAR LISTA DE CONTATOS <br> 3 - QUANTIDADE DE CONTADOS <br> 4 - EXCLUIR CONTATOS<br> 5 - SAIR DA AGENDA <html>");

        textField1 = new TextField(30);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input1 = textField1.getText();

                if(input1.equals("1")){

                    JOptionPane.showMessageDialog(null,"VOCÊ ESCOLHEU A OPÇÃO PARA CADASTRAR UM NOVO CONTATO");

                    String x = JOptionPane.showInputDialog("Nome");

                    String y = JOptionPane.showInputDialog("Telefone");

                    String z = JOptionPane.showInputDialog("Endereço");

                    contatos.add(new Pessoa(x,y,z));

                    System.out.println(contatos);

                }
                else if(input1.equals("2")){

                    JOptionPane.showMessageDialog(null,"VOCÊ ESCOLHEU A OPÇÃO DE MOSTRAR TODOS OS CONTATOS DA AGENDA");

                    for (Pessoa x: contatos) {

                        JOptionPane.showMessageDialog(null, "Lista de Contatos: " + x);

                    }
                }
                else if(input1.equals("3")){

                    JOptionPane.showMessageDialog(null, "VOCÊ TEM: " + contatos.size() + " CONTATOS");
                }
            }
        });

        frame.setSize(400,500);

        setTitle("AGENDA DE CONTATOS");

        painel.add(label1);

        painel.add(botao);

        painel.add(textField1);

        frame.add(painel);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
