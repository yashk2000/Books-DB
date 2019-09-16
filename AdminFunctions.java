import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*; 

class AdminFunctions extends JFrame {
	AdminFunctions() {
		JFrame AFframe = new JFrame();
		AFframe.setTitle("Login Successfull. Welcome");
        AFframe.setLocationRelativeTo(null); 
    	AFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AFframe.setSize(500,500);  
        AFframe.setVisible(true);
        
        JPanel p6 = new JPanel(new GridLayout(4,4,5,5));
        
        JButton BAddB, BAddC, BAddU, BRemoveB, BRemoveU, BRemoveC, BModifyB, BModifyC, BModifyU, BDisp, BLog ;
        BAddB = new JButton("Add a book");
        BAddB.setBackground(Color.YELLOW);
        BAddC = new JButton("Add a category");
        BAddC.setBackground(Color.YELLOW);
        BAddU = new JButton("Add a user");
        BAddU.setBackground(Color.YELLOW);
        
        BRemoveB = new JButton("Remove a book");
        BRemoveB.setBackground(Color.BLUE);
        BRemoveC = new JButton("Remove a category");
        BRemoveC.setBackground(Color.BLUE);
        BRemoveU = new JButton("Remove a user");
        BRemoveU.setBackground(Color.BLUE);
        
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
        
		AFframe.add(new JLabel("Choose a Function"), BorderLayout.NORTH);
		AFframe.add(p6, BorderLayout.CENTER);
	}
}
