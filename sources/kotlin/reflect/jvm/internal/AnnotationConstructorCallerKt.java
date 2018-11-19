package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.C15820a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a6\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0002\u001a$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¨\u0006\u0012²\u0006\r\u0010\u0013\u001a\u00020\rX\u0002¢\u0006\u0000²\u0006\r\u0010\u0014\u001a\u00020\tX\u0002¢\u0006\u0000"}, d2 = {"createAnnotationInstance", "", "annotationClass", "Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "values", "", "", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, k = 2, mv = {1, 1, 10})
public final class AnnotationConstructorCallerKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59866a(new PropertyReference0Impl(C15825i.m59861a(AnnotationConstructorCallerKt.class, "kotlin-reflection"), "hashCode", "<v#0>")), C15825i.m59866a(new PropertyReference0Impl(C15825i.m59861a(AnnotationConstructorCallerKt.class, "kotlin-reflection"), "toString", "<v#1>"))};

    private static final Object transformKotlinToJvm(@Nullable Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = C15820a.m59849a((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object obj2 = (Object[]) obj;
            if (obj2 instanceof Class[]) {
                return null;
            }
            if (!(obj2 instanceof KClass[])) {
                obj = obj2;
            } else if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            } else {
                KClass[] kClassArr = (KClass[]) obj;
                Collection arrayList = new ArrayList(kClassArr.length);
                for (KClass a : kClassArr) {
                    arrayList.add(C15820a.m59849a(a));
                }
                obj = ((List) arrayList).toArray(new Class[0]);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        if (cls.isInstance(obj) == null) {
            obj = null;
        }
        return obj;
    }

    private static final Void throwIllegalArgumentType(int i, String str, Class<?> cls) {
        KClass a;
        if (C2668g.a(cls, Class.class)) {
            a = C15825i.m59860a(KClass.class);
        } else if (cls.isArray() && C2668g.a(cls.getComponentType(), Class.class)) {
            a = C15825i.m59860a(KClass[].class);
        } else {
            a = C15820a.m59850a((Class) cls);
        }
        if (C2668g.a(a.getQualifiedName(), C15825i.m59860a(Object[].class).getQualifiedName())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(a.getQualifiedName());
            stringBuilder.append('<');
            Class componentType = C15820a.m59849a(a).getComponentType();
            C2668g.a(componentType, "kotlinClass.java.componentType");
            stringBuilder.append(C15820a.m59850a(componentType).getQualifiedName());
            stringBuilder.append('>');
            cls = stringBuilder.toString();
        } else {
            cls = a.getQualifiedName();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Argument #");
        stringBuilder2.append(i);
        stringBuilder2.append(32);
        stringBuilder2.append(str);
        stringBuilder2.append(" is not of the required type ");
        stringBuilder2.append(cls);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    private static final Object createAnnotationInstance(Class<?> cls, List<Method> list, Map<String, ? extends Object> map) {
        AnnotationConstructorCallerKt$createAnnotationInstance$1 annotationConstructorCallerKt$createAnnotationInstance$1 = new AnnotationConstructorCallerKt$createAnnotationInstance$1(cls, list, map);
        Lazy a = C15810e.m59833a((Function0) new C19069xa743ec88(map));
        KProperty kProperty = $$delegatedProperties[0];
        Lazy a2 = C15810e.m59833a((Function0) new C19071x4fc4299(cls, map));
        KProperty kProperty2 = $$delegatedProperties[1];
        cls = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new AnnotationConstructorCallerKt$createAnnotationInstance$2(cls, a2, kProperty2, a, kProperty, annotationConstructorCallerKt$createAnnotationInstance$1, map));
        C2668g.a(cls, "Proxy.newProxyInstance(a…        }\n        }\n    }");
        return cls;
    }
}
