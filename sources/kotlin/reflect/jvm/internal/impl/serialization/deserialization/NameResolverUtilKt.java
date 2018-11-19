package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i) {
        C2668g.b(nameResolver, "$receiver");
        nameResolver = ClassId.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
        C2668g.a(nameResolver, "ClassId.fromString(getQu… isLocalClassName(index))");
        return nameResolver;
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i) {
        C2668g.b(nameResolver, "$receiver");
        nameResolver = Name.guessByFirstCharacter(nameResolver.getString(i));
        C2668g.a(nameResolver, "Name.guessByFirstCharacter(getString(index))");
        return nameResolver;
    }
}
