package com.facebook.accountkit.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.PhoneLoginModel;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.C1251w;
import com.facebook.accountkit.ui.C1316j.C1315a;
import com.facebook.accountkit.ui.SkinManager.Skin;

public class PrivacyPolicyFragment extends C4127h {
    /* renamed from: a */
    private boolean f14232a = true;
    /* renamed from: b */
    private OnCompleteListener f14233b;
    /* renamed from: c */
    private ButtonType f14234c;
    /* renamed from: d */
    private LoginFlowState f14235d;
    /* renamed from: g */
    private TextView f14236g;
    /* renamed from: h */
    private Button f14237h;
    /* renamed from: i */
    private boolean f14238i = true;
    /* renamed from: j */
    private TextView f14239j;

    /* renamed from: com.facebook.accountkit.ui.PrivacyPolicyFragment$1 */
    class C12941 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PrivacyPolicyFragment f3432a;

        C12941(PrivacyPolicyFragment privacyPolicyFragment) {
            this.f3432a = privacyPolicyFragment;
        }

        public void onClick(View view) {
            if (this.f3432a.f14233b != null) {
                this.f3432a.f14233b.onNext(view.getContext(), Buttons.ENTER_CONFIRMATION_CODE.name());
            }
        }
    }

    /* renamed from: com.facebook.accountkit.ui.PrivacyPolicyFragment$2 */
    class C12952 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PrivacyPolicyFragment f3433a;

        C12952(PrivacyPolicyFragment privacyPolicyFragment) {
            this.f3433a = privacyPolicyFragment;
        }

        public void onClick(View view) {
            C1219a.m4277c(Buttons.DID_NOT_GET_CODE.name());
            if (this.f3433a.f14233b != null) {
                this.f3433a.f14233b.onRetry(view.getContext());
            }
        }
    }

    public interface OnCompleteListener {
        void onNext(Context context, String str);

        void onRetry(Context context);
    }

    /* renamed from: com.facebook.accountkit.ui.PrivacyPolicyFragment$3 */
    class C32023 implements C1315a {
        /* renamed from: a */
        final /* synthetic */ PrivacyPolicyFragment f9796a;

        C32023(PrivacyPolicyFragment privacyPolicyFragment) {
            this.f9796a = privacyPolicyFragment;
        }

        /* renamed from: a */
        public void mo1619a(String str) {
            C1219a.m4273b(Buttons.POLICY_LINKS.name(), str);
        }
    }

    /* renamed from: b */
    boolean mo3699b() {
        return true;
    }

    public /* bridge */ /* synthetic */ void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public /* bridge */ /* synthetic */ void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    public static PrivacyPolicyFragment m17640b(@NonNull UIManager uIManager, @NonNull LoginFlowState loginFlowState, @NonNull ButtonType buttonType) {
        PrivacyPolicyFragment privacyPolicyFragment = new PrivacyPolicyFragment();
        privacyPolicyFragment.m4590o().putParcelable(af.f3455f, uIManager);
        privacyPolicyFragment.m17646a(loginFlowState);
        privacyPolicyFragment.m17645a(buttonType);
        return privacyPolicyFragment;
    }

    /* renamed from: a */
    public LoginFlowState mo3698a() {
        return this.f14235d;
    }

    /* renamed from: a */
    protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C1193f.com_accountkit_fragment_confirmation_code_bottom, viewGroup, false);
        if (ag.m4612a(m4589n(), Skin.CONTEMPORARY) != null) {
            viewGroup = viewGroup2.findViewById(C1192e.com_accountkit_next_button);
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
            bundle = viewGroup2.findViewById(C1192e.com_accountkit_space);
            ((ViewGroup) bundle.getParent()).removeView(bundle);
            viewGroup2.addView(bundle);
            viewGroup2.addView(viewGroup);
        }
        return viewGroup2;
    }

    /* renamed from: a */
    protected void mo3277a(View view, Bundle bundle) {
        super.mo3277a(view, bundle);
        this.f14234c = ButtonType.values()[bundle.getInt("next_button_type")];
        this.f14235d = LoginFlowState.values()[bundle.getInt("login_flow_state")];
        this.f14238i = bundle.getBoolean("retry button visible", true);
        this.f14237h = (Button) view.findViewById(C1192e.com_accountkit_next_button);
        this.f14236g = (TextView) view.findViewById(C1192e.com_accountkit_retry_button);
        if (this.f14237h != null) {
            this.f14237h.setEnabled(this.f14232a);
            this.f14237h.setOnClickListener(new C12941(this));
            this.f14237h.setText(this.f14234c.getValue());
        }
        if (this.f14236g != null) {
            this.f14236g.setVisibility(this.f14238i ? 0 : 8);
            this.f14236g.setOnClickListener(new C12952(this));
            this.f14236g.setTextColor(ag.m4617c(getActivity(), m4589n()));
        }
        this.f14239j = (TextView) view.findViewById(C1192e.com_accountkit_confirmation_code_agreement);
        if (this.f14239j != null) {
            this.f14239j.setMovementMethod(new C1316j(new C32023(this)));
        }
        mo3972a(this.f14239j, this.f14237h.getText());
    }

    public void onStart() {
        super.onStart();
        mo3972a(this.f14239j, this.f14237h.getText());
    }

    /* renamed from: a */
    public void m17645a(ButtonType buttonType) {
        this.f14234c = buttonType;
        m4590o().putInt("next_button_type", this.f14234c.ordinal());
        if (this.f14237h != null) {
            this.f14237h.setText(buttonType.getValue());
        }
    }

    /* renamed from: a */
    public void m17648a(boolean z) {
        this.f14232a = z;
        if (this.f14237h != null) {
            this.f14237h.setEnabled(z);
        }
    }

    /* renamed from: b */
    public void m17649b(boolean z) {
        this.f14238i = z;
        m4590o().putBoolean("retry button visible", this.f14238i);
        if (this.f14236g != null) {
            this.f14236g.setVisibility(z ? false : true);
        }
    }

    /* renamed from: a */
    public void m17647a(@Nullable OnCompleteListener onCompleteListener) {
        this.f14233b = onCompleteListener;
    }

    /* renamed from: c */
    public boolean m17652c() {
        return m4590o().getBoolean("retry", false);
    }

    /* renamed from: c */
    public void m17651c(boolean z) {
        m4590o().putBoolean("retry", z);
    }

    /* renamed from: a */
    protected void mo3972a(TextView textView, CharSequence charSequence) {
        if (textView != null && getActivity() != null) {
            PhoneLoginModel f = AccountKit.m4117f();
            if (f == null || C1251w.m4500a(f.getPrivacyPolicy())) {
                textView.setText(m17638a(charSequence));
            } else if (C1251w.m4500a(f.getTermsOfService())) {
                textView.setText(Html.fromHtml(getString(C1194g.com_accountkit_confirmation_code_agreement_app_privacy_policy, new Object[]{charSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", f.getPrivacyPolicy(), AccountKit.m4120i()})));
            } else {
                textView.setText(Html.fromHtml(getString(C1194g.f3161xaaa1945c, new Object[]{charSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", f.getPrivacyPolicy(), f.getTermsOfService(), AccountKit.m4120i()})));
            }
        }
    }

    @SuppressLint({"StringFormatMatches"})
    /* renamed from: a */
    private Spanned m17638a(CharSequence charSequence) {
        return Html.fromHtml(getString(C1194g.com_accountkit_confirmation_code_agreement, new Object[]{charSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/"}));
    }

    /* renamed from: a */
    protected void m17646a(@NonNull LoginFlowState loginFlowState) {
        this.f14235d = loginFlowState;
        m4590o().putInt("login_flow_state", loginFlowState.ordinal());
    }
}
