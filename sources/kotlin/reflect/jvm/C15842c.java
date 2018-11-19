package kotlin.reflect.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010%\u001a\u0004\u0018\u00010&*\u00020'H\u0002\"2\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038FX\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\b\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"-\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001e*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001b\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n*\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"javaConstructor", "Ljava/lang/reflect/Constructor;", "T", "Lkotlin/reflect/KFunction;", "javaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "javaField", "Ljava/lang/reflect/Field;", "Lkotlin/reflect/KProperty;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaGetter", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaMethod", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "kotlinFunction", "", "getKotlinFunction", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinProperty", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "getKPackage", "Lkotlin/reflect/KDeclarationContainer;", "Ljava/lang/reflect/Member;", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
@JvmName(name = "ReflectJvmMapping")
/* renamed from: kotlin.reflect.jvm.c */
public final class C15842c {
    @Nullable
    /* renamed from: a */
    public static final Field m59904a(@NotNull KProperty<?> kProperty) {
        C2668g.b(kProperty, "$receiver");
        kProperty = UtilKt.asKPropertyImpl(kProperty);
        return kProperty != null ? kProperty.getJavaField() : null;
    }

    @Nullable
    /* renamed from: b */
    public static final Method m59909b(@NotNull KProperty<?> kProperty) {
        C2668g.b(kProperty, "$receiver");
        return C15842c.m59905a((KFunction) kProperty.getGetter());
    }

    @Nullable
    /* renamed from: a */
    public static final Method m59906a(@NotNull KMutableProperty<?> kMutableProperty) {
        C2668g.b(kMutableProperty, "$receiver");
        return C15842c.m59905a((KFunction) kMutableProperty.getSetter());
    }

    @Nullable
    /* renamed from: a */
    public static final Method m59905a(@NotNull KFunction<?> kFunction) {
        C2668g.b(kFunction, "$receiver");
        kFunction = UtilKt.asKCallableImpl(kFunction);
        if (kFunction != null) {
            kFunction = kFunction.getCaller();
            if (kFunction != null) {
                kFunction = kFunction.getMember$kotlin_reflection();
                if (!(kFunction instanceof Method)) {
                    kFunction = null;
                }
                return (Method) kFunction;
            }
        }
        kFunction = null;
        if (kFunction instanceof Method) {
            kFunction = null;
        }
        return (Method) kFunction;
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Constructor<T> m59908b(@NotNull KFunction<? extends T> kFunction) {
        C2668g.b(kFunction, "$receiver");
        kFunction = UtilKt.asKCallableImpl(kFunction);
        if (kFunction != null) {
            kFunction = kFunction.getCaller();
            if (kFunction != null) {
                kFunction = kFunction.getMember$kotlin_reflection();
                if (!(kFunction instanceof Constructor)) {
                    kFunction = null;
                }
                return (Constructor) kFunction;
            }
        }
        kFunction = null;
        if (kFunction instanceof Constructor) {
            kFunction = null;
        }
        return (Constructor) kFunction;
    }

    @NotNull
    /* renamed from: a */
    public static final Type m59907a(@NotNull KType kType) {
        C2668g.b(kType, "$receiver");
        return ((KTypeImpl) kType).getJavaType$kotlin_reflection();
    }
}
