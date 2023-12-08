public class L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i==j||i==n||j==n)) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
			
		

	}

}

