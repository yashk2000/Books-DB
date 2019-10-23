import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class AdminFunctions extends JFrame {
  AdminFunctions() {
    JFrame AFframe = new JFrame();
    AFframe.setTitle("Login Successfull. Welcome");
        AFframe.setLocationRelativeTo(null); 
      AFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AFframe.setSize(500,500);  
        AFframe.setVisible(true);
        
        JPanel p6 = new JPanel(new GridLayout(4,4,5,5));
        
        JButton BAddB, BAddC, BAddU, BRemoveB, BRemoveU, BRemoveC, BModifyB, BModifyC, BModifyU, BDisp, BLog,BDisplayU ;
        BAddB = new JButton("Add a book");
        BAddB.setBackground(Color.GREEN);
        BAddC = new JButton("Add a category");
        BAddC.setBackground(Color.GREEN);
        BAddU = new JButton("Add a user");
        BAddU.setBackground(Color.GREEN);
        
        BRemoveB = new JButton("Remove a book");
        BRemoveB.setBackground(Color.RED);
        BRemoveC = new JButton("Remove a category");
        BRemoveC.setBackground(Color.RED);
        BRemoveU = new JButton("Remove a user");
        BRemoveU.setBackground(Color.RED);
        
        BModifyB = new JButton("Edit Details of book");
        BModifyB.setBackground(Color.CYAN);
        BModifyC = new JButton("Edit Details of category");
        BModifyC.setBackground(Color.CYAN);
        BModifyU = new JButton("Edit Details of user");
        BModifyU.setBackground(Color.CYAN);
        
        BDisp = new JButton("Display all Books");
        BDisp.setBackground(Color.WHITE);
        BLog = new JButton("Logout");
        BLog.setBackground(Color.LIGHT_GRAY);
        BDisplayU = new JButton("Display all User");
        BDisplayU.setBackground(Color.DARK_GRAY);
        
        JLabel l1,l2,l3 ;
        l1 = new JLabel("Book:");
        l2 = new JLabel("Category:");
        l3 = new JLabel("User:");
        
        p6.add(l1);
        p6.add(BAddB); p6.add(BRemoveB); p6.add(BModifyB);
        p6.add(l2);
        p6.add(BAddC); p6.add(BRemoveC); p6.add(BModifyC);
        p6.add(l3);
        p6.add(BAddU); p6.add(BRemoveU); p6.add(BModifyU);
        p6.add(BDisp);
        p6.add(BLog);
        p6.add(BDisplayU);
        
    AFframe.add(new JLabel("Choose a Function"), BorderLayout.NORTH);
    AFframe.add(p6, BorderLayout.CENTER);
    
    BDisp.addActionListener(new ActionListener(){
    	 public void actionPerformed(ActionEvent e3) {
    		 DisplayAll a = new DisplayAll();
    	 }
    	
    });
    BDisplayU.addActionListener(new ActionListener(){
   	 public void actionPerformed(ActionEvent e3) {
		 DisplayAllUsers a = new DisplayAllUsers();
	 }
	
});
    BAddB.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e4) {
    		AFframe.setVisible(false);
    		AddBook a = new AddBook();
    		
    	}
    });
    BRemoveB.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e4) {
    		AFframe.setVisible(false);
    		RemoveBook b = new RemoveBook();
    		
    	}
    });
    BModifyB.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e4) {
    		AFframe.setVisible(false);
    		EditBooks eb = new EditBooks();
    		
    	}
    });
    BAddU.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e4) {
    		AFframe.setVisible(false);
    		AddUser au = new AddUser();
    		
    	}
    });
    BRemoveU.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e4) {
    		AFframe.setVisible(false);
    		RemoveUser rm = new RemoveUser();
    		
    	}
    });
    BModifyU.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e4) {
    		AFframe.setVisible(false);
    	ChangePassword cp = new ChangePassword();
    		
    	}
    });
  }
}

class UserFunctions extends JFrame {
  UserFunctions() {
    JFrame UFframe = new JFrame();
    UFframe.setTitle("Login Successful. Welcome");
      UFframe.setSize(300,200);
      UFframe.setLocationRelativeTo(null); 
      UFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    UFframe.setVisible(true);
    
    JPanel p7 = new JPanel(new GridLayout(1,3,10,10));
    JPanel p8 = new JPanel(new GridLayout(1,2,10,10));

    JButton BSearch, BBuy, BDisplay, BLogout, BExit;
    BSearch = new JButton("Search");
    BBuy = new JButton("Buy");
    BDisplay = new JButton("Display");
    BLogout = new JButton("Logout");
    BExit = new JButton("Exit");

    p7.add(BSearch);
    p7.add(BBuy);
    p7.add(BDisplay);

    p8.add(BLogout);
    p8.add(BExit);

    BExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e3) {
        System.exit(0);
      }
    });

    BLogout.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e3) {
        ULoginPage u = new ULoginPage();
        UFframe.setVisible(false);
      }
    });

    BSearch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e3) {
        UserSearchPage usp = new UserSearchPage();
        UFframe.setVisible(false);
      }
    });

    BDisplay.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e3) {
        UserDisplayPage usp = new UserDisplayPage();
        UFframe.setVisible(false);
      }
    });
     

    UFframe.add(new JLabel("Choose a Function"), BorderLayout.NORTH);
    UFframe.add(p7, BorderLayout.CENTER);
    UFframe.add(p8, BorderLayout.SOUTH);
  }
}