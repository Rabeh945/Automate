//Rabeh Khe G:4 B
public class Automate {
    public int q0;
    Liste[][] delta;
    Liste finaux;
    Automate(int q, Liste f,Liste [][]d){
        q0 =q;
        delta = d;
        finaux = f;
    }
    public void setQ0(int q0) {
        this.q0 = q0;
    }
    public void setFinaux(Liste finaux) {
        this.finaux = finaux;
    }
    public boolean estEtatFin(int a){
        return finaux.val == a;
    }
    public void afficher () {
        for (int i = q0; i <= finaux.val; i++) {
            for (int j = 0; j <= delta[0].length - 1; j++) {
                if(delta[i][j] != null) {
                    System.out.print(i+"\t");
                    System.out.print(delta[i][j].val+"\t");
                    if (delta[i][j].suivant != null) {
                        while (delta[i][j].suivant != null){
                            System.out.print(delta[i][j].suivant.val+"\t");
                            delta[i][j].getNextSuivant();
                        }
                    }
                    System.out.println(j);
                }
                if (estEtatFin(i)){
                    System.out.println(finaux.val);
                    break;
                }
            }
        }
    }
    public static void main(String [] args){
        Liste[][] delta = new Liste[100][100];
        delta[0][0] = new Liste(0, new Liste(1,null));
        delta[0][1] = new Liste(0,null);
        delta[1][0] = null;
        delta[1][1] = new Liste(2,null);
        Automate a = new Automate(0,new Liste(2,null),delta);
        a.setQ0(0);
        a.setFinaux(new Liste(2,null));
        a.afficher();
    }
}
