package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.text.Html;
import android.widget.TextView;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.LoginModel;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.C1251w;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import com.facebook.accountkit.ui.PrivacyPolicyFragment.OnCompleteListener;

/* renamed from: com.facebook.accountkit.ui.e */
final class C4126e extends C3210g implements C1313d {
    /* renamed from: c */
    private static final ButtonType f13087c = ButtonType.CONTINUE;
    /* renamed from: d */
    private static final LoginFlowState f13088d = LoginFlowState.CONFIRM_ACCOUNT_VERIFIED;
    /* renamed from: a */
    C4132a f13089a;
    /* renamed from: b */
    C4132a f13090b;
    /* renamed from: f */
    private PrivacyPolicyFragment f13091f;
    /* renamed from: g */
    private ButtonType f13092g = f13087c;
    /* renamed from: h */
    private C4127h f13093h;
    /* renamed from: i */
    private C4127h f13094i;
    /* renamed from: j */
    private C4127h f13095j;
    /* renamed from: k */
    private OnCompleteListener f13096k;

    /* renamed from: com.facebook.accountkit.ui.e$1 */
    class C32091 implements OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ C4126e f9810a;

        public void onRetry(Context context) {
        }

        C32091(C4126e c4126e) {
            this.f9810a = c4126e;
        }

        public void onNext(Context context, String str) {
            if (this.f9810a.f13095j != null) {
                if (this.f9810a.f13091f != null) {
                    C1219a.m4282d(str);
                    C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.CONFIRM_SEAMLESS_LOGIN));
                }
            }
        }
    }

    /* renamed from: com.facebook.accountkit.ui.e$a */
    public static class C4441a extends PrivacyPolicyFragment {
        /* renamed from: a */
        public static C4441a m18467a(@NonNull UIManager uIManager, @NonNull LoginFlowState loginFlowState, @NonNull ButtonType buttonType) {
            C4441a c4441a = new C4441a();
            c4441a.m4590o().putParcelable(af.f3455f, uIManager);
            c4441a.m17646a(loginFlowState);
            c4441a.m17645a(buttonType);
            return c4441a;
        }

        /* renamed from: a */
        protected void mo3972a(TextView textView, CharSequence charSequence) {
            if (textView != null && getActivity() != null) {
                LoginModel g = AccountKit.m4118g();
                if (g == null || C1251w.m4500a(g.getPrivacyPolicy())) {
                    textView.setText(Html.fromHtml(getString(C1194g.com_accountkit_confirmation_code_agreement_instant_verification, new Object[]{charSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", "https://www.accountkit.com/faq"})));
                } else if (C1251w.m4500a(g.getTermsOfService())) {
                    textView.setText(Html.fromHtml(getString(C1194g.f3163x43e88c5c, new Object[]{charSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", g.getPrivacyPolicy(), AccountKit.m4120i(), "https://www.accountkit.com/faq"})));
                } else {
                    textView.setText(Html.fromHtml(getString(C1194g.f3162x1afe87bc, new Object[]{charSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", g.getPrivacyPolicy(), g.getTermsOfService(), AccountKit.m4120i(), "https://www.accountkit.com/faq"})));
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo1632h() {
        return false;
    }

    C4126e(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13091f == null) {
            mo3270a(C4441a.m18467a(this.e.getUIManager(), f13088d, f13087c));
        }
        return this.f13091f;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4441a) {
            this.f13091f = (C4441a) c4127h;
            this.f13091f.m17647a(m16162j());
            this.f13091f.m17649b(false);
            m16161i();
        }
    }

    /* renamed from: g */
    public ButtonType m16176g() {
        return this.f13092g;
    }

    /* renamed from: a */
    public void mo3257a(ButtonType buttonType) {
        this.f13092g = buttonType;
        m16161i();
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        this.f13093h = c4127h;
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13089a = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13090b == null) {
            mo3271b(C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_account_verified, new String[0]));
        }
        return this.f13090b;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13090b = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13088d;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13094i == null) {
            m16173d(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13094i;
    }

    /* renamed from: d */
    public void m16173d(@Nullable C4127h c4127h) {
        this.f13094i = c4127h;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13095j == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13095j;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        this.f13095j = c4127h;
    }

    /* renamed from: i */
    private void m16161i() {
        if (this.f13095j != null) {
            if (this.f13091f != null) {
                this.f13091f.m17645a(m16176g());
            }
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        if (this.f13091f != null) {
            C1219a.m4287f(true);
        }
    }

    /* renamed from: j */
    private OnCompleteListener m16162j() {
        if (this.f13096k == null) {
            this.f13096k = new C32091(this);
        }
        return this.f13096k;
    }
}
