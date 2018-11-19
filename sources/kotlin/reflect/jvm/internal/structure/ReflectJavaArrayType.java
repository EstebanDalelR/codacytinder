package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType.Factory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {
    @NotNull
    private final ReflectJavaType componentType;
    @NotNull
    private final Type reflectType;

    public ReflectJavaArrayType(@NotNull Type type) {
        C2668g.b(type, "reflectType");
        this.reflectType = type;
        type = getReflectType();
        Factory factory;
        if (type instanceof GenericArrayType) {
            factory = ReflectJavaType.Factory;
            type = ((GenericArrayType) type).getGenericComponentType();
            C2668g.a(type, "genericComponentType");
            type = factory.create(type);
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    factory = ReflectJavaType.Factory;
                    type = cls.getComponentType();
                    C2668g.a(type, "getComponentType()");
                    type = factory.create(type);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not an array type (");
            stringBuilder.append(getReflectType().getClass());
            stringBuilder.append("): ");
            stringBuilder.append(getReflectType());
            throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
        this.componentType = type;
    }

    @NotNull
    protected Type getReflectType() {
        return this.reflectType;
    }

    @NotNull
    public ReflectJavaType getComponentType() {
        return this.componentType;
    }
}
