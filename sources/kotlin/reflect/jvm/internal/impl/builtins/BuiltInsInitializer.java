package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsInitializer<T extends KotlinBuiltIns> {
    private final Function0<T> constructor;
    private Throwable initializationFailed;
    private volatile boolean initializing;
    private volatile T instance;

    public BuiltInsInitializer(@NotNull Function0<? extends T> function0) {
        C2668g.b(function0, "constructor");
        this.constructor = function0;
    }

    private final synchronized void initialize() {
        if (this.instance == null) {
            Throwable th;
            if (this.initializationFailed != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Built-in library initialization failed previously: ");
                th = this.initializationFailed;
                if (th == null) {
                    C2668g.a();
                }
                stringBuilder.append(th);
                throw new IllegalStateException(stringBuilder.toString(), this.initializationFailed);
            } else if (this.initializing) {
                throw new IllegalStateException("Built-in library initialization loop");
            } else {
                this.initializing = true;
                try {
                    this.instance = (KotlinBuiltIns) this.constructor.invoke();
                    this.initializing = false;
                } catch (Throwable th2) {
                    this.initializing = false;
                }
            }
        }
    }

    @NotNull
    public final T get() {
        T t;
        if (this.initializing) {
            synchronized (this) {
                t = this.instance;
                if (t != null) {
                } else {
                    throw new AssertionError("Built-ins are not initialized (note: We are under the same lock as initializing and instance)");
                }
            }
            return t;
        }
        if (this.instance == null) {
            initialize();
        }
        t = this.instance;
        if (t == null) {
            C2668g.a();
        }
        return t;
    }
}
