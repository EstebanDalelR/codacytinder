package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.C15820a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"equals", "", "other", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class AnnotationConstructorCallerKt$createAnnotationInstance$1 extends Lambda implements Function1<Object, Boolean> {
    final /* synthetic */ Class $annotationClass;
    final /* synthetic */ List $methods;
    final /* synthetic */ Map $values;

    AnnotationConstructorCallerKt$createAnnotationInstance$1(Class cls, List list, Map map) {
        this.$annotationClass = cls;
        this.$methods = list;
        this.$values = map;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke(obj));
    }

    /* renamed from: invoke */
    public final boolean m71762invoke(@Nullable Object obj) {
        Object obj2 = null;
        Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
        if (annotation != null) {
            KClass a = C15820a.m59851a(annotation);
            if (a != null) {
                obj2 = C15820a.m59849a(a);
            }
        }
        if (!C2668g.a(obj2, this.$annotationClass)) {
            return false;
        }
        Iterable<Method> iterable = this.$methods;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (Method method : iterable) {
                boolean equals;
                Object obj3 = this.$values.get(method.getName());
                Object invoke = method.invoke(obj, new Object[0]);
                if (obj3 instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.BooleanArray");
                    }
                    equals = Arrays.equals(zArr, (boolean[]) invoke);
                    continue;
                } else if (obj3 instanceof char[]) {
                    char[] cArr = (char[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharArray");
                    }
                    equals = Arrays.equals(cArr, (char[]) invoke);
                    continue;
                } else if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                    }
                    equals = Arrays.equals(bArr, (byte[]) invoke);
                    continue;
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.ShortArray");
                    }
                    equals = Arrays.equals(sArr, (short[]) invoke);
                    continue;
                } else if (obj3 instanceof int[]) {
                    int[] iArr = (int[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
                    }
                    equals = Arrays.equals(iArr, (int[]) invoke);
                    continue;
                } else if (obj3 instanceof float[]) {
                    float[] fArr = (float[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.FloatArray");
                    }
                    equals = Arrays.equals(fArr, (float[]) invoke);
                    continue;
                } else if (obj3 instanceof long[]) {
                    long[] jArr = (long[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.LongArray");
                    }
                    equals = Arrays.equals(jArr, (long[]) invoke);
                    continue;
                } else if (obj3 instanceof double[]) {
                    double[] dArr = (double[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.DoubleArray");
                    }
                    equals = Arrays.equals(dArr, (double[]) invoke);
                    continue;
                } else if (obj3 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj3;
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                    equals = Arrays.equals(objArr, (Object[]) invoke);
                    continue;
                } else {
                    equals = C2668g.a(obj3, invoke);
                    continue;
                }
                if (!equals) {
                    obj = null;
                    break;
                }
            }
        }
        obj = true;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
