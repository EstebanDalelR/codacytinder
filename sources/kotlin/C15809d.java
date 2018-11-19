package kotlin;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: kotlin.d */
public final /* synthetic */ class C15809d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f49014a = new int[LazyThreadSafetyMode.values().length];

    static {
        f49014a[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        f49014a[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        f49014a[LazyThreadSafetyMode.NONE.ordinal()] = 3;
    }
}
