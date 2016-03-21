
package laporan_bab_3;


public class mainApotek {

    public static void main(String[] args) {
        Apotek a1 = new Apotek("Rexy");
        a1 = new Apotek("Rexy Marten", "Jl. M.T Haryono XII No.348,Malang ");
        a1.displayMessage();
        do {
            a1.menuApotek();
        } while (true);
    }
}

