package eu.unareil.mineraux.bo;

public class TestBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commune maCom= new Commune("Nantes",44300);
		Gite unGite= new Gite();
		maCom.ajouteGite(unGite);
		System.out.println(maCom);
		System.out.println("fait oups ...");

	}

}
