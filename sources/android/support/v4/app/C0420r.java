package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: android.support.v4.app.r */
public final class C0420r {
    /* renamed from: a */
    public static boolean m1568a(@NonNull Activity activity, @NonNull Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        activity = activity.getIntent().getAction();
        activity = (activity == null || activity.equals("android.intent.action.MAIN") != null) ? null : true;
        return activity;
    }

    /* renamed from: b */
    public static void m1571b(@NonNull Activity activity, @NonNull Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    public static android.content.Intent m1566a(@android.support.annotation.NonNull android.app.Activity r4) {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x000d;
    L_0x0006:
        r0 = r4.getParentActivityIntent();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = android.support.v4.app.C0420r.m1569b(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        return r1;
    L_0x0015:
        r2 = new android.content.ComponentName;
        r2.<init>(r4, r0);
        r4 = android.support.v4.app.C0420r.m1570b(r4, r2);	 Catch:{ NameNotFoundException -> 0x002f }
        if (r4 != 0) goto L_0x0025;	 Catch:{ NameNotFoundException -> 0x002f }
    L_0x0020:
        r4 = android.content.Intent.makeMainActivity(r2);	 Catch:{ NameNotFoundException -> 0x002f }
        goto L_0x002e;	 Catch:{ NameNotFoundException -> 0x002f }
    L_0x0025:
        r4 = new android.content.Intent;	 Catch:{ NameNotFoundException -> 0x002f }
        r4.<init>();	 Catch:{ NameNotFoundException -> 0x002f }
        r4 = r4.setComponent(r2);	 Catch:{ NameNotFoundException -> 0x002f }
    L_0x002e:
        return r4;
    L_0x002f:
        r4 = "NavUtils";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "getParentActivityIntent: bad parentActivityName '";
        r2.append(r3);
        r2.append(r0);
        r0 = "' in manifest";
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.e(r4, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.a(android.app.Activity):android.content.Intent");
    }

    @Nullable
    /* renamed from: a */
    public static Intent m1567a(@NonNull Context context, @NonNull ComponentName componentName) throws NameNotFoundException {
        String b = C0420r.m1570b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (C0420r.m1570b(context, componentName2) == null) {
            context = Intent.makeMainActivity(componentName2);
        } else {
            context = new Intent().setComponent(componentName2);
        }
        return context;
    }

    @Nullable
    /* renamed from: b */
    public static String m1569b(@NonNull Activity activity) {
        try {
            return C0420r.m1570b((Context) activity, activity.getComponentName());
        } catch (Activity activity2) {
            throw new IllegalArgumentException(activity2);
        }
    }

    @Nullable
    /* renamed from: b */
    public static String m1570b(@NonNull Context context, @NonNull ComponentName componentName) throws NameNotFoundException {
        componentName = context.getPackageManager().getActivityInfo(componentName, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        if (VERSION.SDK_INT >= 16) {
            String str = componentName.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        if (componentName.metaData == null) {
            return null;
        }
        componentName = componentName.metaData.getString("android.support.PARENT_ACTIVITY");
        if (componentName == null) {
            return null;
        }
        if (componentName.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(componentName);
            componentName = stringBuilder.toString();
        }
        return componentName;
    }
}
