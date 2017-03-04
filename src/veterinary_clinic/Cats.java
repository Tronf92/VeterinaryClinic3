package veterinary_clinic;

public class Cats implements ICats{
	int ID,age,weight;
	String Description;
	Address an_adress;
	

	public String getAge() {
		String age_ = Integer.toString(age);
		return age_;
	}

	public String getWeight() {
		String weight_ = Integer.toString(weight);
		return weight_;
	}

	public String getDescription() {
		return Description;
	}

	public String getAddress() {
		String adres = an_adress.toString();
		return adres;
	}

	public void setID(int id) {
		ID = id;
	}

	public void setAge(int age_) {
		age = age_;
	}

	public void setWeight(int weight_) {
		weight = weight_;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void setAddress(Address address) {
		an_adress = address;	
	}

	public int getID() {
		return ID;
	}
	
	public String toString(){
		return "Cat ID: " + ID + " age: " + age + " weight: " + weight + " description: " + 
				Description + " address: " + an_adress.toString();
	}

}
