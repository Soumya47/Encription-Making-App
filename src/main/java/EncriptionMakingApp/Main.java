package EncriptionMakingApp;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today";
	    int offset = 12; 
		
		EncriptionMakingApp encriptionMakingApp = new EncriptionMakingApp();
		
		String encriptedMessage =encriptionMakingApp.makingApp(message, offset);
		
		System.out.println("Message: "+ message);
		System.out.println("Offset : "+ offset);
		System.out.println("Encripted message: "+ encriptedMessage); 
	}

}
