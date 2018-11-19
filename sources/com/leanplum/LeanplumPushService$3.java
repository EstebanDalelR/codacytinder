package com.leanplum;

import android.os.Bundle;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.bo;
import java.util.HashMap;
import java.util.Map;

final class LeanplumPushService$3 extends VariablesChangedCallback {
    /* renamed from: a */
    private /* synthetic */ Bundle f25513a;

    LeanplumPushService$3(Bundle bundle) {
        this.f25513a = bundle;
    }

    public final void variablesChanged() {
        try {
            final String a = LeanplumPushService.a(this.f25513a);
            if (a != null) {
                if (LeanplumPushService.b(this.f25513a)) {
                    Map hashMap = new HashMap();
                    hashMap.put("Open action", ab.a(this.f25513a.getString("_lpx")));
                    ActionContext actionContext = new ActionContext("__Push Notification", hashMap, a);
                    actionContext.preventRealtimeUpdating();
                    actionContext.update();
                    actionContext.runTrackedActionNamed("Open action");
                    return;
                }
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback(this) {
                    /* renamed from: b */
                    private /* synthetic */ LeanplumPushService$3 f25512b;

                    /* renamed from: com.leanplum.LeanplumPushService$3$1$1 */
                    final class C70311 extends VariablesChangedCallback {
                        /* renamed from: a */
                        private /* synthetic */ C70321 f25510a;

                        C70311(C70321 c70321) {
                            this.f25510a = c70321;
                        }

                        public final void variablesChanged() {
                            try {
                                ag.a("Open action", a);
                            } catch (Throwable th) {
                                bo.a(th);
                            }
                        }
                    }

                    public final void variablesChanged() {
                        try {
                            LeanplumPushService.a(a, new C70311(this));
                        } catch (Throwable th) {
                            bo.a(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            bo.a(th);
        }
    }
}
