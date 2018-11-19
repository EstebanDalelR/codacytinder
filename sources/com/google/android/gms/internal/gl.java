package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.ar;

final class gl implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ gk f16103a;

    gl(gk gkVar) {
        this.f16103a = gkVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ar.e();
        fk.m19697a(this.f16103a.f16099a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
