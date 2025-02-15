package CONCEPTS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AditionFrame extends JFrame {
    private JPanel panel;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextArea T1;
    private JTextField T2;
    private JButton B1;

    public AditionFrame(){
          initComponent();
          setVisible(true);
          setContentPane(panel);
          setSize(400,400);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void initComponent(){
         panel.setLayout(null);
         l1.setBounds(50,50,100,20);
         T1.setBounds(170,50,100,20);
         l2.setBounds(50,100,100,20);
         T2.setBounds(170,100,100,20);
         B1.setBounds(100,150,100,20);
         l3.setBounds(50,200,400,20);
         panel.add(l1);
         panel.add(T1);
         panel.add(l2);
         panel.add(T2);
         panel.add(B1);
         panel.add(l3);
         B1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int a = Integer.parseInt(T1.getText());
                 int b = Integer.parseInt(T2.getText());
                 int c = a+b;
                 l3.setText("Sum of FirstNumber & SecondNumber is : "+c);
             }
         });
     }

}
