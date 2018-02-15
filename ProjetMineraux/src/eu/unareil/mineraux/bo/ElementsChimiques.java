package eu.unareil.mineraux.bo;


public class ElementsChimiques {

  private Integer id;

  private String nom;

  private String symbole;

  private Integer numAtomique;

  private Float masseAtomique;

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

public String getSymbole() {
	return symbole;
}

public void setSymbole(String symbole) {
	this.symbole = symbole;
}

public Integer getNumAtomique() {
	return numAtomique;
}

public void setNumAtomique(Integer numAtomique) {
	this.numAtomique = numAtomique;
}

public Float getMasseAtomique() {
	return masseAtomique;
}

public void setMasseAtomique(Float masseAtomique) {
	this.masseAtomique = masseAtomique;
}

@Override
public String toString() {
	return "elementsChimiques [id=" + id + ", nom=" + nom + ", symbole=" + symbole + ", numAtomique=" + numAtomique
			+ ", masseAtomique=" + masseAtomique + "]";
}



}
