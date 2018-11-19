package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.ranges.c */
public final class C18461c extends C17565a implements ClosedRange<Integer> {
    /* renamed from: b */
    public static final C15833a f57758b = new C15833a();
    @NotNull
    /* renamed from: c */
    private static final C18461c f57759c = new C18461c(1, 0);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.ranges.c$a */
    public static final class C15833a {
        private C15833a() {
        }

        @NotNull
        /* renamed from: a */
        public final C18461c m59891a() {
            return C18461c.f57759c;
        }
    }

    public C18461c(int i, int i2) {
        super(i, i2, 1);
    }

    public /* synthetic */ boolean contains(Comparable comparable) {
        return m66913a(((Number) comparable).intValue());
    }

    public /* synthetic */ Comparable getEndInclusive() {
        return m66915f();
    }

    public /* synthetic */ Comparable getStart() {
        return m66914e();
    }

    @NotNull
    /* renamed from: e */
    public Integer m66914e() {
        return Integer.valueOf(m64208a());
    }

    @NotNull
    /* renamed from: f */
    public Integer m66915f() {
        return Integer.valueOf(m64209b());
    }

    /* renamed from: a */
    public boolean m66913a(int i) {
        return m64208a() <= i && i <= m64209b();
    }

    public boolean isEmpty() {
        return m64208a() > m64209b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof kotlin.ranges.C18461c;
        if (r0 == 0) goto L_0x002b;
    L_0x0004:
        r0 = r2.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (kotlin.ranges.C18461c) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0029;
    L_0x0013:
        r0 = r2.m64208a();
        r3 = (kotlin.ranges.C18461c) r3;
        r1 = r3.m64208a();
        if (r0 != r1) goto L_0x002b;
    L_0x001f:
        r0 = r2.m64209b();
        r3 = r3.m64209b();
        if (r0 != r3) goto L_0x002b;
    L_0x0029:
        r3 = 1;
        goto L_0x002c;
    L_0x002b:
        r3 = 0;
    L_0x002c:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (m64208a() * 31) + m64209b();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m64208a());
        stringBuilder.append("..");
        stringBuilder.append(m64209b());
        return stringBuilder.toString();
    }
}
