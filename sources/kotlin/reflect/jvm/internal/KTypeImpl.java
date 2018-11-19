package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.C19299w;
import kotlin.jvm.C15820a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C15838a;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.C15841b;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00068@X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006%²\u0006\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0002¢\u0006\u0000"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "getArguments", "()Ljava/util/List;", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflection", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-reflection", "parameterizedTypeArguments"}, k = 1, mv = {1, 1, 10})
public final class KTypeImpl implements KType {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(KTypeImpl.class), "javaType", "getJavaType$kotlin_reflection()Ljava/lang/reflect/Type;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;")), C15825i.m59866a(new PropertyReference0Impl(C15825i.m59860a(KTypeImpl.class), "parameterizedTypeArguments", "<v#3>"))};
    @NotNull
    private final LazySoftVal arguments$delegate = ReflectProperties.lazySoft((Function0) new KTypeImpl$arguments$2(this));
    @Nullable
    private final LazySoftVal classifier$delegate = ReflectProperties.lazySoft((Function0) new KTypeImpl$classifier$2(this));
    @NotNull
    private final LazySoftVal javaType$delegate;
    @NotNull
    private final KotlinType type;

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Variance.values().length];

        static {
            $EnumSwitchMapping$0[Variance.INVARIANT.ordinal()] = 1;
            $EnumSwitchMapping$0[Variance.IN_VARIANCE.ordinal()] = 2;
            $EnumSwitchMapping$0[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    @NotNull
    public List<C15838a> getArguments() {
        return (List) this.arguments$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Nullable
    public KClassifier getClassifier() {
        return (KClassifier) this.classifier$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final Type getJavaType$kotlin_reflection() {
        return (Type) this.javaType$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public KTypeImpl(@NotNull KotlinType kotlinType, @NotNull Function0<? extends Type> function0) {
        C2668g.b(kotlinType, "type");
        C2668g.b(function0, "computeJavaType");
        this.type = kotlinType;
        this.javaType$delegate = ReflectProperties.lazySoft(function0);
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }

    private final KClassifier convert(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            Class toJavaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            if (toJavaClass == null) {
                return null;
            }
            if (toJavaClass.isArray()) {
                TypeProjection typeProjection = (TypeProjection) C19299w.m68838k((List) kotlinType.getArguments());
                if (typeProjection != null) {
                    kotlinType = typeProjection.getType();
                    if (kotlinType != null) {
                        C2668g.a(kotlinType, "argument");
                        KClassifier convert = convert(kotlinType);
                        if (convert != null) {
                            return new KClassImpl(ReflectClassUtilKt.createArrayType(C15820a.m59849a(C15841b.m59902a(convert))));
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot determine classifier for array element type: ");
                        stringBuilder.append(this);
                        throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
                    }
                }
                return (KClassifier) new KClassImpl(toJavaClass);
            } else if (TypeUtils.isNullableType(kotlinType) != null) {
                return (KClassifier) new KClassImpl(toJavaClass);
            } else {
                Class primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(toJavaClass);
                if (primitiveByWrapper != null) {
                    toJavaClass = primitiveByWrapper;
                }
                return (KClassifier) new KClassImpl(toJavaClass);
            }
        } else if ((declarationDescriptor instanceof TypeParameterDescriptor) != null) {
            return (KClassifier) new KTypeParameterImpl((TypeParameterDescriptor) declarationDescriptor);
        } else {
            if ((declarationDescriptor instanceof TypeAliasDescriptor) == null) {
                return null;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("An operation is not implemented: ");
            stringBuilder2.append("Type alias classifiers are not yet supported");
            throw new NotImplementedError(stringBuilder2.toString());
        }
    }

    public boolean isMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof KTypeImpl) || C2668g.a(this.type, ((KTypeImpl) obj).type) == null) ? null : true;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderType(this.type);
    }
}
