package veterinary_clinic;

public interface ICats {
	int getID();
	String getAge();
	String getWeight();
	String getDescription();
	String getAddress();
	void setID(int id);
	void setAge(int age_);
	void setWeight(int weight_);
	void setDescription(String description);
	void setAddress(Address address);
	String toString();
	
}
