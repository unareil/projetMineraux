package eu.unareil.mineraux.bo;

public class Couleur {

  private Integer id;

  private String nom;
  
  private Integer frequenceDebut;

  private Integer frequenceFin;



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

public Integer getFrequenceDebut() {
	return frequenceDebut;
}

public void setFrequenceDebut(Integer frequenceDebut) {
	this.frequenceDebut = frequenceDebut;
}

public Integer getFrequenceFin() {
	return frequenceFin;
}

public void setFrequenceFin(Integer frequenceFin) {
	this.frequenceFin = frequenceFin;
}

  @Override
public String toString() {
	return "Couleur [id=" + getId() + ", nom=" + getNom() + ", frequenceDebut=" + getFrequenceDebut() + ", frequenceFin="
			+ getFrequenceFin() + "]";
}

}
