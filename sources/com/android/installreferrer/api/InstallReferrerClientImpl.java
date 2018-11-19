package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.android.installreferrer.p021a.C0895a;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService.C3730a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

class InstallReferrerClientImpl extends InstallReferrerClient {
    /* renamed from: a */
    private int f9321a = 0;
    /* renamed from: b */
    private final Context f9322b;
    /* renamed from: c */
    private IGetInstallReferrerService f9323c;
    /* renamed from: d */
    private ServiceConnection f9324d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
    }

    /* renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$a */
    private final class C0899a implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ InstallReferrerClientImpl f2325a;
        /* renamed from: b */
        private final InstallReferrerStateListener f2326b;

        private C0899a(InstallReferrerClientImpl installReferrerClientImpl, @NonNull InstallReferrerStateListener installReferrerStateListener) {
            this.f2325a = installReferrerClientImpl;
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f2326b = installReferrerStateListener;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0895a.m3021a("InstallReferrerClient", "Install Referrer service connected.");
            this.f2325a.f9323c = C3730a.m14152a(iBinder);
            this.f2325a.f9321a = 2;
            this.f2326b.onInstallReferrerSetupFinished(null);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0895a.m3022b("InstallReferrerClient", "Install Referrer service disconnected.");
            this.f2325a.f9323c = null;
            this.f2325a.f9321a = 0;
            this.f2326b.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(@NonNull Context context) {
        this.f9322b = context.getApplicationContext();
    }

    /* renamed from: c */
    public boolean m11616c() {
        return (this.f9321a != 2 || this.f9323c == null || this.f9324d == null) ? false : true;
    }

    /* renamed from: a */
    public void mo1181a(@NonNull InstallReferrerStateListener installReferrerStateListener) {
        if (m11616c()) {
            C0895a.m3021a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
        } else if (this.f9321a == 1) {
            C0895a.m3022b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (this.f9321a == 3) {
            C0895a.m3022b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            C0895a.m3021a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f9324d = new C0899a(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List queryIntentServices = this.f9322b.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty())) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null && m11612d()) {
                        if (this.f9322b.bindService(new Intent(intent), this.f9324d, 1)) {
                            C0895a.m3021a("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        C0895a.m3022b("InstallReferrerClient", "Connection to service is blocked.");
                        this.f9321a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(1);
                        return;
                    }
                    C0895a.m3022b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                    this.f9321a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(2);
                    return;
                }
            }
            this.f9321a = 0;
            C0895a.m3021a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        }
    }

    /* renamed from: a */
    public void mo1180a() {
        this.f9321a = 3;
        if (this.f9324d != null) {
            C0895a.m3021a("InstallReferrerClient", "Unbinding from service.");
            this.f9322b.unbindService(this.f9324d);
            this.f9324d = null;
        }
        this.f9323c = null;
    }

    /* renamed from: b */
    public C0900a mo1182b() throws RemoteException {
        if (m11616c()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f9322b.getPackageName());
            try {
                return new C0900a(this.f9323c.getInstallReferrer(bundle));
            } catch (RemoteException e) {
                C0895a.m3022b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f9321a = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    /* renamed from: d */
    private boolean m11612d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f9322b;
        r0 = r0.getPackageManager();
        r1 = 0;
        r2 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x0018 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0018 }
        r0 = r0.getPackageInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x0018 }
        r0 = r0.versionCode;	 Catch:{ NameNotFoundException -> 0x0018 }
        r2 = 80837300; // 0x4d17ab4 float:4.924835E-36 double:3.9938933E-316;
        if (r0 < r2) goto L_0x0017;
    L_0x0016:
        r1 = 1;
    L_0x0017:
        return r1;
    L_0x0018:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.InstallReferrerClientImpl.d():boolean");
    }
}
