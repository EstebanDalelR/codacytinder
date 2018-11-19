package java8.util.stream;

abstract class AbstractSpinedBuffer {
    /* renamed from: a */
    protected final int f48873a;
    /* renamed from: b */
    protected int f48874b;
    /* renamed from: c */
    protected int f48875c;
    /* renamed from: d */
    protected long[] f48876d;

    /* renamed from: d */
    public abstract void mo13005d();

    protected AbstractSpinedBuffer() {
        this.f48873a = 4;
    }

    protected AbstractSpinedBuffer(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal Capacity: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f48873a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* renamed from: c */
    public long m59410c() {
        return this.f48875c == 0 ? (long) this.f48874b : this.f48876d[this.f48875c] + ((long) this.f48874b);
    }

    /* renamed from: a */
    protected int m59409a(int i) {
        if (i != 0) {
            if (i != 1) {
                i = Math.min((this.f48873a + i) - 1, 30);
                return 1 << i;
            }
        }
        i = this.f48873a;
        return 1 << i;
    }
}
