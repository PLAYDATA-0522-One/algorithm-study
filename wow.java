package test;

public class wow {

	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}
				};
		
		int loop_idx=0;
			for (int i=arr[0].length; i>0; i--) {
				for (int j=0; j<i; j++) {
					System.out.println(arr[j][j+loop_idx]);
				}
				loop_idx++;
			}

	}

}
