public class Liste {
    int val;
    Liste suivant;
    Liste(int v , Liste x) {
        val = v;
        suivant = x;
    }
    public void getNextSuivant() {
        suivant = suivant.suivant;
    }
}
