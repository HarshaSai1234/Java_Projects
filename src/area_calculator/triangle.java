package area_calculator;

public class triangle extends shape {
	double breadth;
	double height;
	triangle(double breadth,double height){
		this.breadth=breadth;
		this.height=height;
	}
	@Override
	void area() {
		super.area();
		System.out.println("Area od triangle : "+(0.5*breadth*height));
	}
}
