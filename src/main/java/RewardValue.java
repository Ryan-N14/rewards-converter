public class RewardValue {

    private double milesToCashRate = 0.0035;
    private double cashBalance = 0;
    private double milesBalance = 0;



    public RewardValue(double cash){
        cashBalance = cash;
    }

    public RewardValue(double miles, boolean isMiles){
        milesBalance = miles;
    }




    //Methods
    public double getCashValue(){
        cashBalance = milesBalance * milesToCashRate; //converting the miles to cash
        return cashBalance;
    }


    public double getMilesValue(){
        milesBalance = cashBalance / milesToCashRate; //converting cash to miles
        return milesBalance;
    }


}
