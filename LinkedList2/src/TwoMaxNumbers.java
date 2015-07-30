public class TwoMaxNumbers {
 
	
//	Description:
//		Write a program to find top two maximum numbers in the
//		given array. You should not use any sorting functions. You
//		should iterate the array only once. You should not use any
//		kind of collections in java
//		- See more at: http://www.java2novice.com/java-interview-programs/two-max-numbers-in-array/#sthash.iaw2rcKv.dpuf
	
    public void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}
