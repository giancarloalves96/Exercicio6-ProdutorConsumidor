public class Main {
	
	 public static void main(String args[]) {
		 Buffer b = new Buffer();
		
		 Writer w1 = new Writer("C:\\Users\\Giancarlo\\workspace\\CES-22 - Lab 06\\src\\entry1.txt",b);
		 Writer w2 = new Writer("C:\\Users\\Giancarlo\\workspace\\CES-22 - Lab 06\\src\\entry2.txt",b);
		 Writer w3 = new Writer("C:\\Users\\Giancarlo\\workspace\\CES-22 - Lab 06\\src\\entry3.txt",b);
		 
		 Reader r1 = new Reader(b);
		 Reader r2 = new Reader(b);
		 Reader r3 = new Reader(b);
		 
		 w1.start();
		 w2.start();
		 w3.start();
		 r1.start();
		 r2.start();
		 r3.start();
	 }
}