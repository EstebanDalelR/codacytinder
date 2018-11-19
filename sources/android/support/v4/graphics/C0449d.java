package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.content.res.FontResourcesParserCompat.C2840a;
import android.support.v4.provider.FontsContractCompat.C0533b;
import android.support.v4.util.C0551g;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.d */
public class C0449d {
    /* renamed from: a */
    private static final C0448a f1490a;
    /* renamed from: b */
    private static final C0551g<String, Typeface> f1491b = new C0551g(16);

    /* renamed from: android.support.v4.graphics.d$a */
    interface C0448a {
        /* renamed from: a */
        Typeface mo468a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: a */
        Typeface mo469a(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C0533b[] c0533bArr, int i);

        /* renamed from: a */
        Typeface mo470a(Context context, C2840a c2840a, Resources resources, int i);
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1490a = new C4313g();
        } else if (VERSION.SDK_INT >= 24 && C4020f.m15754a()) {
            f1490a = new C4020f();
        } else if (VERSION.SDK_INT >= 21) {
            f1490a = new C4019e();
        } else {
            f1490a = new C2850h();
        }
    }

    @Nullable
    /* renamed from: a */
    public static Typeface m1713a(@NonNull Resources resources, int i, int i2) {
        return (Typeface) f1491b.get(C0449d.m1714b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1714b(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        stringBuilder.append("-");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    /* renamed from: a */
    public static android.graphics.Typeface m1712a(@android.support.annotation.NonNull android.content.Context r7, @android.support.annotation.NonNull android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry r8, @android.support.annotation.NonNull android.content.res.Resources r9, int r10, int r11, @android.support.annotation.Nullable android.support.v4.content.res.C0441a.C0440a r12, @android.support.annotation.Nullable android.os.Handler r13, boolean r14) {
        /*
        r4 = r8 instanceof android.support.v4.content.res.FontResourcesParserCompat.C2841c;
        if (r4 == 0) goto L_0x002d;
    L_0x0004:
        r0 = r8;
        r0 = (android.support.v4.content.res.FontResourcesParserCompat.C2841c) r0;
        r4 = 0;
        r5 = 1;
        if (r14 == 0) goto L_0x0013;
    L_0x000b:
        r6 = r0.m11244b();
        if (r6 != 0) goto L_0x0016;
    L_0x0011:
        r4 = 1;
        goto L_0x0016;
    L_0x0013:
        if (r12 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0011;
    L_0x0016:
        if (r14 == 0) goto L_0x001e;
    L_0x0018:
        r1 = r0.m11245c();
        r5 = r1;
        goto L_0x0020;
    L_0x001e:
        r1 = -1;
        r5 = -1;
    L_0x0020:
        r1 = r0.m11243a();
        r0 = r7;
        r2 = r12;
        r3 = r13;
        r6 = r11;
        r0 = android.support.v4.provider.FontsContractCompat.m1964a(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x0042;
    L_0x002d:
        r1 = f1490a;
        r0 = r8;
        r0 = (android.support.v4.content.res.FontResourcesParserCompat.C2840a) r0;
        r0 = r1.mo470a(r7, r0, r9, r11);
        if (r12 == 0) goto L_0x0042;
    L_0x0038:
        if (r0 == 0) goto L_0x003e;
    L_0x003a:
        r12.callbackSuccessAsync(r0, r13);
        goto L_0x0042;
    L_0x003e:
        r1 = -3;
        r12.callbackFailAsync(r1, r13);
    L_0x0042:
        if (r0 == 0) goto L_0x004d;
    L_0x0044:
        r1 = f1491b;
        r2 = android.support.v4.graphics.C0449d.m1714b(r9, r10, r11);
        r1.put(r2, r0);
    L_0x004d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.d.a(android.content.Context, android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry, android.content.res.Resources, int, int, android.support.v4.content.res.a$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    @Nullable
    /* renamed from: a */
    public static Typeface m1710a(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2) {
        context = f1490a.mo468a(context, resources, i, str, i2);
        if (context != null) {
            f1491b.put(C0449d.m1714b(resources, i, i2), context);
        }
        return context;
    }

    @Nullable
    /* renamed from: a */
    public static Typeface m1711a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C0533b[] c0533bArr, int i) {
        return f1490a.mo469a(context, cancellationSignal, c0533bArr, i);
    }
}
