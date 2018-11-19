package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public final class AnnotationConstructorCaller extends FunctionCaller {
    private final CallMode callMode;
    private final List<Object> defaultValues;
    private final List<Class<?>> erasedParameterTypes;
    private final Class<?> jClass;
    private final List<Method> methods;
    private final List<String> parameterNames;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public enum CallMode {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public enum Origin {
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i, C15823e c15823e) {
        if ((i & 16) != 0) {
            Iterable<String> iterable = list;
            Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (String declaredMethod : iterable) {
                collection.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list2 = (List) collection;
        }
        this(cls, list, callMode, origin, list2);
    }

    public AnnotationConstructorCaller(@NotNull Class<?> cls, @NotNull List<String> list, @NotNull CallMode callMode, @NotNull Origin origin, @NotNull List<Method> list2) {
        C2668g.b(cls, "jClass");
        C2668g.b(list, "parameterNames");
        C2668g.b(callMode, "callMode");
        C2668g.b(origin, "origin");
        C2668g.b(list2, "methods");
        Type type = cls;
        Iterable<Method> iterable = list2;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Method genericReturnType : iterable) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        Object[] toArray = ((List) arrayList).toArray(new Type[0]);
        if (toArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super(null, type, null, (Type[]) toArray);
        this.jClass = cls;
        this.parameterNames = list;
        this.callMode = callMode;
        this.methods = list2;
        Iterable<Method> iterable2 = (Iterable) this.methods;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
        for (Method returnType : iterable2) {
            callMode = returnType.getReturnType();
            C2668g.a(callMode, "it");
            list2 = ReflectClassUtilKt.getWrapperByPrimitive(callMode);
            if (list2 != null) {
                callMode = list2;
            }
            arrayList2.add(callMode);
        }
        this.erasedParameterTypes = (List) arrayList2;
        iterable2 = (Iterable) this.methods;
        arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
        for (Method returnType2 : iterable2) {
            arrayList2.add(returnType2.getDefaultValue());
        }
        this.defaultValues = (List) arrayList2;
        if (this.callMode == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && (C19299w.m68816c((Iterable) this.parameterNames, (Object) "value").isEmpty() ^ 1) != null) {
            throw ((Throwable) new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."));
        }
    }

    @Nullable
    public Object call(@NotNull Object[] objArr) {
        C2668g.b(objArr, "args");
        checkArguments(objArr);
        Collection arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            if (obj == null && this.callMode == CallMode.CALL_BY_NAME) {
                obj = this.defaultValues.get(i2);
            } else {
                obj = AnnotationConstructorCallerKt.transformKotlinToJvm(obj, (Class) this.erasedParameterTypes.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                AnnotationConstructorCallerKt.throwIllegalArgumentType(i2, (String) this.parameterNames.get(i2), (Class) this.erasedParameterTypes.get(i2));
                throw null;
            }
        }
        return AnnotationConstructorCallerKt.createAnnotationInstance(this.jClass, this.methods, ah.m66885a((Iterable) C19299w.m68815c((Iterable) this.parameterNames, (Iterable) (List) arrayList)));
    }
}
