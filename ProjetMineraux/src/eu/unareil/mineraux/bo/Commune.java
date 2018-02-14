package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class Commune {

private Integer id;
private String nom;
private Integer codePostal;
private Pays lePays;
private ArrayList <Gite>  lesGites= new ArrayList<>();


public Commune(Integer id, String nom, Integer codePostal, Pays lePays) {
	this.setId(id);
	this.setNom(nom);
	this.setCodePostal(codePostal);
	this.setLePays(lePays);
}

public Commune(String nom, Integer codePostal, Pays lePays) {
	this(null, nom, codePostal, lePays);
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
public Integer getCodePostal() {
	return codePostal;
}
public void setCodePostal(Integer codePostal) {
	this.codePostal = codePostal;
}
public Pays getLePays() {
	return lePays;
}
public void setLePays(Pays lePays) {
	this.lePays = lePays;
}
public ArrayList<Gite> getLesGites() {
	return lesGites;
}
public void setLesGites(ArrayList<Gite> lesGites) {
	this.lesGites = lesGites;
}
public void ajouteGite(Gite unGite)
{
	this.lesGites.add(unGite);
}
public void supprimeGite(Gite unGite)
{
	this.lesGites.remove(unGite);
}
}
