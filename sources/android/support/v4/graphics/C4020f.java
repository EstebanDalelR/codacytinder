package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.content.res.FontResourcesParserCompat.C0437b;
import android.support.v4.content.res.FontResourcesParserCompat.C2840a;
import android.support.v4.provider.FontsContractCompat.C0533b;
import android.support.v4.util.C0562m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(24)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.f */
class C4020f extends C2850h {
    /* renamed from: a */
    private static final Class f12772a;
    /* renamed from: b */
    private static final Constructor f12773b;
    /* renamed from: c */
    private static final Method f12774c;
    /* renamed from: d */
    private static final Method f12775d;

    C4020f() {
    }

    static {
        Class cls;
        Method method;
        Method method2;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (Throwable e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = cls;
            method = method2;
        }
        f12773b = constructor;
        f12772a = cls;
        f12774c = method;
        f12775d = method2;
    }

    /* renamed from: a */
    public static boolean m15754a() {
        if (f12774c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f12774c != null;
    }

    /* renamed from: b */
    private static Object m15756b() {
        try {
            return f12773b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m15755a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f12774c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), 0, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: a */
    private static Typeface m15753a(Object obj) {
        try {
            Array.set(Array.newInstance(f12772a, 1), 0, obj);
            return (Typeface) f12775d.invoke(null, new Object[]{r0});
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: a */
    public Typeface mo469a(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C0533b[] c0533bArr, int i) {
        Object b = C4020f.m15756b();
        C0562m c0562m = new C0562m();
        for (C0533b c0533b : c0533bArr) {
            Uri a = c0533b.m1958a();
            ByteBuffer byteBuffer = (ByteBuffer) c0562m.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0455i.m1746a(context, cancellationSignal, a);
                c0562m.put(a, byteBuffer);
            }
            if (!C4020f.m15755a(b, byteBuffer, c0533b.m1959b(), c0533b.m1960c(), c0533b.m1961d())) {
                return null;
            }
        }
        return Typeface.create(C4020f.m15753a(b), i);
    }

    /* renamed from: a */
    public Typeface mo470a(Context context, C2840a c2840a, Resources resources, int i) {
        i = C4020f.m15756b();
        for (C0437b c0437b : c2840a.m11242a()) {
            ByteBuffer a = C0455i.m1745a(context, resources, c0437b.m1657d());
            if (a == null || !C4020f.m15755a(i, a, 0, c0437b.m1655b(), c0437b.m1656c())) {
                return null;
            }
        }
        return C4020f.m15753a(i);
    }
}
