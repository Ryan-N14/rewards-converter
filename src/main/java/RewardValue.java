public class RewardValue {

    public static final double milesToCashRate = 0.0035;
    private double cashBalance;




    public RewardValue(double cash){
        cashBalance = cash;
    }

    public RewardValue(int miles){
        cashBalance = convertToCash(miles);
    }




    private static double convertToMiles(double cash){
        return (int)(cash / milesToCashRate);
    }

    private static double convertToCash(int miles){
        return miles * milesToCashRate;
    }





    //Methods
    public double getCashValue(){
        return cashBalance;
    }


    public double getMilesValue(){
        return convertToMiles(cashBalance); //converting cash to miles
    }


}
