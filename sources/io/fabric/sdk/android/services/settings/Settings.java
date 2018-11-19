package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.C15608c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class Settings {
    /* renamed from: a */
    private final AtomicReference<C15665p> f48445a;
    /* renamed from: b */
    private final CountDownLatch f48446b;
    /* renamed from: c */
    private SettingsController f48447c;
    /* renamed from: d */
    private boolean f48448d;

    public interface SettingsAccess<T> {
        T usingSettings(C15665p c15665p);
    }

    /* renamed from: io.fabric.sdk.android.services.settings.Settings$a */
    static class C15655a {
        /* renamed from: a */
        private static final Settings f48444a = new Settings();
    }

    /* renamed from: a */
    public static Settings m58816a() {
        return C15655a.f48444a;
    }

    private Settings() {
        this.f48445a = new AtomicReference();
        this.f48446b = new CountDownLatch(1);
        this.f48448d = false;
    }

    /* renamed from: a */
    public synchronized io.fabric.sdk.android.services.settings.Settings m58818a(io.fabric.sdk.android.C15611g r23, io.fabric.sdk.android.services.common.IdManager r24, io.fabric.sdk.android.services.network.HttpRequestFactory r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r22 = this;
        r1 = r22;
        r3 = r23;
        monitor-enter(r22);
        r2 = r1.f48448d;	 Catch:{ all -> 0x0095 }
        if (r2 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r22);
        return r1;
    L_0x000b:
        r2 = r1.f48447c;	 Catch:{ all -> 0x0095 }
        r9 = 1;	 Catch:{ all -> 0x0095 }
        if (r2 != 0) goto L_0x0091;	 Catch:{ all -> 0x0095 }
    L_0x0010:
        r2 = r23.getContext();	 Catch:{ all -> 0x0095 }
        r4 = r24.m58638c();	 Catch:{ all -> 0x0095 }
        r5 = new io.fabric.sdk.android.services.common.f;	 Catch:{ all -> 0x0095 }
        r5.<init>();	 Catch:{ all -> 0x0095 }
        r11 = r5.m58689a(r2);	 Catch:{ all -> 0x0095 }
        r5 = r24.m58644i();	 Catch:{ all -> 0x0095 }
        r6 = new io.fabric.sdk.android.services.common.m;	 Catch:{ all -> 0x0095 }
        r6.<init>();	 Catch:{ all -> 0x0095 }
        r7 = new io.fabric.sdk.android.services.settings.j;	 Catch:{ all -> 0x0095 }
        r7.<init>();	 Catch:{ all -> 0x0095 }
        r8 = new io.fabric.sdk.android.services.settings.h;	 Catch:{ all -> 0x0095 }
        r8.<init>(r3);	 Catch:{ all -> 0x0095 }
        r20 = io.fabric.sdk.android.services.common.CommonUtils.m58625k(r2);	 Catch:{ all -> 0x0095 }
        r10 = java.util.Locale.US;	 Catch:{ all -> 0x0095 }
        r12 = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings";	 Catch:{ all -> 0x0095 }
        r13 = new java.lang.Object[r9];	 Catch:{ all -> 0x0095 }
        r14 = 0;	 Catch:{ all -> 0x0095 }
        r13[r14] = r4;	 Catch:{ all -> 0x0095 }
        r4 = java.lang.String.format(r10, r12, r13);	 Catch:{ all -> 0x0095 }
        r15 = new io.fabric.sdk.android.services.settings.k;	 Catch:{ all -> 0x0095 }
        r10 = r25;	 Catch:{ all -> 0x0095 }
        r12 = r28;	 Catch:{ all -> 0x0095 }
        r15.<init>(r3, r12, r4, r10);	 Catch:{ all -> 0x0095 }
        r12 = r24.m58642g();	 Catch:{ all -> 0x0095 }
        r13 = r24.m58641f();	 Catch:{ all -> 0x0095 }
        r4 = r24.m58640e();	 Catch:{ all -> 0x0095 }
        r16 = r24.m58637b();	 Catch:{ all -> 0x0095 }
        r10 = new java.lang.String[r9];	 Catch:{ all -> 0x0095 }
        r2 = io.fabric.sdk.android.services.common.CommonUtils.m58627m(r2);	 Catch:{ all -> 0x0095 }
        r10[r14] = r2;	 Catch:{ all -> 0x0095 }
        r2 = io.fabric.sdk.android.services.common.CommonUtils.m58598a(r10);	 Catch:{ all -> 0x0095 }
        r5 = io.fabric.sdk.android.services.common.DeliveryMechanism.determineFrom(r5);	 Catch:{ all -> 0x0095 }
        r19 = r5.getId();	 Catch:{ all -> 0x0095 }
        r5 = new io.fabric.sdk.android.services.settings.r;	 Catch:{ all -> 0x0095 }
        r10 = r5;	 Catch:{ all -> 0x0095 }
        r14 = r4;	 Catch:{ all -> 0x0095 }
        r21 = r15;	 Catch:{ all -> 0x0095 }
        r15 = r16;	 Catch:{ all -> 0x0095 }
        r16 = r2;	 Catch:{ all -> 0x0095 }
        r17 = r27;	 Catch:{ all -> 0x0095 }
        r18 = r26;	 Catch:{ all -> 0x0095 }
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ all -> 0x0095 }
        r10 = new io.fabric.sdk.android.services.settings.i;	 Catch:{ all -> 0x0095 }
        r2 = r10;	 Catch:{ all -> 0x0095 }
        r4 = r5;	 Catch:{ all -> 0x0095 }
        r5 = r6;	 Catch:{ all -> 0x0095 }
        r6 = r7;	 Catch:{ all -> 0x0095 }
        r7 = r8;	 Catch:{ all -> 0x0095 }
        r8 = r21;	 Catch:{ all -> 0x0095 }
        r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0095 }
        r1.f48447c = r10;	 Catch:{ all -> 0x0095 }
    L_0x0091:
        r1.f48448d = r9;	 Catch:{ all -> 0x0095 }
        monitor-exit(r22);
        return r1;
    L_0x0095:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r22);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.settings.Settings.a(io.fabric.sdk.android.g, io.fabric.sdk.android.services.common.IdManager, io.fabric.sdk.android.services.network.HttpRequestFactory, java.lang.String, java.lang.String, java.lang.String):io.fabric.sdk.android.services.settings.Settings");
    }

    /* renamed from: b */
    public io.fabric.sdk.android.services.settings.C15665p m58819b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f48446b;	 Catch:{ InterruptedException -> 0x000e }
        r0.await();	 Catch:{ InterruptedException -> 0x000e }
        r0 = r3.f48445a;	 Catch:{ InterruptedException -> 0x000e }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x000e }
        r0 = (io.fabric.sdk.android.services.settings.C15665p) r0;	 Catch:{ InterruptedException -> 0x000e }
        return r0;
    L_0x000e:
        r0 = io.fabric.sdk.android.C15608c.m58560h();
        r1 = "Fabric";
        r2 = "Interrupted while waiting for settings data.";
        r0.mo12793e(r1, r2);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.settings.Settings.b():io.fabric.sdk.android.services.settings.p");
    }

    /* renamed from: c */
    public synchronized boolean m58820c() {
        C15665p loadSettingsData;
        loadSettingsData = this.f48447c.loadSettingsData();
        m58817a(loadSettingsData);
        return loadSettingsData != null;
    }

    /* renamed from: d */
    public synchronized boolean m58821d() {
        C15665p loadSettingsData;
        loadSettingsData = this.f48447c.loadSettingsData(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        m58817a(loadSettingsData);
        if (loadSettingsData == null) {
            C15608c.m58560h().mo12794e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return loadSettingsData != null;
    }

    /* renamed from: a */
    private void m58817a(C15665p c15665p) {
        this.f48445a.set(c15665p);
        this.f48446b.countDown();
    }
}
