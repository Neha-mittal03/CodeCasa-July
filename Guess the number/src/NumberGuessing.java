import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessing {
    private JPanel mypanel;
    private JButton guessButton;
    private JTextField message;
    private JTextField mynumber;
    private JTextField computerno;
    private JPanel secondpanel;

    public NumberGuessing() {
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int myno=Integer.parseInt(mynumber.getText());
            int no2=(int)(Math.random()*100+1);
            if (myno<=0 || myno>100){
                message.setText("Invalid Guess!!!!!");
            }
            else if (myno==no2) {
              message.setText("You Guess the Corret Number!!!!!");
            } else if (myno+1==no2 || myno-1==no2) {
                 message.setText("You were too close!!!!");
             } else if (myno>no2) {
                message.setText("Your Guess is too High!!!!!");
            }
            else if (myno<no2) {
                message.setText("Your Guess is too Low!!!!!");
            }
                else {
                 message.setText("Your Guess is Incorrect!!!!!");
             }
             computerno.setText(Integer.toString(no2));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Guess the Number");
        frame.setContentPane(new NumberGuessing().mypanel);
        frame.setSize(550,380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
