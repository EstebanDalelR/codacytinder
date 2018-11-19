package com.tinder.auth.accountkit;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.facebook.accountkit.AccountKitError;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;

public class AccountKitErrorHeaderFragment extends Fragment implements C8270e {
    @Inject
    /* renamed from: a */
    C12564c f33728a;
    /* renamed from: b */
    private Unbinder f33729b;
    /* renamed from: c */
    private AccountKitError f33730c;
    @BindString(2131820578)
    String mAccountKItErrorMsgTemplate;
    @BindString(2131821765)
    String mDefaultErrorMessage;
    @BindView(2131361814)
    TextView mErrorText;
    @BindString(2131820958)
    String mPhoneNumberInvalidMessage;

    /* renamed from: a */
    public static AccountKitErrorHeaderFragment m42098a() {
        return new AccountKitErrorHeaderFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ManagerApp.e().inject(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(R.layout.fragment_accountkit_error_header, viewGroup, false);
        this.f33729b = ButterKnife.a(this, layoutInflater);
        return layoutInflater;
    }

    public void onStart() {
        super.onStart();
        this.f33728a.a(this);
    }

    public void onResume() {
        super.onResume();
        this.f33728a.m49672a(this.f33730c);
    }

    public void onDestroyView() {
        this.f33729b.unbind();
        super.onDestroyView();
    }

    /* renamed from: b */
    public void mo9215b() {
        m42099a(this.mPhoneNumberInvalidMessage);
    }

    /* renamed from: c */
    public void mo9216c() {
        m42099a(this.mDefaultErrorMessage);
    }

    /* renamed from: a */
    public void mo9214a(String str, int i) {
        m42099a(String.format(this.mAccountKItErrorMsgTemplate, new Object[]{str, Integer.valueOf(i)}));
    }

    /* renamed from: a */
    void m42100a(@Nullable AccountKitError accountKitError) {
        this.f33730c = accountKitError;
    }

    /* renamed from: a */
    private void m42099a(CharSequence charSequence) {
        this.mErrorText.setText(charSequence);
    }
}
