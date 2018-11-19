package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class LazyWrappedType extends WrappedType {
    private final NotNullLazyValue<KotlinType> lazyValue;

    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> function0) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(function0, "computation");
        this.lazyValue = storageManager.createLazyValue(function0);
    }

    @NotNull
    protected KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }
}
