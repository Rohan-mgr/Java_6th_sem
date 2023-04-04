import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterGUI implements ActionListener {
    int count = 1;
    JFrame frame = new JFrame("Counter App");
    JButton btnAdd = new JButton("+");
    JButton btnSub = new JButton("-");

    JLabel label = new JLabel(String.valueOf(count));
    CounterGUI() {
        frame.setLayout(null);
        frame.setSize(400, 400);
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void render(){
        label.setBounds(205, 150, 40, 40);
        label.setSize(50, 50);
        frame.add(label);
        btnAdd.setBounds(150, 200, 50, 30);
        btnAdd.setFocusPainted(false);
        frame.add(btnAdd);
        btnSub.setBounds(220, 200, 50, 30);
        btnSub.setFocusPainted(false);
        frame.add(btnSub);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
            count++;
            label.setText(String.valueOf(count));
        } else {
            count--;
            label.setText(String.valueOf(count));
        }
    }
}
