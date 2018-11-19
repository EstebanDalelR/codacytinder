package com.facebook.accountkit.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;

/* renamed from: com.facebook.accountkit.ui.o */
final class C4346o extends C4129m {
    /* renamed from: a */
    private static final LoginFlowState f14256a = LoginFlowState.ERROR;
    /* renamed from: b */
    private final LoginFlowState f14257b;
    /* renamed from: c */
    private C4345a f14258c;

    /* renamed from: com.facebook.accountkit.ui.o$a */
    public static final class C4345a extends C4127h {
        /* renamed from: a */
        private static final String f14255a;

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

        static {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e);
            stringBuilder.append(".RETURN_LOGIN_FLOW_STATE");
            f14255a = stringBuilder.toString();
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_error_bottom, viewGroup, false);
        }

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return C4346o.f14256a;
        }

        /* renamed from: a */
        protected void mo3277a(View view, final Bundle bundle) {
            super.mo3277a(view, bundle);
            view = view.findViewById(C1192e.com_accountkit_start_over_button);
            if (view != null) {
                view.setOnClickListener(new OnClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4345a f3465b;

                    public void onClick(View view) {
                        C1219a.m4272b(Buttons.TRY_AGAIN.name());
                        Intent intent = new Intent(LoginFlowBroadcastReceiver.f3413b);
                        intent.putExtra(LoginFlowBroadcastReceiver.f3414c, Event.ERROR_RESTART);
                        intent.putExtra(LoginFlowBroadcastReceiver.f3418g, (Integer) bundle.get(C4345a.f14255a));
                        C0436c.m1648a(view.getContext()).m1653a(intent);
                    }
                });
            }
        }
    }

    C4346o(LoginFlowState loginFlowState, AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
        this.f14257b = loginFlowState;
    }

    /* renamed from: g */
    LoginFlowState m17716g() {
        return this.f14257b;
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f14258c == null) {
            mo3270a(new C4345a());
        }
        return this.f14258c;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4345a) {
            this.f14258c = (C4345a) c4127h;
            this.f14258c.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f14258c.m4590o().putInt(C4345a.f14255a, this.f14257b.ordinal());
        }
    }
}
