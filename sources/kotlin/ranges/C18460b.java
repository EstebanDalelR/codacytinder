package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ab;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.ranges.b */
public final class C18460b extends ab {
    /* renamed from: a */
    private final int f57754a;
    /* renamed from: b */
    private boolean f57755b;
    /* renamed from: c */
    private int f57756c;
    /* renamed from: d */
    private final int f57757d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18460b(int r3, int r4, int r5) {
        /*
        r2 = this;
        r2.<init>();
        r2.f57757d = r5;
        r2.f57754a = r4;
        r5 = r2.f57757d;
        r0 = 0;
        r1 = 1;
        if (r5 <= 0) goto L_0x0011;
    L_0x000d:
        if (r3 > r4) goto L_0x0014;
    L_0x000f:
        r0 = 1;
        goto L_0x0014;
    L_0x0011:
        if (r3 < r4) goto L_0x0014;
    L_0x0013:
        goto L_0x000f;
    L_0x0014:
        r2.f57755b = r0;
        r4 = r2.f57755b;
        if (r4 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x001d;
    L_0x001b:
        r3 = r2.f57754a;
    L_0x001d:
        r2.f57756c = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.b.<init>(int, int, int):void");
    }

    public boolean hasNext() {
        return this.f57755b;
    }

    /* renamed from: b */
    public int mo13805b() {
        int i = this.f57756c;
        if (i != this.f57754a) {
            this.f57756c += this.f57757d;
        } else if (this.f57755b) {
            this.f57755b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
