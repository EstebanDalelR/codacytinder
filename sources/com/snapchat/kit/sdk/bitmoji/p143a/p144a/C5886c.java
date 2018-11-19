package com.snapchat.kit.sdk.bitmoji.p143a.p144a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSelectedListener;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.a.c */
public class C5886c {
    /* renamed from: a */
    private final MetricQueue<ServerEvent> f21572a;
    /* renamed from: b */
    private final C5885a f21573b;
    /* renamed from: c */
    private final C5887d f21574c;
    /* renamed from: d */
    private final C5890a f21575d;
    /* renamed from: e */
    private final OnBitmojiSelectedListener f21576e;

    public C5886c(MetricQueue<ServerEvent> metricQueue, C5885a c5885a, C5887d c5887d, C5890a c5890a, OnBitmojiSelectedListener onBitmojiSelectedListener) {
        this.f21572a = metricQueue;
        this.f21573b = c5885a;
        this.f21574c = c5887d;
        this.f21575d = c5890a;
        this.f21576e = onBitmojiSelectedListener;
    }

    /* renamed from: a */
    public void m25408a(@NonNull Sticker sticker, @NonNull C5889h c5889h, @Nullable String str) {
        if (str != null) {
            this.f21574c.m25410a(c5889h, str);
        }
        if (!this.f21574c.m25411b()) {
            this.f21572a.push(this.f21573b.m25404a(this.f21574c.m25409a()));
        }
        this.f21572a.push(m25407b(sticker, c5889h, str));
        this.f21575d.m25425a("picker:share", 1);
        this.f21576e.onBitmojiSelected(sticker.getImageUrl());
    }

    /* renamed from: b */
    private ServerEvent m25407b(Sticker sticker, C5889h c5889h, String str) {
        return this.f21573b.m25402a(sticker.getComicId(), c5889h, str);
    }
}
