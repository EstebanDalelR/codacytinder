package com.google.android.exoplayer2.trackselection;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.trackselection.e */
public final class C2255e {
    /* renamed from: a */
    public final int f6685a;
    /* renamed from: b */
    private final TrackSelection[] f6686b;
    /* renamed from: c */
    private int f6687c;

    public C2255e(TrackSelection... trackSelectionArr) {
        this.f6686b = trackSelectionArr;
        this.f6685a = trackSelectionArr.length;
    }

    /* renamed from: a */
    public TrackSelection m8123a(int i) {
        return this.f6686b[i];
    }

    /* renamed from: a */
    public TrackSelection[] m8124a() {
        return (TrackSelection[]) this.f6686b.clone();
    }

    public int hashCode() {
        if (this.f6687c == 0) {
            this.f6687c = 527 + Arrays.hashCode(this.f6686b);
        }
        return this.f6687c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return Arrays.equals(this.f6686b, ((C2255e) obj).f6686b);
            }
        }
        return null;
    }
}
