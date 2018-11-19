package kotlin.reflect.jvm.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052,\u0010\u0006\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "proxy", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
final class AnnotationConstructorCallerKt$createAnnotationInstance$2 implements InvocationHandler {
    final /* synthetic */ Class $annotationClass;
    final /* synthetic */ AnnotationConstructorCallerKt$createAnnotationInstance$1 $equals$1;
    final /* synthetic */ Lazy $hashCode;
    final /* synthetic */ KProperty $hashCode$metadata;
    final /* synthetic */ Lazy $toString;
    final /* synthetic */ KProperty $toString$metadata;
    final /* synthetic */ Map $values;

    AnnotationConstructorCallerKt$createAnnotationInstance$2(Class cls, Lazy lazy, KProperty kProperty, Lazy lazy2, KProperty kProperty2, AnnotationConstructorCallerKt$createAnnotationInstance$1 annotationConstructorCallerKt$createAnnotationInstance$1, Map map) {
        this.$annotationClass = cls;
        this.$toString = lazy;
        this.$toString$metadata = kProperty;
        this.$hashCode = lazy2;
        this.$hashCode$metadata = kProperty2;
        this.$equals$1 = annotationConstructorCallerKt$createAnnotationInstance$1;
        this.$values = map;
    }

    @Nullable
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C2668g.a(method, "method");
        obj = method.getName();
        if (obj != null) {
            int hashCode = obj.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633) {
                        if (obj.equals("annotationType")) {
                            return this.$annotationClass;
                        }
                    }
                } else if (obj.equals("hashCode")) {
                    obj = this.$hashCode;
                    method = this.$hashCode$metadata;
                    return obj.getValue();
                }
            } else if (obj.equals("toString")) {
                obj = this.$toString;
                method = this.$toString$metadata;
                return obj.getValue();
            }
        }
        if (C2668g.a(obj, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(this.$equals$1.invoke(C19066k.m68003f(objArr)));
        }
        if (this.$values.containsKey(obj)) {
            return this.$values.get(obj);
        }
        obj = new StringBuilder();
        obj.append("Method is not supported: ");
        obj.append(method);
        obj.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[null];
        }
        obj.append(C19066k.m68007i(objArr));
        obj.append(')');
        throw ((Throwable) new KotlinReflectionInternalError(obj.toString()));
    }
}
