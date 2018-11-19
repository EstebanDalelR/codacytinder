package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.util.C2526k;
import com.google.android.gms.common.util.C2529n;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class GcmTaskService extends Service {
    /* renamed from: a */
    private final Object f7723a = new Object();
    /* renamed from: b */
    private int f7724b;
    /* renamed from: c */
    private ExecutorService f7725c;
    /* renamed from: d */
    private Messenger f7726d;
    /* renamed from: e */
    private ComponentName f7727e;
    /* renamed from: f */
    private C2544a f7728f;

    @TargetApi(21)
    /* renamed from: com.google.android.gms.gcm.GcmTaskService$a */
    class C2541a extends Handler {
        /* renamed from: a */
        private /* synthetic */ GcmTaskService f7716a;

        C2541a(GcmTaskService gcmTaskService, Looper looper) {
            this.f7716a = gcmTaskService;
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (C2529n.m9223a(this.f7716a, message.sendingUid, "com.google.android.gms")) {
                int i = message.what;
                if (i != 4) {
                    String valueOf;
                    StringBuilder stringBuilder;
                    switch (i) {
                        case 1:
                            Bundle data = message.getData();
                            if (!data.isEmpty()) {
                                Messenger messenger = message.replyTo;
                                if (messenger != null) {
                                    String string = data.getString("tag");
                                    List parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                                    if (!this.f7716a.m9250a(string)) {
                                        this.f7716a.m9247a(new C2542b(this.f7716a, string, messenger, data.getBundle("extras"), parcelableArrayList));
                                    }
                                }
                            }
                            return;
                        case 2:
                            if (Log.isLoggable("GcmTaskService", 3)) {
                                valueOf = String.valueOf(message);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
                                stringBuilder.append("ignoring unimplemented stop message for now: ");
                                stringBuilder.append(valueOf);
                                Log.d("GcmTaskService", stringBuilder.toString());
                            }
                            return;
                        default:
                            valueOf = String.valueOf(message);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                            stringBuilder.append("Unrecognized message received: ");
                            stringBuilder.append(valueOf);
                            Log.e("GcmTaskService", stringBuilder.toString());
                            return;
                    }
                }
                this.f7716a.mo1536a();
                return;
            }
            Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
        }
    }

    /* renamed from: com.google.android.gms.gcm.GcmTaskService$b */
    class C2542b implements Runnable {
        /* renamed from: a */
        private final String f7717a;
        /* renamed from: b */
        private final Bundle f7718b;
        /* renamed from: c */
        private final List<Uri> f7719c;
        @Nullable
        /* renamed from: d */
        private final zzd f7720d;
        @Nullable
        /* renamed from: e */
        private final Messenger f7721e;
        /* renamed from: f */
        private /* synthetic */ GcmTaskService f7722f;

        C2542b(GcmTaskService gcmTaskService, String str, @NonNull IBinder iBinder, Bundle bundle, List<Uri> list) {
            zzd zzd;
            this.f7722f = gcmTaskService;
            this.f7717a = str;
            if (iBinder == null) {
                zzd = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                zzd = queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new C3846f(iBinder);
            }
            this.f7720d = zzd;
            this.f7718b = bundle;
            this.f7719c = list;
            this.f7721e = null;
        }

        C2542b(GcmTaskService gcmTaskService, String str, @NonNull Messenger messenger, Bundle bundle, List<Uri> list) {
            this.f7722f = gcmTaskService;
            this.f7717a = str;
            this.f7721e = messenger;
            this.f7718b = bundle;
            this.f7719c = list;
            this.f7720d = null;
        }

        /* renamed from: a */
        private final void m9242a(int r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.f7722f;
            r0 = r0.f7723a;
            monitor-enter(r0);
            r1 = r5.f7722f;	 Catch:{ RemoteException -> 0x00d0 }
            r1 = r1.f7728f;	 Catch:{ RemoteException -> 0x00d0 }
            r2 = r5.f7717a;	 Catch:{ RemoteException -> 0x00d0 }
            r3 = r5.f7722f;	 Catch:{ RemoteException -> 0x00d0 }
            r3 = r3.f7727e;	 Catch:{ RemoteException -> 0x00d0 }
            r3 = r3.getClassName();	 Catch:{ RemoteException -> 0x00d0 }
            r1 = r1.m9275c(r2, r3);	 Catch:{ RemoteException -> 0x00d0 }
            if (r1 == 0) goto L_0x005d;
        L_0x001f:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r6 = r6.f7728f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7717a;	 Catch:{ all -> 0x0167 }
            r2 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r2 = r2.f7727e;	 Catch:{ all -> 0x0167 }
            r2 = r2.getClassName();	 Catch:{ all -> 0x0167 }
            r6.m9273b(r1, r2);	 Catch:{ all -> 0x0167 }
            r6 = r5.m9244a();	 Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x005b;	 Catch:{ all -> 0x0167 }
        L_0x003a:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r6 = r6.f7728f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7727e;	 Catch:{ all -> 0x0167 }
            r1 = r1.getClassName();	 Catch:{ all -> 0x0167 }
            r6 = r6.m9274b(r1);	 Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x005b;	 Catch:{ all -> 0x0167 }
        L_0x0050:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7724b;	 Catch:{ all -> 0x0167 }
            r6.stopSelf(r1);	 Catch:{ all -> 0x0167 }
        L_0x005b:
            monitor-exit(r0);	 Catch:{ all -> 0x0167 }
            return;
        L_0x005d:
            r1 = r5.m9244a();	 Catch:{ RemoteException -> 0x00d0 }
            if (r1 == 0) goto L_0x008c;	 Catch:{ RemoteException -> 0x00d0 }
        L_0x0063:
            r1 = r5.f7721e;	 Catch:{ RemoteException -> 0x00d0 }
            r2 = android.os.Message.obtain();	 Catch:{ RemoteException -> 0x00d0 }
            r3 = 3;	 Catch:{ RemoteException -> 0x00d0 }
            r2.what = r3;	 Catch:{ RemoteException -> 0x00d0 }
            r2.arg1 = r6;	 Catch:{ RemoteException -> 0x00d0 }
            r6 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x00d0 }
            r6.<init>();	 Catch:{ RemoteException -> 0x00d0 }
            r3 = "component";	 Catch:{ RemoteException -> 0x00d0 }
            r4 = r5.f7722f;	 Catch:{ RemoteException -> 0x00d0 }
            r4 = r4.f7727e;	 Catch:{ RemoteException -> 0x00d0 }
            r6.putParcelable(r3, r4);	 Catch:{ RemoteException -> 0x00d0 }
            r3 = "tag";	 Catch:{ RemoteException -> 0x00d0 }
            r4 = r5.f7717a;	 Catch:{ RemoteException -> 0x00d0 }
            r6.putString(r3, r4);	 Catch:{ RemoteException -> 0x00d0 }
            r2.setData(r6);	 Catch:{ RemoteException -> 0x00d0 }
            r1.send(r2);	 Catch:{ RemoteException -> 0x00d0 }
            goto L_0x0091;	 Catch:{ RemoteException -> 0x00d0 }
        L_0x008c:
            r1 = r5.f7720d;	 Catch:{ RemoteException -> 0x00d0 }
            r1.zzdr(r6);	 Catch:{ RemoteException -> 0x00d0 }
        L_0x0091:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r6 = r6.f7728f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7717a;	 Catch:{ all -> 0x0167 }
            r2 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r2 = r2.f7727e;	 Catch:{ all -> 0x0167 }
            r2 = r2.getClassName();	 Catch:{ all -> 0x0167 }
            r6.m9273b(r1, r2);	 Catch:{ all -> 0x0167 }
            r6 = r5.m9244a();	 Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x0128;	 Catch:{ all -> 0x0167 }
        L_0x00ac:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r6 = r6.f7728f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7727e;	 Catch:{ all -> 0x0167 }
            r1 = r1.getClassName();	 Catch:{ all -> 0x0167 }
            r6 = r6.m9274b(r1);	 Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x0128;	 Catch:{ all -> 0x0167 }
        L_0x00c2:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7724b;	 Catch:{ all -> 0x0167 }
        L_0x00ca:
            r6.stopSelf(r1);	 Catch:{ all -> 0x0167 }
            goto L_0x0128;
        L_0x00ce:
            r6 = move-exception;
            goto L_0x012a;
        L_0x00d0:
            r6 = "GcmTaskService";	 Catch:{ all -> 0x00ce }
            r1 = "Error reporting result of operation to scheduler for ";	 Catch:{ all -> 0x00ce }
            r2 = r5.f7717a;	 Catch:{ all -> 0x00ce }
            r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00ce }
            r3 = r2.length();	 Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x00e5;	 Catch:{ all -> 0x00ce }
        L_0x00e0:
            r1 = r1.concat(r2);	 Catch:{ all -> 0x00ce }
            goto L_0x00eb;	 Catch:{ all -> 0x00ce }
        L_0x00e5:
            r2 = new java.lang.String;	 Catch:{ all -> 0x00ce }
            r2.<init>(r1);	 Catch:{ all -> 0x00ce }
            r1 = r2;	 Catch:{ all -> 0x00ce }
        L_0x00eb:
            android.util.Log.e(r6, r1);	 Catch:{ all -> 0x00ce }
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r6 = r6.f7728f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7717a;	 Catch:{ all -> 0x0167 }
            r2 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r2 = r2.f7727e;	 Catch:{ all -> 0x0167 }
            r2 = r2.getClassName();	 Catch:{ all -> 0x0167 }
            r6.m9273b(r1, r2);	 Catch:{ all -> 0x0167 }
            r6 = r5.m9244a();	 Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x0128;	 Catch:{ all -> 0x0167 }
        L_0x0109:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r6 = r6.f7728f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7727e;	 Catch:{ all -> 0x0167 }
            r1 = r1.getClassName();	 Catch:{ all -> 0x0167 }
            r6 = r6.m9274b(r1);	 Catch:{ all -> 0x0167 }
            if (r6 != 0) goto L_0x0128;	 Catch:{ all -> 0x0167 }
        L_0x011f:
            r6 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7724b;	 Catch:{ all -> 0x0167 }
            goto L_0x00ca;	 Catch:{ all -> 0x0167 }
        L_0x0128:
            monitor-exit(r0);	 Catch:{ all -> 0x0167 }
            return;	 Catch:{ all -> 0x0167 }
        L_0x012a:
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7728f;	 Catch:{ all -> 0x0167 }
            r2 = r5.f7717a;	 Catch:{ all -> 0x0167 }
            r3 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r3 = r3.f7727e;	 Catch:{ all -> 0x0167 }
            r3 = r3.getClassName();	 Catch:{ all -> 0x0167 }
            r1.m9273b(r2, r3);	 Catch:{ all -> 0x0167 }
            r1 = r5.m9244a();	 Catch:{ all -> 0x0167 }
            if (r1 != 0) goto L_0x0166;	 Catch:{ all -> 0x0167 }
        L_0x0145:
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r1 = r1.f7728f;	 Catch:{ all -> 0x0167 }
            r2 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r2 = r2.f7727e;	 Catch:{ all -> 0x0167 }
            r2 = r2.getClassName();	 Catch:{ all -> 0x0167 }
            r1 = r1.m9274b(r2);	 Catch:{ all -> 0x0167 }
            if (r1 != 0) goto L_0x0166;	 Catch:{ all -> 0x0167 }
        L_0x015b:
            r1 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r2 = r5.f7722f;	 Catch:{ all -> 0x0167 }
            r2 = r2.f7724b;	 Catch:{ all -> 0x0167 }
            r1.stopSelf(r2);	 Catch:{ all -> 0x0167 }
        L_0x0166:
            throw r6;	 Catch:{ all -> 0x0167 }
        L_0x0167:
            r6 = move-exception;	 Catch:{ all -> 0x0167 }
            monitor-exit(r0);	 Catch:{ all -> 0x0167 }
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.b.a(int):void");
        }

        /* renamed from: a */
        private final boolean m9244a() {
            return this.f7721e != null;
        }

        public final void run() {
            m9242a(this.f7722f.mo1535a(new C2546c(this.f7717a, this.f7718b, this.f7719c)));
        }
    }

    /* renamed from: a */
    private final void m9246a(int i) {
        synchronized (this.f7723a) {
            this.f7724b = i;
            if (!this.f7728f.m9274b(this.f7727e.getClassName())) {
                stopSelf(this.f7724b);
            }
        }
    }

    /* renamed from: a */
    private final void m9247a(C2542b c2542b) {
        try {
            this.f7725c.execute(c2542b);
        } catch (Throwable e) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            c2542b.m9242a(1);
        }
    }

    /* renamed from: a */
    private final boolean m9250a(String str) {
        boolean a;
        synchronized (this.f7723a) {
            a = this.f7728f.m9272a(str, this.f7727e.getClassName()) ^ 1;
            if (a) {
                String packageName = getPackageName();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(packageName).length() + 44) + String.valueOf(str).length());
                stringBuilder.append(packageName);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(": Task already running, won't start another");
                Log.w("GcmTaskService", stringBuilder.toString());
            }
        }
        return a;
    }

    /* renamed from: a */
    public abstract int mo1535a(C2546c c2546c);

    /* renamed from: a */
    public void mo1536a() {
    }

    @CallSuper
    public IBinder onBind(Intent intent) {
        if (intent != null && C2526k.m9216g()) {
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
                return this.f7726d.getBinder();
            }
        }
        return null;
    }

    @CallSuper
    public void onCreate() {
        super.onCreate();
        this.f7728f = C2544a.m9265a((Context) this);
        this.f7725c = Executors.newFixedThreadPool(2, new C2548e(this));
        this.f7726d = new Messenger(new C2541a(this, Looper.getMainLooper()));
        this.f7727e = new ComponentName(this, getClass());
    }

    @CallSuper
    public void onDestroy() {
        super.onDestroy();
        List shutdownNow = this.f7725c.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            int size = shutdownNow.size();
            StringBuilder stringBuilder = new StringBuilder(79);
            stringBuilder.append("Shutting down, but not all tasks are finished executing. Remaining: ");
            stringBuilder.append(size);
            Log.e("GcmTaskService", stringBuilder.toString());
        }
    }

    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            m9246a(i2);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            StringBuilder stringBuilder;
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra("extras");
                List parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                if (!(parcelableExtra instanceof PendingCallback)) {
                    action = getPackageName();
                    stringBuilder = new StringBuilder((String.valueOf(action).length() + 47) + String.valueOf(stringExtra).length());
                    stringBuilder.append(action);
                    stringBuilder.append(" ");
                    stringBuilder.append(stringExtra);
                    stringBuilder.append(": Could not process request, invalid callback.");
                    Log.e("GcmTaskService", stringBuilder.toString());
                    return 2;
                } else if (m9250a(stringExtra)) {
                    m9246a(i2);
                    return 2;
                } else {
                    m9247a(new C2542b(this, stringExtra, ((PendingCallback) parcelableExtra).zzfzf, bundleExtra, parcelableArrayListExtra));
                }
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                mo1536a();
            } else {
                stringBuilder = new StringBuilder(String.valueOf(action).length() + 37);
                stringBuilder.append("Unknown action received ");
                stringBuilder.append(action);
                stringBuilder.append(", terminating");
                Log.e("GcmTaskService", stringBuilder.toString());
            }
            m9246a(i2);
            return 2;
        } finally {
            m9246a(i2);
        }
    }
}
