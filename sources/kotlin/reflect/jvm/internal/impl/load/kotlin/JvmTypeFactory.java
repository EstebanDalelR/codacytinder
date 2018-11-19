package kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;

public interface JvmTypeFactory<T> {
    @NotNull
    T boxType(@NotNull T t);

    @NotNull
    T createFromString(@NotNull String str);

    @NotNull
    T createObjectType(@NotNull String str);

    @NotNull
    T getJavaLangClassType();

    @NotNull
    String toString(@NotNull T t);
}
