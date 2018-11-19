package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19066k;
import kotlin.jvm.C15820a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.C17625i;
import kotlin.sequences.C19155k;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006&"}, d2 = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"}, k = 2, mv = {1, 1, 10})
public final class ReflectClassUtilKt {
    private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES;
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES;
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        cls = cls.getClassLoader();
        if (cls != null) {
            return cls;
        }
        cls = ClassLoader.getSystemClassLoader();
        C2668g.a(cls, "ClassLoader.getSystemClassLoader()");
        return cls;
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        return Enum.class.isAssignableFrom(cls);
    }

    static {
        r1 = new KClass[8];
        int i = 0;
        r1[0] = C15825i.m59860a(Boolean.TYPE);
        r1[1] = C15825i.m59860a(Byte.TYPE);
        r1[2] = C15825i.m59860a(Character.TYPE);
        r1[3] = C15825i.m59860a(Double.TYPE);
        r1[4] = C15825i.m59860a(Float.TYPE);
        r1[5] = C15825i.m59860a(Integer.TYPE);
        r1[6] = C15825i.m59860a(Long.TYPE);
        r1[7] = C15825i.m59860a(Short.TYPE);
        PRIMITIVE_CLASSES = C17554o.m64199b((Object[]) r1);
        Iterable<KClass> iterable = PRIMITIVE_CLASSES;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (KClass kClass : iterable) {
            arrayList.add(C15811g.m59834a(C15820a.m59853c(kClass), C15820a.m59852b(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = ah.m66885a((Iterable) (List) arrayList);
        iterable = PRIMITIVE_CLASSES;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (KClass kClass2 : iterable) {
            arrayList.add(C15811g.m59834a(C15820a.m59852b(kClass2), C15820a.m59853c(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = ah.m66885a((Iterable) (List) arrayList);
        Iterable<Class> b = C17554o.m64199b((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) b, 10));
        for (Class a : b) {
            int i2 = i + 1;
            arrayList2.add(C15811g.m59834a(a, Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = ah.m66885a((Iterable) (List) arrayList2);
    }

    @Nullable
    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        return (Class) WRAPPER_TO_PRIMITIVE.get(cls);
    }

    @Nullable
    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        return (Class) PRIMITIVE_TO_WRAPPER.get(cls);
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        return (Integer) FUNCTION_CLASSES.get(cls);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        StringBuilder stringBuilder;
        if (cls.isPrimitive()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't compute ClassId for primitive type: ");
            stringBuilder.append(cls);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (cls.isArray()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't compute ClassId for array type: ");
            stringBuilder.append(cls);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C2668g.a(simpleName, "simpleName");
                if ((((CharSequence) simpleName).length() == 0 ? 1 : null) == null) {
                    ClassId classId;
                    Class declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        classId = getClassId(declaringClass);
                        if (classId != null) {
                            classId = classId.createNestedClassId(Name.identifier(cls.getSimpleName()));
                            if (classId != null) {
                                return classId;
                            }
                        }
                    }
                    classId = ClassId.topLevel(new FqName(cls.getName()));
                    C2668g.a(classId, "ClassId.topLevel(FqName(name))");
                    return classId;
                }
            }
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), true);
        }
    }

    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        if (C2668g.a(cls, Void.TYPE)) {
            return "V";
        }
        cls = createArrayType(cls).getName();
        C2668g.a(cls, "createArrayType().name");
        if (cls == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = cls.substring(1);
        C2668g.a(substring, "(this as java.lang.String).substring(startIndex)");
        return C19296q.m68670a(substring, '.', '/', false, 4, null);
    }

    @NotNull
    public static final Class<?> createArrayType(@NotNull Class<?> cls) {
        C2668g.b(cls, "$receiver");
        return Array.newInstance(cls, 0).getClass();
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        C2668g.b(type, "$receiver");
        if (!(type instanceof ParameterizedType)) {
            return C17554o.m64195a();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C19155k.m68033f(C19155k.m68030d(C17625i.m64229a((Object) type, (Function1) ReflectClassUtilKt$parameterizedTypeArguments$1.INSTANCE), ReflectClassUtilKt$parameterizedTypeArguments$2.INSTANCE));
        }
        type = parameterizedType.getActualTypeArguments();
        C2668g.a(type, "actualTypeArguments");
        return C19066k.m68007i(type);
    }
}
