
public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int stack = i + 1;
				if(j < 5 - stack) {
					System.out.print(" ");
				}
				else if(j >= 5 - stack) {
					System.out.print("*");
				}			
			}
			System.out.println();
		}
	}
}
