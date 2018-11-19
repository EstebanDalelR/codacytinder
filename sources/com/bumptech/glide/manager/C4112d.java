package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;

/* renamed from: com.bumptech.glide.manager.d */
class C4112d implements ConnectivityMonitor {
    /* renamed from: a */
    private final Context f12991a;
    /* renamed from: b */
    private final ConnectivityListener f12992b;
    /* renamed from: c */
    private boolean f12993c;
    /* renamed from: d */
    private boolean f12994d;
    /* renamed from: e */
    private final BroadcastReceiver f12995e = new C10601(this);

    /* renamed from: com.bumptech.glide.manager.d$1 */
    class C10601 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C4112d f2899a;

        C10601(C4112d c4112d) {
            this.f2899a = c4112d;
        }

        public void onReceive(Context context, Intent intent) {
            intent = this.f2899a.f12993c;
            this.f2899a.f12993c = this.f2899a.m15978a(context);
            if (intent != this.f2899a.f12993c) {
                this.f2899a.f12992b.onConnectivityChanged(this.f2899a.f12993c);
            }
        }
    }

    public void onDestroy() {
    }

    public C4112d(Context context, ConnectivityListener connectivityListener) {
        this.f12991a = context.getApplicationContext();
        this.f12992b = connectivityListener;
    }

    /* renamed from: a */
    private void m15977a() {
        if (!this.f12994d) {
            this.f12993c = m15978a(this.f12991a);
            this.f12991a.registerReceiver(this.f12995e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f12994d = true;
        }
    }

    /* renamed from: b */
    private void m15983b() {
        if (this.f12994d) {
            this.f12991a.unregisterReceiver(this.f12995e);
            this.f12994d = false;
        }
    }

    /* renamed from: a */
    private boolean m15978a(Context context) {
        context = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return (context == null || context.isConnected() == null) ? null : true;
    }

    public void onStart() {
        m15977a();
    }

    public void onStop() {
        m15983b();
    }
}
