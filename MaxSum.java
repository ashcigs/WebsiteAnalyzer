package sample;

public class MaxSum {
	
	public static void main(String[] args) {
		

		int[] numbersList = {1,2};
		
		int big, sum=0;
		
		if(numbersList[0] > numbersList[1]) {
			big = numbersList[0];
		} else {
			big = numbersList[1];
		}
		
		for(int k=2;k<numbersList.length;k++) {
		    for(int j=0;j<numbersList.length;j++) {
		        sum=0;
		        for(int i=j;i<numbersList.length;i+=k) {
			        sum+=numbersList[i];
			        if(sum>big) {
				        big = sum;
			        }
		        }
		    }
		}
		
		System.out.println(big);
		
	}

}
