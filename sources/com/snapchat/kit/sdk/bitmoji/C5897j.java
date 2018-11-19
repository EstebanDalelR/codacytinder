package com.snapchat.kit.sdk.bitmoji;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewStub;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5886c;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask.OnIndexCompleteListener;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

@Module
/* renamed from: com.snapchat.kit.sdk.bitmoji.j */
public class C5897j {
    /* renamed from: a */
    private final OnIndexCompleteListener f21600a;
    /* renamed from: b */
    private final OnBitmojiSelectedListener f21601b;
    /* renamed from: c */
    private final OnBitmojiSearchFocusChangeListener f21602c;
    /* renamed from: d */
    private final View f21603d;

    public C5897j(OnIndexCompleteListener onIndexCompleteListener, OnBitmojiSelectedListener onBitmojiSelectedListener, @Nullable OnBitmojiSearchFocusChangeListener onBitmojiSearchFocusChangeListener, View view) {
        this.f21600a = onIndexCompleteListener;
        this.f21601b = onBitmojiSelectedListener;
        this.f21602c = onBitmojiSearchFocusChangeListener;
        this.f21603d = view;
    }

    @FragmentScope
    @Provides
    /* renamed from: a */
    C5886c m25448a(MetricQueue<ServerEvent> metricQueue, C5885a c5885a, C5887d c5887d, C5890a c5890a) {
        return new C5886c(metricQueue, c5885a, c5887d, c5890a, this.f21601b);
    }

    @Provides
    /* renamed from: a */
    OnIndexCompleteListener m25449a() {
        return this.f21600a;
    }

    @Nullable
    @Provides
    /* renamed from: b */
    OnBitmojiSearchFocusChangeListener m25450b() {
        return this.f21602c;
    }

    @FragmentScope
    @Provides
    @Named("sticker_picker")
    /* renamed from: c */
    C5927a m25451c() {
        return new C5927a((ViewStub) this.f21603d.findViewById(C5882c.snap_connect_bitmoji_sticker_picker_stub));
    }

    @FragmentScope
    @Provides
    @Named("login")
    /* renamed from: d */
    C5927a m25452d() {
        return new C5927a((ViewStub) this.f21603d.findViewById(C5882c.snap_connect_bitmoji_login_view_stub));
    }

    @FragmentScope
    @Provides
    @Named("error")
    /* renamed from: e */
    C5927a m25453e() {
        return new C5927a((ViewStub) this.f21603d.findViewById(C5882c.snap_connect_bitmoji_error_view_stub));
    }

    @FragmentScope
    @Provides
    @Named("create_avatar")
    /* renamed from: f */
    C5927a m25454f() {
        return new C5927a((ViewStub) this.f21603d.findViewById(C5882c.snap_connect_bitmoji_create_avatar_view_stub));
    }

    @FragmentScope
    @Provides
    @Named("tag_results")
    /* renamed from: g */
    C5927a m25455g() {
        return new C5927a((ViewStub) this.f21603d.findViewById(C5882c.snap_connect_bitmoji_results_stub));
    }
}
