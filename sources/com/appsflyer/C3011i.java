package com.appsflyer;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.android.installreferrer.api.C0900a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.i */
final class C3011i implements InstallReferrerStateListener {
    /* renamed from: a */
    private InstallReferrerClient f9386a;
    /* renamed from: b */
    private C0933j f9387b;

    C3011i() {
    }

    /* renamed from: a */
    protected final void m11753a(Context context, C0933j c0933j) {
        this.f9387b = c0933j;
        this.f9386a = InstallReferrerClient.m3024a(context).m3023a();
        try {
            this.f9386a.mo1181a((InstallReferrerStateListener) this);
        } catch (Throwable e) {
            AFLogger.m3073a("referrerClient -> startConnection", e);
        }
    }

    /* renamed from: a */
    private void m11752a(@Nullable C0900a c0900a, Map<String, String> map) {
        if (c0900a != null) {
            if (c0900a.m3028a() != null) {
                map.put("val", c0900a.m3028a());
            }
            map.put("clk", Long.toString(c0900a.m3029b()));
            map.put("install", Long.toString(c0900a.m3030c()));
        }
        if (this.f9387b != null) {
            this.f9387b.mo1226a(map);
        }
    }

    public final void onInstallReferrerSetupFinished(int i) {
        Map hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        C0900a c0900a = null;
        switch (i) {
            case 0:
                try {
                    AFLogger.m3080c("InstallReferrer connected");
                    i = this.f9386a.mo1182b();
                    try {
                        this.f9386a.mo1180a();
                        c0900a = i;
                    } catch (RemoteException e) {
                        RemoteException remoteException = e;
                        c0900a = i;
                        i = remoteException;
                        i.printStackTrace();
                        m11752a(c0900a, hashMap);
                    }
                } catch (RemoteException e2) {
                    i = e2;
                    i.printStackTrace();
                    m11752a(c0900a, hashMap);
                }
            case 1:
                AFLogger.m3084e("InstallReferrer not supported");
                break;
            case 2:
                AFLogger.m3084e("InstallReferrer not supported");
                break;
            default:
                AFLogger.m3084e("responseCode not found.");
                break;
        }
        m11752a(c0900a, hashMap);
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.m3080c("Install Referrer service disconnected");
    }
}
