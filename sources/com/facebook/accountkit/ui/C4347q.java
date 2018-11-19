package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import com.facebook.accountkit.ui.PhoneContentController.C1287b;

/* renamed from: com.facebook.accountkit.ui.q */
final class C4347q extends PhoneContentController {

    /* renamed from: com.facebook.accountkit.ui.q$1 */
    class C32151 implements C1287b {
        /* renamed from: a */
        final /* synthetic */ C4347q f9815a;

        C32151(C4347q c4347q) {
            this.f9815a = c4347q;
        }

        /* renamed from: a */
        public void mo1634a(Context context, String str) {
            if (this.f9815a.a != null) {
                if (this.f9815a.b != null) {
                    PhoneNumber l = this.f9815a.a.m17636l();
                    if (l != null) {
                        C1219a.m4263a(str, PhoneContentController.m16069a(l, this.f9815a.a.m17630d(), this.f9815a.a.m17634j()).name(), l);
                        C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_LOGIN_COMPLETE).putExtra(LoginFlowBroadcastReceiver.f3417f, l));
                    }
                }
            }
        }
    }

    C4347q(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
        C1220c.m4300c();
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.d == null) {
            mo3271b(C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_phone_login_title, new String[0]));
        }
        return this.d;
    }

    /* renamed from: o */
    void mo3701o() {
        if (this.d != null) {
            this.d.m16233a(C1194g.com_accountkit_phone_login_retry_title, new String[0]);
        }
        if (this.b != null) {
            this.b.m17592b(true);
        }
        if (this.c != null) {
            this.c.m17683e();
        }
    }

    /* renamed from: g */
    C1287b mo3700g() {
        if (this.f == null) {
            this.f = new C32151(this);
        }
        return this.f;
    }
}
