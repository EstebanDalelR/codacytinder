package io.branch.referral;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import io.branch.indexing.C15560b;
import java.lang.ref.WeakReference;

@TargetApi(14)
class Branch$a implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    final /* synthetic */ Branch f48078a;
    /* renamed from: b */
    private int f48079b;

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private Branch$a(Branch branch) {
        this.f48078a = branch;
        this.f48079b = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Branch.a(this.f48078a, Branch.d(this.f48078a) ? Branch$INTENT_STATE.PENDING : Branch$INTENT_STATE.READY);
        Branch.a(this.f48078a, true);
        if (BranchViewHandler.m58191a().m58208b(activity.getApplicationContext()) != null) {
            BranchViewHandler.m58191a().m58205a((Context) activity);
        }
    }

    public void onActivityStarted(android.app.Activity r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f48078a;
        r1 = r3.f48078a;
        r1 = io.branch.referral.Branch.d(r1);
        if (r1 == 0) goto L_0x000d;
    L_0x000a:
        r1 = io.branch.referral.Branch$INTENT_STATE.PENDING;
        goto L_0x000f;
    L_0x000d:
        r1 = io.branch.referral.Branch$INTENT_STATE.READY;
    L_0x000f:
        io.branch.referral.Branch.a(r0, r1);
        r0 = r3.f48078a;
        r0 = io.branch.referral.Branch.e(r0);
        r1 = io.branch.referral.Branch$SESSION_STATE.INITIALISED;
        if (r0 != r1) goto L_0x0027;
    L_0x001c:
        r0 = io.branch.indexing.C15560b.m58095a();	 Catch:{ Exception -> 0x0027 }
        r1 = r3.f48078a;	 Catch:{ Exception -> 0x0027 }
        r1 = r1.f12591g;	 Catch:{ Exception -> 0x0027 }
        r0.m58120a(r4, r1);	 Catch:{ Exception -> 0x0027 }
    L_0x0027:
        r0 = r3.f48079b;
        r1 = 1;
        if (r0 >= r1) goto L_0x0058;
    L_0x002c:
        r0 = r3.f48078a;
        r0 = io.branch.referral.Branch.e(r0);
        r2 = io.branch.referral.Branch$SESSION_STATE.INITIALISED;
        if (r0 != r2) goto L_0x003d;
    L_0x0036:
        r0 = r3.f48078a;
        r2 = io.branch.referral.Branch$SESSION_STATE.UNINITIALISED;
        io.branch.referral.Branch.a(r0, r2);
    L_0x003d:
        r0 = r3.f48078a;
        r0 = io.branch.referral.Branch.f(r0);
        r0 = io.branch.referral.C2666j.a(r0);
        if (r0 == 0) goto L_0x0052;
    L_0x0049:
        r0 = r3.f48078a;
        r0 = io.branch.referral.Branch.a(r0);
        r0.m58399F();
    L_0x0052:
        r0 = r3.f48078a;
        io.branch.referral.Branch.a(r0, r4);
        goto L_0x0070;
    L_0x0058:
        r0 = r3.f48078a;
        r2 = r4.getIntent();
        r0 = io.branch.referral.Branch.a(r0, r2);
        if (r0 == 0) goto L_0x0070;
    L_0x0064:
        r0 = r3.f48078a;
        r2 = io.branch.referral.Branch$SESSION_STATE.UNINITIALISED;
        io.branch.referral.Branch.a(r0, r2);
        r0 = r3.f48078a;
        io.branch.referral.Branch.a(r0, r4);
    L_0x0070:
        r4 = r3.f48079b;
        r4 = r4 + r1;
        r3.f48079b = r4;
        r4 = r3.f48078a;
        r0 = 0;
        io.branch.referral.Branch.a(r4, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch$a.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityResumed(Activity activity) {
        if (Branch.a(this.f48078a, activity.getIntent())) {
            Branch.a(this.f48078a, Branch$SESSION_STATE.UNINITIALISED);
            Branch.a(this.f48078a, activity);
        }
        this.f48078a.f12589e = new WeakReference(activity);
        if (Branch.d(this.f48078a)) {
            Branch.a(this.f48078a, Branch$INTENT_STATE.READY);
            boolean z = (activity.getIntent() == null || Branch.e(this.f48078a) == Branch$SESSION_STATE.INITIALISED) ? false : true;
            Branch.a(this.f48078a, activity, z);
        }
    }

    public void onActivityPaused(Activity activity) {
        if (Branch.g(this.f48078a) != null) {
            Branch.g(this.f48078a).m58278a(true);
        }
    }

    public void onActivityStopped(Activity activity) {
        C15560b.m58095a().m58119a(activity);
        this.f48079b -= 1;
        if (this.f48079b < 1) {
            this.f48078a.f12592h = false;
            this.f48078a.d();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f48078a.f12589e != null && this.f48078a.f12589e.get() == activity) {
            this.f48078a.f12589e.clear();
        }
        BranchViewHandler.m58191a().m58204a(activity);
    }
}
