import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="exp1" height=700 width=700></applet>

public class exp1 extends Applet implements ActionListener{
 Checkbox one,two,three,four,five,sem1,sem2,sem3,sem4,sem5,sem6;
 CheckboxGroup cbg;
 Button b;
 Label name,sem,fav,status;
 TextField nm;
 Font bold = new Font("Consolas", Font.BOLD,14);

 public void init(){
  one=new Checkbox("ONE");
  two=new Checkbox("TWO");
  three=new Checkbox("THREE");
  four=new Checkbox("FOUR");
  five=new Checkbox("FIVE");
  cbg=new CheckboxGroup();
  sem1=new Checkbox("1ST SEM",cbg,false);  
  sem2=new Checkbox("2ND SEM",cbg,false);
  sem3=new Checkbox("3RD SEM",cbg,false);
  sem4=new Checkbox("4TH SEM",cbg,false);
  sem5=new Checkbox("5TH SEM",cbg,false);
  sem6=new Checkbox("6TH SEM",cbg,false);
  b=new Button("SUBMIT");
  name=new Label("ENTER YOUR NAME ::");
  sem=new Label("                                          SELECT YOUR SEMESTER ::");
  fav=new Label("                                SELECT YOUR FAVOURITE SUBJECTS ::");
  status=new Label("");
  nm=new TextField(16);
 
 
  setBackground(new Color(222, 220, 222));
  GridBagConstraints c=new GridBagConstraints();
  setLayout(new GridBagLayout());
  c.fill = GridBagConstraints.HORIZONTAL;  
  c.gridx=0;
  c.gridy=0;
  c.gridwidth=2;
  c.ipadx=16;
  c.ipady=20;
  add(name,c);
  c.gridx=2;
  c.gridy=0;
  c.gridwidth=4;
  add(nm,c);
  c.gridx=0;
  c.gridy=1;
  c.gridwidth=6;
  sem.setFont(new Font("consolas",Font.BOLD,14));
  add(sem,c);
  c.gridx=0;
  c.gridy=2;
  c.gridwidth=1;
  add(sem1,c);
  c.gridx=1;
  c.gridy=2;
  c.gridwidth=1;
  add(sem2,c);
  c.gridx=2;
  c.gridy=2;
  c.gridwidth=1;
  add(sem3,c);
  c.gridx=3;
  c.gridy=2;
  c.gridwidth=1;
  add(sem4,c);
  c.gridx=4;
  c.gridy=2;
  c.gridwidth=1;
  add(sem5,c);
  c.gridx=5;
  c.gridy=2;
  c.gridwidth=1;
  add(sem6,c);
  c.gridx=0;
  c.gridy=3;
  c.gridwidth=6;
  fav.setFont(new Font("consolas",Font.BOLD,14));
  add(fav,c);
  c.gridx=0;
  c.gridy=4;
  c.gridwidth=1;
  add(one,c);
  c.gridx=1;
  c.gridy=4;
  c.gridwidth=1;
  add(two,c);
  c.gridx=2;
  c.gridy=4;
  c.gridwidth=1;
  add(three,c);
  c.gridx=3;
  c.gridy=4;
  c.gridwidth=1;
  add(four,c);
  c.gridx=4;
  c.gridy=4;
  c.gridwidth=1;
  add(five,c);
  c.gridx=0;
  c.gridy=5;
  c.gridwidth=6;
  add(b,c);
  c.gridx=0;
  c.gridy=6;
  c.gridwidth=6;
  add(status,c);

  b.addActionListener(this);
   
  sem1.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent e) {
    one.setLabel("ENG");
    two.setLabel("PHY");
    three.setLabel("CHE");
    four.setLabel("ICT");
    five.setLabel("BAM");
   }
  });
  
  sem2.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent e) {
    one.setLabel("EEC");
    two.setLabel("BEL");
    three.setLabel("PCI");
    four.setLabel("AMI");
    five.setLabel("WPD");
   }
  });

  sem3.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent e) {
    one.setLabel("CGR");
    two.setLabel("DSU");
    three.setLabel("DMS");
    four.setLabel("OOP");
    five.setLabel("DTE");
   }
  });

  sem4.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent e) {
    one.setLabel("DCC");
    two.setLabel("JPR");
    three.setLabel("MIC");
    four.setLabel("SEN");
    five.setLabel("GAD");
   }
  });

  sem5.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent e) {
    one.setLabel("EST");
    two.setLabel("STE");
    three.setLabel("OSY");
    four.setLabel("AJP");
    five.setLabel("CSS");
   }
  });

  sem6.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent e) {
    one.setLabel("PYT");
    two.setLabel("MAD");
    three.setLabel("PHP");
    four.setLabel("ENT");
    five.setLabel("CPP");
   }
  });
 }
  
  public void actionPerformed(ActionEvent e){
   if(nm.getText()!=null && nm.getText().equals("")){
    nm.setText("");
    cbg.setSelectedCheckbox(null);  
     one.setLabel("ONE");
     one.setState(false);
     two.setLabel("TWO");
     two.setState(false);
     three.setLabel("THREE");
     three.setState(false);
     four.setLabel("FOUR");
     four.setState(false);
     five.setLabel("FIVE");
     five.setState(false);
    status.setBackground(Color.RED);
    status.setForeground(Color.WHITE);
    status.setFont(bold);
    status.setText("     DATA NOT SUBMITTED.. CHECK IF ANY INPUT IS EMPTY OR INVALID..");  
   }
   else{  
    if(sem1.getState()==true || sem2.getState()==true || sem3.getState()==true || sem4.getState()==true || sem5.getState()==true || sem6.getState()==true){
     nm.setText("");
     cbg.setSelectedCheckbox(null); 
     one.setLabel("ONE");
     one.setState(false);
     two.setLabel("TWO");
     two.setState(false);
     three.setLabel("THREE");
     three.setState(false);
     four.setLabel("FOUR");
     four.setState(false);
     five.setLabel("FIVE");
     five.setState(false);
     status.setBackground(new Color(36, 161, 14));
     status.setForeground(Color.WHITE);
     status.setFont(bold);
     status.setText("                                   DATA SUBMITTED SUCCESSFULLY!!");
    } 
    else{
     nm.setText("");
     cbg.setSelectedCheckbox(null);  
     one.setLabel("ONE");
     one.setState(false);
     two.setLabel("TWO");
     two.setState(false);
     three.setLabel("THREE");
     three.setState(false);
     four.setLabel("FOUR");
     four.setState(false);
     five.setLabel("FIVE");
     five.setState(false);
     status.setBackground(Color.RED);
     status.setForeground(Color.WHITE);
     status.setFont(bold);
     status.setText("    DATA NOT SUBMITTED.. CHECK IF ANY INPUT IS EMPTY OR INVALID..");
    } 
   }
  }
 }