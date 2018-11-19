package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion();
    private static final BuiltInsInitializer<DefaultBuiltIns> initializer = new BuiltInsInitializer(DefaultBuiltIns$Companion$initializer$1.INSTANCE);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.initializer.get();
        }
    }

    @NotNull
    public static final DefaultBuiltIns getInstance() {
        return Companion.getInstance();
    }

    private DefaultBuiltIns() {
        super(new LockBasedStorageManager());
        createBuiltInsModule();
    }
}
