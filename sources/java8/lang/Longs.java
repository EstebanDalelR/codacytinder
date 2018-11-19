package java8.lang;

public final class Longs {
    /* renamed from: a */
    public static int m59020a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m59021a(long j, long j2) {
        return j < j2 ? -1 : j == j2 ? 0 : 1;
    }

    /* renamed from: b */
    public static long m59022b(long j, long j2) {
        return j + j2;
    }

    private Longs() {
    }
}
