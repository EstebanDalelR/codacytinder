package java8.lang;

public final class Doubles {
    /* renamed from: a */
    public static int m59015a(double d) {
        d = Double.doubleToLongBits(d);
        return (int) (d ^ (d >>> 32));
    }

    private Doubles() {
    }
}
