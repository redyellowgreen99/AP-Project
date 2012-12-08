
public class HidingPlace {
	
	String place;
	String name;
	
	public HidingPlace(String place, String name)
	{
		this.place = place;
		this.name = name;
	}
	public HidingPlace(String place)
	{
		this.place = place;
	}
	public String getName()
	{
		return place;
		
	}
	public String getHider()
	{
		return name;
		
	}
}
