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
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event;
import com.facebook.accountkit.internal.C1220c.C1219a;

final class ab extends C4129m {
    /* renamed from: a */
    private C4340a f14252a;

    /* renamed from: com.facebook.accountkit.ui.ab$a */
    public static final class C4340a extends C4127h {

        /* renamed from: com.facebook.accountkit.ui.ab$a$1 */
        class C13081 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C4340a f3448a;

            C13081(C4340a c4340a) {
                this.f3448a = c4340a;
            }

            public void onClick(View view) {
                C1219a.m4272b(Buttons.TRY_AGAIN.name());
                C0436c.m1648a(view.getContext()).m1653a(new Intent(UpdateFlowBroadcastReceiver.f3151a).putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.RETRY));
            }
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
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_error_bottom, viewGroup, false);
        }

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return LoginFlowState.ERROR;
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            view = view.findViewById(C1192e.com_accountkit_start_over_button);
            if (view != null) {
                view.setOnClickListener(new C13081(this));
            }
        }
    }

    ab(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f14252a == null) {
            mo3270a(new C4340a());
        }
        return this.f14252a;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4340a) {
            this.f14252a = (C4340a) c4127h;
            this.f14252a.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
        }
    }
}
