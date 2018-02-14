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
    /**
   *
   * @element-type Specimen
   */
  public ArrayList  lesSpecimens;

}
