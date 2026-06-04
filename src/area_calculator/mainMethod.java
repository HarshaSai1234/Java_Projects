package area_calculator;

public class mainMethod {
	public static void main(String[] args) {
		shape c = new circle(10.0);
		shape r = new rectangle(10.0,5.0);
		shape t = new triangle(10.0,5.0);
		
		c.area();
		r.area();
		t.area();
	}
}
