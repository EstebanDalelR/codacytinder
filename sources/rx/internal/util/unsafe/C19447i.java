package rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.i */
public final class C19447i {
    /* renamed from: b */
    public static boolean m69986b(int i) {
        return (i & (i + -1)) == 0;
    }

    /* renamed from: a */
    public static int m69985a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
