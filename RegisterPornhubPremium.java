import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.tools.Tool;


public class RegisterPornhubPremium extends JFrame {

    private JPanel P0 = new JPanel();
    private JPanel P1 = new JPanel();
    private JPanel P2 = new JPanel();
    private JPanel P3 = new JPanel();
    private JPanel P4 = new JPanel();
    private JPanel P5 = new JPanel();
    private JPanel P6 = new JPanel();
    private JPanel P7 = new JPanel();

    private JLabel logo = new JLabel();
    private JLabel logo18 = new JLabel();
    private JLabel N = new JLabel("Name");
    private JLabel LN = new JLabel("LastName");
    private JLabel Sex = new JLabel("Sex");
    private JLabel Age = new JLabel("Age");
    private JLabel C = new JLabel(" ");
    private JLabel Country = new JLabel("COUNTRY : THAILAND");

    private JTextField TN = new JTextField("NAME");
    private JTextField TLN = new JTextField("LASTNAME");

    private JRadioButton Male = new JRadioButton( "Male", false );
    private JRadioButton Female = new JRadioButton( "Female", false );

    private String ages[] = {"16","17","18+"};
    private JComboBox age = new JComboBox(ages);

    private JButton Rt = new JButton("REGISTER");


    public RegisterPornhubPremium(){

        setTitle("PornhubPremium");
        setSize(800,600);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().
        getImage(RegisterPornhubPremium.class.getResource("phicon.png")));

    logo = new JLabel(new ImageIcon("logo.png"));
    logo18 = new JLabel(new ImageIcon("18.png"));

    P1.setBackground(Color.BLACK);
        P1.add(logo);

    P0.setLayout(new BoxLayout(P0, BoxLayout.Y_AXIS));
        P0.add(P2);
        P0.add(P6);

    P2.setBorder(BorderFactory.createEmptyBorder(10, 200, 10, 200));
    P2.setLayout(new GridLayout( 4, 2, 10, 10));
        P2.add(N);
        P2.add(LN);
        P2.add(TN);
        P2.add(TLN);
        P2.add(P3);
        P2.add(P5);
        P2.add(P4);
        P2.add(Country);
        
    P3.setLayout(new GridLayout( 1, 2)); 
        P3.add(Sex);
        P3.add(Male);

    P4.setLayout(new GridLayout( 1, 2));
        P4.add(C);
        P4.add(Female);

    P5.setLayout(new GridLayout( 1, 2));
        P5.add(Age);
        P5.add(age);
    
    P6.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        P6.add(Rt);

    P7.setBackground(Color.BLACK);
        P7.add(logo18);
    
    add(P1, BorderLayout.NORTH);
    add(P0, BorderLayout.CENTER);
    add(P7, BorderLayout.SOUTH);
    
    pack();
    setResizable(false);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); 
    

    }
    

    

}

