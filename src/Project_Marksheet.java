import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project_Marksheet {
    private JButton calButton;
    private JPanel Main;
    private JTextField txtStName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtTotal;
    private JTextField txtMarks3;
    private JTextField txtAvg;
    private JTextField txtGrade;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Project_Marksheet");
        frame.setContentPane(new Project_Marksheet().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Project_Marksheet() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1,n2,n3,tot;
                double avg;

                n1=Integer.parseInt(txtMarks1.getText());
                n2=Integer.parseInt(txtMarks2.getText());
                n3=Integer.parseInt(txtMarks3.getText());

                tot=n1+n2+n3;

                txtTotal.setText(String.valueOf(tot));

                avg=tot/3;
                txtAvg.setText(String.valueOf(avg));

                if(avg>38)
                {
                    txtGrade.setText("Pass");
                }
                else {
                    txtGrade.setText("Fail");
                }
            }
        });
    }
}
