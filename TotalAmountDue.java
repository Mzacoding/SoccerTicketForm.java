package TicketsFormApp;


public class TotalAmountDue {
    
    private double totalAmount;
    private  int numberOfTicktes;
    private String team1;
    private String team2;

    public TotalAmountDue(int numberOfTicktes, String team1, String team2) {

        this.numberOfTicktes = numberOfTicktes;
        this.team1 = team1;
        this.team2 = team2;
    }

    public double getTotalAmount() {
        return setTotalAmountDue(team1,team2);
    }
 
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private double  setTotalAmountDue(String team1, String team2){
          double Amount;
       if(team1.equalsIgnoreCase("kaizer chiefs") && team2.equalsIgnoreCase("Orlando Pirates") ){
            Amount=(numberOfTicktes*200);
       }else if(team2.equalsIgnoreCase("kaizer chiefs") || team1.equalsIgnoreCase("Orlando Pirates")  ){
            Amount=(numberOfTicktes*150);
       }
       else if(team1.equalsIgnoreCase("kaizer chiefs") || team2.equalsIgnoreCase("Orlando Pirates")  ){
            Amount=(numberOfTicktes*150);
       }else{
            Amount=(numberOfTicktes*100);
       }
        return  Amount;
    
     }
    

    @Override
    public String toString() {
        return "Home Team :" + team1 + "\nAway Team :" + team2+ 
                "\nNumber Of Ticktes :" + numberOfTicktes +
                "\nTotalAmount :" +getTotalAmount();
                
    }
    

  
    
    
    
}

