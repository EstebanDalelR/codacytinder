package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ac;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.ranges.e */
public final class C18462e extends ac {
    /* renamed from: a */
    private final long f57760a;
    /* renamed from: b */
    private boolean f57761b;
    /* renamed from: c */
    private long f57762c;
    /* renamed from: d */
    private final long f57763d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18462e(long r4, long r6, long r8) {
        /*
        r3 = this;
        r3.<init>();
        r3.f57763d = r8;
        r3.f57760a = r6;
        r8 = r3.f57763d;
        r0 = 0;
        r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        r8 = 0;
        r9 = 1;
        if (r2 <= 0) goto L_0x0017;
    L_0x0011:
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 > 0) goto L_0x001c;
    L_0x0015:
        r8 = 1;
        goto L_0x001c;
    L_0x0017:
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0015;
    L_0x001c:
        r3.f57761b = r8;
        r6 = r3.f57761b;
        if (r6 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0025;
    L_0x0023:
        r4 = r3.f57760a;
    L_0x0025:
        r3.f57762c = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.e.<init>(long, long, long):void");
    }

    public boolean hasNext() {
        return this.f57761b;
    }

    /* renamed from: b */
    public long mo13811b() {
        long j = this.f57762c;
        if (j != this.f57760a) {
            this.f57762c += this.f57763d;
        } else if (this.f57761b) {
            this.f57761b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
