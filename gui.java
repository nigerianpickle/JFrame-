import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener{
    JLabel label;
    int counts=0;
    JFrame frame;
    JPanel panel;

    public GUI(){
        JFrame frame=new JFrame();

        JButton button=new JButton("Click me");
        button .addActionListener(this);

        label  =new JLabel("Number of clicks:0");
        panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);
        
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        counts++;
        label.setText("Number of clicks:"+counts);
    }

}