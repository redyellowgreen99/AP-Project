import java.util.ArrayList;


public class HaciendaBuilding {
	
	HidingPlace[] hidingPlace = new HidingPlace[]{new HidingPlace("in the garage", "macky"), new HidingPlace("in the trash"), new HidingPlace("on the roof", "max")};
	ArrayList<HidingPlace> hidingPlaceList = new ArrayList<HidingPlace>();
	
public HidingPlace[] initializeOldSchoolArrayOfLocations()
{
	HidingPlace[] hidingPlace = new HidingPlace[]{new HidingPlace("in the garage", "macky"), new HidingPlace("in the trash"), new HidingPlace("on the roof", "max")};
	return hidingPlace;
}
public ArrayList<HidingPlace> initializeArrayListOfLocations()
{
	hidingPlaceList.add(new HidingPlace("in the cabient"));
	hidingPlaceList.add(new HidingPlace("under the table"));
	hidingPlaceList.add(new HidingPlace("behind the tv"));
	return hidingPlaceList;	
}
public void setHidingPlaces(HidingPlace[] hideOuts)
{
	hidingPlace = hideOuts;
}
public int findMax()
{
	for (int i = 0; i < hidingPlace.length; i++) {
		if (hidingPlace[i].getHider() != null) {
			if (hidingPlace[i].getHider() == "max") {
				return i;
			}
		}
	}
	return -1;
}
public int findMacky()
{
	for (int i = 0; i < hidingPlace.length; i++) {
		if (hidingPlace[i].getHider() != null) {
			if (hidingPlace[i].getHider() == "macky") {
				return i;
			}
		}
	}
	return -1;
}
public void setHidingPlaces(ArrayList<HidingPlace> hideOuts)
{
	hidingPlaceList = hideOuts;
}
public boolean isMilenaHere()
{
	for (int i = 0; i < hidingPlaceList.size(); i++) {		
		hidingPlaceList.get(i);
		if (hidingPlaceList.get(i).getHider() != null) {
			if (hidingPlaceList.get(i).getHider() == "milena") {
				return true;
			}
		}
	}
	return false;
}
public boolean isMaxHere()
{
	for (int i = 0; i < hidingPlaceList.size(); i++) {		
		hidingPlaceList.get(i);
		if (hidingPlaceList.get(i).getHider() != null) {
			if (hidingPlaceList.get(i).getHider() == "max") {
				return true;
			}
		}
	}
	return false;
}
public boolean isMackyHere()
{
	for (int i = 0; i < hidingPlaceList.size(); i++) {		
		hidingPlaceList.get(i);
		if (hidingPlaceList.get(i).getHider() != null) {
			if (hidingPlaceList.get(i).getHider() == "macky") {
				return true;
			}
		}
	}
	return false;
}
}
