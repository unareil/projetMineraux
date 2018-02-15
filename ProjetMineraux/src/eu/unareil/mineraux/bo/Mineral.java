package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class Mineral {

  private Integer id;

  private Integer nom;

  private Integer habitus;

  private Integer dureteDeb;

  private Integer dureteFin;

  private Double densiteDeb;

  private Double densiteFin;

  private String clivage;

  private String cassure;

  private String couleur;

  private String trace;

  private String eclat;

  private String compositionChimique;

    private SystemeCristallin leSystemeCrystallin;
    private Groupe leGroupe;

  private ArrayList <Specimen>  lesSpecimens=new ArrayList<>();

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getNom() {
	return nom;
}

public void setNom(Integer nom) {
	this.nom = nom;
}

public Integer getHabitus() {
	return habitus;
}

public void setHabitus(Integer habitus) {
	this.habitus = habitus;
}

public Integer getDureteDeb() {
	return dureteDeb;
}

public void setDureteDeb(Integer dureteDeb) {
	this.dureteDeb = dureteDeb;
}

public Integer getDureteFin() {
	return dureteFin;
}

public void setDureteFin(Integer dureteFin) {
	this.dureteFin = dureteFin;
}

public Double getDensiteDeb() {
	return densiteDeb;
}

public void setDensiteDeb(Double densiteDeb) {
	this.densiteDeb = densiteDeb;
}

public Double getDensiteFin() {
	return densiteFin;
}

public void setDensiteFin(Double densiteFin) {
	this.densiteFin = densiteFin;
}

public String getClivage() {
	return clivage;
}

public void setClivage(String clivage) {
	this.clivage = clivage;
}

public String getCassure() {
	return cassure;
}

public void setCassure(String cassure) {
	this.cassure = cassure;
}

public String getCouleur() {
	return couleur;
}

public void setCouleur(String couleur) {
	this.couleur = couleur;
}

public String getTrace() {
	return trace;
}

public void setTrace(String trace) {
	this.trace = trace;
}

public String getEclat() {
	return eclat;
}

public void setEclat(String eclat) {
	this.eclat = eclat;
}

public String getCompositionChimique() {
	return compositionChimique;
}

public void setCompositionChimique(String compositionChimique) {
	this.compositionChimique = compositionChimique;
}

public SystemeCristallin getLeSystemeCrystallin() {
	return leSystemeCrystallin;
}

public void setLeSystemeCrystallin(SystemeCristallin leSystemeCrystallin) {
	this.leSystemeCrystallin = leSystemeCrystallin;
}

public Groupe getLeGroupe() {
	return leGroupe;
}

public void setLeGroupe(Groupe leGroupe) {
	this.leGroupe = leGroupe;
}

public ArrayList<Specimen> getLesSpecimens() {
	return lesSpecimens;
}

public void setLesSpecimens(ArrayList<Specimen> lesSpecimens) {
	this.lesSpecimens = lesSpecimens;
}

@Override
public String toString() {
	return "Mineral [id=" + id + ", nom=" + nom + ", habitus=" + habitus + ", dureteDeb=" + dureteDeb + ", dureteFin="
			+ dureteFin + ", densiteDeb=" + densiteDeb + ", densiteFin=" + densiteFin + ", clivage=" + clivage
			+ ", cassure=" + cassure + ", couleur=" + couleur + ", trace=" + trace + ", eclat=" + eclat
			+ ", compositionChimique=" + compositionChimique + ", leSystemeCrystallin=" + leSystemeCrystallin
			+ ", leGroupe=" + leGroupe + ", lesSpecimens=" + lesSpecimens + "]";
}
  

}
