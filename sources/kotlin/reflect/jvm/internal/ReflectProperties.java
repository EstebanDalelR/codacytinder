package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ReflectProperties {

    public static abstract class Val<T> {
        private static final Object NULL_VALUE = new C158461();

        /* renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$1 */
        static class C158461 {
            C158461() {
            }
        }

        public abstract T invoke();

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }

        protected Object escape(T t) {
            return t == null ? NULL_VALUE : t;
        }

        protected T unescape(Object obj) {
            return obj == NULL_VALUE ? null : obj;
        }
    }

    public static class LazySoftVal<T> extends Val<T> {
        private final Function0<T> initializer;
        private SoftReference<Object> value = null;

        public LazySoftVal(@Nullable T t, @NotNull Function0<T> function0) {
            this.initializer = function0;
            if (t != null) {
                this.value = new SoftReference(escape(t));
            }
        }

        public T invoke() {
            SoftReference softReference = this.value;
            if (softReference != null) {
                Object obj = softReference.get();
                if (obj != null) {
                    return unescape(obj);
                }
            }
            T invoke = this.initializer.invoke();
            this.value = new SoftReference(escape(invoke));
            return invoke;
        }
    }

    public static class LazyVal<T> extends Val<T> {
        private final Function0<T> initializer;
        private Object value = null;

        public LazyVal(@NotNull Function0<T> function0) {
            this.initializer = function0;
        }

        public T invoke() {
            Object obj = this.value;
            if (obj != null) {
                return unescape(obj);
            }
            T invoke = this.initializer.invoke();
            this.value = escape(invoke);
            return invoke;
        }
    }

    @NotNull
    public static <T> LazyVal<T> lazy(@NotNull Function0<T> function0) {
        return new LazyVal(function0);
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@Nullable T t, @NotNull Function0<T> function0) {
        return new LazySoftVal(t, function0);
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@NotNull Function0<T> function0) {
        return lazySoft(null, function0);
    }
}
