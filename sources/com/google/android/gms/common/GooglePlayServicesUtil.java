package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import com.facebook.ads.internal.C1391d;
import com.google.android.gms.common.internal.az;

public final class GooglePlayServicesUtil extends C2513p {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        if (C2513p.zze(activity, i)) {
            i = 18;
        }
        return C3813b.m14425a().m14432a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C2513p.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C2513p.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return C2513p.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C2513p.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C2513p.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C2513p.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (C2513p.zze(activity, i)) {
            i = 18;
        }
        C3813b a = C3813b.m14425a();
        if (fragment == null) {
            return a.m14441b(activity, i, i2, onCancelListener);
        }
        C3813b.m14425a();
        Dialog a2 = C3813b.m14423a((Context) activity, i, az.m9134a(fragment, C2490g.m9019a((Context) activity, i, C1391d.f3780a), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        C3813b.m14427a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C3813b a = C3813b.m14425a();
        if (!C2513p.zze(context, i)) {
            if (!(i == 9 ? C2513p.zzv(context, "com.android.vending") : false)) {
                a.m14435a(context, i);
                return;
            }
        }
        a.m14440b(context);
    }
}
