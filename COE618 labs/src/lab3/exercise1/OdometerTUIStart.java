package lab3.exercise1;

public class OdometerTUIStart {
	
	public static void main(String[] args){
		int numOfTimes = 999;
		int numOfTimes1 = 815;
		Odometer o = new Odometer(15);//size 4
		for (int i = 0 ;i<numOfTimes;i++){ //increment numOfTimes times
			o.increment();
		}
		System.out.println(o);

		for (int i = 0 ;i<numOfTimes1;i++){ //decrement numOfTimes1 times
			o.decrement();
		}
		System.out.println(o);
	}

}
