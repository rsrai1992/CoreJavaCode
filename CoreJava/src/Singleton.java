public class Singleton {
	//static variable of type Singleton
	public static Singleton single_instance = null;
	public String s;
	//private constructor restrict to this class itself
	private Singleton() {
		s = "Hi, I am String and part of singleton class";
	}
	// static method to create instance of Singleton class
	public static Singleton getInstance() {
		if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
	}

}
