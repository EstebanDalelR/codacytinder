package io.branch.indexing;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.appindexing.Action.Builder;
import com.google.firebase.appindexing.Action.Metadata;
import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.builders.Indexables;
import io.branch.referral.util.LinkProperties;
import java.lang.reflect.Method;

/* renamed from: io.branch.indexing.a */
class C15555a {
    /* renamed from: a */
    private static FirebaseUserActions f48042a;
    /* renamed from: b */
    private static final LinkProperties f48043b = new LinkProperties().setChannel("google_search");

    /* renamed from: a */
    static void m58085a(final Context context, final BranchUniversalObject branchUniversalObject, final LinkProperties linkProperties) {
        new Thread(new Runnable() {
            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r4 = this;
                r0 = com.google.firebase.appindexing.FirebaseUserActions.getInstance();	 Catch:{ NoClassDefFoundError -> 0x0010, Throwable -> 0x0008 }
                io.branch.indexing.C15555a.f48042a = r0;	 Catch:{ NoClassDefFoundError -> 0x0010, Throwable -> 0x0008 }
                goto L_0x0017;
            L_0x0008:
                r0 = "BranchSDK";
                r1 = "Failed to index your contents using Firebase. Please make sure Firebase  is enabled and initialised in your app";
                io.branch.referral.C15593m.m58390b(r0, r1);
                goto L_0x0017;
            L_0x0010:
                r0 = "BranchSDK";
                r1 = "Firebase app indexing is not available. Please consider enabling Firebase app indexing for your app for better indexing experience with Google.";
                io.branch.referral.C15593m.m58390b(r0, r1);
            L_0x0017:
                r0 = r4;
                if (r0 != 0) goto L_0x0028;
            L_0x001b:
                r0 = r3;
                r1 = r2;
                r2 = io.branch.indexing.C15555a.f48043b;
                r0 = r0.getShortUrl(r1, r2);
                goto L_0x0032;
            L_0x0028:
                r0 = r3;
                r1 = r2;
                r2 = r4;
                r0 = r0.getShortUrl(r1, r2);
            L_0x0032:
                r1 = "BranchSDK";
                r2 = new java.lang.StringBuilder;
                r2.<init>();
                r3 = "Indexing BranchUniversalObject with Google using URL ";
                r2.append(r3);
                r2.append(r0);
                r2 = r2.toString();
                io.branch.referral.C15593m.m58390b(r1, r2);
                r1 = android.text.TextUtils.isEmpty(r0);
                if (r1 != 0) goto L_0x0069;
            L_0x004e:
                r1 = io.branch.indexing.C15555a.f48042a;	 Catch:{ Throwable -> 0x0062 }
                if (r1 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x0062 }
            L_0x0054:
                r1 = r3;	 Catch:{ Throwable -> 0x0062 }
                io.branch.indexing.C15555a.m58091b(r0, r1);	 Catch:{ Throwable -> 0x0062 }
                goto L_0x0069;	 Catch:{ Throwable -> 0x0062 }
            L_0x005a:
                r1 = r2;	 Catch:{ Throwable -> 0x0062 }
                r2 = r3;	 Catch:{ Throwable -> 0x0062 }
                io.branch.indexing.C15555a.m58090b(r0, r1, r2);	 Catch:{ Throwable -> 0x0062 }
                goto L_0x0069;
            L_0x0062:
                r0 = "BranchSDK";
                r1 = "Branch Warning: Unable to list your content in Google search. Please make sure you have added latest Firebase app indexing SDK to your project dependencies.";
                io.branch.referral.C15593m.m58390b(r0, r1);
            L_0x0069:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.1.run():void");
            }
        }).run();
    }

    /* renamed from: b */
    static void m58089b(final Context context, final BranchUniversalObject branchUniversalObject, final LinkProperties linkProperties) {
        new Thread(new Runnable() {
            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r4 = this;
                r0 = r4;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                if (r0 != 0) goto L_0x0011;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
            L_0x0004:
                r0 = r3;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r1 = r2;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2 = io.branch.indexing.C15555a.f48043b;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r0 = r0.getShortUrl(r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                goto L_0x001b;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
            L_0x0011:
                r0 = r3;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r1 = r2;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2 = r4;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r0 = r0.getShortUrl(r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
            L_0x001b:
                r1 = "BranchSDK";	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2 = new java.lang.StringBuilder;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2.<init>();	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r3 = "Removing indexed BranchUniversalObject with link ";	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2.append(r3);	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2.append(r0);	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2 = r2.toString();	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                io.branch.referral.C15593m.m58390b(r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r1 = com.google.firebase.appindexing.FirebaseAppIndex.getInstance();	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2 = 1;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2 = new java.lang.String[r2];	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r3 = 0;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r2[r3] = r0;	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                r1.remove(r2);	 Catch:{ NoClassDefFoundError -> 0x0047, Throwable -> 0x003f }
                goto L_0x004e;
            L_0x003f:
                r0 = "BranchSDK";
                r1 = "Failed to index your contents using Firebase. Please make sure Firebase is enabled and initialised in your app";
                io.branch.referral.C15593m.m58390b(r0, r1);
                goto L_0x004e;
            L_0x0047:
                r0 = "BranchSDK";
                r1 = "Failed to remove the BranchUniversalObject from Firebase local indexing. Please make sure Firebase is enabled and initialised in your app";
                io.branch.referral.C15593m.m58390b(r0, r1);
            L_0x004e:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.2.run():void");
            }
        }).run();
    }

    /* renamed from: b */
    private static void m58091b(String str, BranchUniversalObject branchUniversalObject) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(branchUniversalObject.getTitle());
        stringBuilder.append("\n");
        stringBuilder.append(branchUniversalObject.getDescription());
        String stringBuilder2 = stringBuilder.toString();
        if (branchUniversalObject.isLocallyIndexable()) {
            Indexable newSimple = Indexables.newSimple(stringBuilder2, str);
            FirebaseAppIndex.getInstance().update(new Indexable[]{newSimple});
        }
        f48042a.end(new Builder("ViewAction").setObject(stringBuilder2, str).setMetadata(new Metadata.Builder().setUpload(branchUniversalObject.isPublicallyIndexable())).build());
    }

    /* renamed from: b */
    private static void m58090b(String str, Context context, BranchUniversalObject branchUniversalObject) throws Exception {
        Class cls = Class.forName("com.google.android.gms.appindexing.Thing");
        Class cls2 = Class.forName("com.google.android.gms.appindexing.Thing$Builder");
        Object newInstance = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
        Method method = cls2.getMethod("setName", new Class[]{String.class});
        Method method2 = cls2.getMethod("setDescription", new Class[]{String.class});
        Method method3 = cls2.getMethod("setUrl", new Class[]{Uri.class});
        Method method4 = cls2.getMethod("build", new Class[0]);
        method.invoke(newInstance, new Object[]{branchUniversalObject.getTitle()});
        method2.invoke(newInstance, new Object[]{branchUniversalObject.getDescription()});
        method3.invoke(newInstance, new Object[]{Uri.parse(str)});
        str = method4.invoke(newInstance, new Object[0]);
        branchUniversalObject = Class.forName("com.google.android.gms.appindexing.Action");
        cls2 = Class.forName("com.google.android.gms.appindexing.Action$Builder");
        newInstance = cls2.getConstructor(new Class[]{String.class}).newInstance(new Object[]{(String) branchUniversalObject.getDeclaredField("TYPE_VIEW").get(null)});
        Method method5 = cls2.getMethod("setObject", new Class[]{cls});
        method = cls2.getMethod("setActionStatus", new Class[]{String.class});
        method4 = cls2.getMethod("build", new Class[0]);
        method5.invoke(newInstance, new Object[]{str});
        method.invoke(newInstance, new Object[]{(String) branchUniversalObject.getDeclaredField("STATUS_TYPE_COMPLETED").get(null)});
        str = method4.invoke(newInstance, new Object[0]);
        cls = Class.forName("com.google.android.gms.appindexing.AppIndex");
        cls2 = Class.forName("com.google.android.gms.common.api.Api");
        Class cls3 = Class.forName("com.google.android.gms.common.api.GoogleApiClient");
        Class cls4 = Class.forName("com.google.android.gms.common.api.GoogleApiClient$a");
        context = cls4.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        method2 = cls4.getMethod("addApi", new Class[]{cls2});
        method = cls4.getMethod("build", new Class[0]);
        Method method6 = cls3.getMethod("connect", new Class[0]);
        Method method7 = cls3.getMethod("disconnect", new Class[0]);
        method2.invoke(context, new Object[]{cls2.cast(cls.getDeclaredField("API").get(null))});
        context = method.invoke(context, new Object[0]);
        method6.invoke(context, new Object[0]);
        cls2 = Class.forName("com.google.android.gms.appindexing.AppIndexApi");
        Object obj = cls.getDeclaredField("AppIndexApi").get(null);
        cls2.getMethod("start", new Class[]{cls3, branchUniversalObject}).invoke(obj, new Object[]{context, str});
        method7.invoke(context, new Object[0]);
    }
}
