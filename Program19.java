package patterns;

public class Program19 {
	public static void main(String[] arga) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || j==1 || i==j || i==n){
					System.out.print("* ");
				}
				else {
					System.out.print("# ");
				}
			}
		System.out.println();
	}
}
}
