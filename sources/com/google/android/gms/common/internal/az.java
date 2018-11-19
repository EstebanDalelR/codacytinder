package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.common.api.internal.zzcf;

public abstract class az implements OnClickListener {
    /* renamed from: a */
    public static az m9133a(Activity activity, Intent intent, int i) {
        return new ba(intent, activity, i);
    }

    /* renamed from: a */
    public static az m9134a(@NonNull Fragment fragment, Intent intent, int i) {
        return new bb(intent, fragment, i);
    }

    /* renamed from: a */
    public static az m9135a(@NonNull zzcf zzcf, Intent intent, int i) {
        return new bc(intent, zzcf, 2);
    }

    /* renamed from: a */
    protected abstract void mo2578a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo2578a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
