package example4;

public class globalvariable {
    /**variabletype**/
	//global variable
	double b=15,h=2.5,pie=3.142;
	static int B=34,H=10;
	public static void main(String[] args) {
		System.out.println("program start");
		//local variable
		double result;
		System.out.println("#area of triangle");
		result=0.5*B*H;
		System.out.println("SGV B :" +B);
		System.out.println("SGV H :" +H);
		System.out.println("LV result :" +result);
		System.out.println("#area of circle");
		globalvariable ref=new globalvariable();
		result=ref.pie*ref.b*ref.b;
        System.out.println("NGV here b reffers to r :" + ref.b);
		System.out.println("NGV here pie:" + ref.pie);
		System.out.println("LV result : " +result);
		
		System.out.println("#area of square");
		globalvariable ref2=new globalvariable();
		result=ref2.h*ref2.h;
		System.out.println("NGV here h reffers to a :" +ref2.h);
		System.out.println("LV result :" +result);
		System.out.println("program end");
		
		
		
		
		
		
		

	}

}
