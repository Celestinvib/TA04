
public class Five {

	public static void main(String[] args) {
		
		int A = 1;
		int B = A;
		int C = 4;
		int D = 8;
		
		B = C;
		C = A;
		A = D;
		D = B;
		System.out.println("A="+A+"\nB="+B+"\nC="+C+"\nD="+D);
		
		
	}

}
