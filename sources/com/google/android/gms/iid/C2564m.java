package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.m */
final class C2564m extends BroadcastReceiver {
    /* renamed from: a */
    private /* synthetic */ C2562k f7800a;

    C2564m(C2562k c2562k) {
        this.f7800a = c2562k;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "Received GSF callback via dynamic receiver");
        }
        this.f7800a.m9327b(intent);
    }
}
