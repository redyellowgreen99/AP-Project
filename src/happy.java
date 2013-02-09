import java.util.ArrayList;

public class happy {
	public static void main(String[] args) {
		house House = new house(10);
		mansion Mansion = new mansion(13);
		hut Hut = new hut(1324387);
		archersHouse ArchersHouse = new archersHouse(3);
		rushersHouse RushersHouse = new rushersHouse(9000);
		cave Cave = new cave(123456789);
		pvpersHouse PvPersHouse = new pvpersHouse(100);

		ArrayList<house> houses = new ArrayList<house>();
		houses.add(Mansion);
		houses.add(House);
		houses.add(Hut);
		houses.add(ArchersHouse);
		houses.add(RushersHouse);
		houses.add(Cave);
	    houses.add(PvPersHouse);

		System.out.println("House: " + House.getHeight());
		System.out.println("Mansion: " + Mansion.getHeight());
		System.out.println("Hut: " + Hut.getHeight());
		System.out.println("Archer's House: " + ArchersHouse.getHeight());
		System.out.println("Rusher's House: " + RushersHouse.getHeight());
		System.out.println("Cave: " + Cave.getHeight());
		System.out.println("PvPer's House: " + PvPersHouse.getHeight());

		average(houses);
	}

	public static int average(ArrayList<house> houses) {
		int added = 0;
		for (int i = 0; i < houses.size(); i++) {
			added += houses.get(i).getHeight();
		}
		System.out.println("Average: " + added / houses.size());
		return added / houses.size();
	}

}
