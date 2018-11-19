package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 1, 10})
/* renamed from: kotlin.internal.d */
public final class C15816d {
    /* renamed from: a */
    private static final int m59838a(int i, int i2) {
        i %= i2;
        return i >= 0 ? i : i + i2;
    }

    /* renamed from: a */
    private static final long m59840a(long j, long j2) {
        j %= j2;
        return j >= 0 ? j : j + j2;
    }

    /* renamed from: b */
    private static final int m59842b(int i, int i2, int i3) {
        return C15816d.m59838a(C15816d.m59838a(i, i3) - C15816d.m59838a(i2, i3), i3);
    }

    /* renamed from: b */
    private static final long m59843b(long j, long j2, long j3) {
        return C15816d.m59840a(C15816d.m59840a(j, j3) - C15816d.m59840a(j2, j3), j3);
    }

    @PublishedApi
    /* renamed from: a */
    public static final int m59839a(int i, int i2, int i3) {
        if (i3 > 0) {
            return i2 - C15816d.m59842b(i2, i, i3);
        }
        if (i3 < 0) {
            return i2 + C15816d.m59842b(i, i2, -i3);
        }
        throw ((Throwable) new IllegalArgumentException("Step is zero."));
    }

    @PublishedApi
    /* renamed from: a */
    public static final long m59841a(long j, long j2, long j3) {
        if (j3 > 0) {
            return j2 - C15816d.m59843b(j2, j, j3);
        }
        if (j3 < 0) {
            return j2 + C15816d.m59843b(j, j2, -j3);
        }
        throw ((Throwable) new IllegalArgumentException("Step is zero."));
    }
}
