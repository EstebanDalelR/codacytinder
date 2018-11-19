package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.C15819j;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaClassDataFinder implements ClassDataFinder {
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    @NotNull
    private final KotlinClassFinder kotlinClassFinder;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
        C2668g.b(kotlinClassFinder, "kotlinClassFinder");
        C2668g.b(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.kotlinClassFinder = kotlinClassFinder;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver;
    }

    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        C2668g.b(classId, "classId");
        KotlinJvmBinaryClass findKotlinClass = this.kotlinClassFinder.findKotlinClass(classId);
        if (findKotlinClass == null) {
            return null;
        }
        boolean a = C2668g.a(findKotlinClass.getClassId(), classId);
        if (!C15819j.f49018a || a) {
            return this.deserializedDescriptorResolver.readClassData$descriptors_jvm(findKotlinClass);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class with incorrect id found: expected ");
        stringBuilder.append(classId);
        stringBuilder.append(", actual ");
        stringBuilder.append(findKotlinClass.getClassId());
        throw new AssertionError(stringBuilder.toString());
    }
}
