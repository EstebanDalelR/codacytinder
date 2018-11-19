package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.common.a */
public class C2461a extends DialogFragment {
    /* renamed from: a */
    private Dialog f7408a = null;
    /* renamed from: b */
    private OnCancelListener f7409b = null;

    /* renamed from: a */
    public static C2461a m8841a(Dialog dialog, OnCancelListener onCancelListener) {
        C2461a c2461a = new C2461a();
        dialog = (Dialog) ad.m9046a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c2461a.f7408a = dialog;
        if (onCancelListener != null) {
            c2461a.f7409b = onCancelListener;
        }
        return c2461a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f7409b != null) {
            this.f7409b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f7408a == null) {
            setShowsDialog(false);
        }
        return this.f7408a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
