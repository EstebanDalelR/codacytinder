package com.leanplum;

import com.leanplum.Leanplum.AnonymousClass13;
import com.leanplum.callbacks.RegisterDeviceCallback$EmailCallback;
import com.leanplum.callbacks.StartCallback;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.ar;
import com.leanplum.p069a.bo;

final class Leanplum$13$1 extends RegisterDeviceCallback$EmailCallback {
    /* renamed from: a */
    private /* synthetic */ AnonymousClass13 f25496a;

    /* renamed from: com.leanplum.Leanplum$13$1$1 */
    final class C70271 extends StartCallback {
        /* renamed from: a */
        private /* synthetic */ Leanplum$13$1 f25495a;

        C70271(Leanplum$13$1 leanplum$13$1) {
        }

        public final void onResponse(boolean z) {
            if (Leanplum.g() != null) {
                Leanplum.g().setSuccess(z);
                aq.a().a(Leanplum.g());
            }
            if (z) {
                try {
                    ag.a();
                } catch (boolean z2) {
                    bo.a(z2);
                }
            }
        }
    }

    Leanplum$13$1(AnonymousClass13 anonymousClass13) {
    }

    public final void onResponse(String str) {
        if (str != null) {
            try {
                ar.m25060a(str, new C70271(this));
            } catch (String str2) {
                bo.a(str2);
            }
        }
    }
}
