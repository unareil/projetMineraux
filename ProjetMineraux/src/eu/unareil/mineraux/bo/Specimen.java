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
    public ArrayList  myCommune;
    private Ressentie unRessenti;
    private Gite leGite;
    public ArrayList  myExperience;
    public ArrayList  myelementsChimiques;
    /**
   *
   * @element-type Couleur
   */
  private ArrayList  lesCouleurs;
    /**
   *
   * @element-type elementsChimiques
   */
  private ArrayList  lesElementsChimiques;
      /**
   *
   * @element-type Experience
   */
  private ArrayList  lesExperiences;

}
