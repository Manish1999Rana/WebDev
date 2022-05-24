import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Calculator implements KeyListener,ActionListener{
    static Float  sum=0f;
    static JTextField t1=new JTextField();
    //main function
    public static void main(String[] args)throws Exception {  
        JFrame f=new JFrame("Calculator");
       
        //button creation
        JButton a=new JButton("1");
        JButton b=new JButton("2");
        a.setBounds(5,80+50,50,50);
        b.setBounds(60,80+50,50,50);
        JButton c=new JButton("3");
        c.setBounds(115,80+50,50,50);
        JButton d=new JButton("4");
        d.setBounds(5,80+105,50,50);
        JButton e=new JButton("5");
        e.setBounds(60,80+105,50,50);
        JButton f1=new JButton("6");
        f1.setBounds(115,80+105,50,50);
        JButton g=new JButton("7");
        g.setBounds(5,80+160,50,50);
        JButton h=new JButton("8");
        h.setBounds(60,80+160,50,50);
        JButton i=new JButton("9");
        i.setBounds(115,80+160,50,50);
        JButton j=new JButton("0");
        j.setBounds(60,80+215,50,50);
        JButton k=new JButton("+");
        k.setBounds(170,80+105,50,105);
        JButton l=new JButton("-");
        l.setBounds(170,80+50,50,50);
        JButton m=new JButton("*");
        m.setBounds(5,75,50,50);
        JButton n=new JButton("/");
        n.setBounds(60,75,50,50);
        JButton b1=new JButton("C");
        b1.setBounds(115,75,50,50);
        JButton b2=new JButton("<");
        b2.setBounds(170,75,50,50);
        JButton o=new JButton("=");
        o.setBounds(115,80+215,105,50);
        JButton ic=new JButton(".");
        ic.setBounds(5,80+215,50,50);
        f.add(ic);

        //button addition
        f.add(a);f.add(b);f.add(c);f.add(d);f.add(e);f.add(f1);f.add(g);f.add(h);f.add(i);
        f.add(j);f.add(k);f.add(l);f.add(m);f.add(n);f.add(o);f.add(b1);f.add(b2);
        
        //text box creation
        t1.setBounds(5,20,212,35);
        t1.setFont(new Font("Arial Black",Font.BOLD,20));
            
        //text box writing
        a.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
                String c1="1";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));    
                }
                else{
                    t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });

        b.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="2";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));    
                }
            }
        });
        
        c.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="3";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        d.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="4";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        e.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="5";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        f1.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="6";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        g.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="7";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        h.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="8";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        i.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="9";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat(c1));
                    
                }
            }
        });
        
        j.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="0";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    t1.setText(t1.getText().concat(c1));
                    
                }
                else{
                        t1.setText(String.valueOf(sum).concat("0"));
                    
                }
            }
        });
        
        k.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="+";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    char com=co.charAt(co.length()-1);
                    if(Character.isDigit(com)){
                        t1.setText(co.concat(c1));
                    }
                    else{
                        String ab=(co.replace(co.charAt(co.length()-1),'+'));
                        t1.setText(ab);
                    }
                }
                else{
                    t1.setText(String.valueOf(sum).concat("+"));
                    
                }

            }
        });
        
        l.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="-";String co=t1.getText();
                if (co.length()==0){
                    t1.setText(c1);
                }
                else{
                    if(co.indexOf("=")==-1){
                        char com=co.charAt(co.length()-1);
                        if(Character.isDigit(com)){
                            t1.setText(co.concat(c1));
                        }
                        else{
                            String ab=(co.replace(co.charAt(co.length()-1),'-'));
                            t1.setText(ab);
                        }
                    }
                    else{
                        t1.setText(String.valueOf(sum).concat("-"));
                        
                    }
                }
                
            }
        });
        
        m.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="*";String co=t1.getText();
                if(co.indexOf("=")==-1){
                    char com=co.charAt(co.length()-1);
                    if(Character.isDigit(com)){
                        t1.setText(co.concat(c1));
                    }
                    else{
                        String ab=(co.replace(co.charAt(co.length()-1),'*'));
                        t1.setText(ab);
                    }
                }
                else{
                    t1.setText(String.valueOf(sum).concat("*"));
                    
                }
            }
        });
        
        n.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String c1="/";
                String co=t1.getText();
                if(co.indexOf("=")==-1){
                    char com=co.charAt(co.length()-1);
                    if(Character.isDigit(com)){
                        t1.setText(co.concat(c1));
                    }
                    else{
                        String ab=(co.replace(co.charAt(co.length()-1),'/'));
                        t1.setText(ab);
                    }
                }
                else{
                    t1.setText(String.valueOf(sum).concat("/"));
                    
                }
            }
        });
        
        o.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                String s1=t1.getText();  
                s1=s1.replaceAll("[+]"," +");
                s1=s1.replaceAll("[-]"," -");
                String[] al1=s1.split(" ");
                String[] al = Arrays.stream(al1).filter(x -> !x.isEmpty()).toArray(String[]::new);
                int j=al.length;
                Float product;
                sum=0f;
                Float Quo;
                for(int k=0;k<j;k++){
                   if(al[k].contains("*")){
                    String s[]=al[k].split("\\*");
                    int i=s.length;
                    for(int k1=0;k1<i;k1++)
                        if(s[k1].contains("/")){
                            String sd[]=s[k1].split("/");
                            int id=s.length;
                            Quo=Float.parseFloat(sd[0]);
                            for(int d=1;d<id;d++){
                                Quo=Quo/Float.parseFloat(sd[d]);
                            }
                            s[k1]=String.valueOf(Quo);
                        }
                        product=1f;
                        for(int d=0;d<i;d++){
                    
                            product=product*Float.parseFloat(s[d]);
                        }
                        al[k]=String.valueOf(product);
                    }
                    if(al[k].contains("/")){
                        String sd[]=al[k].split("/");
                        int id=sd.length;
                        Quo=Float.parseFloat(sd[0]);
                        for(int d=1;d<id;d++){
                            Quo=Quo/Float.parseFloat(sd[d]);
                        }
                        al[k]=String.valueOf(Quo);
                    }
                }
                for(int k=0;k<j;k++){
                    sum=sum+Float.parseFloat(al[k]);
                }
                System.out.println(sum);
                t1.setText(t1.getText().concat("\n=").concat(String.valueOf(sum)));
                //t1.setText(String.valueOf(sum));

            }
        });
        b1.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){  
                t1.setText("");
            }
        });
        b2.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
                String co=t1.getText();
                StringBuilder sb = new StringBuilder(co);
                sb.deleteCharAt(co.length() - 1);
                t1.setText(sb.toString());
            }
        });
        ic.addActionListener((ActionListener) new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
                String c1=".";String co=t1.getText();
                if(co.indexOf("=")==-1&&co.indexOf(".")==-1){
                    char com=co.charAt(co.length()-1);
                    if(Character.isDigit(com)){
                        t1.setText(co.concat(c1));
                    }
                    else{
                        String ab=(co.replace(co.charAt(co.length()-1),'*'));
                        t1.setText(ab);
                    }
                }
                else{
                    t1.setText(String.valueOf(sum).concat("*"));
                    
                }
            }
        });

        //textbox addition
        f.add(t1);

        //KeyListener key;
        Calculator ent=new Calculator();
        t1.addKeyListener(ent);
         
        //Frame display and close
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(220+20,350+40);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    } 
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_ENTER){String s1=t1.getText();  
            s1=s1.replaceAll("[+]"," +");
            s1=s1.replaceAll("[-]"," -");
            String[] al1=s1.split(" ");
            String[] al = Arrays.stream(al1).filter(x -> !x.isEmpty()).toArray(String[]::new);
            int j=al.length;
            Float product;
            sum=0f;
            Float Quo;
            for(int k=0;k<j;k++){
               if(al[k].contains("*")){
                String s[]=al[k].split("\\*");
                int i=s.length;
                for(int k1=0;k1<i;k1++)
                    if(s[k1].contains("/")){
                        String sd[]=s[k1].split("/");
                        int id=s.length;
                        Quo=Float.parseFloat(sd[0]);
                        for(int d=1;d<id;d++){
                            Quo=Quo/Float.parseFloat(sd[d]);
                        }
                        s[k1]=String.valueOf(Quo);
                    }
                    product=1f;
                    for(int d=0;d<i;d++){
                
                        product=product*Float.parseFloat(s[d]);
                    }
                    al[k]=String.valueOf(product);
                }
                if(al[k].contains("/")){
                    String sd[]=al[k].split("/");
                    int id=sd.length;
                    Quo=Float.parseFloat(sd[0]);
                    for(int d=1;d<id;d++){
                        Quo=Quo/Float.parseFloat(sd[d]);
                    }
                    al[k]=String.valueOf(Quo);
                }
            }
            for(int k=0;k<j;k++){
                sum=sum+Float.parseFloat(al[k]);
            }
            System.out.println(sum);
            t1.setText(t1.getText().concat("=").concat(String.valueOf(sum)));
            //t1.setText(String.valueOf(sum));

        
        }
        if (e.getKeyCode()!=KeyEvent.VK_ENTER
        &&e.getKeyCode()!=KeyEvent.VK_SHIFT
        &&e.getKeyCode()!=KeyEvent.VK_DELETE
        &&e.getKeyCode()!=KeyEvent.VK_BACK_SPACE
        &&e.getKeyCode()!=KeyEvent.VK_ADD
        &&e.getKeyCode()!=KeyEvent.VK_PLUS
        &&e.getKeyCode()!=KeyEvent.VK_SUBTRACT
        &&e.getKeyCode()!=KeyEvent.VK_MINUS
        &&e.getKeyCode()!=KeyEvent.VK_MULTIPLY
        &&e.getKeyCode()!=KeyEvent.VK_ASTERISK
        &&e.getKeyCode()!=KeyEvent.VK_DIVIDE
        &&e.getKeyCode()!=KeyEvent.VK_SLASH
        &&e.getKeyCode()!=KeyEvent.VK_PERIOD
        &&e.getKeyCode()!=KeyEvent.VK_DECIMAL
        &&e.getKeyCode()!=KeyEvent.VK_0
        &&e.getKeyCode()!=KeyEvent.VK_1
        &&e.getKeyCode()!=KeyEvent.VK_2
        &&e.getKeyCode()!=KeyEvent.VK_3
        &&e.getKeyCode()!=KeyEvent.VK_4
        &&e.getKeyCode()!=KeyEvent.VK_5
        &&e.getKeyCode()!=KeyEvent.VK_6
        &&e.getKeyCode()!=KeyEvent.VK_7
        &&e.getKeyCode()!=KeyEvent.VK_8
        &&e.getKeyCode()!=KeyEvent.VK_9
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD0
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD1
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD2
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD3
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD4
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD5
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD6
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD7
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD8
        &&e.getKeyCode()!=KeyEvent.VK_NUMPAD9
        ){
            
            JOptionPane.showMessageDialog(null , "Enter correct Input");
            String co=t1.getText();
            StringBuilder sb = new StringBuilder(co);
            sb.deleteCharAt(co.length() - 1);
            t1.setText(sb.toString());
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            String co=t1.getText();
            if(co.indexOf("=")!=-1){
                    t1.setText(t1.getText());
                
            }
        }
        else{
            String co=t1.getText();
            if(co.indexOf("=")!=-1){
                    t1.setText(String.valueOf(sum));
            }
        }
            
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void actionPerformed(ActionEvent e) {}
}