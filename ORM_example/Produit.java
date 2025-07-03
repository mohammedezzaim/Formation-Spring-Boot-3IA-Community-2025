/**
 * @author Ezzaim Mohammed
 **/
public class Produit {
    private Integer id;

    private String nom;

    private Double prix;

    private Integer quantite;

    public Produit() {
    }

    public Produit(int id, String nom, Double prix, Integer quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Produit(String nom, Double prix, Integer quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "prix=" + prix +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                '}';
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

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
}
