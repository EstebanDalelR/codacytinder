package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import android.widget.TextView;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView;
import javax.inject.Inject;
import javax.inject.Named;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.f */
public class C7880f implements OnInflateListener, FullScreenViewController {
    /* renamed from: a */
    private final C5927a f28435a;
    /* renamed from: b */
    private TextView f28436b;
    /* renamed from: c */
    private TextView f28437c;
    /* renamed from: d */
    private View f28438d;
    /* renamed from: e */
    private View f28439e;
    /* renamed from: f */
    private View f28440f;
    /* renamed from: g */
    private Runnable f28441g;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.f$1 */
    class C59201 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C7880f f21669a;

        C59201(C7880f c7880f) {
            this.f21669a = c7880f;
        }

        public void onClick(View view) {
            this.f21669a.f28440f.setVisibility(8);
            this.f21669a.f28438d.setVisibility(0);
            this.f21669a.f28439e.setClickable(false);
            this.f21669a.f28441g.run();
        }
    }

    @Inject
    C7880f(@Named("error") C5927a c5927a) {
        this.f28435a = c5927a;
        this.f28435a.m25524a((OnInflateListener) this);
    }

    public void onInflate(ViewStub viewStub, View view) {
        this.f28439e = view.findViewById(C5882c.snap_connect_bitmoji_error_button);
        this.f28436b = (TextView) view.findViewById(C5882c.snap_connect_bitmoji_error_title);
        this.f28437c = (TextView) view.findViewById(C5882c.snap_connect_bitmoji_error_message);
        this.f28438d = view.findViewById(C5882c.snap_connect_bitmoji_loading_icon);
        this.f28440f = view.findViewById(C5882c.snap_connect_bitmoji_error_button_text);
        this.f28439e.setOnClickListener(new C59201(this));
    }

    /* renamed from: a */
    public void m33715a(@StringRes int i, @StringRes int i2, @NonNull Runnable runnable) {
        this.f28435a.m25523a(0);
        this.f28436b.setText(i);
        this.f28437c.setText(i2);
        this.f28441g = runnable;
        this.f28440f.setVisibility(0);
        this.f28438d.setVisibility(8);
        this.f28439e.setClickable(1);
    }

    public void hide() {
        this.f28435a.m25523a(8);
    }

    @NonNull
    public BitmojiKitStickerPickerView getViewType() {
        return BitmojiKitStickerPickerView.UNRECOGNIZED;
    }
}
