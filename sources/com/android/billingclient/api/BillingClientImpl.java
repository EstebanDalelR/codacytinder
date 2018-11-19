package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.android.billingclient.api.C0889d.C0888a;
import com.android.billingclient.api.C0891e.C0890a;
import com.android.billingclient.p020a.C0865a;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.C2999a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class BillingClientImpl extends BillingClient {
    /* renamed from: a */
    private int f9310a = 0;
    /* renamed from: b */
    private final Handler f9311b = new Handler();
    /* renamed from: c */
    private final C0880a f9312c;
    /* renamed from: d */
    private final Context f9313d;
    /* renamed from: e */
    private IInAppBillingService f9314e;
    /* renamed from: f */
    private ServiceConnection f9315f;
    /* renamed from: g */
    private boolean f9316g;
    /* renamed from: h */
    private boolean f9317h;
    /* renamed from: i */
    private boolean f9318i;
    /* renamed from: j */
    private ExecutorService f9319j;
    /* renamed from: k */
    private final BroadcastReceiver f9320k = new C08681(this);

    /* renamed from: com.android.billingclient.api.BillingClientImpl$1 */
    class C08681 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ BillingClientImpl f2259a;

        C08681(BillingClientImpl billingClientImpl) {
            this.f2259a = billingClientImpl;
        }

        public void onReceive(Context context, Intent intent) {
            context = this.f2259a.f9312c.m2978b();
            if (context == null) {
                C0865a.m2962b("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
            } else {
                context.onPurchasesUpdated(intent.getIntExtra("response_code_key", 6), C0865a.m2960a(intent.getBundleExtra("response_bundle_key")));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
    }

    /* renamed from: com.android.billingclient.api.BillingClientImpl$a */
    private final class C0877a implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ BillingClientImpl f2286a;
        /* renamed from: b */
        private final BillingClientStateListener f2287b;

        private C0877a(BillingClientImpl billingClientImpl, @NonNull BillingClientStateListener billingClientStateListener) {
            this.f2286a = billingClientImpl;
            if (billingClientStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when init is done.");
            }
            this.f2287b = billingClientStateListener;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0865a.m2962b("BillingClient", "Billing service disconnected.");
            this.f2286a.f9314e = null;
            this.f2286a.f9310a = 0;
            this.f2287b.onBillingServiceDisconnected();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0865a.m2961a("BillingClient", "Billing service connected.");
            this.f2286a.f9314e = C2999a.m11617a(iBinder);
            componentName = this.f2286a.f9313d.getPackageName();
            this.f2286a.f9316g = false;
            this.f2286a.f9317h = false;
            this.f2286a.f9318i = false;
            try {
                int isBillingSupported = this.f2286a.f9314e.isBillingSupported(6, componentName, "subs");
                if (isBillingSupported == 0) {
                    C0865a.m2961a("BillingClient", "In-app billing API version 6 with subs is supported.");
                    this.f2286a.f9318i = true;
                    this.f2286a.f9316g = true;
                    this.f2286a.f9317h = true;
                } else {
                    if (this.f2286a.f9314e.isBillingSupported(6, componentName, "inapp") == 0) {
                        C0865a.m2961a("BillingClient", "In-app billing API without subs version 6 supported.");
                        this.f2286a.f9318i = true;
                    }
                    isBillingSupported = this.f2286a.f9314e.isBillingSupported(5, componentName, "subs");
                    if (isBillingSupported == 0) {
                        C0865a.m2961a("BillingClient", "In-app billing API version 5 supported.");
                        this.f2286a.f9317h = true;
                        this.f2286a.f9316g = true;
                    } else {
                        isBillingSupported = this.f2286a.f9314e.isBillingSupported(3, componentName, "subs");
                        if (isBillingSupported == 0) {
                            C0865a.m2961a("BillingClient", "In-app billing API version 3 with subscriptions is supported.");
                            this.f2286a.f9316g = true;
                        } else if (this.f2286a.f9318i) {
                            isBillingSupported = 0;
                        } else {
                            componentName = this.f2286a.f9314e.isBillingSupported(3, componentName, "inapp");
                            if (componentName == null) {
                                C0865a.m2961a("BillingClient", "In-app billing API version 3 with in-app items is supported.");
                            } else {
                                C0865a.m2962b("BillingClient", "Even billing API version 3 is not supported on this device.");
                            }
                            isBillingSupported = componentName;
                        }
                    }
                }
                if (isBillingSupported == 0) {
                    this.f2286a.f9310a = 2;
                } else {
                    this.f2286a.f9310a = 0;
                    this.f2286a.f9314e = null;
                }
                this.f2287b.onBillingSetupFinished(isBillingSupported);
            } catch (ComponentName componentName2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RemoteException while setting up in-app billing");
                stringBuilder.append(componentName2);
                C0865a.m2962b("BillingClient", stringBuilder.toString());
                this.f2286a.f9310a = 0;
                this.f2286a.f9314e = null;
                this.f2287b.onBillingSetupFinished(-1);
            }
        }
    }

    @UiThread
    BillingClientImpl(@NonNull Context context, @NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
        this.f9313d = context.getApplicationContext();
        this.f9312c = new C0880a(this.f9313d, purchasesUpdatedListener);
    }

    /* renamed from: a */
    public boolean mo1178a() {
        return (this.f9310a != 2 || this.f9314e == null || this.f9315f == null) ? false : true;
    }

    /* renamed from: a */
    public void mo1174a(@NonNull BillingClientStateListener billingClientStateListener) {
        if (mo1178a()) {
            C0865a.m2961a("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(0);
        } else if (this.f9310a == 1) {
            C0865a.m2962b("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(5);
        } else if (this.f9310a == 3) {
            C0865a.m2962b("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(5);
        } else {
            this.f9310a = 1;
            this.f9312c.m2977a();
            C0887c.m2995a(this.f9313d).m2999a(this.f9320k, new IntentFilter("proxy_activity_response_intent_action"));
            C0865a.m2961a("BillingClient", "Starting in-app billing setup.");
            this.f9315f = new C0877a(billingClientStateListener);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List queryIntentServices = this.f9313d.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty())) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        C0865a.m2962b("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("libraryVersion", "1.0");
                        if (this.f9313d.bindService(intent2, this.f9315f, 1)) {
                            C0865a.m2961a("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        C0865a.m2962b("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.f9310a = 0;
            C0865a.m2961a("BillingClient", "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(3);
        }
    }

    /* renamed from: b */
    public void mo1179b() {
        C0887c.m2995a(this.f9313d).m2998a(this.f9320k);
        this.f9312c.m2979c();
        this.f9310a = 3;
        if (this.f9315f != null) {
            C0865a.m2961a("BillingClient", "Unbinding from service.");
            this.f9313d.unbindService(this.f9315f);
            this.f9315f = null;
        }
        this.f9314e = null;
        if (this.f9319j != null) {
            this.f9319j.shutdownNow();
            this.f9319j = null;
        }
    }

    /* renamed from: a */
    public int mo1172a(android.app.Activity r18, com.android.billingclient.api.C0883b r19) {
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
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r17.mo1178a();
        r3 = -1;
        if (r2 != 0) goto L_0x000c;
    L_0x000b:
        return r3;
    L_0x000c:
        r8 = r19.m2989b();
        r2 = r19.m2988a();
        r4 = 5;
        if (r2 != 0) goto L_0x001f;
    L_0x0017:
        r1 = "BillingClient";
        r2 = "Please fix the input params. SKU can't be null.";
        com.android.billingclient.p020a.C0865a.m2962b(r1, r2);
        return r4;
    L_0x001f:
        if (r8 != 0) goto L_0x0029;
    L_0x0021:
        r1 = "BillingClient";
        r2 = "Please fix the input params. SkuType can't be null.";
        com.android.billingclient.p020a.C0865a.m2962b(r1, r2);
        return r4;
    L_0x0029:
        r5 = r19.m2990c();
        r6 = 1;
        if (r5 == 0) goto L_0x0042;
    L_0x0030:
        r5 = r19.m2990c();
        r5 = r5.size();
        if (r5 >= r6) goto L_0x0042;
    L_0x003a:
        r1 = "BillingClient";
        r2 = "Please fix the input params. OldSkus size can't be 0.";
        com.android.billingclient.p020a.C0865a.m2962b(r1, r2);
        return r4;
    L_0x0042:
        r4 = "subs";
        r4 = r8.equals(r4);
        r5 = -2;
        if (r4 == 0) goto L_0x0057;
    L_0x004b:
        r4 = r0.f9316g;
        if (r4 != 0) goto L_0x0057;
    L_0x004f:
        r1 = "BillingClient";
        r2 = "Current client doesn't support subscriptions.";
        com.android.billingclient.p020a.C0865a.m2962b(r1, r2);
        return r5;
    L_0x0057:
        r4 = r19.m2990c();
        r16 = 0;
        if (r4 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0061;
    L_0x0060:
        r6 = 0;
    L_0x0061:
        if (r6 == 0) goto L_0x006f;
    L_0x0063:
        r4 = r0.f9317h;
        if (r4 != 0) goto L_0x006f;
    L_0x0067:
        r1 = "BillingClient";
        r2 = "Current client doesn't support subscriptions update.";
        com.android.billingclient.p020a.C0865a.m2962b(r1, r2);
        return r5;
    L_0x006f:
        r4 = r19.m2994g();
        if (r4 == 0) goto L_0x0081;
    L_0x0075:
        r4 = r0.f9318i;
        if (r4 != 0) goto L_0x0081;
    L_0x0079:
        r1 = "BillingClient";
        r2 = "Current client doesn't support extra params for buy intent.";
        com.android.billingclient.p020a.C0865a.m2962b(r1, r2);
        return r5;
    L_0x0081:
        r4 = "BillingClient";	 Catch:{ RemoteException -> 0x0128 }
        r5 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0128 }
        r5.<init>();	 Catch:{ RemoteException -> 0x0128 }
        r7 = "Constructing buy intent for ";	 Catch:{ RemoteException -> 0x0128 }
        r5.append(r7);	 Catch:{ RemoteException -> 0x0128 }
        r5.append(r2);	 Catch:{ RemoteException -> 0x0128 }
        r7 = ", item type: ";	 Catch:{ RemoteException -> 0x0128 }
        r5.append(r7);	 Catch:{ RemoteException -> 0x0128 }
        r5.append(r8);	 Catch:{ RemoteException -> 0x0128 }
        r5 = r5.toString();	 Catch:{ RemoteException -> 0x0128 }
        com.android.billingclient.p020a.C0865a.m2961a(r4, r5);	 Catch:{ RemoteException -> 0x0128 }
        r4 = r0.f9318i;	 Catch:{ RemoteException -> 0x0128 }
        if (r4 == 0) goto L_0x00ca;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00a3:
        r4 = r19;	 Catch:{ RemoteException -> 0x0128 }
        r10 = r0.m11585a(r4);	 Catch:{ RemoteException -> 0x0128 }
        r5 = "libraryVersion";	 Catch:{ RemoteException -> 0x0128 }
        r6 = "1.0";	 Catch:{ RemoteException -> 0x0128 }
        r10.putString(r5, r6);	 Catch:{ RemoteException -> 0x0128 }
        r4 = r19.m2993f();	 Catch:{ RemoteException -> 0x0128 }
        if (r4 == 0) goto L_0x00b9;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00b6:
        r4 = 7;	 Catch:{ RemoteException -> 0x0128 }
        r5 = 7;	 Catch:{ RemoteException -> 0x0128 }
        goto L_0x00bb;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00b9:
        r4 = 6;	 Catch:{ RemoteException -> 0x0128 }
        r5 = 6;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00bb:
        r4 = r0.f9314e;	 Catch:{ RemoteException -> 0x0128 }
        r6 = r0.f9313d;	 Catch:{ RemoteException -> 0x0128 }
        r6 = r6.getPackageName();	 Catch:{ RemoteException -> 0x0128 }
        r9 = 0;	 Catch:{ RemoteException -> 0x0128 }
        r7 = r2;	 Catch:{ RemoteException -> 0x0128 }
        r4 = r4.getBuyIntentExtraParams(r5, r6, r7, r8, r9, r10);	 Catch:{ RemoteException -> 0x0128 }
        goto L_0x00f3;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00ca:
        r4 = r19;	 Catch:{ RemoteException -> 0x0128 }
        if (r6 == 0) goto L_0x00e4;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00ce:
        r9 = r0.f9314e;	 Catch:{ RemoteException -> 0x0128 }
        r10 = 5;	 Catch:{ RemoteException -> 0x0128 }
        r5 = r0.f9313d;	 Catch:{ RemoteException -> 0x0128 }
        r11 = r5.getPackageName();	 Catch:{ RemoteException -> 0x0128 }
        r12 = r19.m2990c();	 Catch:{ RemoteException -> 0x0128 }
        r14 = "subs";	 Catch:{ RemoteException -> 0x0128 }
        r15 = 0;	 Catch:{ RemoteException -> 0x0128 }
        r13 = r2;	 Catch:{ RemoteException -> 0x0128 }
        r4 = r9.getBuyIntentToReplaceSkus(r10, r11, r12, r13, r14, r15);	 Catch:{ RemoteException -> 0x0128 }
        goto L_0x00f3;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00e4:
        r4 = r0.f9314e;	 Catch:{ RemoteException -> 0x0128 }
        r5 = 3;	 Catch:{ RemoteException -> 0x0128 }
        r6 = r0.f9313d;	 Catch:{ RemoteException -> 0x0128 }
        r6 = r6.getPackageName();	 Catch:{ RemoteException -> 0x0128 }
        r9 = 0;	 Catch:{ RemoteException -> 0x0128 }
        r7 = r2;	 Catch:{ RemoteException -> 0x0128 }
        r4 = r4.getBuyIntent(r5, r6, r7, r8, r9);	 Catch:{ RemoteException -> 0x0128 }
    L_0x00f3:
        r5 = "BillingClient";	 Catch:{ RemoteException -> 0x0128 }
        r5 = com.android.billingclient.p020a.C0865a.m2959a(r4, r5);	 Catch:{ RemoteException -> 0x0128 }
        if (r5 == 0) goto L_0x0112;	 Catch:{ RemoteException -> 0x0128 }
    L_0x00fb:
        r1 = "BillingClient";	 Catch:{ RemoteException -> 0x0128 }
        r4 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0128 }
        r4.<init>();	 Catch:{ RemoteException -> 0x0128 }
        r6 = "Unable to buy item, Error response code: ";	 Catch:{ RemoteException -> 0x0128 }
        r4.append(r6);	 Catch:{ RemoteException -> 0x0128 }
        r4.append(r5);	 Catch:{ RemoteException -> 0x0128 }
        r4 = r4.toString();	 Catch:{ RemoteException -> 0x0128 }
        com.android.billingclient.p020a.C0865a.m2962b(r1, r4);	 Catch:{ RemoteException -> 0x0128 }
        return r5;	 Catch:{ RemoteException -> 0x0128 }
    L_0x0112:
        r5 = new android.content.Intent;	 Catch:{ RemoteException -> 0x0128 }
        r6 = com.android.billingclient.api.ProxyBillingActivity.class;	 Catch:{ RemoteException -> 0x0128 }
        r5.<init>(r1, r6);	 Catch:{ RemoteException -> 0x0128 }
        r6 = "BUY_INTENT";	 Catch:{ RemoteException -> 0x0128 }
        r7 = "BUY_INTENT";	 Catch:{ RemoteException -> 0x0128 }
        r4 = r4.getParcelable(r7);	 Catch:{ RemoteException -> 0x0128 }
        r5.putExtra(r6, r4);	 Catch:{ RemoteException -> 0x0128 }
        r1.startActivity(r5);	 Catch:{ RemoteException -> 0x0128 }
        return r16;
    L_0x0128:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "RemoteException while launching launching replace subscriptions flow: ; for sku: ";
        r1.append(r4);
        r1.append(r2);
        r2 = "; try to reconnect";
        r1.append(r2);
        r1 = r1.toString();
        r2 = "BillingClient";
        com.android.billingclient.p020a.C0865a.m2962b(r2, r1);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.a(android.app.Activity, com.android.billingclient.api.b):int");
    }

    /* renamed from: a */
    public C0888a mo1173a(String str) {
        if (!mo1178a()) {
            return new C0888a(-1, null);
        }
        if (!TextUtils.isEmpty(str)) {
            return m11588a(str, false);
        }
        C0865a.m2962b("BillingClient", "Please provide a valid SKU type.");
        return new C0888a(5, null);
    }

    /* renamed from: a */
    public void mo1175a(C0894f c0894f, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!mo1178a()) {
            skuDetailsResponseListener.onSkuDetailsResponse(-1, null);
        }
        final Object a = c0894f.m3019a();
        c0894f = c0894f.m3020b();
        if (TextUtils.isEmpty(a)) {
            C0865a.m2962b("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(5, null);
        } else if (c0894f == null) {
            C0865a.m2962b("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(5, null);
        } else {
            m11592a(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ BillingClientImpl f2265d;

                public void run() {
                    final C0890a a = this.f2265d.m11603a(a, c0894f);
                    this.f2265d.m11595b(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C08702 f2261b;

                        public void run() {
                            skuDetailsResponseListener.onSkuDetailsResponse(a.m3009b(), a.m3008a());
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo1176a(final String str, final ConsumeResponseListener consumeResponseListener) {
        if (!mo1178a()) {
            consumeResponseListener.onConsumeResponse(-1, null);
        }
        if (TextUtils.isEmpty(str)) {
            C0865a.m2962b("BillingClient", "Please provide a valid purchase token got from queryPurchases result.");
            consumeResponseListener.onConsumeResponse(5, str);
            return;
        }
        m11592a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ BillingClientImpl f2268c;

            public void run() {
                this.f2268c.m11596b(str, consumeResponseListener);
            }
        });
    }

    /* renamed from: a */
    public void mo1177a(final String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!mo1178a()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(-1, null);
        }
        m11592a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ BillingClientImpl f2273c;

            public void run() {
                final C0888a a = this.f2273c.m11588a(str, true);
                this.f2273c.m11595b(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C08734 f2270b;

                    public void run() {
                        purchaseHistoryResponseListener.onPurchaseHistoryResponse(a.m3001a(), a.m3002b());
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private Bundle m11585a(C0883b c0883b) {
        Bundle bundle = new Bundle();
        if (!c0883b.m2991d()) {
            bundle.putBoolean("replaceSkusProration", false);
        }
        if (c0883b.m2992e() != null) {
            bundle.putString("accountId", c0883b.m2992e());
        }
        if (c0883b.m2993f()) {
            bundle.putBoolean("vr", true);
        }
        if (c0883b.m2990c() != null) {
            bundle.putStringArrayList("skusToReplace", c0883b.m2990c());
        }
        return bundle;
    }

    /* renamed from: a */
    private void m11592a(Runnable runnable) {
        if (this.f9319j == null) {
            this.f9319j = Executors.newFixedThreadPool(C0865a.f2256a);
        }
        this.f9319j.submit(runnable);
    }

    @android.support.annotation.VisibleForTesting
    /* renamed from: a */
    com.android.billingclient.api.C0891e.C0890a m11603a(java.lang.String r13, java.util.List<java.lang.String> r14) {
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
        r12 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r14.size();
        r2 = 0;
        r3 = 0;
    L_0x000b:
        if (r3 >= r1) goto L_0x00f7;
    L_0x000d:
        r4 = r3 + 20;
        if (r4 <= r1) goto L_0x0013;
    L_0x0011:
        r5 = r1;
        goto L_0x0014;
    L_0x0013:
        r5 = r4;
    L_0x0014:
        r6 = new java.util.ArrayList;
        r3 = r14.subList(r3, r5);
        r6.<init>(r3);
        r3 = new android.os.Bundle;
        r3.<init>();
        r5 = "ITEM_ID_LIST";
        r3.putStringArrayList(r5, r6);
        r5 = "libraryVersion";
        r6 = "1.0";
        r3.putString(r5, r6);
        r5 = 0;
        r6 = r12.f9314e;	 Catch:{ RemoteException -> 0x00d9 }
        r7 = 3;	 Catch:{ RemoteException -> 0x00d9 }
        r8 = r12.f9313d;	 Catch:{ RemoteException -> 0x00d9 }
        r8 = r8.getPackageName();	 Catch:{ RemoteException -> 0x00d9 }
        r3 = r6.getSkuDetails(r7, r8, r13, r3);	 Catch:{ RemoteException -> 0x00d9 }
        r6 = 4;
        if (r3 != 0) goto L_0x004c;
    L_0x003f:
        r13 = "BillingClient";
        r14 = "querySkuDetailsAsync got null sku details list";
        com.android.billingclient.p020a.C0865a.m2962b(r13, r14);
        r13 = new com.android.billingclient.api.e$a;
        r13.<init>(r6, r5);
        return r13;
    L_0x004c:
        r7 = "DETAILS_LIST";
        r7 = r3.containsKey(r7);
        r8 = 6;
        if (r7 != 0) goto L_0x0086;
    L_0x0055:
        r13 = "BillingClient";
        r13 = com.android.billingclient.p020a.C0865a.m2959a(r3, r13);
        if (r13 == 0) goto L_0x0079;
    L_0x005d:
        r14 = "BillingClient";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "getSkuDetails() failed. Response code: ";
        r1.append(r2);
        r1.append(r13);
        r1 = r1.toString();
        com.android.billingclient.p020a.C0865a.m2962b(r14, r1);
        r14 = new com.android.billingclient.api.e$a;
        r14.<init>(r13, r0);
        return r14;
    L_0x0079:
        r13 = "BillingClient";
        r14 = "getSkuDetails() returned a bundle with neither an error nor a detail list.";
        com.android.billingclient.p020a.C0865a.m2962b(r13, r14);
        r13 = new com.android.billingclient.api.e$a;
        r13.<init>(r8, r0);
        return r13;
    L_0x0086:
        r7 = "DETAILS_LIST";
        r3 = r3.getStringArrayList(r7);
        if (r3 != 0) goto L_0x009b;
    L_0x008e:
        r13 = "BillingClient";
        r14 = "querySkuDetailsAsync got null response list";
        com.android.billingclient.p020a.C0865a.m2962b(r13, r14);
        r13 = new com.android.billingclient.api.e$a;
        r13.<init>(r6, r5);
        return r13;
    L_0x009b:
        r6 = 0;
    L_0x009c:
        r7 = r3.size();
        if (r6 >= r7) goto L_0x00d6;
    L_0x00a2:
        r7 = r3.get(r6);
        r7 = (java.lang.String) r7;
        r9 = new com.android.billingclient.api.e;	 Catch:{ JSONException -> 0x00c9 }
        r9.<init>(r7);	 Catch:{ JSONException -> 0x00c9 }
        r7 = "BillingClient";
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = "Got sku details: ";
        r10.append(r11);
        r10.append(r9);
        r10 = r10.toString();
        com.android.billingclient.p020a.C0865a.m2961a(r7, r10);
        r0.add(r9);
        r6 = r6 + 1;
        goto L_0x009c;
    L_0x00c9:
        r13 = "BillingClient";
        r14 = "Got a JSON exception trying to decode SkuDetails";
        com.android.billingclient.p020a.C0865a.m2962b(r13, r14);
        r13 = new com.android.billingclient.api.e$a;
        r13.<init>(r8, r5);
        return r13;
    L_0x00d6:
        r3 = r4;
        goto L_0x000b;
    L_0x00d9:
        r13 = move-exception;
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r0 = "querySkuDetailsAsync got a remote exception (try to reconnect): ";
        r14.append(r0);
        r14.append(r13);
        r13 = r14.toString();
        r14 = "BillingClient";
        com.android.billingclient.p020a.C0865a.m2962b(r14, r13);
        r13 = new com.android.billingclient.api.e$a;
        r14 = -1;
        r13.<init>(r14, r5);
        return r13;
    L_0x00f7:
        r13 = new com.android.billingclient.api.e$a;
        r13.<init>(r2, r0);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.a(java.lang.String, java.util.List):com.android.billingclient.api.e$a");
    }

    /* renamed from: a */
    private C0888a m11588a(String str, boolean z) {
        BillingClientImpl billingClientImpl = this;
        String str2 = str;
        boolean z2 = z;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Querying owned items, item type: ");
        stringBuilder.append(str2);
        stringBuilder.append("; history: ");
        stringBuilder.append(z2);
        C0865a.m2961a("BillingClient", stringBuilder.toString());
        List arrayList = new ArrayList();
        List list = null;
        String str3 = null;
        while (true) {
            if (z2) {
                try {
                    if (billingClientImpl.f9318i) {
                        Bundle purchaseHistory = billingClientImpl.f9314e.getPurchaseHistory(6, billingClientImpl.f9313d.getPackageName(), str2, str3, null);
                    } else {
                        C0865a.m2962b("BillingClient", "getPurchaseHistory is not supported on current device");
                        return new C0888a(-2, list);
                    }
                } catch (RemoteException e) {
                    RemoteException remoteException = e;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Got exception trying to get purchases: ");
                    stringBuilder2.append(remoteException);
                    stringBuilder2.append("; try to reconnect");
                    C0865a.m2962b("BillingClient", stringBuilder2.toString());
                    return new C0888a(-1, null);
                }
            }
            purchaseHistory = billingClientImpl.f9314e.getPurchases(3, billingClientImpl.f9313d.getPackageName(), str2, str3);
            if (purchaseHistory != null) {
                int a = C0865a.m2959a(purchaseHistory, "BillingClient");
                if (a == 0) {
                    if (!purchaseHistory.containsKey("INAPP_PURCHASE_ITEM_LIST") || !purchaseHistory.containsKey("INAPP_PURCHASE_DATA_LIST")) {
                        break;
                    } else if (!purchaseHistory.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        break;
                    } else {
                        ArrayList stringArrayList = purchaseHistory.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList stringArrayList2 = purchaseHistory.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList stringArrayList3 = purchaseHistory.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            C0865a.m2962b("BillingClient", "Bundle returned from getPurchases() contains null SKUs list.");
                            return new C0888a(6, list);
                        } else if (stringArrayList2 == null) {
                            C0865a.m2962b("BillingClient", "Bundle returned from getPurchases() contains null purchases list.");
                            return new C0888a(6, list);
                        } else if (stringArrayList3 == null) {
                            C0865a.m2962b("BillingClient", "Bundle returned from getPurchases() contains null signatures list.");
                            return new C0888a(6, list);
                        } else {
                            int i = 0;
                            while (i < stringArrayList2.size()) {
                                String str4 = (String) stringArrayList2.get(i);
                                String str5 = (String) stringArrayList3.get(i);
                                String str6 = (String) stringArrayList.get(i);
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Sku is owned: ");
                                stringBuilder.append(str6);
                                C0865a.m2961a("BillingClient", stringBuilder.toString());
                                try {
                                    C0889d c0889d = new C0889d(str4, str5);
                                    if (TextUtils.isEmpty(c0889d.m3005c())) {
                                        C0865a.m2962b("BillingClient", "BUG: empty/null token!");
                                    }
                                    arrayList.add(c0889d);
                                    i++;
                                } catch (JSONException e2) {
                                    JSONException jSONException = e2;
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("Got an exception trying to decode the purchase: ");
                                    stringBuilder2.append(jSONException);
                                    C0865a.m2962b("BillingClient", stringBuilder2.toString());
                                    return new C0888a(6, null);
                                }
                            }
                            str3 = purchaseHistory.getString("INAPP_CONTINUATION_TOKEN");
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Continuation token: ");
                            stringBuilder.append(str3);
                            C0865a.m2961a("BillingClient", stringBuilder.toString());
                            if (TextUtils.isEmpty(str3)) {
                                return new C0888a(0, arrayList);
                            }
                            list = null;
                        }
                    }
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("getPurchases() failed. Response code: ");
                    stringBuilder.append(a);
                    C0865a.m2962b("BillingClient", stringBuilder.toString());
                    return new C0888a(a, list);
                }
            }
            C0865a.m2962b("BillingClient", "queryPurchases got null owned items list");
            return new C0888a(6, list);
        }
        C0865a.m2962b("BillingClient", "Bundle returned from getPurchases() doesn't contain required fields.");
        return new C0888a(6, null);
    }

    /* renamed from: b */
    private void m11595b(Runnable runnable) {
        this.f9311b.post(runnable);
    }

    @WorkerThread
    /* renamed from: b */
    private void m11596b(final String str, final ConsumeResponseListener consumeResponseListener) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Consuming purchase with token: ");
            stringBuilder.append(str);
            C0865a.m2961a("BillingClient", stringBuilder.toString());
            final int consumePurchase = this.f9314e.consumePurchase(3, this.f9313d.getPackageName(), str);
            if (consumePurchase == 0) {
                C0865a.m2961a("BillingClient", "Successfully consumed purchase.");
                if (consumeResponseListener != null) {
                    m11595b(new Runnable(this) {
                        /* renamed from: d */
                        final /* synthetic */ BillingClientImpl f2277d;

                        public void run() {
                            consumeResponseListener.onConsumeResponse(consumePurchase, str);
                        }
                    });
                    return;
                }
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Error consuming purchase with token. Response code: ");
            stringBuilder2.append(consumePurchase);
            C0865a.m2962b("BillingClient", stringBuilder2.toString());
            m11595b(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ BillingClientImpl f2281d;

                public void run() {
                    C0865a.m2962b("BillingClient", "Error consuming purchase.");
                    consumeResponseListener.onConsumeResponse(consumePurchase, str);
                }
            });
        } catch (final RemoteException e) {
            m11595b(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ BillingClientImpl f2285d;

                public void run() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error consuming purchase; ex: ");
                    stringBuilder.append(e);
                    C0865a.m2962b("BillingClient", stringBuilder.toString());
                    consumeResponseListener.onConsumeResponse(-1, str);
                }
            });
        }
    }
}
