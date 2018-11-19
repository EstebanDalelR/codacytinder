package kotlin.reflect.jvm.internal.impl.storage;

import com.leanplum.BuildConfig;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StorageKt {
    @NotNull
    public static final <T> T getValue(@NotNull NotNullLazyValue<? extends T> notNullLazyValue, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        C2668g.b(notNullLazyValue, "$receiver");
        C2668g.b(kProperty, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
        return notNullLazyValue.invoke();
    }

    @Nullable
    public static final <T> T getValue(@NotNull NullableLazyValue<? extends T> nullableLazyValue, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        C2668g.b(nullableLazyValue, "$receiver");
        C2668g.b(kProperty, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
        return nullableLazyValue.invoke();
    }
}
