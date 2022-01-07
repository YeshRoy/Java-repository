package accessmodifier;

public class AccessmodifierExample {

	public void getPublic() {
		System.out.println("Public method");
	}

	protected void getprotected() {
		System.out.println("protected method");
	}

	void getdefault() {
		System.out.println("Default method");
	}

	private void getPrivate() {
		System.out.println("Private method");
		
	}
	public static void main(String[] args) {
		AccessmodifierExample accessmodifierExample= new AccessmodifierExample();
		accessmodifierExample.getPublic();
		accessmodifierExample.getprotected();
		accessmodifierExample.getdefault();
		accessmodifierExample.getPrivate();
	}

}
