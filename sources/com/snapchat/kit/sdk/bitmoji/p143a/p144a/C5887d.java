package com.snapchat.kit.sdk.bitmoji.p143a.p144a;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.a.a.d */
public class C5887d {
    /* renamed from: a */
    private List<BitmojiKitSearchTerm> f21577a = new ArrayList();
    /* renamed from: b */
    private BitmojiKitSearchTerm f21578b = null;

    @Inject
    C5887d() {
    }

    /* renamed from: a */
    public List<BitmojiKitSearchTerm> m25409a() {
        List<BitmojiKitSearchTerm> list = this.f21577a;
        this.f21577a = new ArrayList();
        return list;
    }

    /* renamed from: a */
    public void m25410a(C5889h c5889h, @NonNull String str) {
        c5889h = BitmojiKitSearchTerm.newBuilder().setCategory(c5889h.m25420a()).setValue(str).build();
        if (c5889h.equals(this.f21578b) == null) {
            this.f21577a.add(c5889h);
            this.f21578b = c5889h;
        }
    }

    /* renamed from: b */
    public boolean m25411b() {
        return this.f21577a.isEmpty();
    }
}
