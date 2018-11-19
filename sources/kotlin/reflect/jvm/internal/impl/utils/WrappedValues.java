package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WrappedValues {
    private static final Object NULL_VALUE = new C158671();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$1 */
    static class C158671 {
        public String toString() {
            return "NULL_VALUE";
        }

        C158671() {
        }
    }

    private static final class ThrowableWrapper {
        private final Throwable throwable;

        private ThrowableWrapper(@NotNull Throwable th) {
            this.throwable = th;
        }

        @NotNull
        public Throwable getThrowable() {
            return this.throwable;
        }

        public String toString() {
            return this.throwable.toString();
        }
    }

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    @Nullable
    public static <V> V unescapeNull(@NotNull Object obj) {
        return obj == NULL_VALUE ? null : obj;
    }

    @NotNull
    public static <V> Object escapeNull(@Nullable V v) {
        return v == null ? NULL_VALUE : v;
    }

    @NotNull
    public static Object escapeThrowable(@NotNull Throwable th) {
        return new ThrowableWrapper(th);
    }

    @Nullable
    public static <V> V unescapeExceptionOrNull(@NotNull Object obj) {
        return unescapeNull(unescapeThrowable(obj));
    }

    @Nullable
    public static <V> V unescapeThrowable(@Nullable Object obj) {
        if (!(obj instanceof ThrowableWrapper)) {
            return obj;
        }
        obj = ((ThrowableWrapper) obj).getThrowable();
        if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(obj)) {
            throw new WrappedProcessCanceledException(obj);
        }
        throw ExceptionUtilsKt.rethrow(obj);
    }
}
