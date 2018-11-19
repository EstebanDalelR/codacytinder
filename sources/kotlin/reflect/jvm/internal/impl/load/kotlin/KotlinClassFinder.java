package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KotlinClassFinder {
    @Nullable
    KotlinJvmBinaryClass findKotlinClass(@NotNull JavaClass javaClass);

    @Nullable
    KotlinJvmBinaryClass findKotlinClass(@NotNull ClassId classId);
}
