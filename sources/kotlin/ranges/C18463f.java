package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(JJ)V", "getEndInclusive", "()Ljava/lang/Long;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.ranges.f */
public final class C18463f extends C17566d implements ClosedRange<Long> {
    /* renamed from: b */
    public static final C15835a f57764b = new C15835a();
    @NotNull
    /* renamed from: c */
    private static final C18463f f57765c = new C18463f(1, 0);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.ranges.f$a */
    public static final class C15835a {
        private C15835a() {
        }
    }

    public C18463f(long j, long j2) {
        super(j, j2, 1);
    }

    public /* synthetic */ boolean contains(Comparable comparable) {
        return m66917a(((Number) comparable).longValue());
    }

    public /* synthetic */ Comparable getEndInclusive() {
        return m66919e();
    }

    public /* synthetic */ Comparable getStart() {
        return m66918d();
    }

    @NotNull
    /* renamed from: d */
    public Long m66918d() {
        return Long.valueOf(m64212a());
    }

    @NotNull
    /* renamed from: e */
    public Long m66919e() {
        return Long.valueOf(m64213b());
    }

    /* renamed from: a */
    public boolean m66917a(long j) {
        return (m64212a() > j || j > m64213b()) ? 0 : 1;
    }

    public boolean isEmpty() {
        return m64212a() > m64213b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
        r5 = this;
        r0 = r6 instanceof kotlin.ranges.C18463f;
        if (r0 == 0) goto L_0x002f;
    L_0x0004:
        r0 = r5.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r6;
        r0 = (kotlin.ranges.C18463f) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x002d;
    L_0x0013:
        r0 = r5.m64212a();
        r6 = (kotlin.ranges.C18463f) r6;
        r2 = r6.m64212a();
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x0021:
        r0 = r5.m64213b();
        r2 = r6.m64213b();
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 != 0) goto L_0x002f;
    L_0x002d:
        r6 = 1;
        goto L_0x0030;
    L_0x002f:
        r6 = 0;
    L_0x0030:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (int) ((((long) 31) * (m64212a() ^ (m64212a() >>> 32))) + (m64213b() ^ (m64213b() >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m64212a());
        stringBuilder.append("..");
        stringBuilder.append(m64213b());
        return stringBuilder.toString();
    }
}
