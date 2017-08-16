import java.awt.*;
import java.awt.event.*;
class add extends Frame implements ActionListener
{
    private TextField txt_fno,txt_sno,txt_sum;
    private Button btn_add;
    private Label lbl_fno,lbl_sno;
    public add()
    {
        setResizable(false);
        setTitle("Addition");
        setSize(300,300);
        setLocation(100,100);
        lbl_fno=new Label("Enter first number");
        lbl_sno=new Label("Enter Second Number");
        txt_fno=new TextField(10);
        txt_sno=new TextField(10);
        btn_add=new Button("Add");
        txt_sum=new TextField(10);
        setLayout(null);
        lbl_fno.setBounds(10,50,130,20);
        txt_fno.setBounds(150,50,100,20);
        lbl_sno.setBounds(10,100,130,20);
        txt_sno.setBounds(150,100,100,20);
        btn_add.setBounds(50,150,70,20);
        txt_sum.setBounds(150,150,100,20);
       
        add(lbl_fno);
        add(txt_fno);
        add(lbl_sno);
        add(txt_sno);
        add(btn_add);
        add(txt_sum);
        btn_add.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn_add)
        {
            int fno=Integer.parseInt(txt_fno.getText());
            int sno=Integer.parseInt(txt_sno.getText());
            int sum=fno+sno;
            txt_sum.setText(sum+"");
        }
    }
}
class AddDemo
{
    public static void main(String args[])
    {
        new add().setVisible(true);
    }
}