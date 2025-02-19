
public class Pile {
    private int elements[];
    private int sommet;

    /**
     * Constructeur avec paramètre
     * @param i
     * prec : i > 0
     */
    public Pile(int i) {
        this.elements = new int[i];
        this.sommet = -1;
    }

    /**
     * Permet de savoir si la pile est vide
     * @return true si vide, false sinon
     */
    public boolean est_vide() {
        return this.sommet == -1;
    }

    /**
     * Permet de savoir si la pile est pleine
     * @return true si pleine, false sinon
     */
    public boolean est_plein() {
        return this.sommet == this.elements.length - 1;
    }

    /**
     * Empile un élément
     * @param i
     * prec : ! this.est_plein
     */
    public void empiler(int i) {
        this.sommet++;
        this.elements[this.sommet] = i;
    }

    /**
     * Permet de dépiler un élément de la pile
     * @return le sommet dépilé
     * prec : ! this.est_vide
     */
    public int depiler() {
        int val = this.elements[this.sommet];
        this.sommet--;
        return val;
    }

    /**
     * Renvoie le sommet de la pile
     * @return
     * prec : ! this.est_vide
     */
    public int sommet() {
        return this.elements[this.sommet];
    }

    /**
     * Vide la pile
     */
    public void vider() {
        this.sommet = - 1;
    }

}
