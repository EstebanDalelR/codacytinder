package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsInitializer;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

final class FallbackBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion();
    private static final BuiltInsInitializer<FallbackBuiltIns> initializer = new BuiltInsInitializer(FallbackBuiltIns$Companion$initializer$1.INSTANCE);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.initializer.get();
        }
    }

    private FallbackBuiltIns() {
        super(new LockBasedStorageManager());
        createBuiltInsModule();
    }

    @NotNull
    protected All getPlatformDependentDeclarationFilter() {
        return All.INSTANCE;
    }
}
