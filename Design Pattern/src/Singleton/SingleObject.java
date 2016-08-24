package Singleton;

public class SingleObject {

	private static  SingleObject instance=new SingleObject();
	
	
	
	public static  SingleObject getinstance(){
		return instance;
	}
	
	public void print(){
		System.out.println("hello world");
	}

}
