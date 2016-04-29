class Reader extends Thread {
	Buffer b;
	public void run() {
		 char x;
		 String output = "The consumer "+this.getName().toString()+" got a collection:";
		 while ((x = b.get()) != ' ')
			 output += x;
		 System.out.println(output);
		 System.out.print("\n");
	}
	 
	Reader(Buffer b) {
		this.b = b;
		System.out.println("A new consumer " + this.getName() + " was born.");
	}
} 