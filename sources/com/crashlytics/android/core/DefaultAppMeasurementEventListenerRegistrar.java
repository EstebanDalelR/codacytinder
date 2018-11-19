package com.crashlytics.android.core;

import android.os.Bundle;
import io.fabric.sdk.android.C15608c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

class DefaultAppMeasurementEventListenerRegistrar implements AppMeasurementEventListenerRegistrar {
    private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    private static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
    private static final String CRASH_ORIGIN = "crash";
    private static final String GET_INSTANCE_METHOD = "getInstance";
    private static final String NAME = "name";
    private static final String PARAMETERS = "parameters";
    private static final String REGISTER_METHOD = "registerOnMeasurementEventListener";
    private final CrashlyticsCore crashlyticsCore;

    /* renamed from: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar$1 */
    class C11111 implements InvocationHandler {
        C11111() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr.length != 4) {
                throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
            }
            String str = (String) objArr[null];
            String str2 = (String) objArr[1];
            Bundle bundle = (Bundle) objArr[2];
            if (str != null && str.equals(DefaultAppMeasurementEventListenerRegistrar.CRASH_ORIGIN) == null) {
                DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
            }
            return null;
        }
    }

    static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore crashlyticsCore) {
        return new DefaultAppMeasurementEventListenerRegistrar(crashlyticsCore);
    }

    private DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticsCore) {
        this.crashlyticsCore = crashlyticsCore;
    }

    public boolean register() {
        Class cls = getClass(ANALYTIC_CLASS);
        if (cls == null) {
            C15608c.h().w(CrashlyticsCore.TAG, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object instance = getInstance(cls);
        if (instance != null) {
            return invoke(cls, instance, REGISTER_METHOD);
        }
        C15608c.h().w(CrashlyticsCore.TAG, "Could not create an instance of Firebase Analytics.");
        return false;
    }

    private java.lang.Class<?> getClass(java.lang.String r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.crashlyticsCore;	 Catch:{ Exception -> 0x000f }
        r0 = r0.getContext();	 Catch:{ Exception -> 0x000f }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x000f }
        r2 = r0.loadClass(r2);	 Catch:{ Exception -> 0x000f }
        return r2;
    L_0x000f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.getClass(java.lang.String):java.lang.Class<?>");
    }

    private java.lang.Object getInstance(java.lang.Class<?> r6) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = "getInstance";	 Catch:{ Exception -> 0x001d }
        r1 = 1;	 Catch:{ Exception -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x001d }
        r3 = android.content.Context.class;	 Catch:{ Exception -> 0x001d }
        r4 = 0;	 Catch:{ Exception -> 0x001d }
        r2[r4] = r3;	 Catch:{ Exception -> 0x001d }
        r0 = r6.getDeclaredMethod(r0, r2);	 Catch:{ Exception -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x001d }
        r2 = r5.crashlyticsCore;	 Catch:{ Exception -> 0x001d }
        r2 = r2.getContext();	 Catch:{ Exception -> 0x001d }
        r1[r4] = r2;	 Catch:{ Exception -> 0x001d }
        r6 = r0.invoke(r6, r1);	 Catch:{ Exception -> 0x001d }
        return r6;
    L_0x001d:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.getInstance(java.lang.Class):java.lang.Object");
    }

    private boolean invoke(Class<?> cls, Object obj, String str) {
        String str2;
        StringBuilder stringBuilder;
        Class cls2 = getClass(ANALYTIC_CLASS_ON_EVENT_LISTENER);
        try {
            cls.getDeclaredMethod(str, new Class[]{cls2}).invoke(obj, new Object[]{onEventListenerProxy(cls2)});
            return true;
        } catch (Class<?> cls3) {
            obj = C15608c.h();
            str2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Expected method missing: ");
            stringBuilder.append(str);
            obj.w(str2, stringBuilder.toString(), cls3);
            return false;
        } catch (Class<?> cls32) {
            obj = C15608c.h();
            str2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke method: ");
            stringBuilder.append(str);
            obj.w(str2, stringBuilder.toString(), cls32);
            return false;
        } catch (Class<?> cls322) {
            obj = C15608c.h();
            str2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot access method: ");
            stringBuilder.append(str);
            obj.w(str2, stringBuilder.toString(), cls322);
            return false;
        }
    }

    private Object onEventListenerProxy(Class cls) {
        return Proxy.newProxyInstance(this.crashlyticsCore.getContext().getClassLoader(), new Class[]{cls}, new C11111());
    }

    private static void writeEventToUserLog(com.crashlytics.android.core.CrashlyticsCore r2, java.lang.String r3, android.os.Bundle r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0019 }
        r0.<init>();	 Catch:{ JSONException -> 0x0019 }
        r1 = "$A$:";	 Catch:{ JSONException -> 0x0019 }
        r0.append(r1);	 Catch:{ JSONException -> 0x0019 }
        r4 = serializeEvent(r3, r4);	 Catch:{ JSONException -> 0x0019 }
        r0.append(r4);	 Catch:{ JSONException -> 0x0019 }
        r4 = r0.toString();	 Catch:{ JSONException -> 0x0019 }
        r2.log(r4);	 Catch:{ JSONException -> 0x0019 }
        goto L_0x0033;
    L_0x0019:
        r2 = io.fabric.sdk.android.C15608c.h();
        r4 = "CrashlyticsCore";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unable to serialize Firebase Analytics event; ";
        r0.append(r1);
        r0.append(r3);
        r3 = r0.toString();
        r2.w(r4, r3);
    L_0x0033:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(com.crashlytics.android.core.CrashlyticsCore, java.lang.String, android.os.Bundle):void");
    }

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }
}
