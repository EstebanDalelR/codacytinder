package com.snapchat.kit.sdk.bitmoji.p143a.p144a;

import android.support.annotation.Nullable;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareCategory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.a.h */
public enum C5889h {
    POPULAR(null, BitmojiKitShareCategory.POPULAR),
    TEXT(BitmojiKitSearchCategory.TEXT, BitmojiKitShareCategory.SEARCH),
    AUTOCOMPLETE(BitmojiKitSearchCategory.AUTOCOMPLETE, BitmojiKitShareCategory.SEARCH),
    PROGRAMMED_PILLS(BitmojiKitSearchCategory.PROGRAMMED_PILLS, BitmojiKitShareCategory.SEARCH);
    
    /* renamed from: e */
    private BitmojiKitSearchCategory f21589e;
    /* renamed from: f */
    private BitmojiKitShareCategory f21590f;

    private C5889h(BitmojiKitSearchCategory bitmojiKitSearchCategory, BitmojiKitShareCategory bitmojiKitShareCategory) {
        this.f21589e = bitmojiKitSearchCategory;
        this.f21590f = bitmojiKitShareCategory;
    }

    @Nullable
    /* renamed from: a */
    public BitmojiKitSearchCategory m25420a() {
        return this.f21589e;
    }

    /* renamed from: b */
    public BitmojiKitShareCategory m25421b() {
        return this.f21590f;
    }

    /* renamed from: c */
    boolean m25422c() {
        return m25420a() != null;
    }
}
