package kotlin.reflect.jvm.internal.structure;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaEnumValueAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaEnumValueAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Enum;)V", "entryName", "getEntryName", "()Lorg/jetbrains/kotlin/name/Name;", "enumClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getEnumClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {
    private final Enum<?> value;

    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name, @NotNull Enum<?> enumR) {
        C2668g.b(enumR, "value");
        super(name);
        this.value = enumR;
    }

    @Nullable
    public ClassId getEnumClassId() {
        Class cls = this.value.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C2668g.a(cls, "enumClass");
        return ReflectClassUtilKt.getClassId(cls);
    }

    @Nullable
    public Name getEntryName() {
        return Name.identifier(this.value.name());
    }
}
