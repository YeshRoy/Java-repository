package snippet;

public class Snippet {
		public abstract void start();
	
		public abstract void accelarate();
	
		public abstract void brake();
	
		default void gps() {
			System.out.println("GPS is running ");
		}
	}
	
}

