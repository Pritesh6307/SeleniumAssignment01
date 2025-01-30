package seleniumtraining;


class InvalidNameException extends Exception{
	InvalidNameException(String msg){
		System.out.println(msg);
	}
	
}
public class CustomException {

	String name = "Pritesh";
	public static void main(String[] args) throws InvalidNameException {
		name("Pritesh");

	}
	public static void name(String name) throws InvalidNameException {
		if (name.equals("Pritesh")) {
			System.out.println("Name");
				
		}else {
			throw new InvalidNameException("Invalid Name Exception");
			
		}
	}

}
