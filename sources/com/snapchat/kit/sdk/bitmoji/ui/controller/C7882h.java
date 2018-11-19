package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import com.snapchat.kit.sdk.SnapLogin;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import javax.inject.Inject;
import javax.inject.Named;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.h */
public class C7882h implements OnInflateListener, FullScreenViewController {
    /* renamed from: a */
    private final Context f28443a;
    /* renamed from: b */
    private final C5927a f28444b;
    /* renamed from: c */
    private final MetricQueue<ServerEvent> f28445c;
    /* renamed from: d */
    private final C5885a f28446d;
    /* renamed from: e */
    private boolean f28447e = false;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.h$1 */
    class C59211 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C7882h f21670a;

        C59211(C7882h c7882h) {
            this.f21670a = c7882h;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                this.f21670a.f28445c.push(this.f21670a.f28446d.m25405b());
                this.f21670a.f28447e = true;
            }
            return null;
        }
    }

    @Inject
    C7882h(Context context, @Named("login") C5927a c5927a, MetricQueue<ServerEvent> metricQueue, C5885a c5885a) {
        this.f28443a = context;
        this.f28444b = c5927a;
        this.f28445c = metricQueue;
        this.f28446d = c5885a;
        this.f28444b.m25524a((OnInflateListener) this);
    }

    public void onInflate(ViewStub viewStub, View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C5882c.snap_connect_bitmoji_login_button_container);
        SnapLogin.getButton(this.f28443a, viewGroup);
        viewGroup.setOnTouchListener(new C59211(this));
    }

    /* renamed from: a */
    public boolean m33721a() {
        return this.f28447e;
    }

    /* renamed from: b */
    public void m33722b() {
        this.f28447e = false;
    }

    /* renamed from: c */
    public void m33723c() {
        this.f28444b.m25523a(0);
    }

    public void hide() {
        this.f28444b.m25523a(8);
    }

    @NonNull
    public BitmojiKitStickerPickerView getViewType() {
        return BitmojiKitStickerPickerView.LINK_ACCOUNT;
    }
}
