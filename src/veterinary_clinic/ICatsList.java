package veterinary_clinic;

public interface ICatsList {
	void addCat(ICats catToAdd);
	String toString();
	String getCatById(int id);
	String getCatsFromAddress(Address adress);
}
