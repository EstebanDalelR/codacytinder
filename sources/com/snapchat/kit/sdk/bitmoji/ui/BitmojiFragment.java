package com.snapchat.kit.sdk.bitmoji.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.kit.sdk.Bitmoji;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5883d;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5884e;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSelectedListener;
import com.snapchat.kit.sdk.bitmoji.models.StickerPack;
import com.snapchat.kit.sdk.bitmoji.models.StickerPacks;
import com.snapchat.kit.sdk.bitmoji.networking.BitmojiClientCallback;
import com.snapchat.kit.sdk.bitmoji.networking.C5900a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5888f;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache;
import com.snapchat.kit.sdk.bitmoji.persistence.StickerPacksCache.StickerPacksReadCallback;
import com.snapchat.kit.sdk.bitmoji.search.C5909d;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask;
import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask.OnIndexCompleteListener;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7878d;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7880f;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7882h;
import com.snapchat.kit.sdk.bitmoji.ui.controller.C7884k;
import com.snapchat.kit.sdk.bitmoji.ui.controller.FullScreenViewController;
import com.snapchat.kit.sdk.bitmoji.ui.p146b.C5911a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.squareup.okhttp.C5997b;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public final class BitmojiFragment extends Fragment implements OnIndexCompleteListener, OnLoginStateChangedListener {
    @Inject
    /* renamed from: a */
    AuthTokenManager f28385a;
    @Inject
    /* renamed from: b */
    MetricQueue<ServerEvent> f28386b;
    @Inject
    /* renamed from: c */
    C5885a f28387c;
    @Inject
    /* renamed from: d */
    C5900a f28388d;
    @Inject
    /* renamed from: e */
    C7880f f28389e;
    @Inject
    /* renamed from: f */
    C7878d f28390f;
    @Inject
    /* renamed from: g */
    C5887d f28391g;
    @Inject
    /* renamed from: h */
    C5911a f28392h;
    @Inject
    /* renamed from: i */
    C5888f f28393i;
    @Inject
    /* renamed from: j */
    C7884k f28394j;
    @Inject
    /* renamed from: k */
    C7882h f28395k;
    @Inject
    /* renamed from: l */
    LoginStateController f28396l;
    @Inject
    /* renamed from: m */
    C5890a f28397m;
    @Inject
    /* renamed from: n */
    StickerPacksCache f28398n;
    @Inject
    /* renamed from: o */
    Provider<StickerIndexingTask> f28399o;
    @Inject
    @Named("perceived:first_render")
    /* renamed from: p */
    C5891c f28400p;
    @Inject
    @Named("perceived:open")
    /* renamed from: q */
    C5891c f28401q;
    @Inject
    /* renamed from: r */
    C5997b f28402r;
    /* renamed from: s */
    private OnBitmojiSelectedListener f28403s;
    /* renamed from: t */
    private OnBitmojiSearchFocusChangeListener f28404t = null;
    /* renamed from: u */
    private FullScreenViewController f28405u;
    /* renamed from: v */
    private boolean f28406v = false;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment$1 */
    class C71271 implements StickerPacksReadCallback {
        /* renamed from: a */
        final /* synthetic */ BitmojiFragment f25806a;

        C71271(BitmojiFragment bitmojiFragment) {
            this.f25806a = bitmojiFragment;
        }

        public void onStickerPacksRead(@Nullable StickerPacks stickerPacks) {
            if (stickerPacks != null && !this.f25806a.f28406v) {
                this.f25806a.m33678a(stickerPacks);
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment$2 */
    class C71282 implements BitmojiClientCallback<StickerPacks> {
        /* renamed from: a */
        final /* synthetic */ BitmojiFragment f25807a;

        /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment$2$1 */
        class C59101 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C71282 f21651a;

            C59101(C71282 c71282) {
                this.f21651a = c71282;
            }

            public void run() {
                this.f21651a.f25807a.m33677a();
            }
        }

        C71282(BitmojiFragment bitmojiFragment) {
            this.f25807a = bitmojiFragment;
        }

        public /* synthetic */ void onSuccess(@Nullable Object obj) {
            m30722a((StickerPacks) obj);
        }

        /* renamed from: a */
        public void m30722a(@Nullable StickerPacks stickerPacks) {
            this.f25807a.f28398n.m25467a(stickerPacks);
            if (stickerPacks == null) {
                this.f25807a.f28390f.m33708a();
                this.f25807a.m33682a(this.f25807a.f28390f);
                return;
            }
            this.f25807a.m33678a(stickerPacks);
        }

        public void onFailure(boolean z, int i) {
            this.f25807a.m33683a(z, new C59101(this));
        }
    }

    public void onAttach(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        super.onAttach(r2);
        r0 = r2;	 Catch:{ ClassCastException -> 0x0011 }
        r0 = (com.snapchat.kit.sdk.bitmoji.OnBitmojiSelectedListener) r0;	 Catch:{ ClassCastException -> 0x0011 }
        r1.f28403s = r0;	 Catch:{ ClassCastException -> 0x0011 }
        r0 = r2 instanceof com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener;
        if (r0 == 0) goto L_0x0010;
    L_0x000c:
        r2 = (com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener) r2;
        r1.f28404t = r2;
    L_0x0010:
        return;
    L_0x0011:
        r2 = new java.lang.ClassCastException;
        r0 = "The context/activity from which BitmojiFragment is attached MUST implement OnBitmojiSelectedListener";
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment.onAttach(android.content.Context):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater = layoutInflater.inflate(C5883d.snap_connect_bitmoji_ui, viewGroup, false);
        Bitmoji.inject(this, this.f28403s, this.f28404t, layoutInflater);
        return layoutInflater;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.f28401q.m25428a();
        this.f28400p.m25428a();
        if (this.f28385a.isUserLoggedIn() != null) {
            this.f28398n.m25468a(new C71271(this));
        }
        this.f28396l.addOnLoginStateChangedListener(this);
    }

    public void onResume() {
        super.onResume();
        FullScreenViewController fullScreenViewController = this.f28405u;
        this.f28393i.m25414a();
        if (this.f28385a.isUserLoggedIn()) {
            m33677a();
        } else {
            this.f28395k.m33723c();
            fullScreenViewController = this.f28395k;
        }
        if (fullScreenViewController != null) {
            m33682a(fullScreenViewController);
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.f28391g.m25411b()) {
            this.f28386b.push(this.f28387c.m25404a(this.f28391g.m25409a()));
        }
        if (this.f28401q.m25431d()) {
            this.f28397m.m25425a("perceived:open:failure", 1);
        }
        this.f28401q.m25430c();
        this.f28392h.m25497a();
        this.f28397m.m25424a();
        this.f28393i.m25416b();
    }

    public void onLogout() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f28395k;
        r0.m33723c();
        r0 = r2.f28395k;
        r2.m33682a(r0);
        r0 = r2.f28398n;
        r1 = 0;
        r0.m25467a(r1);
        r0 = r2.f28402r;	 Catch:{ IOException -> 0x0015 }
        r0.m25787a();	 Catch:{ IOException -> 0x0015 }
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment.onLogout():void");
    }

    public void onLoginSucceeded() {
        if (this.f28395k.m33721a()) {
            this.f28386b.push(this.f28387c.m25406c());
        }
        this.f28395k.m33722b();
        m33677a();
    }

    public void onLoginFailed() {
        this.f28395k.m33722b();
    }

    public void onIndexComplete(C5909d c5909d) {
        if (this.f28385a.isUserLoggedIn()) {
            this.f28394j.m33733a(c5909d);
            m33682a(this.f28394j);
        }
    }

    /* renamed from: a */
    private void m33678a(StickerPacks stickerPacks) {
        this.f28406v = true;
        ((StickerIndexingTask) this.f28399o.get()).execute((StickerPack[]) stickerPacks.get().toArray(new StickerPack[0]));
    }

    /* renamed from: a */
    private void m33677a() {
        this.f28388d.m25461a(Locale.getDefault(), new C71282(this));
    }

    /* renamed from: a */
    private void m33683a(boolean z, @NonNull Runnable runnable) {
        if (this.f28405u != this.f28394j) {
            int i;
            if (z) {
                z = C5884e.snap_connect_bitmoji_connection_lost;
                i = C5884e.snap_connect_bitmoji_connection_lost_desc;
            } else {
                z = C5884e.snap_connect_bitmoji_connection_error;
                i = C5884e.snap_connect_bitmoji_connection_error_desc;
            }
            this.f28389e.m33715a(z, i, runnable);
            m33682a(this.f28389e);
        }
    }

    /* renamed from: a */
    private void m33682a(@NonNull FullScreenViewController fullScreenViewController) {
        if (this.f28393i.m25419e()) {
            m33687b(fullScreenViewController);
        }
        if (this.f28400p.m25431d() && fullScreenViewController.getViewType() != BitmojiKitStickerPickerView.STICKER_PICKER) {
            this.f28400p.m25430c();
        }
        if (this.f28405u != fullScreenViewController) {
            if (this.f28405u != null) {
                this.f28405u.hide();
            }
            this.f28405u = fullScreenViewController;
        }
    }

    /* renamed from: b */
    private void m33687b(@NonNull FullScreenViewController fullScreenViewController) {
        if (this.f28401q.m25431d()) {
            this.f28401q.m25429b();
        }
        if (m33688c(fullScreenViewController)) {
            this.f28397m.m25425a("picker:open", 1);
        }
        this.f28392h.m25498a(fullScreenViewController.getViewType());
    }

    /* renamed from: b */
    private BitmojiKitStickerPickerView m33685b() {
        if (this.f28405u == null) {
            return BitmojiKitStickerPickerView.UNRECOGNIZED;
        }
        return this.f28405u.getViewType();
    }

    /* renamed from: c */
    private boolean m33688c(@NonNull FullScreenViewController fullScreenViewController) {
        return (fullScreenViewController.getViewType() != BitmojiKitStickerPickerView.STICKER_PICKER || (this.f28392h.m25499b() != null && m33685b() == BitmojiKitStickerPickerView.STICKER_PICKER)) ? null : true;
    }
}
