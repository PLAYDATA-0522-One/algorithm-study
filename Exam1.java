package test;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrNum = {{1,2,3},{4,5,6},{7,8,9}};
		int count = 0;
		
		for (int i=0; i<3; i++) {
			count += i;
			
			for (int j=0; j<arrNum[0].length; j++) {
				
				if (count == 3) {
					break;
				} else {
					System.out.println(arrNum[j][count]);
					count +=1;
				}
			}
			
			count = 0;
			
			}

	}

}
