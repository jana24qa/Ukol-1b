import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String jmenoPrijmeni1 = "Jan Novak";
        String jmenoPrijmeni2 = "Tom Novotny";
        String jmenoPrijmeni3 = "Martin Novy";

        String datumNarozeni1 = "1.1.1970";
        String datumNarozeni2 = "2.2.1980";
        String datumNarozeni3 = "3.3.1990";

        int pocetSjednanychSmluv1 = 4759;
        int pocetSjednanychSmluv2 = 3687;
        int pocetSjednanychSmluv3 = 1258;

        int celkemProdanoVTunach1 = 858;
        int celkemProdanoVTunach2 = 796;
        int celkemProdanoVTunach3 = 447;

        String mestoProdejce1 = "Plzen";
        String mestoProdejce2 = "Pisek";
        String mestoProdejce3 = "Praha";

        String SPZProdejce1 = "1A1 0000";
        String SPZProdejce2 = "1A1 0001";
        String SPZProdejce3 = "1A1 0002";

        int spotrebaAutoNa100Km1 = 5;
        int spotrebaAutoNa100Km2 = 4;
        int spotrebaAutoNa100Km3 = 7;

        String IPAdresaPC1 = "192.168.48.39";
        String IPAdresaPC2 = "192.0.2.146";
        String IPAdresaPC3 = "192.158.1.38.";

        int MnozstviProdaneMrkveNa1Smlouvu1 = (858 * 1000) / 4759;
        int MnozstviProdaneMrkveNa1Smlouvu2 = (796 * 1000) / 3687;
        int MnozstviProdaneMrkveNa1Smlouvu3 = (447 * 1000) / 1258;

        int sum = MnozstviProdaneMrkveNa1Smlouvu1 + MnozstviProdaneMrkveNa1Smlouvu2 + MnozstviProdaneMrkveNa1Smlouvu3;

        int average = (int) sum / 3;

        System.out.println("Prumerne mnozstvi prodane mrkve na jednu smlouvu je: " + average + " Kg.");
    }
}