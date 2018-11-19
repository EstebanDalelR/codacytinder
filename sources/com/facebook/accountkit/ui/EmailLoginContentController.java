package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.C0436c;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.C1251w;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import com.facebook.accountkit.ui.SkinManager.Skin;
import com.facebook.accountkit.ui.TextContentFragment.NextButtonTextProvider;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest.C2430a;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

final class EmailLoginContentController extends C3210g implements C1313d {
    /* renamed from: a */
    private static final ButtonType f13030a = ButtonType.NEXT;
    /* renamed from: b */
    private static final LoginFlowState f13031b = LoginFlowState.EMAIL_INPUT;
    /* renamed from: c */
    private C4336a f13032c;
    /* renamed from: d */
    private ButtonType f13033d = f13030a;
    /* renamed from: f */
    private C4351a f13034f;
    /* renamed from: g */
    private C4132a f13035g;
    /* renamed from: h */
    private C4132a f13036h;
    /* renamed from: i */
    private C4438b f13037i;
    @Nullable
    /* renamed from: j */
    private TopFragment f13038j;
    /* renamed from: k */
    private OnCompleteListener f13039k;

    enum EmailSourceAppSupplied {
        NO_APP_SUPPLIED_EMAIL,
        APP_SUPPLIED_EMAIL_CHANGED,
        APP_SUPPLIED_EMAIL_USED
    }

    enum EmailSourceSelected {
        NO_SELECTABLE_EMAILS,
        SELECTED_CHANGED,
        SELECTED_NOT_USED,
        SELECTED_USED
    }

    public interface OnCompleteListener {
        void onNext(Context context, String str);
    }

    /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$1 */
    class C31951 implements NextButtonTextProvider {
        /* renamed from: a */
        final /* synthetic */ EmailLoginContentController f9785a;

        C31951(EmailLoginContentController emailLoginContentController) {
            this.f9785a = emailLoginContentController;
        }

        public String getNextButtonText() {
            if (this.f9785a.f13032c == null) {
                return null;
            }
            return this.f9785a.f13037i.getResources().getText(this.f9785a.f13032c.m17582c()).toString();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$2 */
    class C31962 implements OnEmailChangedListener {
        /* renamed from: a */
        final /* synthetic */ EmailLoginContentController f9786a;

        C31962(EmailLoginContentController emailLoginContentController) {
            this.f9786a = emailLoginContentController;
        }

        public void onEmailChanged() {
            this.f9786a.m16047m();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$3 */
    class C31973 implements OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ EmailLoginContentController f9787a;

        C31973(EmailLoginContentController emailLoginContentController) {
            this.f9787a = emailLoginContentController;
        }

        public void onNext(Context context, String str) {
            if (this.f9787a.f13038j != null) {
                String d = this.f9787a.f13038j.m17570d();
                if (d != null) {
                    d = d.trim();
                    if (Patterns.EMAIL_ADDRESS.matcher(d).matches()) {
                        if (this.f9787a.f13038j.f14215b != null) {
                            this.f9787a.f13038j.f14215b.setError(null);
                        }
                        C1219a.m4265a(str, EmailLoginContentController.m16037a(this.f9787a.f13038j.m17568c(), d).name(), EmailLoginContentController.m16038a(this.f9787a.f13038j.m17571e(), d, C1251w.m4514e(this.f9787a.f13038j.getActivity().getApplicationContext())).name(), d);
                        C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.EMAIL_LOGIN_COMPLETE).putExtra(LoginFlowBroadcastReceiver.f3415d, d));
                        return;
                    }
                    if (this.f9787a.f13036h != null) {
                        this.f9787a.f13036h.m16233a(C1194g.com_accountkit_email_invalid, new String[0]);
                    }
                    if (this.f9787a.f13038j.f14215b != null) {
                        this.f9787a.f13038j.f14215b.setError(context.getText(C1194g.com_accountkit_email_invalid));
                    }
                }
            }
        }
    }

    public static final class TopFragment extends C4127h {
        /* renamed from: a */
        private AutoCompleteTextView f14214a;
        /* renamed from: b */
        private TextInputLayout f14215b;
        /* renamed from: c */
        private OnEmailChangedListener f14216c;
        /* renamed from: d */
        private OnCompleteListener f14217d;

        /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$TopFragment$1 */
        class C12781 implements TextWatcher {
            /* renamed from: a */
            final /* synthetic */ TopFragment f3399a;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            C12781(TopFragment topFragment) {
                this.f3399a = topFragment;
            }

            public void afterTextChanged(Editable editable) {
                if (this.f3399a.f14216c != null) {
                    this.f3399a.f14216c.onEmailChanged();
                }
            }
        }

        /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$TopFragment$2 */
        class C12792 implements OnEditorActionListener {
            /* renamed from: a */
            final /* synthetic */ TopFragment f3400a;

            C12792(TopFragment topFragment) {
                this.f3400a = topFragment;
            }

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 5 || C1251w.m4500a(this.f3400a.m17570d()) != 0) {
                    return null;
                }
                if (this.f3400a.f14217d != 0) {
                    this.f3400a.f14217d.onNext(textView.getContext(), Buttons.EMAIL_LOGIN_NEXT_KEYBOARD.name());
                }
                return true;
            }
        }

        /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$TopFragment$3 */
        class C12803 implements OnItemClickListener {
            /* renamed from: a */
            final /* synthetic */ TopFragment f3401a;

            C12803(TopFragment topFragment) {
                this.f3401a = topFragment;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f3401a.m17569c(this.f3401a.f14214a.getText().toString());
            }
        }

        public interface OnEmailChangedListener {
            void onEmailChanged();
        }

        /* renamed from: b */
        boolean mo3699b() {
            return false;
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

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return EmailLoginContentController.f13031b;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_email_login_top, viewGroup, false);
        }

        public void onStart() {
            super.onStart();
            m17559f();
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            this.f14214a = (AutoCompleteTextView) view.findViewById(C1192e.com_accountkit_email);
            this.f14215b = (TextInputLayout) view.findViewById(C1192e.com_accountkit_email_layout);
            if (this.f14214a != null) {
                this.f14214a.addTextChangedListener(new C12781(this));
                this.f14214a.setOnEditorActionListener(new C12792(this));
                this.f14214a.setInputType(33);
            }
        }

        /* renamed from: f */
        private void m17559f() {
            Context activity = getActivity();
            List e = C1251w.m4514e(activity.getApplicationContext());
            if (e != null) {
                this.f14214a.setAdapter(new ArrayAdapter(activity, 17367050, e));
                this.f14214a.setOnItemClickListener(new C12803(this));
            }
            String c = m17568c();
            if (!C1251w.m4500a(c)) {
                this.f14214a.setText(c);
                this.f14214a.setSelection(c.length());
            } else if (C1251w.m4518g(getActivity())) {
                GoogleApiClient h = m16180h();
                if (h != null && m16181i() == EmailLoginContentController.f13031b && C1251w.m4500a(m17570d())) {
                    try {
                        getActivity().startIntentSenderForResult(C2422a.f7349g.getHintPickerIntent(h, new C2430a().m8800a(true).m8801a()).getIntentSender(), 152, null, 0, 0, 0);
                    } catch (Throwable e2) {
                        Log.w(e, "Failed to send intent", e2);
                    }
                }
            }
        }

        /* renamed from: a */
        public void m17565a(String str) {
            this.f14214a.setText(str);
            this.f14214a.setSelection(str.length());
        }

        /* renamed from: c */
        public String m17568c() {
            return m4590o().getString("appSuppliedEmail");
        }

        /* renamed from: b */
        public void m17566b(String str) {
            m4590o().putString("appSuppliedEmail", str);
        }

        @Nullable
        /* renamed from: d */
        public String m17570d() {
            if (this.f14214a == null) {
                return null;
            }
            return this.f14214a.getText().toString();
        }

        /* renamed from: a */
        public void m17563a(@Nullable OnCompleteListener onCompleteListener) {
            this.f14217d = onCompleteListener;
        }

        /* renamed from: a */
        public void m17564a(@Nullable OnEmailChangedListener onEmailChangedListener) {
            this.f14216c = onEmailChangedListener;
        }

        /* renamed from: e */
        public String m17571e() {
            return m4590o().getString("selectedEmail");
        }

        /* renamed from: c */
        public void m17569c(String str) {
            m4590o().putString("selectedEmail", str);
        }
    }

    /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$a */
    public static final class C4336a extends C4127h {
        /* renamed from: a */
        private Button f14218a;
        /* renamed from: b */
        private boolean f14219b;
        /* renamed from: c */
        private ButtonType f14220c = EmailLoginContentController.f13030a;
        /* renamed from: d */
        private OnCompleteListener f14221d;

        /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$a$1 */
        class C12811 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C4336a f3402a;

            C12811(C4336a c4336a) {
                this.f3402a = c4336a;
            }

            public void onClick(View view) {
                if (this.f3402a.f14221d != null) {
                    this.f3402a.f14221d.onNext(view.getContext(), Buttons.EMAIL_LOGIN_NEXT.name());
                }
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

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return EmailLoginContentController.f13031b;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            layoutInflater = layoutInflater.inflate(C1193f.com_accountkit_fragment_email_login_bottom, viewGroup, false);
            viewGroup = m4589n();
            if ((viewGroup instanceof SkinManager) == null || ((SkinManager) viewGroup).getSkin() != Skin.CONTEMPORARY) {
                return layoutInflater;
            }
            viewGroup = layoutInflater.findViewById(C1192e.com_accountkit_next_button);
            ((ViewGroup) layoutInflater).removeView(viewGroup);
            viewGroup.setLayoutParams(new LayoutParams(-1, -2));
            return viewGroup;
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            this.f14218a = (Button) view.findViewById(C1192e.com_accountkit_next_button);
            if (this.f14218a != null) {
                this.f14218a.setEnabled(this.f14219b);
                this.f14218a.setOnClickListener(new C12811(this));
            }
            m17573e();
        }

        /* renamed from: a */
        public void m17579a(boolean z) {
            this.f14219b = z;
            if (this.f14218a != null) {
                this.f14218a.setEnabled(z);
            }
        }

        /* renamed from: a */
        public void m17577a(ButtonType buttonType) {
            this.f14220c = buttonType;
            m17573e();
        }

        @StringRes
        /* renamed from: c */
        public int m17582c() {
            if (m17583d()) {
                return C1194g.com_accountkit_resend_email_text;
            }
            return this.f14220c.getValue();
        }

        /* renamed from: a */
        public void m17578a(@Nullable OnCompleteListener onCompleteListener) {
            this.f14221d = onCompleteListener;
        }

        /* renamed from: d */
        public boolean m17583d() {
            return m4590o().getBoolean("retry", false);
        }

        /* renamed from: b */
        public void m17580b(boolean z) {
            m4590o().putBoolean("retry", z);
            m17573e();
        }

        /* renamed from: e */
        private void m17573e() {
            if (this.f14218a != null) {
                this.f14218a.setText(m17582c());
            }
        }
    }

    /* renamed from: com.facebook.accountkit.ui.EmailLoginContentController$b */
    public static final class C4438b extends TextContentFragment {
        /* renamed from: b */
        boolean mo3699b() {
            return false;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo3968b(int i) {
            super.mo3968b(i);
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ int mo3969c() {
            return super.mo3969c();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo3970d() {
            return super.mo3970d();
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

        public /* bridge */ /* synthetic */ void onStart() {
            super.onStart();
        }

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return EmailLoginContentController.f13031b;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_email_login_text, viewGroup, false);
        }

        /* renamed from: a */
        protected Spanned mo3965a(String str) {
            return Html.fromHtml(getString(C1194g.com_accountkit_email_login_text, new Object[]{str, AccountKit.m4120i(), "https://www.accountkit.com/faq"}));
        }
    }

    /* renamed from: h */
    public boolean mo1632h() {
        return false;
    }

    EmailLoginContentController(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
        C1220c.m4300c();
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13032c == null) {
            mo3270a(new C4336a());
        }
        return this.f13032c;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4336a) {
            this.f13032c = (C4336a) c4127h;
            this.f13032c.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13032c.m17578a(m16048n());
            m16047m();
        }
    }

    /* renamed from: g */
    public ButtonType m16064g() {
        return this.f13033d;
    }

    /* renamed from: a */
    public void mo3257a(ButtonType buttonType) {
        this.f13033d = buttonType;
        m16047m();
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13034f = (C4351a) c4127h;
        }
    }

    @Nullable
    /* renamed from: i */
    public View m16066i() {
        if (this.f13038j == null) {
            return null;
        }
        return this.f13038j.f14214a;
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13035g = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13036h == null) {
            this.f13036h = C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_email_login_title, new String[0]);
        }
        return this.f13036h;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13036h = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13031b;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13037i == null) {
            m16061d(new C4438b());
        }
        return this.f13037i;
    }

    /* renamed from: d */
    public void m16061d(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4438b) {
            this.f13037i = (C4438b) c4127h;
            this.f13037i.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13037i.mo3967a(new C31951(this));
        }
    }

    @Nullable
    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13038j == null) {
            mo3273c(new TopFragment());
        }
        return this.f13038j;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof TopFragment) {
            this.f13038j = (TopFragment) c4127h;
            this.f13038j.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13038j.m17564a(new C31962(this));
            this.f13038j.m17563a(m16048n());
            if (!(this.e == null || this.e.getInitialEmail() == null)) {
                this.f13038j.m17566b(this.e.getInitialEmail());
            }
            m16047m();
        }
    }

    /* renamed from: j */
    void m16067j() {
        if (this.f13036h != null) {
            this.f13036h.m16233a(C1194g.com_accountkit_email_login_retry_title, new String[0]);
        }
        if (this.f13032c != null) {
            this.f13032c.m17580b(true);
        }
        if (this.f13037i != null) {
            this.f13037i.m17683e();
        }
    }

    /* renamed from: a */
    private static void m16040a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("autofill_email_method", str);
        C1219a.m4261a("ak_email_autofilled", bundle);
    }

    /* renamed from: a */
    public void mo1629a(int i, int i2, Intent intent) {
        super.mo1629a(i, i2, intent);
        if (i == 152 && i2 == -1) {
            Credential credential = (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY);
            if (credential != null && this.f13038j != 0) {
                this.f13038j.m17565a(credential.getId());
                m16040a("autofill_email_by_google");
            }
        }
    }

    /* renamed from: a */
    public void mo1630a(Activity activity) {
        super.mo1630a(activity);
        ag.m4608a(m16066i());
    }

    /* renamed from: m */
    private void m16047m() {
        if (this.f13038j != null) {
            if (this.f13032c != null) {
                this.f13032c.m17579a(C1251w.m4500a(this.f13038j.m17570d()) ^ 1);
                this.f13032c.m17577a(m16064g());
            }
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        if (this.f13032c != null) {
            C1219a.m4268a(this.f13032c.m17583d());
        }
    }

    /* renamed from: n */
    private OnCompleteListener m16048n() {
        if (this.f13039k == null) {
            this.f13039k = new C31973(this);
        }
        return this.f13039k;
    }

    /* renamed from: a */
    static EmailSourceAppSupplied m16037a(String str, String str2) {
        if (C1251w.m4500a(str)) {
            return EmailSourceAppSupplied.NO_APP_SUPPLIED_EMAIL;
        }
        if (str.equals(str2) != null) {
            return EmailSourceAppSupplied.APP_SUPPLIED_EMAIL_USED;
        }
        return EmailSourceAppSupplied.APP_SUPPLIED_EMAIL_CHANGED;
    }

    /* renamed from: a */
    static EmailSourceSelected m16038a(String str, String str2, List<String> list) {
        if (C1251w.m4500a(str)) {
            if (list == null || list.isEmpty() != null) {
                return EmailSourceSelected.NO_SELECTABLE_EMAILS;
            }
            return EmailSourceSelected.SELECTED_NOT_USED;
        } else if (str.equals(str2) != null) {
            return EmailSourceSelected.SELECTED_USED;
        } else {
            return EmailSourceSelected.SELECTED_CHANGED;
        }
    }
}
