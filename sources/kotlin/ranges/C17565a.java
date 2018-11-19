package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ab;
import kotlin.internal.C15816d;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.ranges.a */
public class C17565a implements Iterable<Integer>, KMappedMarker {
    /* renamed from: a */
    public static final C15832a f54763a = new C15832a();
    /* renamed from: b */
    private final int f54764b;
    /* renamed from: c */
    private final int f54765c;
    /* renamed from: d */
    private final int f54766d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.ranges.a$a */
    public static final class C15832a {
        private C15832a() {
        }

        @NotNull
        /* renamed from: a */
        public final C17565a m59890a(int i, int i2, int i3) {
            return new C17565a(i, i2, i3);
        }
    }

    public /* synthetic */ Iterator iterator() {
        return m64211d();
    }

    public C17565a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw ((Throwable) new IllegalArgumentException("Step must be non-zero"));
        }
        this.f54764b = i;
        this.f54765c = C15816d.m59839a(i, i2, i3);
        this.f54766d = i3;
    }

    /* renamed from: a */
    public final int m64208a() {
        return this.f54764b;
    }

    /* renamed from: b */
    public final int m64209b() {
        return this.f54765c;
    }

    /* renamed from: c */
    public final int m64210c() {
        return this.f54766d;
    }

    @NotNull
    /* renamed from: d */
    public ab m64211d() {
        return new C18460b(this.f54764b, this.f54765c, this.f54766d);
    }

    public boolean isEmpty() {
        if (this.f54766d > 0) {
            if (this.f54764b <= this.f54765c) {
                return false;
            }
        } else if (this.f54764b >= this.f54765c) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof kotlin.ranges.C17565a;
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r0 = r2.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (kotlin.ranges.C17565a) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.f54764b;
        r3 = (kotlin.ranges.C17565a) r3;
        r1 = r3.f54764b;
        if (r0 != r1) goto L_0x0029;
    L_0x001b:
        r0 = r2.f54765c;
        r1 = r3.f54765c;
        if (r0 != r1) goto L_0x0029;
    L_0x0021:
        r0 = r2.f54766d;
        r3 = r3.f54766d;
        if (r0 != r3) goto L_0x0029;
    L_0x0027:
        r3 = 1;
        goto L_0x002a;
    L_0x0029:
        r3 = 0;
    L_0x002a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return isEmpty() ? -1 : (((this.f54764b * 31) + this.f54765c) * 31) + this.f54766d;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder;
        int i;
        if (this.f54766d > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f54764b);
            stringBuilder.append("..");
            stringBuilder.append(this.f54765c);
            stringBuilder.append(" step ");
            i = this.f54766d;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f54764b);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.f54765c);
            stringBuilder.append(" step ");
            i = -this.f54766d;
        }
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
