package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class Gite {

  private Integer id;

  private String nom;

  private Double gpsLat;

  private Double gpsLong;

    private Commune laCommune;

  private ArrayList <Specimen> lesSpecimens=new ArrayList<>();
  

public Gite(Integer id, String nom, Double gpsLat, Double gpsLong, Commune laCommune) {
	this.setId(id);
	this.setNom(nom);
	this.setGpsLat(gpsLat);
	this.setGpsLong(gpsLong);
	this.setLaCommune(laCommune);
}



public Gite(String nom, Double gpsLat, Double gpsLong, Commune laCommune) {
	this.nom = nom;
	this.gpsLat = gpsLat;
	this.gpsLong = gpsLong;
	this.laCommune = laCommune;
}



public Gite() {
	super();
	// TODO Auto-generated constructor stub
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Double getGpsLat() {
	return gpsLat;
}

public void setGpsLat(Double gpsLat) {
	this.gpsLat = gpsLat;
}

public Double getGpsLong() {
	return gpsLong;
}

public void setGpsLong(Double gpsLong) {
	this.gpsLong = gpsLong;
}

public Commune getLaCommune() {
	return laCommune;
}

public void setLaCommune(Commune laCommune) {
	this.laCommune = laCommune;
}

public ArrayList<Specimen> getLesSpecimens() {
	return lesSpecimens;
}

public void setLesSpecimens(ArrayList<Specimen> lesSpecimens) {
	this.lesSpecimens = lesSpecimens;
}
@Override
public String toString() {
	if (getNom()==null)
	{
		return "gite non définie pour le moment";
	}
	else
	{
		StringBuffer bf=new StringBuffer();
		bf.append("Gite [");
		if (getId()!=null)
		{
			bf.append("id=" + getId()+", ");
		}
		bf.append("nom=" + getNom()+"latitude()=" + getGpsLat() + ", longitude"+ getGpsLong());
		//return "Gite [getId()=" + getId() + ", getNom()=" + getNom() + ", getGpsLat()=" + getGpsLat() + ", getGpsLong()="
			//	+ getGpsLong() + ", getLaCommune()=" + getLaCommune() + ", getLesSpecimens()=" + getLesSpecimens() + "]";
		return bf.toString();
	}
}

}
