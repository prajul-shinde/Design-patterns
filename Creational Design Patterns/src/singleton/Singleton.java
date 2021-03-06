package singleton;

//Singleton class
public class Singleton {
	
	private static volatile Singleton instance=null;
	
	private Singleton() {
		
	}
	
	//double check ensures that only this particular block is locked 
	//if some another thread which tried to access getInstance then it will not get it
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
				
			}
			
		}
		return instance;
	}

}
