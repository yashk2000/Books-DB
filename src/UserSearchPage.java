import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class UserSearchPage extends JFrame {
  UserSearchPage() {
    JFrame USPframe = new JFrame();
    USPframe.setTitle("Search");
      USPframe.setSize(300,200);
      USPframe.setLocationRelativeTo(null); 
      USPframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    USPframe.setVisible(true);

    JPanel p9 = new JPanel(new GridLayout(1,1,10,10));
    JPanel p10 = new JPanel(new GridLayout(1,2,10,10));
    JTextField LSearch = new JTextField();
    JButton BUSearch, BUExit;
    BUSearch = new JButton("Search");
    BUExit = new JButton("Exit");

    p9.add(LSearch);
    p10.add(BUSearch);
    p10.add(BUExit);

    BUExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e3) {
        USPframe.setVisible(false);
        UserFunctions user = new UserFunctions();
      }
    });
    BUSearch.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e3) {
            USPframe.setVisible(false);
            SearchDisplay sdisplay = new SearchDisplay(LSearch.getText());
          }
        });

    USPframe.add(new JLabel("Enter a Book Name"),BorderLayout.NORTH);
    USPframe.add(p9,BorderLayout.CENTER);
    USPframe.add(p10,BorderLayout.SOUTH);
  }
}