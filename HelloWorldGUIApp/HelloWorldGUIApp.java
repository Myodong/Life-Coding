import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;

public class HelloWorldGUIApp{
	
    public static void main(String[] args){
    	
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(300, 200));
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
//import javax.swing.*;   
//import java.awt.Dimension;
//import java.awt.Toolkit;
//public class HelloWorldGUIApp{
//    public static void main(String[] args){
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame frame = new JFrame("HelloWorld GUI"); #텝란명칭
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setPreferredSize(new Dimension(300, 200));#텍스트창 넓이 높이
//                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);#메세지
//                frame.getContentPane().add(label);
//                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);#모니터 위치 표시
//
//                frame.pack();
//                frame.setVisible(true);
//            }
//        });
//    }
//} 