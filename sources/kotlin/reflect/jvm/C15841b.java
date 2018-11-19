package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
@JvmName(name = "KTypesJvm")
/* renamed from: kotlin.reflect.jvm.b */
public final class C15841b {
    @NotNull
    /* renamed from: a */
    public static final KClass<?> m59903a(@NotNull KType kType) {
        C2668g.b(kType, "$receiver");
        KClassifier classifier = kType.getClassifier();
        if (classifier != null) {
            KClass<?> a = C15841b.m59902a(classifier);
            if (a != null) {
                return a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot calculate JVM erasure for type: ");
        stringBuilder.append(kType);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }

    @NotNull
    /* renamed from: a */
    public static final KClass<?> m59902a(@NotNull KClassifier kClassifier) {
        C2668g.b(kClassifier, "$receiver");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (kClassifier instanceof KTypeParameter) {
            Object obj;
            kClassifier = ((KTypeParameter) kClassifier).getUpperBounds();
            Iterator it = ((Iterable) kClassifier).iterator();
            Object obj2;
            do {
                ClassifierDescriptor classifierDescriptor = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                KType kType = (KType) obj;
                if (kType == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
                ClassifierDescriptor declarationDescriptor = ((KTypeImpl) kType).getType().getConstructor().getDeclarationDescriptor();
                if (declarationDescriptor instanceof ClassDescriptor) {
                    classifierDescriptor = declarationDescriptor;
                }
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
                if (classDescriptor == null || classDescriptor.getKind() == ClassKind.INTERFACE || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) {
                    obj2 = null;
                    continue;
                } else {
                    obj2 = 1;
                    continue;
                }
            } while (obj2 == null);
            KType kType2 = (KType) obj;
            if (kType2 == null) {
                kType2 = (KType) C19299w.m68831g((List) kClassifier);
            }
            if (kType2 != null) {
                kClassifier = C15841b.m59903a(kType2);
                if (kClassifier != null) {
                    return kClassifier;
                }
            }
            return C15825i.m59860a(Object.class);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot calculate JVM erasure for type: ");
        stringBuilder.append(kClassifier);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }
}
