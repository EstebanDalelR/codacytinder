package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.p458a.C15798b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 10})
/* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$$special$$inlined$sortedBy$1 */
public final class C15844x577aa3c4<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Method method = (Method) t;
        C2668g.a(method, "it");
        Comparable name = method.getName();
        Method method2 = (Method) t2;
        C2668g.a(method2, "it");
        return C15798b.m59813a(name, method2.getName());
    }
}
