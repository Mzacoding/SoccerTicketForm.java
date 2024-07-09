
package TicketsFormApp;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SoccerTickets extends JFrame{
        private JTextField NameTextField;  
    private JTextField SurnameTextField;
    private JLabel CostLabel;
    private JTextField HomeTeamTextField;
    private JTextField AwayTeamTextField;
    private JTextField CostTextField;

    private JButton Buy;
    private JButton Clear;
    private JButton Exit;

    private JPanel HeadingPanel;
    private JPanel NamePanel;
    private JPanel SurnamePanel;

    private JPanel HomeTeamPanel;
    private JPanel AwayTeamPanel;

    private JPanel NumberTicketsPanel;
    private JPanel ScrollPanePanel;
    private JPanel CostTextPanel;
    private JPanel MainPanel;
    private JLabel NumTickes;
    
    private JPanel CustomerPanel;
    private JPanel CustomerTicketstPanel;
    private JPanel TicketstPanel;
    private JPanel ButtonPanel;
    private JSlider Slider;
     private JPanel TotalCostTextPanel;

    public SoccerTickets() throws HeadlessException {
        NameTextField = new JTextField(20);
        NameTextField .setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        SurnameTextField = new JTextField(20);
        SurnameTextField .setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        HomeTeamTextField = new JTextField(20);
        HomeTeamTextField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AwayTeamTextField = new JTextField(20);
         AwayTeamTextField  .setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        CostTextField = new JTextField(20);
          CostTextField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Buy = new JButton("Buy");
           Buy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Clear = new JButton("Clear");
          Clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Exit = new JButton("Exit");
           Exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        Buy.addActionListener(new BuyActionListener());
        Clear.addActionListener(new ClearActionListener());
        Exit.addActionListener(new ExitActionListener());
      
        
        Slider = new JSlider();
        Slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Slider.addChangeListener(new SliderChangeListener());
      // Slider.setPaintTicks(true);
      // Slider.setPaintLabels(true);
      // Slider.setMajorTickSpacing(25);
        
        //HeadingPanel 
        HeadingPanel = new JPanel();
        HeadingPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        HeadingPanel .setLayout(new FlowLayout(FlowLayout.CENTER));
        HeadingPanel.add(new JLabel("Soccer Match Tickets"));
        
        //NamePanel
        NamePanel= new JPanel();
        NamePanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        NamePanel.add(new JLabel(" Name:             "));
        NamePanel.add(NameTextField);
        
        //SurnamePanel
        SurnamePanel = new JPanel();
        SurnamePanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        SurnamePanel.add(new JLabel(" Surname:       "));
        SurnamePanel.add(SurnameTextField);        
        //HomeTeamPanel
        HomeTeamPanel = new JPanel();
        HomeTeamPanel .setLayout(new FlowLayout(FlowLayout.LEADING));
        HomeTeamPanel .add(new JLabel("Home team:   "));
        HomeTeamPanel .add(HomeTeamTextField);  
        
               
        //AwayTeamPanel 
        AwayTeamPanel = new JPanel();
        AwayTeamPanel .setLayout(new FlowLayout(FlowLayout.LEADING));
        AwayTeamPanel .add(new JLabel("Away team:    "));
        AwayTeamPanel .add(AwayTeamTextField);
        

        //NumberTicketsPanel 
        NumTickes=new JLabel("0");
        NumberTicketsPanel = new JPanel();
        NumberTicketsPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        NumberTicketsPanel.add(new JLabel("Number of Tickets Required:"));
        NumberTicketsPanel.add(NumTickes);
        NumberTicketsPanel.add(Slider);
        
       
         //CostTextPanel
        CostTextPanel = new JPanel();
        CostTextPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        CostTextPanel.add(new JLabel("Cost Price R:  "));
        CostTextPanel.add(CostTextField);
        //TotalCostTextPanel
        
        CostLabel=new  JLabel("0.00");
        TotalCostTextPanel = new JPanel();
        TotalCostTextPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        TotalCostTextPanel.add(new JLabel("Total Amount Due R:"));
        TotalCostTextPanel.add(CostLabel);
        

        
        CustomerPanel = new JPanel();
        CustomerPanel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.BLUE,2), "Customer Details"));
        CustomerPanel.setLayout(new GridLayout(2,1));
        CustomerPanel.add(NamePanel);
        CustomerPanel.add(SurnamePanel );
        
          
        TicketstPanel = new JPanel();
         TicketstPanel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.BLUE,2), "Tickets Details"));
        TicketstPanel.setLayout(new GridLayout(5,1));
        TicketstPanel.add(HomeTeamPanel);
        TicketstPanel.add(AwayTeamPanel );
        TicketstPanel.add(CostTextPanel );
        TicketstPanel.add(NumberTicketsPanel);
        TicketstPanel.add(TotalCostTextPanel);
        
        //CustomerTicketstPanel
        CustomerTicketstPanel = new JPanel();
        CustomerTicketstPanel.setLayout(new BorderLayout() );
        CustomerTicketstPanel.add(CustomerPanel,BorderLayout.NORTH);
        CustomerTicketstPanel.add(TicketstPanel,BorderLayout.CENTER);
        
        //ButtonPanel
        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        ButtonPanel.add(Buy);
        ButtonPanel.add(Clear);
        ButtonPanel.add(Exit);
        
        // MainPanel 
        MainPanel = new JPanel();
        MainPanel.setLayout(new BorderLayout());
        MainPanel.add(HeadingPanel, BorderLayout.NORTH);
        MainPanel.add(CustomerTicketstPanel, BorderLayout.CENTER);
        MainPanel.add(ButtonPanel, BorderLayout.SOUTH);
        
        
           
         //Frame
         this.setTitle("Soccer Tickets Form");
         this.setSize(500,400);
         this.setLocation(500,200);
         this.setResizable(false);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         this.add(MainPanel);
         
         this.setVisible(true);
           
     }
    
    public void clear(){
        
         NameTextField.setText("");
         SurnameTextField.setText("");
         HomeTeamTextField.setText(""); 
         AwayTeamTextField.setText(""); 
         CostTextField.setText(""); 
         CostLabel.setText("0.00"); 
         NumTickes.setText("0");
    }
    
    public String   totalAmountDue(){
     
        int numberOfTicktes = Integer.parseInt(NumTickes.getText());
        String team1 = HomeTeamTextField.getText().trim();
        String team2 = AwayTeamTextField.getText().trim();
          
        TotalAmountDue cash = new TotalAmountDue(numberOfTicktes, team1, team2);
        double totalAmountDue=cash.getTotalAmount();
        double change;
        double HandedOver;
        try{
            HandedOver=Double.parseDouble(CostTextField.getText().trim()); 
             
        if(HandedOver>=totalAmountDue){
            
           change=HandedOver-totalAmountDue;

              
           int answer=JOptionPane.showConfirmDialog(null, "Please Confirm Your Oder\n"+cash.toString(),"ConfirmationBox",JOptionPane.OK_CANCEL_OPTION);
           if(answer==0){
                return cash.toString()+ "\nAmount Handed Over :R" + HandedOver + "\nChange :R"+String.valueOf(change);
           }else {
                JOptionPane.showMessageDialog(null,"Oder Cancelled","ErroMessage",JOptionPane.ERROR_MESSAGE);
                 return "Try Again Later";
           }
          
           
        }else{
            JOptionPane.showMessageDialog(null,"Amount Handed is less the the Amount Due","ErroMessage",JOptionPane.ERROR_MESSAGE);
            return "Couldn't Processing the Payment Please Try Again Later";
        }
        
        
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp.getMessage());
        }
        
        return "Something went Wrong";
       
  
        
    }
    
   
       private class SliderChangeListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            
            NumTickes.setText(String.valueOf(Slider.getValue()));
            
            if(!(HomeTeamTextField.getText().isEmpty()) && !(AwayTeamTextField.getText().isEmpty())){
                
                 
                 int numberOfTicktes=Integer.parseInt(NumTickes.getText());
                 String team1=HomeTeamTextField.getText().trim();
                 String team2=AwayTeamTextField.getText().trim();
                
            TotalAmountDue cash=  new TotalAmountDue(numberOfTicktes, team1,team2);
             double totalAmountDue=cash.getTotalAmount();
             CostLabel.setText(String.valueOf(totalAmountDue));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Fill  Teams Fields","ErroBox",JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private class BuyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

         
            if((NameTextField.getText().trim().isEmpty())==false){
                
              if(!(SurnameTextField.getText().trim().isEmpty())){
                  
                   if(!(HomeTeamTextField.getText().trim().isEmpty())){
                  
                       
                             if(!(AwayTeamTextField.getText().trim().isEmpty())){
                                                if(!(CostTextField.getText().trim().isEmpty())){
                                                    
                                                         if(!(NumTickes.getText().trim().equals("0"))){
                                                             
                                                                   
                                                                         JOptionPane.showMessageDialog(null,totalAmountDue(),"Infor",JOptionPane.INFORMATION_MESSAGE);
                                                             
                                                         }else{
                                                            JOptionPane.showMessageDialog(null,"Number of Tickets Must be >0","ErrorMessage",JOptionPane.ERROR_MESSAGE);
                                                    }
                                                    
                                                   }else{
                                                     JOptionPane.showMessageDialog(null,"Cost Filed is Required Field","ErrorMessage",JOptionPane.ERROR_MESSAGE);
                                                    } 
                                }else{
                                       JOptionPane.showMessageDialog(null,"Away Team Filed is Required Field","ErrorMessage",JOptionPane.ERROR_MESSAGE);
                                } 
                    }else{
                         JOptionPane.showMessageDialog(null,"Home Team Filed is Required Field","ErrorMessage",JOptionPane.ERROR_MESSAGE);
                        } 
              }else{
                JOptionPane.showMessageDialog(null,"Surname Filed is Required Field","ErrorMessage",JOptionPane.ERROR_MESSAGE);
            } 
              
            }else{
                JOptionPane.showMessageDialog(null,"Name Filed is Required Field","ErrorMessage",JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private class ClearActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
                 clear();
        }

    }

    private class ExitActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
                System.exit(0);
        }

    }
    

}
