package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.PhoneContentController.C1287b;

/* renamed from: com.facebook.accountkit.ui.t */
final class C4349t extends PhoneContentController {

    /* renamed from: com.facebook.accountkit.ui.t$1 */
    class C32161 implements C1287b {
        /* renamed from: a */
        final /* synthetic */ C4349t f9816a;

        C32161(C4349t c4349t) {
            this.f9816a = c4349t;
        }

        /* renamed from: a */
        public void mo1634a(Context context, String str) {
            if (this.f9816a.a != null) {
                if (this.f9816a.b != null) {
                    PhoneNumber l = this.f9816a.a.m17636l();
                    if (l != null) {
                        C1219a.m4263a(str, PhoneContentController.m16069a(l, this.f9816a.a.m17630d(), this.f9816a.a.m17634j()).name(), l);
                        C0436c.m1648a(context).m1653a(new Intent(UpdateFlowBroadcastReceiver.f3151a).putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.UPDATE_START).putExtra(UpdateFlowBroadcastReceiver.f3153c, l));
                    }
                }
            }
        }
    }

    C4349t(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.d == null) {
            mo3271b(C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_phone_update_title, new String[0]));
        }
        return this.d;
    }

    /* renamed from: g */
    C1287b mo3700g() {
        if (this.f == null) {
            this.f = new C32161(this);
        }
        return this.f;
    }
}
