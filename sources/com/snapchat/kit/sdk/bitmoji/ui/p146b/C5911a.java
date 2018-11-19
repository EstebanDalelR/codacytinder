package com.snapchat.kit.sdk.bitmoji.ui.p146b;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import java.util.Date;
import javax.inject.Inject;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.b.a */
public class C5911a {
    /* renamed from: a */
    private final C5885a f21652a;
    /* renamed from: b */
    private final MetricQueue<ServerEvent> f21653b;
    /* renamed from: c */
    private boolean f21654c = false;

    @Inject
    C5911a(C5885a c5885a, MetricQueue<ServerEvent> metricQueue) {
        this.f21652a = c5885a;
        this.f21653b = metricQueue;
    }

    /* renamed from: a */
    public void m25498a(@NonNull BitmojiKitStickerPickerView bitmojiKitStickerPickerView) {
        if (bitmojiKitStickerPickerView != BitmojiKitStickerPickerView.UNRECOGNIZED) {
            if (!this.f21654c) {
                this.f21653b.push(this.f21652a.m25401a(bitmojiKitStickerPickerView));
                this.f21654c = true;
            }
        }
    }

    /* renamed from: a */
    public void m25497a() {
        if (this.f21654c) {
            this.f21653b.push(this.f21652a.m25403a(new Date()));
            this.f21654c = false;
        }
    }

    /* renamed from: b */
    public boolean m25499b() {
        return this.f21654c;
    }
}
