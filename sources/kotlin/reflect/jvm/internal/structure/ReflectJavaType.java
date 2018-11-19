package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "()V", "reflectType", "Ljava/lang/reflect/Type;", "getReflectType", "()Ljava/lang/reflect/Type;", "equals", "", "other", "", "hashCode", "", "toString", "", "Factory", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public abstract class ReflectJavaType implements JavaType {
    public static final Factory Factory = new Factory();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "type", "Ljava/lang/reflect/Type;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
    public static final class Factory {
        private Factory() {
        }

        @NotNull
        public final ReflectJavaType create(@NotNull Type type) {
            C2668g.b(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return (ReflectJavaType) new ReflectJavaPrimitiveType(cls);
                }
            }
            if (!(type instanceof GenericArrayType)) {
                if (!z || !((Class) type).isArray()) {
                    if (type instanceof WildcardType) {
                        return new ReflectJavaWildcardType((WildcardType) type);
                    }
                    return new ReflectJavaClassifierType(type);
                }
            }
            return new ReflectJavaArrayType(type);
        }
    }

    @NotNull
    protected abstract Type getReflectType();

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof ReflectJavaType) || C2668g.a(getReflectType(), ((ReflectJavaType) obj).getReflectType()) == null) ? null : true;
    }

    public int hashCode() {
        return getReflectType().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(getReflectType());
        return stringBuilder.toString();
    }
}
