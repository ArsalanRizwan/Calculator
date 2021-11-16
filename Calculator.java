
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Calculator extends JFrame{
    JLabel disp2=null,disp1=null;
    BtnHandler hndl;
    
    Calculator(){
        setTitle("Calculator");
        setSize(375,500);
        setLocationRelativeTo(null);
        setLayout(null);
        calculatorGUI();
        
        hndl = new BtnHandler(this);
        
        for(int i=0;i<23;i++){
           a[i].addActionListener(hndl);
        }
    }
    
    JButton a[]=new JButton[23];
    
    void calculatorGUI(){
        disp2=new JLabel("",JLabel.RIGHT);
        add(disp2);
        disp2.setBounds(22, 70, 300, 40);
        disp2.setBackground(Color.LIGHT_GRAY);
        
        disp1=new JLabel("",JLabel.RIGHT);
        add(disp1);
        disp1.setBounds(22,10,300,40);
        disp1.setBackground(Color.LIGHT_GRAY);
        disp1.setText("");
        
        for(int i=0;i<10;i++){
            a[i] = new JButton(""+i);
        }
        
         a[10] = new JButton("<-");
         a[11] = new JButton("CE");
         a[12] = new JButton("C");
         a[13] = new JButton("+/-");
         a[14] = new JButton("sqrt");
         a[15] = new JButton("/");
         a[16] = new JButton("%");
         a[17] = new JButton("x");
         a[18] = new JButton("1/x");
         a[19] = new JButton("-");
         a[20] = new JButton(".");
         a[21] = new JButton("+");
         a[22] = new JButton("=");
        
        a[0].setBounds(22,370,110,50);
        a[1].setBounds(22,310,50,50);
        a[2].setBounds(82,310,50,50);
        a[3].setBounds(142,310,50,50);
        a[4].setBounds(22,250,50,50);
        a[5].setBounds(82,250,50,50);
        a[6].setBounds(142,250,50,50);
        a[7].setBounds(22,190,50,50);
        a[8].setBounds(82,190,50,50);
        a[9].setBounds(142,190,50,50);
        a[10].setBounds(262,190,70,50);
        a[11].setBounds(82,130,50,50);
        a[12].setBounds(142,130,50,50);
        a[13].setBounds(202,130,50,50);
        a[14].setBounds(262,130,70,50);
        a[15].setBounds(202,190,50,50);
        a[16].setBounds(22,130,50,50);
        a[17].setBounds(202,250,50,50);
        a[18].setBounds(262,250,70,50);
        a[19].setBounds(202,310,50,50);
        a[20].setBounds(142,370,50,50);
        a[21].setBounds(202,370,50,50);
        a[22].setBounds(262,310,70,110);
        
        for(int i=0;i<23;i++){
            add(a[i]);
        }
        
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    double n=0;
    String res="",op="";
    String btn="";
    
    public void operations(){
        
        if(op=="+")
        {
            n=n+Double.parseDouble(res);
            disp2.setText(""+n);
        }
        else if(op=="-")
        {
            n=n-Double.parseDouble(res);
            disp2.setText(""+n);
        }
        else if(op=="x")
        {
            n=n*Double.parseDouble(res);
            disp2.setText(""+n);
        }  
        else if(op=="/")
        {
            n=n/Double.parseDouble(res);
            disp2.setText(""+n);
        }
        else if(op=="%")
        {
            n=n/100;
            disp2.setText(""+n);
        }
        else if(op=="sqrt")
        {
            n=Math.sqrt(n);
            disp2.setText(""+n);
        }
        else if(op=="1/x")
        {
            n=1/n;
            disp2.setText(""+n);
        }
        else if(op=="+/-")
        {
            n=-n;
            disp2.setText(""+n);
        }
        else if(op=="=")
        {
            op=btn; 
        }
        res="";
    }
    
}
