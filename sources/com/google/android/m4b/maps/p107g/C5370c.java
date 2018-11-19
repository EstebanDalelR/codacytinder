package com.google.android.m4b.maps.p107g;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.m4b.maps.p110j.C5462v;

@TargetApi(11)
/* renamed from: com.google.android.m4b.maps.g.c */
public final class C5370c extends DialogFragment {
    /* renamed from: a */
    private Dialog f20249a = null;
    /* renamed from: b */
    private OnCancelListener f20250b = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f20249a == null) {
            setShowsDialog(null);
        }
        return this.f20249a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f20250b != null) {
            this.f20250b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C5370c m23568a(Dialog dialog, OnCancelListener onCancelListener) {
        C5370c c5370c = new C5370c();
        dialog = (Dialog) C5462v.m23768a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c5370c.f20249a = dialog;
        if (onCancelListener != null) {
            c5370c.f20250b = onCancelListener;
        }
        return c5370c;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
