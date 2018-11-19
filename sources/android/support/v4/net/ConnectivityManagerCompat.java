package android.support.v4.net;

import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ConnectivityManagerCompat {

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: a */
    public static boolean m1948a(@NonNull ConnectivityManager connectivityManager) {
        if (VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        connectivityManager = connectivityManager.getActiveNetworkInfo();
        if (connectivityManager == null) {
            return true;
        }
        switch (connectivityManager.getType()) {
            case null:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
            case 7:
            case 9:
                return null;
            default:
                return true;
        }
    }
}
