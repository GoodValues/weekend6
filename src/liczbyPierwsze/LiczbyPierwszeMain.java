package liczbyPierwsze;

public class LiczbyPierwszeMain {
    public static void main(String[] args) {
        LiczbaPierwsza pierwsza= new LiczbaPierwsza();

        System.out.println(pierwsza.isFirst(15));
        pierwsza.displayFirstNumbersInRange(15);
    }
}
