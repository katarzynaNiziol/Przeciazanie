package main;

public class MetodyPrzeciazanie {

    public static int dajLiczbe(int a) {
        return a;
    }

    public static int dajLiczbe(double a) {
        return (int) a;
    }

    public int dajLiczbe(int a, int b) {
        return a + b;
    }

    public static int dajLiczbe(int a, double b) {
        return a + (int) b;
    }

    public static int dajLiczbe(double b, int a, int c) {
       return a + (int) b + c;
    }
}

