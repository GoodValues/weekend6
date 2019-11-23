package stopczas;

public class StopWatch {

    private long startTime;

    public void start() { //tu robimy sobie funkcję typu void, aby w ponizszej funkcji stop() dało radę podstawić zmienną startTime
        startTime=System.nanoTime();
    }

    public long stop() { // zwraca wynik w ms
        long time=System.nanoTime() - startTime;
        return time;
    }

}
