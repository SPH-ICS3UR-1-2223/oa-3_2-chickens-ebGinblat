public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	double dailyAverage;
    	double monthlyAverage;
    	double monthlyProfit;
    	int totalEggs = 0;
    	int chickenCount = 4;
    	int eggsPerChicken = 8;
    	//Monday +100 eggs
    	totalEggs+=100;
    	//Tues 
    	totalEggs+=121;
    	totalEggs+=117;
    	dailyAverage=totalEggs/3;
    	monthlyAverage=dailyAverage*30;
    	monthlyProfit = monthlyAverage *0.18;
    	System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        
        
    }
    
    
}
