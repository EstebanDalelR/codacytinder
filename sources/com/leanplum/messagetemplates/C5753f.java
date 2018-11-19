package com.leanplum.messagetemplates;

import com.leanplum.ActionArgs;
import com.leanplum.Leanplum;
import com.leanplum.callbacks.ActionCallback;

/* renamed from: com.leanplum.messagetemplates.f */
final class C5753f {
    /* renamed from: a */
    private static final String f21444a = "Open URL";

    /* renamed from: com.leanplum.messagetemplates.f$1 */
    final class C70621 extends ActionCallback {
        C70621() {
        }

        public final boolean onResponse(com.leanplum.ActionContext r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = "URL";
            r5 = r5.stringNamed(r0);
            r0 = new android.content.Intent;
            r1 = "android.intent.action.VIEW";
            r2 = android.net.Uri.parse(r5);
            r0.<init>(r1, r2);
            r1 = com.leanplum.Leanplum.getContext();
            r1 = r1 instanceof android.app.Activity;
            if (r1 != 0) goto L_0x001e;
        L_0x0019:
            r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
            r0.addFlags(r1);
        L_0x001e:
            r1 = 0;
            r2 = com.leanplum.Leanplum.getContext();	 Catch:{ ActivityNotFoundException -> 0x0030 }
            if (r2 == 0) goto L_0x002f;	 Catch:{ ActivityNotFoundException -> 0x0030 }
        L_0x0025:
            r2 = new com.leanplum.messagetemplates.f$1$1;	 Catch:{ ActivityNotFoundException -> 0x0030 }
            r2.<init>(r4, r0);	 Catch:{ ActivityNotFoundException -> 0x0030 }
            com.leanplum.LeanplumActivityHelper.queueActionUponActive(r2);	 Catch:{ ActivityNotFoundException -> 0x0030 }
            r5 = 1;
            return r5;
        L_0x002f:
            return r1;
        L_0x0030:
            r0 = "Leanplum";
            r2 = new java.lang.StringBuilder;
            r3 = "Unable to handle URL ";
            r2.<init>(r3);
            r2.append(r5);
            r5 = r2.toString();
            android.util.Log.e(r0, r5);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.f.1.onResponse(com.leanplum.ActionContext):boolean");
        }
    }

    C5753f() {
    }

    /* renamed from: a */
    public static void m25297a() {
        Leanplum.defineAction(f21444a, 2, new ActionArgs().with("URL", "http://www.example.com"), new C70621());
    }
}
