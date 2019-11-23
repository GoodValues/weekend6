package liczbyPierwsze;

public class LiczbaPierwsza {

    boolean prawda;

    public boolean isFirst (int n) {
        for (int i = 2; i <= n/2 ; i++) { //tutaj sobie dalismy n/2 (a nie n), bo 2krotnie mniej bedzie nam sprawdzał. Liczby powyzej polowy dają nam ułamek.
            if (n%i==0)
                return false;
        }
        return true;
    }

    public void displayFirstNumbersInRange (int upperRange) {
        for (int i=2; i<=upperRange; i++)
            if(isFirst(i))
                System.out.println(i);
    }
}
