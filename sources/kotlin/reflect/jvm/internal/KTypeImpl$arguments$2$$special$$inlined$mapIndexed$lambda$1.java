package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke", "kotlin/reflect/jvm/internal/KTypeImpl$arguments$2$1$type$1"}, k = 3, mv = {1, 1, 10})
final class KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 extends Lambda implements Function0<Type> {
    final /* synthetic */ int $i;
    final /* synthetic */ Lazy $parameterizedTypeArguments$inlined;
    final /* synthetic */ KProperty $parameterizedTypeArguments$metadata$inlined;
    final /* synthetic */ KTypeImpl$arguments$2 this$0;

    KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(int i, KTypeImpl$arguments$2 kTypeImpl$arguments$2, Lazy lazy, KProperty kProperty) {
        this.$i = i;
        this.this$0 = kTypeImpl$arguments$2;
        this.$parameterizedTypeArguments$inlined = lazy;
        this.$parameterizedTypeArguments$metadata$inlined = kProperty;
        super(0);
    }

    @NotNull
    public final Type invoke() {
        Type javaType$kotlin_reflection = this.this$0.this$0.getJavaType$kotlin_reflection();
        Object componentType;
        if (javaType$kotlin_reflection instanceof Class) {
            Class cls = (Class) javaType$kotlin_reflection;
            componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            C2668g.a(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
            return (Type) componentType;
        } else if (javaType$kotlin_reflection instanceof GenericArrayType) {
            if (this.$i != 0) {
                r1 = new StringBuilder();
                r1.append("Array type has been queried for a non-0th argument: ");
                r1.append(this.this$0.this$0);
                throw new KotlinReflectionInternalError(r1.toString());
            }
            javaType$kotlin_reflection = ((GenericArrayType) javaType$kotlin_reflection).getGenericComponentType();
            C2668g.a(javaType$kotlin_reflection, "javaType.genericComponentType");
            return javaType$kotlin_reflection;
        } else if (javaType$kotlin_reflection instanceof ParameterizedType) {
            Lazy lazy = this.$parameterizedTypeArguments$inlined;
            KProperty kProperty = this.$parameterizedTypeArguments$metadata$inlined;
            javaType$kotlin_reflection = (Type) ((List) lazy.getValue()).get(this.$i);
            if (javaType$kotlin_reflection instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) javaType$kotlin_reflection;
                Object lowerBounds = wildcardType.getLowerBounds();
                C2668g.a(lowerBounds, "argument.lowerBounds");
                Type type = (Type) C19066k.m68000d((Object[]) lowerBounds);
                if (type != null) {
                    javaType$kotlin_reflection = type;
                } else {
                    componentType = wildcardType.getUpperBounds();
                    C2668g.a(componentType, "argument.upperBounds");
                    javaType$kotlin_reflection = (Type) C19066k.m67994c((Object[]) componentType);
                }
            }
            C2668g.a(javaType$kotlin_reflection, "if (argument !is Wildcar…ument.upperBounds.first()");
            return javaType$kotlin_reflection;
        } else {
            r1 = new StringBuilder();
            r1.append("Non-generic type has been queried for arguments: ");
            r1.append(this.this$0.this$0);
            throw new KotlinReflectionInternalError(r1.toString());
        }
    }
}
