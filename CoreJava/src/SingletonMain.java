public class SingletonMain {

	public static void main(String []args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		System.out.println("Sting of x : "+x.s);
		System.out.println("Sting of y : "+y.s);
		System.out.println("Sting of z : "+z.s);
		
		x.s = x.s.toUpperCase();
		
		System.out.println("Sting of x : "+x.s);
		System.out.println("Sting of y : "+y.s);
		System.out.println("Sting of z : "+z.s);
		
		z.s = z.s.toLowerCase();
		
		System.out.println("Sting of x : "+x.s);
		System.out.println("Sting of y : "+y.s);
		System.out.println("Sting of z : "+z.s);
	}
}
