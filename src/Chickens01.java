public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        
    	int totalEggs = 0;
    	int chickenCount = 4;
    	int eggsPerChicken = 8;       
        //Monday
    	totalEggs=totalEggs+chickenCount*eggsPerChicken;
    	
    	//Tuesday
    	chickenCount++;
    	totalEggs+=chickenCount*eggsPerChicken;
    	
    	//Wednesday
    	chickenCount/=2;
    	totalEggs+=chickenCount*eggsPerChicken;
    	System.out.println(totalEggs);
        
    }   
}
