
public class Star {

	public static void main(String[] args) {
		// *****
		// �ϳ��� ���� ����� for������ �ݺ��ؼ� ���
//		for(int i = 0; i < 5; i++) {			
//			System.out.print("*");
//		}
//	
//		for(int i = 0; i < 5; i++) {
//			System.out.print("*");
//			System.out.println();
//		}
/* *
 * **
 * ***
 * ****
 * *****	
 */
//		for(int i = 1; i<=5; i++) {
//			for(int j = 0; j < 5; j++) {
//			System.out.print(i);
//			
//			}
//			System.out.println();
//		}
//		int star = 1;
//		for( int i = 0; i<5; i++) {
//			for(int j = 0; j<5; j++) {
//				System.out.print(star);
//			}
//			star++;
//			System.out.println();
//		}
//		int star = 1;
//		for( int i = 0; i<5; i++) {
//			for(int j = 0; j<5; j++) {
//				System.out.print(star);
//				star++;
//			}
//			star = 1;
//			System.out.println();
//		}
//		System.out.println();
//		int n =1;
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <=n ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			n++;
//		}
//		for(int i = 0; i <= 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i =0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 5; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
