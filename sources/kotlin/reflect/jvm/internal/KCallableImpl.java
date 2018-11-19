package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.C15842c;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J%\u00105\u001a\u00028\u00002\u0016\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010807\"\u0004\u0018\u000108H\u0017¢\u0006\u0002\u00109J#\u0010:\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0002¢\u0006\u0002\u0010<J#\u0010=\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0016¢\u0006\u0002\u0010<J#\u0010>\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0002¢\u0006\u0002\u0010<J\u0012\u0010?\u001a\u0004\u0018\u0001082\u0006\u0010@\u001a\u00020AH\u0002R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u000b*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0012\u0010\u001e\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR(\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" \u000b*\n\u0012\u0004\u0012\u00020\"\u0018\u00010%0%0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010+0+0\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\bR(\u0010/\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000200 \u000b*\n\u0012\u0004\u0012\u000200\u0018\u00010\u00050\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\u0004\u0018\u0001028VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006B"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "()V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations_", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", "", "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "Lkotlin/reflect/KParameter;", "getParameters", "parameters_", "Ljava/util/ArrayList;", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "returnType_", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters_", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "call", "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", "", "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public abstract class KCallableImpl<R> implements KCallable<R> {
    private final LazySoftVal<List<Annotation>> annotations_ = ReflectProperties.lazySoft(new KCallableImpl$annotations_$1(this));
    private final LazySoftVal<ArrayList<KParameter>> parameters_ = ReflectProperties.lazySoft(new KCallableImpl$parameters_$1(this));
    private final LazySoftVal<KTypeImpl> returnType_ = ReflectProperties.lazySoft(new KCallableImpl$returnType_$1(this));
    private final LazySoftVal<List<KTypeParameterImpl>> typeParameters_ = ReflectProperties.lazySoft(new KCallableImpl$typeParameters_$1(this));

    @NotNull
    public abstract FunctionCaller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract FunctionCaller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    public abstract boolean isBound();

    @NotNull
    public List<Annotation> getAnnotations() {
        Object invoke = this.annotations_.invoke();
        C2668g.a(invoke, "annotations_()");
        return (List) invoke;
    }

    @NotNull
    public List<KParameter> getParameters() {
        Object invoke = this.parameters_.invoke();
        C2668g.a(invoke, "parameters_()");
        return (List) invoke;
    }

    @NotNull
    public KType getReturnType() {
        Object invoke = this.returnType_.invoke();
        C2668g.a(invoke, "returnType_()");
        return (KType) invoke;
    }

    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        Object invoke = this.typeParameters_.invoke();
        C2668g.a(invoke, "typeParameters_()");
        return (List) invoke;
    }

    @Nullable
    public KVisibility getVisibility() {
        Visibility visibility = getDescriptor().getVisibility();
        C2668g.a(visibility, "descriptor.visibility");
        return UtilKt.toKVisibility(visibility);
    }

    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }

    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    protected final boolean isAnnotationConstructor() {
        return C2668g.a(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    public R call(@NotNull Object... objArr) {
        C2668g.b(objArr, "args");
        try {
            return getCaller().call(objArr);
        } catch (Object[] objArr2) {
            throw new IllegalCallableAccessException(objArr2);
        }
    }

    public R callBy(@NotNull Map<KParameter, ? extends Object> map) {
        C2668g.b(map, "args");
        return isAnnotationConstructor() ? callAnnotationConstructor(map) : callDefaultMethod(map);
    }

    private final R callDefaultMethod(Map<KParameter, ? extends Object> map) {
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        int i = 0;
        Object obj = null;
        int i2 = 0;
        for (KParameter kParameter : parameters) {
            if (i != 0 && i % 32 == 0) {
                arrayList2.add(Integer.valueOf(i2));
                i2 = 0;
            }
            if (map.containsKey(kParameter)) {
                arrayList.add(map.get(kParameter));
            } else if (kParameter.isOptional()) {
                arrayList.add(defaultPrimitiveValue(C15842c.m59907a(kParameter.getType())));
                i2 = (1 << (i % 32)) | i2;
                obj = 1;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No argument provided for a required parameter: ");
                stringBuilder.append(kParameter);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
            if (kParameter.getKind() == Kind.VALUE) {
                i++;
            }
        }
        if (obj == null) {
            map = arrayList.toArray(new Object[0]);
            if (map != null) {
                return call(Arrays.copyOf(map, map.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        arrayList2.add(Integer.valueOf(i2));
        map = getDefaultCaller();
        if (map != null) {
            arrayList.addAll(arrayList2);
            arrayList.add(null);
            try {
                Object[] toArray = arrayList.toArray(new Object[0]);
                if (toArray != null) {
                    return map.call(toArray);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (Map<KParameter, ? extends Object> map2) {
                throw new IllegalCallableAccessException(map2);
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("This callable does not support a default call: ");
        stringBuilder.append(getDescriptor());
        throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
    }

    private final R callAnnotationConstructor(Map<KParameter, ? extends Object> map) {
        Iterable<KParameter> parameters = getParameters();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) parameters, 10));
        for (KParameter kParameter : parameters) {
            Object obj;
            StringBuilder stringBuilder;
            if (map.containsKey(kParameter)) {
                obj = map.get(kParameter);
                if (obj == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Annotation argument value cannot be null (");
                    stringBuilder.append(kParameter);
                    stringBuilder.append(')');
                    throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
                }
            } else if (kParameter.isOptional()) {
                obj = null;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("No argument provided for a required parameter: ");
                stringBuilder.append(kParameter);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
            arrayList.add(obj);
        }
        List list = (List) arrayList;
        map = getDefaultCaller();
        if (map != null) {
            try {
                Object[] toArray = list.toArray(new Object[0]);
                if (toArray != null) {
                    return map.call(toArray);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (Map<KParameter, ? extends Object> map2) {
                throw new IllegalCallableAccessException(map2);
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("This callable does not support a default call: ");
        stringBuilder.append(getDescriptor());
        throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
    }

    private final Object defaultPrimitiveValue(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C2668g.a(type, Boolean.TYPE)) {
            return Boolean.valueOf(false);
        }
        if (C2668g.a(type, Character.TYPE)) {
            return Character.valueOf((char) null);
        }
        if (C2668g.a(type, Byte.TYPE)) {
            return Byte.valueOf((byte) null);
        }
        if (C2668g.a(type, Short.TYPE)) {
            return Short.valueOf((short) null);
        }
        if (C2668g.a(type, Integer.TYPE)) {
            return Integer.valueOf(0);
        }
        if (C2668g.a(type, Float.TYPE)) {
            return Float.valueOf(null);
        }
        if (C2668g.a(type, Long.TYPE)) {
            return Long.valueOf(0);
        }
        if (C2668g.a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C2668g.a(type, Void.TYPE)) {
            throw ((Throwable) new IllegalStateException("Parameter with void type is illegal"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown primitive: ");
        stringBuilder.append(type);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
