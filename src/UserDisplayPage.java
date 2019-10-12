import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class UserDisplayPage extends JFrame {
  UserDisplayPage() {
    JFrame UDPframe = new JFrame();
    UDPframe.setTitle("Search");
      UDPframe.setSize(400,100);
      UDPframe.setLocationRelativeTo(null); 
      UDPframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    UDPframe.setVisible(true);
    
    JPanel p11 = new JPanel(new GridLayout(1,2,10,10));
    JComboBox genre = new JComboBox(new String[]{"Science Fiction", "Mystery","Fiction","Non-Fiction","Fantasy","Romance"});
    JButton BUDisplay = new JButton("Display");
    JLabel UDPgenre = new JLabel("Choose a Book Genre:");
    p11.add(UDPgenre);
    p11.add(genre);
    
    UDPframe.add(p11,BorderLayout.CENTER);
    UDPframe.add(BUDisplay,BorderLayout.SOUTH);  
  }
}
    