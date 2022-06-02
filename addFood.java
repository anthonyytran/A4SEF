import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 

class TestAddFood {
	
	
	//Checking Functions with valid constraints
	void testCase1AddFood() {
		food testCase1Data1 = new food ("1", "Pizza slice", "Large Slice of Pepperoni Pizza", 5, 400, "Italian");
		assertEquals ("The food was added successfully", testCase1Data1.addFood());
		
		food testCase1Data2 = new food ("2", "Kebab", "Lamb Kebab with the lot", 10, 1000, "Turkish");
		assertEquals ("The food was added successfully", testCase1Data2.addFood());
		
		food testCase1Data3 = new food ("3", "Spaghetti", "Homemade Spaghetti Bolognese with special sauce", 15, 400, "Italian");
		assertEquals ("The food was added successfully", testCase1Data3.addFood());
		
		food testCase1Data4 = new food ("4", "Ice Cream", "Delicious and creamy Chocolate Ice Cream", 10, 600, "Dessert");
		assertEquals ("The food was added successfully", testCase1Data4.addFood());
	}
	
	//Checking Functions with invalid food name
	void testCase2AddFood() {
		food testCase2Data1 = new food ("5", "Chip", "Red Rock Deli Potato Chips", 5, 400, "Snacks");
		assertEquals ("The food name must be between 5 and 30 characters.", testCase2Data1.addFood());
	}
	
	//Checking Functions with invalid food description
	void testCase3AddFood() {
		food testCase3Data1 = new food ("6", "Fried Chicken", "", 10, 800, "Fried");
		assertEquals ("The food description must be between 5 and 50 words.", testCase3Data1.addFood());
	}
	
	//Checking functions with invalid caloric amount
	void testCase4AddFood() {
		food testCase4Data1 = new food ("7", "Steak", "Porterhouse steak with sides", 50, 2000, "Mains");
		assertEquals ("The food The food calories cannot exceed 1500 calories.", testCase4Data1.addFood());
		
	//Checking functions with invalid price
	void testCase5AddFood() {
		food testCase5Data1 = new food ("8", "Tomato Sauce", "Master Foods Tomato Sauce Satchet", 0.5, 100, "Sauce");
		assertEquals ("The food The food calories cannot exceed 1500 calories.", testCase5Data1.addFood());
	}
}
