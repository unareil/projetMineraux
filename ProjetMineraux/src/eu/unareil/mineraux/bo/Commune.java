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

public Commune(String nom, Integer codePostal) {
	this(null, nom, codePostal, null);
}

@Override
public String toString() {
	StringBuffer bf= new StringBuffer();
	if (getNom()==null)
	{
		return "commune non définie pour le moment";
	}
	else
	{
	bf.append("Commune [");
	if (getId()!=null)
		{
		bf.append("id=" + getId()+",");
		}
	bf.append("nom=" + getNom() + ", code postal=" + getCodePostal());
	if (getLePays()!=null)
		{
		bf.append(",pays =" + getLePays());
		}
	if (getLesGites().size()>0)
		{
		if (getLesGites().size()==1)
			{
			bf.append(",le gite=");
			}
		else
			{
			bf.append(",les gites=");
			}
		for(Gite leGite :getLesGites())
			{
			bf.append(leGite);
			}
		}
	bf.append("]");
	return bf.toString();
	}
}

public Commune(String nom, Integer codePostal, Pays lePays) {
	this(null, nom, codePostal, lePays);
}

public Commune() {
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
