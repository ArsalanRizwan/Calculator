/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnHandler implements ActionListener {
    
    Calculator ref;

    public BtnHandler(Calculator cal) {
        this.ref = cal;
    }
    
    String k="";
    int dCount=0;
    boolean isNeg=false;
    @Override
    public void actionPerformed(ActionEvent e) {
        
      ref.btn=e.getActionCommand();
     
      if(k=="" && ref.btn=="-")
      {
          isNeg=true;
          ref.disp2.setText(ref.btn);
      }
      
      if(ref.btn!=".")
      {
          k=k+ref.btn;
      }
      else if(k!="" && ref.btn==".")
      {
          if(dCount==0)
          {
              k=k+ref.btn;
          }
      }
      if(ref.btn!="C" && ref.btn!="CE")
      {
          ref.disp1.setText(""+k);
      }
      
      if(ref.btn=="<-")
      {
          ref.res=ref.res.substring(0,ref.res.length()-1);
          ref.disp2.setText(""+ref.res); 
     }
      else if(ref.btn=="+"||ref.btn=="-"||ref.btn=="x"||ref.btn=="/"||ref.btn=="%"||ref.btn=="="
              ||ref.btn=="sqrt"||ref.btn=="1/x"||ref.btn=="+/-")
      {
          dCount=0;
          
          if(ref.op=="")
          {
              if(ref.res!="")
              {
                  ref.n=Double.parseDouble(ref.res);
                  
                  if(isNeg==true)
                  {
                      ref.n=-1*ref.n;
                      isNeg=false;
                  }
                  
                  ref.op=ref.btn;
                  ref.res="";
              }
          }
          else
          {
              ref.operations();
              ref.op=ref.btn;
          }
      }
      else if(ref.btn=="CE")
      {
          ref.disp2.setText("");
          ref.res="";
      }
      else if(ref.btn=="C")
      {
          k="";
          ref.disp1.setText(k);
          ref.disp2.setText("0");
          ref.res="";
          ref.op="";
          ref.n=0;
          dCount=0;
      }
      else if(ref.btn==".")
      {
          if(ref.res!="")
          {
              if(dCount==0)
              {
                  ref.res=ref.res+".";
                  ref.disp2.setText(ref.res);
                  dCount=dCount+1;
              }
          }
      }
      else if(ref.btn.equals("7"))
      {
          ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("8"))
      { 
                    ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("9"))
      {
                    ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("4"))
      {
                    ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("5"))
      {
                    ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("6"))
      {
                    ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("1"))
      {
                    ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("2"))
      {
                     ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("3"))
      {
                     ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          

      }
      else if(ref.btn.equals("0"))
      {
              ref.res=ref.res+ref.btn;
              ref.disp2.setText(""+ref.res);
          
      }
    }
}

