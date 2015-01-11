package lab4.exercise1;

public class NegativeExponentException extends RuntimeException{
	public NegativeExponentException(){
		super ();
	}
	public NegativeExponentException(String msg){
		super (msg);
	}
}
