
public class Three {

	public static void main(String[] args) {

		int X = 6;
		int Y = 2;
		double N = 2.2;
		double M = 4;
		
		System.out.println("Variable X= "+X+"\nVariable Y= "+Y+"\nVariable N= "+N+"\nVariable M= "+M);
		System.out.println(X+" + "+Y+" = "+(X+Y));
		System.out.println(X+" - "+Y+" = "+(X-Y));
		System.out.println(X+" * "+Y+" = "+(X*Y));
		System.out.println(X+" / "+Y+" = "+(X/Y));
		System.out.println(X+" % "+Y+" = "+(X%Y));

		System.out.println(N+" + "+M+" = "+(N+M));
		System.out.println(N+" - "+M+" = "+(N-M));
		System.out.println(N+" * "+M+" = "+(N*M));
		System.out.println(N+" / "+M+" = "+(N/M));
		System.out.println(N+" % "+M+" = "+(N%M));
		
		System.out.println(X+" + "+N+" = "+(X+N));
		System.out.println(Y+" / "+M+" = "+(Y/M));
		System.out.println(Y+" % "+M+" = "+(Y/M));
		
		System.out.println("\nDoble de X= "+(X*2)+"\nDoble Y= "+(Y*2)+"\nDoble N= "+(N*2)+"\nDoble M= "+(M*2));
		System.out.println("\nSuma de todas las variables = "+(X+Y+N+M));
		System.out.println("\nProducto con todas las variables = "+(X*Y*N*M));
	}

}
