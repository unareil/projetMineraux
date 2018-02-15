package eu.unareil.mineraux.bo;
import java.util.ArrayList;

public class Groupe {

  private Integer id;

  private String nom;

  private String commentaire;
  private ArrayList<Mineral>  lesMineraux=new ArrayList<>();
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
public String getCommentaire() {
	return commentaire;
}
public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
}
public ArrayList <Mineral>getLesMineraux() {
	return lesMineraux;
}
public void setLesMineraux(ArrayList<Mineral> lesMineraux) {
	this.lesMineraux = lesMineraux;
}
@Override
public String toString() {
	return "Groupe [id=" + id + ", nom=" + nom + ", commentaire=" + commentaire + ", lesMineraux=" + lesMineraux + "]";
}
  

}
