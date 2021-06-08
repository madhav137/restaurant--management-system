
package restaurant.management.system;
        import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class RestaurantManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public RestaurantManagementSystem() {
		
                setSize(1200,430);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(60,100);
                setResizable(false);
                setTitle("RESTAURANT MANAGEMENT SYSTEM ( TECH RESTRA )");

		l1 = new JLabel("");
                b1 = new JButton("NEXT");
                
                b1.setBackground(Color.black);
                b1.setForeground(Color.white);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("restaurant/management/system/icons/mm-2.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel l2=new JLabel("TECH RESTRA");
                l2.setBounds(700 ,30,1000,100);
                l2.setFont(new Font("Brush Script MT",Font.PLAIN,70));
                l2.setForeground(Color.black);
                l1.add(l2);
                
                b1.setBounds(1000,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        l2.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        l2.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        @Override
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
        }
        
        public static void main(String[] args) {
                RestaurantManagementSystem window = new RestaurantManagementSystem();
                window.setVisible(true);			
	}

}
    
