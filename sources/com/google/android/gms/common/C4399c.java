package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.C4017g;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.common.c */
public class C4399c extends C4017g {
    /* renamed from: a */
    private Dialog f14581a = null;
    /* renamed from: b */
    private OnCancelListener f14582b = null;

    /* renamed from: a */
    public static C4399c m18159a(Dialog dialog, OnCancelListener onCancelListener) {
        C4399c c4399c = new C4399c();
        dialog = (Dialog) ad.m9046a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c4399c.f14581a = dialog;
        if (onCancelListener != null) {
            c4399c.f14582b = onCancelListener;
        }
        return c4399c;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f14582b != null) {
            this.f14582b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f14581a == null) {
            setShowsDialog(false);
        }
        return this.f14581a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
