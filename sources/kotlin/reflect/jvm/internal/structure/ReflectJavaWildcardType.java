package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType.Factory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "reflectType", "Ljava/lang/reflect/WildcardType;", "(Ljava/lang/reflect/WildcardType;)V", "bound", "getBound", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "isExtends", "", "()Z", "getReflectType", "()Ljava/lang/reflect/WildcardType;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {
    @NotNull
    private final WildcardType reflectType;

    public ReflectJavaWildcardType(@NotNull WildcardType wildcardType) {
        C2668g.b(wildcardType, "reflectType");
        this.reflectType = wildcardType;
    }

    @NotNull
    protected WildcardType getReflectType() {
        return this.reflectType;
    }

    @Nullable
    public ReflectJavaType getBound() {
        Object upperBounds = getReflectType().getUpperBounds();
        Object lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length <= 1) {
            if (lowerBounds.length <= 1) {
                if (lowerBounds.length == 1) {
                    Factory factory = ReflectJavaType.Factory;
                    C2668g.a(lowerBounds, "lowerBounds");
                    lowerBounds = C19066k.m68003f((Object[]) lowerBounds);
                    C2668g.a(lowerBounds, "lowerBounds.single()");
                    return factory.create((Type) lowerBounds);
                } else if (upperBounds.length != 1) {
                    return null;
                } else {
                    C2668g.a(upperBounds, "upperBounds");
                    Type type = (Type) C19066k.m68003f((Object[]) upperBounds);
                    if ((C2668g.a(type, Object.class) ^ 1) == 0) {
                        return null;
                    }
                    Factory factory2 = ReflectJavaType.Factory;
                    C2668g.a(type, "ub");
                    return factory2.create(type);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Wildcard types with many bounds are not yet supported: ");
        stringBuilder.append(getReflectType());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public boolean isExtends() {
        Object upperBounds = getReflectType().getUpperBounds();
        C2668g.a(upperBounds, "reflectType.upperBounds");
        return C2668g.a((Type) C19066k.m68000d((Object[]) upperBounds), Object.class) ^ 1;
    }
}
