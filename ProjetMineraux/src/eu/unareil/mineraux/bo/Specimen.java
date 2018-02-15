package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class Specimen {

  private Integer id;

  private Double longueur;

  private Double largeur;

  private Double hauteur;

  private Double poids;

  private String commentaire;

  private String urlImage;

    private Mineral unMineral;
    private Ressentie unRessenti;
    private Gite leGite;

    /**
   *
   * @element-type Couleur
   */
  private ArrayList<Couleur>  lesCouleurs=new ArrayList<>();
    /**
   *
   * @element-type elementsChimiques
   */
  private ArrayList <ElementsChimiques>  lesElementsChimiques=new ArrayList<>();
      /**
   *
   * @element-type Experience
   */
  private ArrayList  <Experience> lesExperiences=new ArrayList<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getLongueur() {
		return longueur;
	}
	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}
	public Double getLargeur() {
		return largeur;
	}
	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}
	public Double getHauteur() {
		return hauteur;
	}
	public void setHauteur(Double hauteur) {
		this.hauteur = hauteur;
	}
	public Double getPoids() {
		return poids;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public Mineral getUnMineral() {
		return unMineral;
	}
	public void setUnMineral(Mineral unMineral) {
		this.unMineral = unMineral;
	}
	public Ressentie getUnRessenti() {
		return unRessenti;
	}
	public void setUnRessenti(Ressentie unRessenti) {
		this.unRessenti = unRessenti;
	}
	public Gite getLeGite() {
		return leGite;
	}
	public void setLeGite(Gite leGite) {
		this.leGite = leGite;
	}
	public ArrayList<Couleur> getLesCouleurs() {
		return lesCouleurs;
	}
	public void setLesCouleurs(ArrayList<Couleur> lesCouleurs) {
		this.lesCouleurs = lesCouleurs;
	}
	public ArrayList<ElementsChimiques> getLesElementsChimiques() {
		return lesElementsChimiques;
	}
	public void setLesElementsChimiques(ArrayList<ElementsChimiques> lesElementsChimiques) {
		this.lesElementsChimiques = lesElementsChimiques;
	}
	public ArrayList<Experience> getLesExperiences() {
		return lesExperiences;
	}
	public void setLesExperiences(ArrayList<Experience> lesExperiences) {
		this.lesExperiences = lesExperiences;
	}
	@Override
	public String toString() {
		return "Specimen [id=" + id + ", longueur=" + longueur + ", largeur=" + largeur + ", hauteur=" + hauteur
				+ ", poids=" + poids + ", commentaire=" + commentaire + ", urlImage=" + urlImage + ", unMineral="
				+ unMineral + ", unRessenti=" + unRessenti + ", leGite=" + leGite + ", lesCouleurs=" + lesCouleurs
				+ ", lesElementsChimiques=" + lesElementsChimiques + ", lesExperiences=" + lesExperiences + "]";
	}
  
  

}
