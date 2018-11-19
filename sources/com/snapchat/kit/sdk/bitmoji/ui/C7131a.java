package com.snapchat.kit.sdk.bitmoji.ui;

import com.snapchat.kit.sdk.bitmoji.networking.C5900a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5888f;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7878d;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7880f;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7882h;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7884k;
import com.snapchat.kit.sdk.bitmoji.ui.p146b.C5911a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.squareup.okhttp.C5997b;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.a */
public final class C7131a implements MembersInjector<BitmojiFragment> {
    /* renamed from: a */
    private final Provider<AuthTokenManager> f25818a;
    /* renamed from: b */
    private final Provider<MetricQueue<ServerEvent>> f25819b;
    /* renamed from: c */
    private final Provider<C5885a> f25820c;
    /* renamed from: d */
    private final Provider<C5900a> f25821d;
    /* renamed from: e */
    private final Provider<C7880f> f25822e;
    /* renamed from: f */
    private final Provider<C7878d> f25823f;
    /* renamed from: g */
    private final Provider<C5887d> f25824g;
    /* renamed from: h */
    private final Provider<C5911a> f25825h;
    /* renamed from: i */
    private final Provider<C5888f> f25826i;
    /* renamed from: j */
    private final Provider<C7884k> f25827j;
    /* renamed from: k */
    private final Provider<C7882h> f25828k;
    /* renamed from: l */
    private final Provider<LoginStateController> f25829l;
    /* renamed from: m */
    private final Provider<C5890a> f25830m;
    /* renamed from: n */
    private final Provider<StickerPacksCache> f25831n;
    /* renamed from: o */
    private final Provider<StickerIndexingTask> f25832o;
    /* renamed from: p */
    private final Provider<C5891c> f25833p;
    /* renamed from: q */
    private final Provider<C5891c> f25834q;
    /* renamed from: r */
    private final Provider<C5997b> f25835r;

    public /* synthetic */ void injectMembers(Object obj) {
        m30750a((BitmojiFragment) obj);
    }

    /* renamed from: a */
    public void m30750a(BitmojiFragment bitmojiFragment) {
        C7131a.m30746a(bitmojiFragment, (AuthTokenManager) this.f25818a.get());
        C7131a.m30745a(bitmojiFragment, (MetricQueue) this.f25819b.get());
        C7131a.m30732a(bitmojiFragment, (C5885a) this.f25820c.get());
        C7131a.m30737a(bitmojiFragment, (C5900a) this.f25821d.get());
        C7131a.m30741a(bitmojiFragment, (C7880f) this.f25822e.get());
        C7131a.m30740a(bitmojiFragment, (C7878d) this.f25823f.get());
        C7131a.m30733a(bitmojiFragment, (C5887d) this.f25824g.get());
        C7131a.m30739a(bitmojiFragment, (C5911a) this.f25825h.get());
        C7131a.m30734a(bitmojiFragment, (C5888f) this.f25826i.get());
        C7131a.m30743a(bitmojiFragment, (C7884k) this.f25827j.get());
        C7131a.m30742a(bitmojiFragment, (C7882h) this.f25828k.get());
        C7131a.m30744a(bitmojiFragment, (LoginStateController) this.f25829l.get());
        C7131a.m30735a(bitmojiFragment, (C5890a) this.f25830m.get());
        C7131a.m30738a(bitmojiFragment, (StickerPacksCache) this.f25831n.get());
        C7131a.m30748a(bitmojiFragment, this.f25832o);
        C7131a.m30736a(bitmojiFragment, (C5891c) this.f25833p.get());
        C7131a.m30749b(bitmojiFragment, (C5891c) this.f25834q.get());
        C7131a.m30747a(bitmojiFragment, (C5997b) this.f25835r.get());
    }

    /* renamed from: a */
    public static void m30746a(BitmojiFragment bitmojiFragment, AuthTokenManager authTokenManager) {
        bitmojiFragment.f28385a = authTokenManager;
    }

    /* renamed from: a */
    public static void m30745a(BitmojiFragment bitmojiFragment, MetricQueue<ServerEvent> metricQueue) {
        bitmojiFragment.f28386b = metricQueue;
    }

    /* renamed from: a */
    public static void m30732a(BitmojiFragment bitmojiFragment, C5885a c5885a) {
        bitmojiFragment.f28387c = c5885a;
    }

    /* renamed from: a */
    public static void m30737a(BitmojiFragment bitmojiFragment, C5900a c5900a) {
        bitmojiFragment.f28388d = c5900a;
    }

    /* renamed from: a */
    public static void m30741a(BitmojiFragment bitmojiFragment, C7880f c7880f) {
        bitmojiFragment.f28389e = c7880f;
    }

    /* renamed from: a */
    public static void m30740a(BitmojiFragment bitmojiFragment, C7878d c7878d) {
        bitmojiFragment.f28390f = c7878d;
    }

    /* renamed from: a */
    public static void m30733a(BitmojiFragment bitmojiFragment, C5887d c5887d) {
        bitmojiFragment.f28391g = c5887d;
    }

    /* renamed from: a */
    public static void m30739a(BitmojiFragment bitmojiFragment, C5911a c5911a) {
        bitmojiFragment.f28392h = c5911a;
    }

    /* renamed from: a */
    public static void m30734a(BitmojiFragment bitmojiFragment, C5888f c5888f) {
        bitmojiFragment.f28393i = c5888f;
    }

    /* renamed from: a */
    public static void m30743a(BitmojiFragment bitmojiFragment, C7884k c7884k) {
        bitmojiFragment.f28394j = c7884k;
    }

    /* renamed from: a */
    public static void m30742a(BitmojiFragment bitmojiFragment, C7882h c7882h) {
        bitmojiFragment.f28395k = c7882h;
    }

    /* renamed from: a */
    public static void m30744a(BitmojiFragment bitmojiFragment, LoginStateController loginStateController) {
        bitmojiFragment.f28396l = loginStateController;
    }

    /* renamed from: a */
    public static void m30735a(BitmojiFragment bitmojiFragment, C5890a c5890a) {
        bitmojiFragment.f28397m = c5890a;
    }

    /* renamed from: a */
    public static void m30738a(BitmojiFragment bitmojiFragment, StickerPacksCache stickerPacksCache) {
        bitmojiFragment.f28398n = stickerPacksCache;
    }

    /* renamed from: a */
    public static void m30748a(BitmojiFragment bitmojiFragment, Provider<StickerIndexingTask> provider) {
        bitmojiFragment.f28399o = provider;
    }

    /* renamed from: a */
    public static void m30736a(BitmojiFragment bitmojiFragment, C5891c c5891c) {
        bitmojiFragment.f28400p = c5891c;
    }

    /* renamed from: b */
    public static void m30749b(BitmojiFragment bitmojiFragment, C5891c c5891c) {
        bitmojiFragment.f28401q = c5891c;
    }

    /* renamed from: a */
    public static void m30747a(BitmojiFragment bitmojiFragment, C5997b c5997b) {
        bitmojiFragment.f28402r = c5997b;
    }
}
