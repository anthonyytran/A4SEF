import java.util.StringTokenizer; 
public class food {
	
	private String foodID;
	private String foodName;
	private String foodDescription;
	private double foodPrice;
	private int foodCalorie;
	private String foodType;
	
	public food (String ID, String Name, String Description, double Price, int Calorie, String Type)
	{
		
		foodID=ID;
		foodName=Name;
		foodDescription=Description;
		foodPrice=Price;
		foodCalorie=Calorie;
		foodType=Type;		
	}
	
	public String addFood ()
	{
		//If the food name isn't between 5 and 30 characters, an erorr message would be shown. 
		if (foodName.length() <5 || >30) {
			return "The food name must be between 5 and 30 characters.";
	}
		//If the food description isn't between 5 and 50 words, an error message is shown.
		int countWord= countWordFoodDescription (foodDescription);
		if (countWord <5 || countWord >50) {
			return "The food description must be between 5 and 50 words.";		
	}
		//If the food calories exceeds 1500 calories, an error message is shown.
		if (foodCalorie() >1500) {
			return "The food calories cannot exceed 1500 calories.";
		}
		//If the food price isn't between $5 and $1000, an error message is shown.
		if (foodPrice() <5 || >1000) {
			return "The food price must be between $5 and $1000.";
		//If everything is within the constraints, the food is added successfully. 
		return "The food was added successfully.";
}

	public int countWordFoodDescription (String food_Description) 
    { 
  StringTokenizer stringTokenizer1 = new StringTokenizer(food_Description); 
  return  stringTokenizer1.countTokens(); 
    } 
} 