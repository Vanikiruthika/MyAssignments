package week3.day1.classroom;

public interface Plan {
	
	/**
	 * This is a plan to build a house of 1800 sqft
	 * @author Vanikiruthika
	 * @Param numbers -. no of bedrooms and balconies house should have. 
	 */
	int landsizesqft=1800;
	String name="Seven Wonders";
	String[] flats= {"F1","F2","S1","S2"};

	/** buildBedrooms() method to build bedrooms
	 * it has 3 bedrooms with 3 wardrobes and 3 attached bathrooms 
	 * 2 bedrooms of east facing and 1 bedroom of north facing
	 * @author Vanikiruthika
	 */
	public void buildBedrooms(int numbers);
	 /** buildBalcony() method to build balconies
	  * it has 2 balconies
	  * 1 balcony attached to east facing bedroom
	  * 1 balcony attached to kitchen as service balcony
	  * @author Vanikiruthika
	  */

	public void buildBalcony();
	/**
	 * it has 1 car parking
	 * @author Vanikiruthika
	 */
	public void buildParking();
	
	

}
