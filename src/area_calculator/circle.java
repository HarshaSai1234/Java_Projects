package area_calculator;

public class circle extends shape {
	double radius;
	circle(double radius){
		this.radius=radius;
	}
	@Override
	void area() {
		super.area();
		System.out.println("Area of circle : "+(3.14*radius*radius));
	}
}
