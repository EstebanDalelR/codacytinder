package com.github.pwittchen.reactivenetwork.library.rx2;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.NetworkObservingStrategy;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.p060a.C3573a;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.p060a.C3575b;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.p060a.C3579c;
import io.reactivex.C3959e;

/* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.c */
public class C1997c {
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: a */
    public static C3959e<C1995a> m7210a(Context context) {
        NetworkObservingStrategy c3575b;
        if (C1996b.m7209b()) {
            c3575b = new C3575b();
        } else if (C1996b.m7208a()) {
            c3575b = new C3573a();
        } else {
            c3575b = new C3579c();
        }
        return C1997c.m7211a(context, c3575b);
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: a */
    public static C3959e<C1995a> m7211a(Context context, NetworkObservingStrategy networkObservingStrategy) {
        C1996b.m7207a(context, "context == null");
        C1996b.m7207a(networkObservingStrategy, "strategy == null");
        return networkObservingStrategy.observeNetworkConnectivity(context);
    }
}
