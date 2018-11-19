package com.google.android.exoplayer2.text.p065a;

import android.support.annotation.NonNull;
import android.text.Layout.Alignment;
import com.google.android.exoplayer2.text.Cue;

/* renamed from: com.google.android.exoplayer2.text.a.b */
final class C3701b extends Cue implements Comparable<C3701b> {
    /* renamed from: o */
    public final int f11559o;

    public /* synthetic */ int compareTo(@NonNull Object obj) {
        return m14037a((C3701b) obj);
    }

    public C3701b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f11559o = i5;
    }

    /* renamed from: a */
    public int m14037a(@NonNull C3701b c3701b) {
        if (c3701b.f11559o < this.f11559o) {
            return -1;
        }
        return c3701b.f11559o > this.f11559o ? 1 : null;
    }
}
