package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;

/* renamed from: com.bumptech.glide.manager.c */
public class C1059c {
    /* renamed from: a */
    public ConnectivityMonitor m3646a(Context context, ConnectivityListener connectivityListener) {
        if ((context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null) != null) {
            return new C4112d(context, connectivityListener);
        }
        return new C4113f();
    }
}
