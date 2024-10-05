import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App {
    private JButton Button;
    private JPanel panel1;
    private JTextField textField1;
    // загаданное число
    static int num;
    public App() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(textField1.getText());
                if (userNum > num)
                    JOptionPane.showMessageDialog(null,"Число меньше!");
                else if (userNum < num)
                    JOptionPane.showMessageDialog(null,"Число больше!");
                else
                    JOptionPane.showMessageDialog(null,"Вы угадали!");
            }
        });
    }
    public static void main(String[] args) {
        num = (int)Math.floor(Math.random() * 10);
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
