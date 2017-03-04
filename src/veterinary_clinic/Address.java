package veterinary_clinic;

public class Address {
	String Name,Surname,Phone;
	
	public void SetName(String name){
		Name = name;
	}
	
	public void SetSurname(String surname){
		Surname = surname;
	}
	
	public void SetPhone(String phone){
		Phone = phone;
	}
	
	public String toString(){
		return "Name: " + Name + " surname: " + Surname + " Phone: " + Phone.toString();
	}
}
