package com.google.android.m4b.maps.p107g;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.C4017g;
import android.support.v4.app.FragmentManager;
import com.google.android.m4b.maps.p110j.C5462v;

/* renamed from: com.google.android.m4b.maps.g.i */
public final class C8087i extends C4017g {
    /* renamed from: a */
    private Dialog f29041a = null;
    /* renamed from: b */
    private OnCancelListener f29042b = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f29041a == null) {
            setShowsDialog(null);
        }
        return this.f29041a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f29042b != null) {
            this.f29042b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C8087i m34411a(Dialog dialog, OnCancelListener onCancelListener) {
        C8087i c8087i = new C8087i();
        dialog = (Dialog) C5462v.m23768a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c8087i.f29041a = dialog;
        if (onCancelListener != null) {
            c8087i.f29042b = onCancelListener;
        }
        return c8087i;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
