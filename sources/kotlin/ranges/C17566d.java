package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ac;
import kotlin.internal.C15816d;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.ranges.d */
public class C17566d implements Iterable<Long>, KMappedMarker {
    /* renamed from: a */
    public static final C15834a f54767a = new C15834a();
    /* renamed from: b */
    private final long f54768b;
    /* renamed from: c */
    private final long f54769c;
    /* renamed from: d */
    private final long f54770d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.ranges.d$a */
    public static final class C15834a {
        private C15834a() {
        }
    }

    public /* synthetic */ Iterator iterator() {
        return m64214c();
    }

    public C17566d(long j, long j2, long j3) {
        if (j3 == 0) {
            throw ((Throwable) new IllegalArgumentException("Step must be non-zero"));
        }
        this.f54768b = j;
        this.f54769c = C15816d.m59841a(j, j2, j3);
        this.f54770d = j3;
    }

    /* renamed from: a */
    public final long m64212a() {
        return this.f54768b;
    }

    /* renamed from: b */
    public final long m64213b() {
        return this.f54769c;
    }

    @NotNull
    /* renamed from: c */
    public ac m64214c() {
        return new C18462e(this.f54768b, this.f54769c, this.f54770d);
    }

    public boolean isEmpty() {
        if (this.f54770d > 0) {
            if (this.f54768b <= this.f54769c) {
                return false;
            }
        } else if (this.f54768b >= this.f54769c) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
        r5 = this;
        r0 = r6 instanceof kotlin.ranges.C17566d;
        if (r0 == 0) goto L_0x002f;
    L_0x0004:
        r0 = r5.isEmpty();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r6;
        r0 = (kotlin.ranges.C17566d) r0;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x002d;
    L_0x0013:
        r0 = r5.f54768b;
        r6 = (kotlin.ranges.C17566d) r6;
        r2 = r6.f54768b;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x001d:
        r0 = r5.f54769c;
        r2 = r6.f54769c;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x0025:
        r0 = r5.f54770d;
        r2 = r6.f54770d;
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = (long) 31;
        return (int) ((j * (((this.f54768b ^ (this.f54768b >>> 32)) * j) + (this.f54769c ^ (this.f54769c >>> 32)))) + (this.f54770d ^ (this.f54770d >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder;
        long j;
        if (this.f54770d > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f54768b);
            stringBuilder.append("..");
            stringBuilder.append(this.f54769c);
            stringBuilder.append(" step ");
            j = this.f54770d;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f54768b);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.f54769c);
            stringBuilder.append(" step ");
            j = -this.f54770d;
        }
        stringBuilder.append(j);
        return stringBuilder.toString();
    }
}
