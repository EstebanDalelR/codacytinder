package rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.s */
abstract class C19858s<E> extends C19779f<E> {
    /* renamed from: e */
    private static final Integer f62137e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    /* renamed from: d */
    protected final int f62138d;

    public C19858s(int i) {
        super(i);
        this.f62138d = Math.min(i / 4, f62137e.intValue());
    }
}
