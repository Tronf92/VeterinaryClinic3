package veterinary_clinic;

import java.util.Random;


public class Main {
	public static void main(String[] args) {
		CatsList a= new CatsList();
		
		for (int i = 0; i <= 10; i++)
		{
			Cats cat = new Cats();
			cat.setID(i);
			cat.setAge(1);
			cat.setDescription("long description for cat");
			Address ad = new Address();
			ad.SetName("name");
			ad.SetSurname("surname");
			ad.SetPhone("0123456789");
			cat.setAddress(ad);
			a.addCat(cat);
			//System.out.println(cat);
			
		}
		for (int i = 11; i <= 20; i++)
		{
			Cats cat = new Cats();
			cat.setID(i);
			cat.setAge(1);
			cat.setDescription("long description for cat");
			Address ad = new Address();
			ad.SetName("surname");
			ad.SetSurname("name");
			ad.SetPhone("9876543210");
			cat.setAddress(ad);
			a.addCat(cat);
			//System.out.println(cat);
			
		}
		System.out.println(a.getCatById(5));
		System.out.println(a.getCatById(11));
		Address ad = new Address();
		ad.SetName("surname");
		ad.SetSurname("name");
		ad.SetPhone("9876543210");
		System.out.println(a.getCatsFromAddress(ad));
		
	}
}
	
