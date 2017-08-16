import java.awt.*; 
import java.awt.event.*; 
import java.applet.Applet; 

public class test extends Applet implements ActionListener 
{ 
  Button b; 

  private Frame findParentFrame(){ 
    Container c = this; 
    while(c != null){ 
      if (c instanceof Frame) 
        return (Frame)c; 

      c = c.getParent(); 
    } 
    return (Frame)null; 
  } 

  public void init(){ 
    setLayout(new FlowLayout()); 
    b = new Button("push me"); 
    b.addActionListener(this); 
    add(b); 
  } 

  public void actionPerformed(ActionEvent e){ 
    Frame f = findParentFrame(); 
    if(f != null){ 
      Dialog d = new Dialog(f, "modalDialog", true); 
      d.setLayout(new FlowLayout()); 
      d.add(new Label("hello")); 
      d.pack(); 
      d.setLocation(100,100); 
      d.show(); 
    } 
  } 
} 