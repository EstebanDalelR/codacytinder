package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.facebook.accountkit.ui.KeyboardObserver.OnVisibleFrameChangedListener;
import com.facebook.accountkit.ui.SkinManager.Skin;

/* renamed from: com.facebook.accountkit.ui.a */
abstract class C4461a extends AppCompatActivity {
    /* renamed from: a */
    public static final String f14845a = AccountKitConfiguration.TAG;
    /* renamed from: e */
    private static final String f14846e = AccountKitUpdateActivity.class.getSimpleName();
    /* renamed from: f */
    private static final String f14847f;
    @Nullable
    /* renamed from: b */
    AccountKitConfiguration f14848b;
    /* renamed from: c */
    UIManager f14849c;
    /* renamed from: d */
    AccountKitError f14850d;
    /* renamed from: g */
    private KeyboardObserver f14851g;
    /* renamed from: h */
    private final Bundle f14852h = new Bundle();

    /* renamed from: e */
    abstract void mo4067e();

    C4461a() {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f14846e);
        stringBuilder.append(".viewState");
        f14847f = stringBuilder.toString();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f14848b = (AccountKitConfiguration) getIntent().getParcelableExtra(f14845a);
        if (this.f14848b == null) {
            this.f14850d = new AccountKitError(Type.INITIALIZATION_ERROR, InternalAccountKitError.INVALID_INTENT_EXTRAS_CONFIGURATION);
            mo4067e();
            return;
        }
        this.f14849c = this.f14848b.getUIManager();
        if (ag.m4616b((Context) this, this.f14848b.getUIManager())) {
            int themeId = this.f14848b.getUIManager().getThemeId();
            if (themeId != -1) {
                setTheme(themeId);
            }
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
            if (!ag.m4610a((Context) this)) {
                setRequestedOrientation(1);
            }
            setContentView(C1193f.com_accountkit_activity_layout);
            final ConstrainedLinearLayout constrainedLinearLayout = (ConstrainedLinearLayout) findViewById(C1192e.com_accountkit_content_view);
            View findViewById = findViewById(C1192e.com_accountkit_scroll_view);
            if (!(constrainedLinearLayout == null || findViewById == null || constrainedLinearLayout.getMinHeight() >= 0 || constrainedLinearLayout.getRootView() == null)) {
                this.f14851g = new KeyboardObserver(findViewById);
                this.f14851g.m4563a(new OnVisibleFrameChangedListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4461a f9802b;

                    public void onVisibleFrameChanged(Rect rect) {
                        rect = rect.height();
                        if (rect >= null) {
                            constrainedLinearLayout.setMinHeight(rect);
                        }
                    }
                });
            }
            if (bundle != null) {
                this.f14852h.putAll(bundle.getBundle(f14847f));
            }
            ag.m4615b((Context) this, this.f14848b.getUIManager(), findViewById(C1192e.com_accountkit_background));
            return;
        }
        C1219a.m4276c();
        this.f14850d = new AccountKitError(Type.INITIALIZATION_ERROR, InternalAccountKitError.INVALID_BACKGROUND_CONTRACT);
        mo4067e();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle(f14847f, this.f14852h);
        super.onSaveInstanceState(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f14851g != null) {
            this.f14851g.m4563a(null);
            this.f14851g = null;
        }
    }

    /* renamed from: b */
    void m18690b(C1314f c1314f) {
        if (ag.m4612a(this.f14849c, Skin.CONTEMPORARY)) {
            FragmentManager fragmentManager = getFragmentManager();
            if (c1314f == null) {
                c1314f = fragmentManager.beginTransaction();
                if (m18688a(c1314f, C1192e.com_accountkit_content_bottom_fragment) == null) {
                    m18688a(c1314f, C1192e.com_accountkit_content_bottom_keyboard_fragment);
                }
                c1314f.commit();
                return;
            }
            c1314f = c1314f.mo3259b();
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (c1314f.mo3699b()) {
                m18688a(beginTransaction, C1192e.com_accountkit_content_bottom_fragment);
                m18689a(beginTransaction, C1192e.com_accountkit_content_bottom_keyboard_fragment, c1314f);
            } else {
                m18688a(beginTransaction, C1192e.com_accountkit_content_bottom_keyboard_fragment);
                m18689a(beginTransaction, C1192e.com_accountkit_content_bottom_fragment, c1314f);
            }
            beginTransaction.commit();
        }
    }

    /* renamed from: a */
    void m18689a(FragmentTransaction fragmentTransaction, int i, Fragment fragment) {
        if (getFragmentManager().findFragmentById(i) != fragment) {
            fragmentTransaction.replace(i, fragment);
        }
    }

    /* renamed from: a */
    Fragment m18688a(FragmentTransaction fragmentTransaction, int i) {
        i = getFragmentManager().findFragmentById(i);
        if (i != 0) {
            fragmentTransaction.remove(i);
        }
        return i;
    }
}
