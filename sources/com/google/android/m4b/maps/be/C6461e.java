package com.google.android.m4b.maps.be;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.m4b.maps.be.e */
public final class C6461e extends C4775a<short[]> {
    /* renamed from: e */
    private static final C4777c<short[]> f23974e = new C64601(100);

    /* renamed from: com.google.android.m4b.maps.be.e$1 */
    class C64601 extends C4777c<short[]> {
        C64601(int i) {
            super(100);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5015a() {
            return new short[2058];
        }
    }

    public C6461e(int i) {
        super(i, 11, f23974e);
    }

    /* renamed from: a */
    public final void m28320a(ShortBuffer shortBuffer) {
        for (int i = 0; i < this.b; i++) {
            shortBuffer.put((short[]) this.a.get(i), 0, ItemAnimator.FLAG_MOVED);
        }
        if (this.b != this.a.size()) {
            shortBuffer.put((short[]) this.c, 0, this.d);
        }
    }
}
