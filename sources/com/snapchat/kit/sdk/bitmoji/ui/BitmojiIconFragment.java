package com.snapchat.kit.sdk.bitmoji.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.snapchat.kit.sdk.Bitmoji;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5881b;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5883d;
import com.snapchat.kit.sdk.bitmoji.networking.C5900a;
import com.snapchat.kit.sdk.bitmoji.networking.FetchAvatarUrlCallback;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.squareup.picasso.Picasso;
import javax.inject.Inject;

public class BitmojiIconFragment extends Fragment implements OnLoginStateChangedListener {
    @Inject
    /* renamed from: a */
    AuthTokenManager f28408a;
    @Inject
    /* renamed from: b */
    C5900a f28409b;
    @Inject
    /* renamed from: c */
    LoginStateController f28410c;
    @Inject
    /* renamed from: d */
    Picasso f28411d;
    /* renamed from: e */
    private ImageView f28412e;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.BitmojiIconFragment$1 */
    class C78731 implements FetchAvatarUrlCallback {
        /* renamed from: a */
        final /* synthetic */ BitmojiIconFragment f28407a;

        public void onFailure(boolean z, int i) {
        }

        C78731(BitmojiIconFragment bitmojiIconFragment) {
            this.f28407a = bitmojiIconFragment;
        }

        public void onSuccess(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                this.f28407a.m33692b();
            } else {
                this.f28407a.f28411d.m26429a(str).m26527a(C5881b.snap_connect_bitmoji_icon).m26529a(this.f28407a.f28412e);
            }
        }
    }

    public void onLoginFailed() {
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f28412e = (ImageView) layoutInflater.inflate(C5883d.snap_connect_bitmoji_icon_view, viewGroup, false);
        Bitmoji.inject(this);
        this.f28410c.addOnLoginStateChangedListener(this);
        return this.f28412e;
    }

    public void onResume() {
        super.onResume();
        if (this.f28408a.isUserLoggedIn()) {
            m33689a();
        }
    }

    public void onLogout() {
        m33692b();
    }

    public void onLoginSucceeded() {
        m33689a();
    }

    /* renamed from: a */
    private void m33689a() {
        this.f28409b.m25460a(new C78731(this));
    }

    /* renamed from: b */
    private void m33692b() {
        this.f28411d.m26431a(this.f28412e);
        Context activity = getActivity();
        if (activity != null) {
            this.f28412e.setImageDrawable(activity.getResources().getDrawable(C5881b.snap_connect_bitmoji_icon));
        }
    }
}
