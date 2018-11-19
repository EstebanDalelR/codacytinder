package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.C1251w;
import com.facebook.accountkit.ui.AccountKitSpinner.OnSpinnerEventsListener;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.PhoneCountryCodeAdapter.ValueData;
import com.facebook.accountkit.ui.SkinManager.Skin;
import com.facebook.accountkit.ui.TextContentFragment.NextButtonTextProvider;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

abstract class PhoneContentController extends C3210g implements C1313d {
    /* renamed from: g */
    private static final LoginFlowState f13042g = LoginFlowState.PHONE_NUMBER_INPUT;
    /* renamed from: h */
    private static final ButtonType f13043h = ButtonType.NEXT;
    @Nullable
    /* renamed from: a */
    C4338d f13044a;
    @Nullable
    /* renamed from: b */
    C4337a f13045b;
    @Nullable
    /* renamed from: c */
    C4439c f13046c;
    @Nullable
    /* renamed from: d */
    C4132a f13047d;
    /* renamed from: f */
    C1287b f13048f;
    /* renamed from: i */
    private ButtonType f13049i = f13043h;
    /* renamed from: j */
    private C4351a f13050j;
    /* renamed from: k */
    private C4132a f13051k;

    enum PhoneNumberSource {
        UNKNOWN,
        APP_SUPPLIED_PHONE_NUMBER,
        APP_SUPPLIED_AND_DEVICE_PHONE_NUMBER,
        DEVICE_PHONE_NUMBER,
        DEVICE_PHONE_NUMBER_AND_APP_NUMBER_NOT_SUPPLIED,
        DEVICE_PHONE_NUMBER_NOT_SUPPLIED
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneContentController$b */
    interface C1287b {
        /* renamed from: a */
        void mo1634a(Context context, String str);
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneContentController$1 */
    class C31981 implements NextButtonTextProvider {
        /* renamed from: a */
        final /* synthetic */ PhoneContentController f9788a;

        C31981(PhoneContentController phoneContentController) {
            this.f9788a = phoneContentController;
        }

        @Nullable
        public String getNextButtonText() {
            if (this.f9788a.f13045b == null) {
                return null;
            }
            return this.f9788a.f13046c.getResources().getText(this.f9788a.f13045b.m17594c()).toString();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneContentController$2 */
    class C31992 implements C1289a {
        /* renamed from: a */
        final /* synthetic */ PhoneContentController f9789a;

        C31992(PhoneContentController phoneContentController) {
            this.f9789a = phoneContentController;
        }

        /* renamed from: a */
        public void mo1614a() {
            this.f9789a.mo3701o();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneContentController$a */
    public static final class C4337a extends C4127h {
        @Nullable
        /* renamed from: a */
        private Button f14222a;
        /* renamed from: b */
        private boolean f14223b;
        /* renamed from: c */
        private ButtonType f14224c = PhoneContentController.f13043h;
        @Nullable
        /* renamed from: d */
        private C1287b f14225d;

        /* renamed from: com.facebook.accountkit.ui.PhoneContentController$a$1 */
        class C12861 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C4337a f3421a;

            C12861(C4337a c4337a) {
                this.f3421a = c4337a;
            }

            public void onClick(View view) {
                if (this.f3421a.f14225d != null) {
                    this.f3421a.f14225d.mo1634a(view.getContext(), Buttons.PHONE_LOGIN_NEXT.name());
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
            return PhoneContentController.f13042g;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            layoutInflater = layoutInflater.inflate(C1193f.com_accountkit_fragment_phone_login_bottom, viewGroup, false);
            if (ag.m4612a(m4589n(), Skin.CONTEMPORARY) == null) {
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
            this.f14222a = (Button) view.findViewById(C1192e.com_accountkit_next_button);
            if (this.f14222a != null) {
                this.f14222a.setEnabled(this.f14223b);
                this.f14222a.setOnClickListener(new C12861(this));
            }
            m17585e();
        }

        /* renamed from: a */
        public void m17591a(boolean z) {
            this.f14223b = z;
            if (this.f14222a != null) {
                this.f14222a.setEnabled(z);
            }
        }

        /* renamed from: a */
        public void m17589a(ButtonType buttonType) {
            this.f14224c = buttonType;
            m17585e();
        }

        @StringRes
        /* renamed from: c */
        public int m17594c() {
            if (m17595d()) {
                return C1194g.com_accountkit_button_resend_sms;
            }
            return this.f14224c.getValue();
        }

        /* renamed from: a */
        public void m17590a(@Nullable C1287b c1287b) {
            this.f14225d = c1287b;
        }

        /* renamed from: d */
        public boolean m17595d() {
            return m4590o().getBoolean("retry", false);
        }

        /* renamed from: b */
        public void m17592b(boolean z) {
            m4590o().putBoolean("retry", z);
            m17585e();
        }

        /* renamed from: e */
        private void m17585e() {
            if (this.f14222a != null) {
                this.f14222a.setText(m17594c());
            }
        }
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneContentController$d */
    public static final class C4338d extends C4127h {
        /* renamed from: a */
        private boolean f14226a;
        @Nullable
        /* renamed from: b */
        private EditText f14227b;
        @Nullable
        /* renamed from: c */
        private AccountKitSpinner f14228c;
        /* renamed from: d */
        private PhoneCountryCodeAdapter f14229d;
        @Nullable
        /* renamed from: g */
        private C1287b f14230g;
        @Nullable
        /* renamed from: h */
        private C1289a f14231h;

        /* renamed from: com.facebook.accountkit.ui.PhoneContentController$d$3 */
        class C12883 implements OnEditorActionListener {
            /* renamed from: a */
            final /* synthetic */ C4338d f3422a;

            C12883(C4338d c4338d) {
                this.f3422a = c4338d;
            }

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 5 || this.f3422a.f14226a == 0) {
                    return null;
                }
                if (this.f3422a.f14230g != 0) {
                    this.f3422a.f14230g.mo1634a(textView.getContext(), Buttons.PHONE_LOGIN_NEXT_KEYBOARD.name());
                }
                return true;
            }
        }

        /* renamed from: com.facebook.accountkit.ui.PhoneContentController$d$a */
        interface C1289a {
            /* renamed from: a */
            void mo1614a();
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
            return PhoneContentController.f13042g;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_phone_login_top, viewGroup, false);
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            this.f14228c = (AccountKitSpinner) view.findViewById(C1192e.com_accountkit_country_code);
            this.f14227b = (EditText) view.findViewById(C1192e.com_accountkit_phone_number);
            final Activity activity = getActivity();
            final View view2 = this.f14227b;
            final AccountKitSpinner accountKitSpinner = this.f14228c;
            if (!(activity == null || view2 == null)) {
                if (accountKitSpinner != null) {
                    this.f14229d = new PhoneCountryCodeAdapter(activity, m4589n(), m17632f(), m17633g());
                    accountKitSpinner.setAdapter(this.f14229d);
                    PhoneNumber a = m17596a(activity);
                    ValueData a2 = this.f14229d.m4580a(a, m17631e());
                    m17601a(a2);
                    accountKitSpinner.setSelection(a2.position);
                    accountKitSpinner.setOnSpinnerEventsListener(new OnSpinnerEventsListener(this) {
                        /* renamed from: d */
                        final /* synthetic */ C4338d f9793d;

                        public void onSpinnerOpened() {
                            C1219a.m4270a(true, ((ValueData) accountKitSpinner.getSelectedItem()).countryCode);
                            ag.m4598a(activity);
                        }

                        public void onSpinnerClosed() {
                            C1219a.m4270a(false, ((ValueData) accountKitSpinner.getSelectedItem()).countryCode);
                            this.f9793d.m17623a(this.f9793d.m17636l());
                            view2.setText(C4338d.m17616d(((ValueData) accountKitSpinner.getSelectedItem()).countryCode));
                            view2.setSelection(view2.getText().length());
                            ag.m4608a(view2);
                        }
                    });
                    view2.addTextChangedListener(new C1323r(this, a2.countryCode) {
                        /* renamed from: b */
                        final /* synthetic */ C4338d f9795b;

                        public void afterTextChanged(Editable editable) {
                            super.afterTextChanged(editable);
                            String obj = editable.toString();
                            boolean z = false;
                            if (!TextUtils.isEmpty(obj)) {
                                if (obj.startsWith("+")) {
                                    editable = C1251w.m4501b(editable.toString());
                                    C4338d c4338d = this.f9795b;
                                    if (!(editable == null || PhoneNumberUtil.b().b(editable) == null)) {
                                        z = true;
                                    }
                                    c4338d.f14226a = z;
                                    if (this.f9795b.f14231h != null) {
                                        this.f9795b.f14231h.mo1614a();
                                    }
                                    this.f9795b.m17623a(this.f9795b.m17636l());
                                    this.f9795b.m17614c(obj);
                                    return;
                                }
                            }
                            this.f9795b.f14226a = false;
                            accountKitSpinner.performClick();
                        }
                    });
                    view2.setOnEditorActionListener(new C12883(this));
                    view2.setRawInputType(18);
                    ag.m4608a(view2);
                    m17606b(a);
                }
            }
        }

        @Nullable
        /* renamed from: a */
        private PhoneNumber m17596a(Activity activity) {
            if (m17619p() != null) {
                return m17619p();
            }
            if (m17630d() != null) {
                return m17630d();
            }
            PhoneNumber c = m17634j() != null ? C1251w.m4506c(m17634j()) : null;
            return c == null ? C1251w.m4506c(m17604b(activity)) : c;
        }

        /* renamed from: c */
        private void m17614c(String str) {
            if (this.f14227b != null) {
                if (this.f14228c != null) {
                    ValueData valueData = (ValueData) this.f14228c.getSelectedItem();
                    str = this.f14229d.m4578a(C1251w.m4509d(str));
                    if (str > null && valueData.position != str) {
                        this.f14228c.setSelection(str, true);
                    }
                }
            }
        }

        /* renamed from: d */
        private static String m17616d(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+");
            stringBuilder.append(str);
            return stringBuilder.toString();
        }

        /* renamed from: b */
        private void m17606b(@Nullable PhoneNumber phoneNumber) {
            if (this.f14227b != null) {
                if (this.f14228c != null) {
                    if (phoneNumber != null) {
                        this.f14227b.setText(phoneNumber.toString());
                        m17614c(phoneNumber.getCountryCode());
                    } else if (m17635k() != null) {
                        this.f14227b.setText(C4338d.m17616d(this.f14229d.m4579a(m17635k().position).countryCode));
                    } else {
                        this.f14227b.setText("");
                    }
                    this.f14227b.setSelection(this.f14227b.getText().length());
                }
            }
        }

        @Nullable
        /* renamed from: b */
        private String m17604b(Activity activity) {
            if (this.f14228c != null) {
                if (m17629c()) {
                    String f = C1251w.m4516f(activity.getApplicationContext());
                    if (f == null) {
                        m17612c(activity);
                    } else {
                        PhoneContentController.m16072b("autofill_number_by_device");
                    }
                    return f;
                }
            }
            return null;
        }

        /* renamed from: c */
        private void m17612c(android.app.Activity r9) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r8 = this;
            r0 = r8.m17619p();
            if (r0 != 0) goto L_0x0036;
        L_0x0006:
            r0 = com.facebook.accountkit.internal.C1251w.m4518g(r9);
            if (r0 != 0) goto L_0x000d;
        L_0x000c:
            goto L_0x0036;
        L_0x000d:
            r0 = r8.m16180h();
            if (r0 == 0) goto L_0x0035;
        L_0x0013:
            r1 = new com.google.android.gms.auth.api.credentials.HintRequest$a;
            r1.<init>();
            r2 = 1;
            r1 = r1.m8802b(r2);
            r1 = r1.m8801a();
            r2 = com.google.android.gms.auth.api.C2422a.f7349g;
            r0 = r2.getHintPickerIntent(r0, r1);
            r2 = r0.getIntentSender();	 Catch:{ SendIntentException -> 0x0035 }
            r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;	 Catch:{ SendIntentException -> 0x0035 }
            r4 = 0;	 Catch:{ SendIntentException -> 0x0035 }
            r5 = 0;	 Catch:{ SendIntentException -> 0x0035 }
            r6 = 0;	 Catch:{ SendIntentException -> 0x0035 }
            r7 = 0;	 Catch:{ SendIntentException -> 0x0035 }
            r1 = r9;	 Catch:{ SendIntentException -> 0x0035 }
            r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7);	 Catch:{ SendIntentException -> 0x0035 }
        L_0x0035:
            return;
        L_0x0036:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.ui.PhoneContentController.d.c(android.app.Activity):void");
        }

        /* renamed from: a */
        public void m17624a(@Nullable C1287b c1287b) {
            this.f14230g = c1287b;
        }

        /* renamed from: a */
        public void m17623a(PhoneNumber phoneNumber) {
            m4590o().putParcelable("lastPhoneNumber", phoneNumber);
        }

        /* renamed from: p */
        private PhoneNumber m17619p() {
            return (PhoneNumber) m4590o().getParcelable("lastPhoneNumber");
        }

        /* renamed from: a */
        public void m17627a(boolean z) {
            m4590o().putBoolean("readPhoneStateEnabled", z);
        }

        /* renamed from: c */
        public boolean m17629c() {
            return m4590o().getBoolean("readPhoneStateEnabled");
        }

        @Nullable
        /* renamed from: d */
        public PhoneNumber m17630d() {
            return (PhoneNumber) m4590o().getParcelable("appSuppliedPhoneNumber");
        }

        /* renamed from: c */
        private void m17613c(@Nullable PhoneNumber phoneNumber) {
            m4590o().putParcelable("appSuppliedPhoneNumber", phoneNumber);
        }

        @Nullable
        /* renamed from: e */
        public String m17631e() {
            return m4590o().getString("defaultCountryCodeNumber");
        }

        /* renamed from: e */
        private void m17617e(@Nullable String str) {
            m4590o().putString("defaultCountryCodeNumber", str);
        }

        @Nullable
        /* renamed from: f */
        public String[] m17632f() {
            return m4590o().getStringArray("smsBlacklist");
        }

        /* renamed from: a */
        private void m17602a(@Nullable String[] strArr) {
            m4590o().putStringArray("smsBlacklist", strArr);
        }

        @Nullable
        /* renamed from: g */
        public String[] m17633g() {
            return m4590o().getStringArray("smsWhitelist");
        }

        /* renamed from: b */
        private void m17609b(@Nullable String[] strArr) {
            m4590o().putStringArray("smsWhitelist", strArr);
        }

        @Nullable
        /* renamed from: j */
        public String m17634j() {
            return m4590o().getString("devicePhoneNumber");
        }

        /* renamed from: f */
        private void m17618f(@Nullable String str) {
            m4590o().putString("devicePhoneNumber", str);
        }

        @Nullable
        /* renamed from: k */
        public ValueData m17635k() {
            return (ValueData) m4590o().getParcelable("initialCountryCodeValue");
        }

        /* renamed from: a */
        private void m17601a(@Nullable ValueData valueData) {
            m4590o().putParcelable("initialCountryCodeValue", valueData);
        }

        @android.support.annotation.Nullable
        /* renamed from: l */
        public com.facebook.accountkit.PhoneNumber m17636l() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.f14227b;
            if (r0 == 0) goto L_0x0036;
        L_0x0004:
            r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.b();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r1 = r5.f14227b;	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r1 = r1.getText();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r2 = "US";	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r0 = r0.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r1 = new com.facebook.accountkit.PhoneNumber;	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r2 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r2 = java.lang.String.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r3 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r3 = java.lang.String.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r0 = r0.m();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r0 = r0.name();	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            r1.<init>(r2, r3, r0);	 Catch:{ IllegalArgumentException -> 0x0036, IllegalArgumentException -> 0x0036 }
            goto L_0x0037;
        L_0x0036:
            r1 = 0;
        L_0x0037:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.ui.PhoneContentController.d.l():com.facebook.accountkit.PhoneNumber");
        }

        /* renamed from: m */
        public boolean m17637m() {
            return this.f14226a;
        }

        /* renamed from: a */
        public void m17625a(@Nullable C1289a c1289a) {
            this.f14231h = c1289a;
        }

        /* renamed from: a */
        void m17626a(String str) {
            if (C1251w.m4501b(str) != null) {
                PhoneContentController.m16072b("autofill_number_by_google");
            }
            m17618f(str);
            m17606b(C1251w.m4506c(str));
        }
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneContentController$c */
    public static final class C4439c extends TextContentFragment {
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
            return PhoneContentController.f13042g;
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_phone_login_text, viewGroup, false);
        }

        /* renamed from: a */
        protected Spanned mo3965a(String str) {
            return Html.fromHtml(getString(C1194g.com_accountkit_phone_login_text, new Object[]{str, "https://www.accountkit.com/faq"}));
        }
    }

    /* renamed from: g */
    abstract C1287b mo3700g();

    /* renamed from: h */
    public boolean mo1632h() {
        return false;
    }

    /* renamed from: b */
    public /* synthetic */ C4127h mo3259b() {
        return m16092i();
    }

    @Nullable
    /* renamed from: f */
    public /* synthetic */ C4127h mo3263f() {
        return m16095l();
    }

    /* renamed from: b */
    private static void m16072b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("autofill_number_method", str);
        C1219a.m4261a("ak_phone_number_autofilled", bundle);
    }

    PhoneContentController(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: i */
    public C4337a m16092i() {
        if (this.f13045b == null) {
            mo3270a(new C4337a());
        }
        return this.f13045b;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4337a) {
            this.f13045b = (C4337a) c4127h;
            this.f13045b.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13045b.m17590a(mo3700g());
            mo3701o();
        }
    }

    /* renamed from: j */
    public ButtonType m16093j() {
        return this.f13049i;
    }

    /* renamed from: a */
    public void mo3257a(ButtonType buttonType) {
        this.f13049i = buttonType;
        mo3701o();
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13050j = (C4351a) c4127h;
        }
    }

    @Nullable
    /* renamed from: k */
    public View m16094k() {
        if (this.f13044a == null) {
            return null;
        }
        return this.f13044a.f14227b;
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13051k = c4132a;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13047d = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13042g;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13046c == null) {
            m16087d(new C4439c());
        }
        return this.f13046c;
    }

    /* renamed from: d */
    public void m16087d(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4439c) {
            this.f13046c = (C4439c) c4127h;
            this.f13046c.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13046c.mo3967a(new C31981(this));
        }
    }

    @Nullable
    /* renamed from: l */
    public C4338d m16095l() {
        if (this.f13044a == null) {
            mo3273c(new C4338d());
        }
        return this.f13044a;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4338d) {
            this.f13044a = (C4338d) c4127h;
            this.f13044a.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13044a.m17625a(new C31992(this));
            this.f13044a.m17624a(mo3700g());
            if (this.e.getInitialPhoneNumber() != null) {
                this.f13044a.m17613c(this.e.getInitialPhoneNumber());
            }
            if (this.e.getDefaultCountryCode() != null) {
                this.f13044a.m17617e(this.e.getDefaultCountryCode());
            }
            if (this.e.getSmsBlacklist() != null) {
                this.f13044a.m17602a(this.e.getSmsBlacklist());
            }
            if (this.e.getSmsWhitelist() != null) {
                this.f13044a.m17609b(this.e.getSmsWhitelist());
            }
            this.f13044a.m17627a(this.e.isReadPhoneStateEnabled());
            mo3701o();
        }
    }

    /* renamed from: a */
    public void mo1629a(int i, int i2, Intent intent) {
        super.mo1629a(i, i2, intent);
        if (i == 152 && i2 == -1 && this.f13044a != 0) {
            this.f13044a.m17626a(((Credential) intent.getParcelableExtra(Credential.EXTRA_KEY)).getId());
        }
    }

    /* renamed from: a */
    public void mo1630a(Activity activity) {
        super.mo1630a(activity);
        ag.m4608a(m16094k());
    }

    /* renamed from: a */
    protected void mo3256a() {
        if (this.f13044a != null) {
            if (this.f13045b != null) {
                String str;
                ValueData k = this.f13044a.m17635k();
                String str2 = null;
                if (k == null) {
                    str = null;
                } else {
                    str = k.countryCode;
                }
                if (k != null) {
                    str2 = k.countryCodeSource;
                }
                C1219a.m4267a(str, str2, this.f13045b.m17595d());
            }
        }
    }

    /* renamed from: a */
    static PhoneNumberSource m16069a(@Nullable PhoneNumber phoneNumber, @Nullable PhoneNumber phoneNumber2, @Nullable String str) {
        if (phoneNumber == null) {
            return PhoneNumberSource.UNKNOWN;
        }
        if (!C1251w.m4500a(str)) {
            if (phoneNumber2 != null && str.equals(phoneNumber2.getRawPhoneNumber()) && str.equals(phoneNumber.getRawPhoneNumber())) {
                return PhoneNumberSource.APP_SUPPLIED_AND_DEVICE_PHONE_NUMBER;
            }
            if (str.equals(phoneNumber.getRawPhoneNumber())) {
                return PhoneNumberSource.DEVICE_PHONE_NUMBER;
            }
        }
        if (phoneNumber2 != null && phoneNumber2.equals(phoneNumber) != null) {
            return PhoneNumberSource.APP_SUPPLIED_PHONE_NUMBER;
        }
        if (str == null && phoneNumber2 == null) {
            return PhoneNumberSource.DEVICE_PHONE_NUMBER_AND_APP_NUMBER_NOT_SUPPLIED;
        }
        return PhoneNumberSource.DEVICE_PHONE_NUMBER_NOT_SUPPLIED;
    }

    /* renamed from: o */
    private void mo3701o() {
        if (this.f13044a != null) {
            if (this.f13045b != null) {
                this.f13045b.m17591a(this.f13044a.m17637m());
                this.f13045b.m17589a(m16093j());
            }
        }
    }
}
