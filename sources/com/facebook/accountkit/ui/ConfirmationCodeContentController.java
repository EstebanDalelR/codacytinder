package com.facebook.accountkit.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.C1251w;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.NotifyingEditText.PasteListener;
import com.facebook.accountkit.ui.PrivacyPolicyFragment.OnCompleteListener;

abstract class ConfirmationCodeContentController extends C3210g implements C1313d {
    /* renamed from: f */
    private static final LoginFlowState f13021f = LoginFlowState.CODE_INPUT;
    /* renamed from: g */
    private static final ButtonType f13022g = ButtonType.CONTINUE;
    /* renamed from: a */
    C4132a f13023a;
    @Nullable
    /* renamed from: b */
    TitleFragment f13024b;
    @Nullable
    /* renamed from: c */
    C4335a f13025c;
    @Nullable
    /* renamed from: d */
    PrivacyPolicyFragment f13026d;
    /* renamed from: h */
    private ButtonType f13027h = f13022g;
    /* renamed from: i */
    private C4351a f13028i;
    /* renamed from: j */
    private C4351a f13029j;

    public static abstract class TitleFragment extends C4132a {
        @Nullable
        /* renamed from: a */
        OnCompleteListener f14208a;
        @Nullable
        /* renamed from: b */
        PhoneNumber f14209b;
        /* renamed from: c */
        boolean f14210c = false;

        public interface OnCompleteListener {
            void onEdit(Context context);
        }

        /* renamed from: a */
        abstract void mo3697a();

        /* renamed from: a */
        public View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_title, viewGroup, false);
        }

        /* renamed from: a */
        void m17526a(PhoneNumber phoneNumber) {
            this.f14209b = phoneNumber;
            mo3697a();
        }

        /* renamed from: a */
        void m17528a(boolean z) {
            this.f14210c = z;
            mo3697a();
        }

        /* renamed from: a */
        void m17527a(@Nullable OnCompleteListener onCompleteListener) {
            this.f14208a = onCompleteListener;
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            mo3697a();
        }

        public void onResume() {
            super.onResume();
            mo3697a();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.ConfirmationCodeContentController$a */
    public static final class C4335a extends C4127h {
        @Nullable
        /* renamed from: a */
        private EditText[] f14211a;
        /* renamed from: b */
        private C1268a f14212b;
        /* renamed from: c */
        private OnCompleteListener f14213c;

        /* renamed from: com.facebook.accountkit.ui.ConfirmationCodeContentController$a$1 */
        class C12651 implements OnEditorActionListener {
            /* renamed from: a */
            final /* synthetic */ C4335a f3384a;

            C12651(C4335a c4335a) {
                this.f3384a = c4335a;
            }

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (!(i != 5 || this.f3384a.m17554g() == 0 || this.f3384a.f14213c == 0)) {
                    this.f3384a.f14213c.onNext(textView.getContext(), Buttons.ENTER_CONFIRMATION_CODE_KEYBOARD.name());
                }
                return true;
            }
        }

        /* renamed from: com.facebook.accountkit.ui.ConfirmationCodeContentController$a$2 */
        class C12662 implements OnKeyListener {
            /* renamed from: a */
            final /* synthetic */ C4335a f3385a;

            C12662(C4335a c4335a) {
                this.f3385a = c4335a;
            }

            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                view = (EditText) view;
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 0) {
                    view.setText(Character.toString((char) keyEvent.getUnicodeChar()));
                    return true;
                } else if (i != 67 || keyEvent.getAction() != 0) {
                    return null;
                } else {
                    if (view.getText().length() == 0) {
                        view = this.f3385a.m17537c(view);
                        if (view != null) {
                            view.setText("");
                        }
                    } else {
                        view.setText("");
                    }
                    return true;
                }
            }
        }

        /* renamed from: com.facebook.accountkit.ui.ConfirmationCodeContentController$a$a */
        interface C1268a {
            /* renamed from: a */
            void mo1625a();
        }

        /* renamed from: com.facebook.accountkit.ui.ConfirmationCodeContentController$a$3 */
        class C31943 implements PasteListener {
            /* renamed from: a */
            final /* synthetic */ C4335a f9784a;

            C31943(C4335a c4335a) {
                this.f9784a = c4335a;
            }

            public void onTextPaste() {
                char[] a = ConfirmationCodeContentController.m16019b(this.f9784a.getActivity());
                if (a != null && this.f9784a.f14211a != null) {
                    for (int i = 0; i < a.length; i++) {
                        this.f9784a.f14211a[i].setText(String.valueOf(a[i]));
                    }
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
            return ConfirmationCodeContentController.f13021f;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_confirmation_code_top, viewGroup, false);
        }

        @Nullable
        /* renamed from: c */
        public View m17550c() {
            if (this.f14211a == null) {
                return null;
            }
            for (View view : this.f14211a) {
                if (view.getText().length() == 0) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: j */
        private void m17540j() {
            if (this.f14211a != null && m4590o().getBoolean("is_error_restart", false)) {
                for (EditText text : this.f14211a) {
                    text.setText("");
                }
                m4590o().putBoolean("is_error_restart", false);
            }
        }

        public void onResume() {
            super.onResume();
            m17540j();
            ag.m4608a(m17550c());
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            bundle = m4589n();
            if (bundle instanceof BaseUIManager) {
                bundle = ((BaseUIManager) bundle).getFlowState();
                if (bundle == LoginFlowState.ERROR) {
                    this.f14211a = null;
                    m4590o().putBoolean("is_error_restart", true);
                    return;
                } else if (bundle == LoginFlowState.VERIFIED) {
                    return;
                }
            }
            bundle = new EditText[6];
            int i = 0;
            bundle[0] = (EditText) view.findViewById(C1192e.com_accountkit_confirmation_code_1);
            bundle[1] = (EditText) view.findViewById(C1192e.com_accountkit_confirmation_code_2);
            bundle[2] = (EditText) view.findViewById(C1192e.com_accountkit_confirmation_code_3);
            bundle[3] = (EditText) view.findViewById(C1192e.com_accountkit_confirmation_code_4);
            bundle[4] = (EditText) view.findViewById(C1192e.com_accountkit_confirmation_code_5);
            bundle[5] = (EditText) view.findViewById(C1192e.com_accountkit_confirmation_code_6);
            this.f14211a = bundle;
            for (EditText editText : this.f14211a) {
                if (editText.getText().length() != 0) {
                    editText.clearFocus();
                }
            }
            view = new C12651(this);
            bundle = new C12662(this);
            EditText[] editTextArr = this.f14211a;
            int length = editTextArr.length;
            while (i < length) {
                final EditText editText2 = editTextArr[i];
                editText2.setRawInputType(18);
                editText2.setOnEditorActionListener(view);
                editText2.setOnKeyListener(bundle);
                if (editText2 instanceof NotifyingEditText) {
                    NotifyingEditText notifyingEditText = (NotifyingEditText) editText2;
                    notifyingEditText.setOnSoftKeyListener(bundle);
                    notifyingEditText.setPasteListener(new C31943(this));
                }
                editText2.addTextChangedListener(new TextWatcher(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4335a f3387b;

                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public void afterTextChanged(Editable editable) {
                        if (!this.f3387b.m17541k()) {
                            this.f3387b.m17533a(true);
                            C1219a.m4273b(Buttons.CONFIRMATION_CODE_FIRST_DIGIT.name(), null);
                        }
                        if (editable.length() == 1) {
                            this.f3387b.m17534b(editText2);
                        }
                        if (this.f3387b.f14212b != null) {
                            this.f3387b.f14212b.mo1625a();
                        }
                    }
                });
                i++;
            }
            m17542l();
            ag.m4608a(m17550c());
        }

        @Nullable
        /* renamed from: d */
        public String m17551d() {
            if (this.f14211a == null) {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (EditText text : this.f14211a) {
                stringBuilder.append(text.getText());
            }
            return stringBuilder.toString();
        }

        @Nullable
        /* renamed from: e */
        public String m17552e() {
            return m4590o().getString("detectedConfirmationCode");
        }

        /* renamed from: a */
        public void m17548a(@Nullable String str) {
            m4590o().putString("detectedConfirmationCode", str);
            m17542l();
        }

        /* renamed from: a */
        public void m17547a(@Nullable OnCompleteListener onCompleteListener) {
            this.f14213c = onCompleteListener;
        }

        /* renamed from: a */
        public void m17546a(@Nullable C1268a c1268a) {
            this.f14212b = c1268a;
        }

        /* renamed from: f */
        public void m17553f() {
            if (this.f14211a != null) {
                for (EditText text : this.f14211a) {
                    text.setText("");
                }
                if (this.f14211a.length > 0) {
                    this.f14211a[0].requestFocus();
                }
            }
        }

        /* renamed from: k */
        private boolean m17541k() {
            return m4590o().getBoolean("textUpdated", false);
        }

        /* renamed from: a */
        private void m17533a(boolean z) {
            m4590o().putBoolean("textUpdated", z);
        }

        /* renamed from: a */
        private int m17529a(View view) {
            if (!(this.f14211a == null || view == null)) {
                int length = this.f14211a.length;
                for (int i = 0; i < length; i++) {
                    if (this.f14211a[i] == view) {
                        return i;
                    }
                }
            }
            return -1;
        }

        /* renamed from: b */
        private EditText m17534b(View view) {
            if (this.f14211a == null) {
                return null;
            }
            view = m17529a(view);
            if (view < this.f14211a.length - 1) {
                view = this.f14211a[view + 1];
                view.requestFocus();
                return view;
            }
            this.f14211a[this.f14211a.length - 1].setSelection(1);
            return null;
        }

        /* renamed from: c */
        private EditText m17537c(View view) {
            if (this.f14211a == null) {
                return null;
            }
            view = m17529a(view);
            if (view <= null) {
                return null;
            }
            view = this.f14211a[view - 1];
            view.requestFocus();
            return view;
        }

        /* renamed from: g */
        public boolean m17554g() {
            if (this.f14211a == null) {
                return false;
            }
            for (EditText text : this.f14211a) {
                if (text.getText().length() != 1) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: l */
        private void m17542l() {
            if (this.f14211a != null) {
                String e = m17552e();
                if (!C1251w.m4500a(e)) {
                    int length = e.length();
                    if (length == this.f14211a.length) {
                        EditText[] editTextArr = this.f14211a;
                        int length2 = editTextArr.length;
                        int i = 0;
                        while (i < length2) {
                            if (editTextArr[i].getText().length() == 0) {
                                i++;
                            } else {
                                return;
                            }
                        }
                        for (int i2 = 0; i2 < length; i2++) {
                            this.f14211a[i2].setText(Character.toString(e.charAt(i2)));
                        }
                        this.f14211a[this.f14211a.length - 1].setSelection(1);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo1632h() {
        return false;
    }

    ConfirmationCodeContentController(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13026d == null) {
            mo3270a(PrivacyPolicyFragment.m17640b(this.e.getUIManager(), f13021f, m16034g()));
        }
        return this.f13026d;
    }

    /* renamed from: g */
    public ButtonType m16034g() {
        return this.f13027h;
    }

    /* renamed from: a */
    public void mo3257a(ButtonType buttonType) {
        this.f13027h = buttonType;
        m16036i();
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13028i = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13023a = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return LoginFlowState.CODE_INPUT;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13029j == null) {
            m16031d(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13029j;
    }

    /* renamed from: d */
    public void m16031d(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13029j = (C4351a) c4127h;
        }
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13025c == null) {
            mo3273c(new C4335a());
        }
        return this.f13025c;
    }

    /* renamed from: a */
    void m16023a(@Nullable PhoneNumber phoneNumber) {
        if (this.f13024b != null) {
            this.f13024b.m17526a(phoneNumber);
        }
    }

    /* renamed from: a */
    void m16026a(@Nullable String str) {
        if (this.f13025c != null) {
            this.f13025c.m17548a(str);
        }
    }

    /* renamed from: i */
    void m16036i() {
        if (this.f13025c != null) {
            if (this.f13026d != null) {
                this.f13026d.m17648a(this.f13025c.m17554g());
                this.f13026d.m17645a(m16034g());
            }
        }
    }

    /* renamed from: a */
    void m16027a(boolean z) {
        if (this.f13024b != null) {
            this.f13024b.m17528a(z);
        }
        if (this.f13026d != null) {
            this.f13026d.m17651c(z);
        }
        if (z && this.f13025c) {
            this.f13025c.m17553f();
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        if (this.f13025c != null) {
            if (this.f13026d != null) {
                C1219a.m4274b(this.f13026d.m17652c());
            }
        }
    }

    /* renamed from: b */
    private static char[] m16019b(Context context) {
        context = m16020c(context);
        return (context != null && context.length() == 6 && context.matches("[0-9]+")) ? context.toCharArray() : null;
    }

    /* renamed from: c */
    private static String m16020c(Context context) {
        if (context == null) {
            return null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            context = clipboardManager.getPrimaryClip().getItemAt(0);
            if (context.getText() != null) {
                return context.getText().toString();
            }
        }
        return null;
    }
}
