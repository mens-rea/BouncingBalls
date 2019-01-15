public class Ball{
	 
	// Ball Size
	float radius = 10; 
	float diameter = radius * 2;
	 
	// Center of Call
	float X = radius + 50;
	float Y = radius + 20;
	 
	// Direction
	float dx = 3;
	float dy = 3;
	
	// default constructor
	public Ball(){}

	public Ball(float rad){
		this.radius = rad;
	}
}