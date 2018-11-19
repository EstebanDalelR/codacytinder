package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;

/* renamed from: com.facebook.accountkit.ui.l */
final class C4128l extends C3210g {
    /* renamed from: a */
    private static final LoginFlowState f13097a = LoginFlowState.EMAIL_VERIFY;
    /* renamed from: b */
    private C4343a f13098b;
    /* renamed from: c */
    private C4351a f13099c;
    /* renamed from: d */
    private C4132a f13100d;
    /* renamed from: f */
    private C4132a f13101f;
    /* renamed from: g */
    private C4351a f13102g;
    /* renamed from: h */
    private C4351a f13103h;

    /* renamed from: com.facebook.accountkit.ui.l$1 */
    class C32111 implements C1319a {
        /* renamed from: a */
        final /* synthetic */ C4128l f9812a;

        C32111(C4128l c4128l) {
            this.f9812a = c4128l;
        }

        /* renamed from: a */
        public void mo1633a(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.EMAIL_VERIFY_RETRY));
        }
    }

    /* renamed from: com.facebook.accountkit.ui.l$a */
    public static final class C4343a extends C4127h {
        /* renamed from: a */
        private C1319a f14253a;

        /* renamed from: com.facebook.accountkit.ui.l$a$1 */
        class C13171 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C4343a f3460a;

            C13171(C4343a c4343a) {
                this.f3460a = c4343a;
            }

            public void onClick(View view) {
                C1219a.m4260a(Buttons.SEND_NEW_EMAIL.name());
                if (this.f3460a.f14253a != null) {
                    this.f3460a.f14253a.mo1633a(view.getContext());
                }
            }
        }

        /* renamed from: com.facebook.accountkit.ui.l$a$2 */
        class C13182 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C4343a f3461a;

            C13182(C4343a c4343a) {
                this.f3461a = c4343a;
            }

            public void onClick(android.view.View r2) {
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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r2 = new android.content.Intent;
                r0 = "android.intent.action.MAIN";
                r2.<init>(r0);
                r0 = "android.intent.category.APP_EMAIL";
                r2.addCategory(r0);
                r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
                r2.addFlags(r0);
                r0 = com.facebook.accountkit.ui.Buttons.OPEN_EMAIL;
                r0 = r0.name();
                com.facebook.accountkit.internal.C1220c.C1219a.m4260a(r0);
                r0 = r1.f3461a;	 Catch:{ ActivityNotFoundException -> 0x001f }
                r0.startActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x001f }
            L_0x001f:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.ui.l.a.2.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.facebook.accountkit.ui.l$a$a */
        interface C1319a {
            /* renamed from: a */
            void mo1633a(Context context);
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
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_email_verify_bottom, viewGroup, false);
        }

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return C4128l.f13097a;
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            bundle = view.findViewById(C1192e.com_accountkit_retry_email_button);
            if (bundle != null) {
                bundle.setOnClickListener(new C13171(this));
            }
            Button button = (Button) view.findViewById(C1192e.com_accountkit_check_email_button);
            if (button != null) {
                button.setOnClickListener(new C13182(this));
            }
        }

        /* renamed from: a */
        public void m17700a(@Nullable C1319a c1319a) {
            this.f14253a = c1319a;
        }
    }

    C4128l(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13098b == null) {
            mo3270a(new C4343a());
        }
        return this.f13098b;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4343a) {
            this.f13098b = (C4343a) c4127h;
            this.f13098b.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13098b.m17700a(new C32111(this));
        }
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13099c = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13100d = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13101f == null) {
            this.f13101f = C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_email_verify_title, new String[0]);
        }
        return this.f13101f;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13101f = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13097a;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13102g == null) {
            this.f13102g = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13102g;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13103h == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13103h;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13103h = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4283d(true);
    }
}
