package area_calculator;

public class rectangle extends shape {
	double length;
	double breadth;
	rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	void area() {
		super.area();
		System.out.println("Area od rectangle is : "+(length*breadth));
	}
}
