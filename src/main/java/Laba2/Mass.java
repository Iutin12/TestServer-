package Laba2;

public class Mass {
	public static void main(String[] args) { 
		obv(); 
		
		 
	}
	
	public static int[] obv()  {
		int[] nums = new int[5] ; 
		// устанавливаем значения элементов массива
		
		for (int i = 0; i < 5; i++ ){
			
			nums[i]= randomizer.rand();
			
		}
		        
		// получаем значение третьего элемента массива
		return nums;
	}
	
	
}
