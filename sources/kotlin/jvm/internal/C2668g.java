package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.g */
public class C2668g {
    /* renamed from: a */
    public static int m10301a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    private C2668g() {
    }

    /* renamed from: a */
    public static void m10304a() {
        throw ((KotlinNullPointerException) C2668g.m10302a(new KotlinNullPointerException()));
    }

    /* renamed from: a */
    public static void m10306a(String str) {
        throw ((UninitializedPropertyAccessException) C2668g.m10302a(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: b */
    public static void m10310b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lateinit property ");
        stringBuilder.append(str);
        stringBuilder.append(" has not been initialized");
        C2668g.m10306a(stringBuilder.toString());
    }

    /* renamed from: a */
    public static void m10305a(Object obj, String str) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be null");
            throw ((IllegalStateException) C2668g.m10302a(new IllegalStateException(stringBuilder.toString())));
        }
    }

    /* renamed from: b */
    public static void m10309b(Object obj, String str) {
        if (obj == null) {
            C2668g.m10311c(str);
        }
    }

    /* renamed from: c */
    private static void m10311c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append(className);
        stringBuilder.append(".");
        stringBuilder.append(methodName);
        stringBuilder.append(", parameter ");
        stringBuilder.append(str);
        throw ((IllegalArgumentException) C2668g.m10302a(new IllegalArgumentException(stringBuilder.toString())));
    }

    /* renamed from: a */
    public static boolean m10308a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else {
            return obj.equals(obj2);
        }
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: a */
    public static boolean m10307a(Float f, float f2) {
        return (f == null || f.floatValue() != f2) ? null : true;
    }

    /* renamed from: a */
    private static <T extends Throwable> T m10302a(T t) {
        return C2668g.m10303a((Throwable) t, C2668g.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m10303a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        str = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) str.toArray(new StackTraceElement[str.size()]));
        return t;
    }
}
