class Reader extends Thread {
	Buffer b;
	public void run() {
		 char x;
		 String output = "Um consumidor("+this.getName().toString()+") pegou uma coleção de produtos: ";
		 while ((x = b.get()) != ' ')
			 output += x;
		 System.out.println(output);
		 System.out.print("\n");
	}
	 
	Reader(Buffer b) {
		this.b = b;
		System.out.println("Um novo consumidor(" + this.getName() + ") nasceu.");
	}
} 