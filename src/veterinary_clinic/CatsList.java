package veterinary_clinic;

public class CatsList implements ICatsList {
	private ICats[] cat = new ICats[100];
	private int nrOfCats = 0;
	
	public void addCat(ICats catToAdd) {
		for (int i=0;i < nrOfCats;i++){
			if(catToAdd.getID() == cat[i].getID()){
				System.out.println("Cat already registered!");
				return;
			}
		}
		cat[nrOfCats] = catToAdd;
		nrOfCats +=1;
		
	}
	
	public String toString(){
		String string = "";
		for (int i=0;i< nrOfCats; i++){
			string += cat[i].toString() + System.lineSeparator();
		}
		return string;
	}

	public String getCatById(int id) {
		String cats="";
		for (int i=0;i<nrOfCats;i++){
			if(cat[i].getID()==id){
				cats += cat[i].toString();
			}
		}
		return cats;
	}

	public String getCatsFromAddress(Address adress) {
		String cats = "";
		for (int i=0;i<nrOfCats;i++){
			if(adress.toString()==cat[i].getAddress()){
				cats += cat[i].toString() + System.lineSeparator();
			}
		}
		if (cats == ""){
			cats += "No cats at this address: " + adress.toString();
		}
		return cats;
	}
	
}
