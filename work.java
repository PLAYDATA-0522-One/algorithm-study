
public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int length = 3;
//		for(int k = 0; k < length; k++) {
//			for(int i = 0; i<arr.length;i++) {
//				for(int j = i+k; j< arr[i].length;j++) {
//					if (j == i+k) {
//					System.out.println(arr[i][j]);
//							}
//						}
//					}
//
//		// 철수가 대각선으로 읽고싶다고 하는것.
//				}
		
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i<arr.length;i++) {		
				if(i==0) {
					System.out.println(arr[i][i+k]);
						}
				else if((i != 0) && (arr[i].length> i+k)) {
					System.out.println(arr[i][i+k]);	
												}
			}

		}
	}
}
