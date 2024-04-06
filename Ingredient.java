package pizzaRestaurant;
import java.util.*;
interface shape {
void area1();
void type();
}
interface payment{
	void onlinePay(double o,double p2,double p3,double mj,int j);
	void cashonPay(double r,double p2,double p3,int cd,double c);
}

public class Ingredient {
	Scanner sc=new Scanner(System.in);
	//Ingredients have these attributes
	private String description;
	public Ingredient(Scanner sc, String description, int calories, double r) {
		super();
		this.sc = sc;
		this.description = description;
		this.calories = calories;
		this.r = r;
	}
	//private Money cost;
	private int calories;
	//private Color myColor;
	//private String colorName;
	public double r;
	//Default constructor
	public Ingredient() {}
	
	//Constructor that is passed description, cost and calories
	public Ingredient(String description, int calories) {
		setDescription(description);
		//setCost(cost);
		setCalories(calories);
	}

	private void setCalories(int c) {
		calories=c;
		
	}

	
	
	public void setDescription(String d)
	{
		description = d;
	}
	protected double area(double r)
	{
		double area=3.14*r*r;
		return area;
	}
	protected int NumberOfPizza (){
		System.out.println("Enter number of pizza");
		int np=sc.nextInt();
		//System.out.println("So total price of pizza is "+np*sr);
		return np;
	}
	
	}