package com.mapbox.android.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private Context f21499a;
    /* renamed from: b */
    private CopyOnWriteArrayList<C5759a> f21500b;
    /* renamed from: c */
    private Boolean f21501c;

    /* renamed from: a */
    private static boolean m25324a(android.content.Context r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "connectivity";	 Catch:{ Exception -> 0x0011 }
        r1 = r1.getSystemService(r0);	 Catch:{ Exception -> 0x0011 }
        r1 = (android.net.ConnectivityManager) r1;	 Catch:{ Exception -> 0x0011 }
        r1 = r1.getActiveNetworkInfo();	 Catch:{ Exception -> 0x0011 }
        r1 = r1.isConnectedOrConnecting();	 Catch:{ Exception -> 0x0011 }
        return r1;
    L_0x0011:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.core.connectivity.ConnectivityReceiver.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    private boolean m25323a() {
        if (this.f21501c == null) {
            return m25324a(this.f21499a);
        }
        return this.f21501c.booleanValue();
    }

    public void onReceive(Context context, Intent intent) {
        context = m25323a();
        intent = this.f21500b.iterator();
        while (intent.hasNext()) {
            ((C5759a) intent.next()).m25325a(context);
        }
    }
}
