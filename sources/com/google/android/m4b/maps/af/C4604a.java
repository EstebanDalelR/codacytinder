package com.google.android.m4b.maps.af;

/* renamed from: com.google.android.m4b.maps.af.a */
public final class C4604a {
    /* renamed from: a */
    private static final double f17014a = Math.log(2.0d);
    /* renamed from: b */
    private static double[] f17015b = new double[]{1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: a */
    public static boolean m20691a(double d) {
        return (!C4605b.m20694c(d) || (d != 0.0d && 52 - Long.numberOfTrailingZeros(C4605b.m20693b(d)) > C4605b.m20692a(d))) ? 0.0d : Double.MIN_VALUE;
    }
}
