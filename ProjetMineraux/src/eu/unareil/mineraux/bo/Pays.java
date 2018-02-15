package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class Pays {

  public Integer id;

  public String nom;

  private ArrayList <Commune> lesCommunes=new ArrayList<>();

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

public ArrayList<Commune> getLesCommunes() {
	return lesCommunes;
}

public void setLesCommunes(ArrayList<Commune> lesCommunes) {
	this.lesCommunes = lesCommunes;
}

@Override
public String toString() {
	return "Pays [id=" + id + ", nom=" + nom + ", lesCommunes=" + lesCommunes + "]";
}
  

}
