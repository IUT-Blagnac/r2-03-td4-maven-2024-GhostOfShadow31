public class Main {
    public static void main(String[] args) {
        // Dépiler et empiler
        Pile maPile = new Pile(10);
        if (!maPile.est_vide())
            System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide())
            System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide())
            System.out.println("NOK");
        if (element != 5)
            System.out.println("NOK");

        // est_pleine
        Pile maPile2 = new Pile(2);
        maPile2.empiler(5);
        maPile2.empiler(5);
        if (!maPile2.est_plein())
            System.out.println("NOK");

        // Sommet
        Pile maPile3 = new Pile(2);
        maPile3.empiler(5);
        if (maPile3.sommet() != 5)
            System.out.println("NOK");
        
        // Vider et est_vide
        Pile maPile4 = new Pile(1);
        maPile4.empiler(5);
        maPile4.vider();
        if (!maPile4.est_vide()) System.out.println("NOK");

        System.out.println("OK");
    }
}