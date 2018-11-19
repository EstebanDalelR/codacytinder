package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C15813i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LockBasedStorageManager implements StorageManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final StorageManager NO_LOCKS = new LockBasedStorageManager("NO_LOCKS", ExceptionHandlingStrategy.THROW, NoLock.INSTANCE) {
        @NotNull
        protected <T> RecursionDetectedResult<T> recursionDetectedDefault() {
            return RecursionDetectedResult.fallThrough();
        }
    };
    private static final String PACKAGE_NAME = C19298r.m68789c(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    private final String debugText;
    private final ExceptionHandlingStrategy exceptionHandlingStrategy;
    protected final Lock lock;

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new C176141();

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$1 */
        static class C176141 implements ExceptionHandlingStrategy {
            C176141() {
            }

            @NotNull
            public RuntimeException handleException(@NotNull Throwable th) {
                throw ExceptionUtilsKt.rethrow(th);
            }
        }

        @NotNull
        RuntimeException handleException(@NotNull Throwable th);
    }

    private static class KeyWithComputation<K, V> {
        private final Function0<? extends V> computation;
        private final K key;

        public KeyWithComputation(K k, Function0<? extends V> function0) {
            this.key = k;
            this.computation = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    return this.key.equals(((KeyWithComputation) obj).key) != null;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.key.hashCode();
        }
    }

    private enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class RecursionDetectedResult<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean fallThrough;
        private final T value;

        static {
            Class cls = LockBasedStorageManager.class;
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> value(T t) {
            return new RecursionDetectedResult(t, false);
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> fallThrough() {
            return new RecursionDetectedResult(null, true);
        }

        private RecursionDetectedResult(T t, boolean z) {
            this.value = t;
            this.fallThrough = z;
        }

        public T getValue() {
            return this.value;
        }

        public boolean isFallThrough() {
            return this.fallThrough;
        }

        public String toString() {
            return isFallThrough() ? "FALL_THROUGH" : String.valueOf(this.value);
        }
    }

    private static class LockBasedLazyValue<T> implements NullableLazyValue<T> {
        private final Function0<? extends T> computable;
        private final LockBasedStorageManager storageManager;
        @Nullable
        private volatile Object value = NotValue.NOT_COMPUTED;

        protected void postCompute(T t) {
        }

        public LockBasedLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            this.storageManager = lockBasedStorageManager;
            this.computable = function0;
        }

        public boolean isComputed() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        public T invoke() {
            Object obj = this.value;
            if (!(obj instanceof NotValue)) {
                return WrappedValues.unescapeThrowable(obj);
            }
            this.storageManager.lock.lock();
            try {
                T value;
                NotValue notValue = this.value;
                if (notValue instanceof NotValue) {
                    if (notValue == NotValue.COMPUTING) {
                        this.value = NotValue.RECURSION_WAS_DETECTED;
                        RecursionDetectedResult recursionDetected = recursionDetected(true);
                        if (!recursionDetected.isFallThrough()) {
                            value = recursionDetected.getValue();
                        }
                    }
                    if (notValue == NotValue.RECURSION_WAS_DETECTED) {
                        RecursionDetectedResult recursionDetected2 = recursionDetected(false);
                        if (!recursionDetected2.isFallThrough()) {
                            value = recursionDetected2.getValue();
                        }
                    }
                    this.value = NotValue.COMPUTING;
                    value = this.computable.invoke();
                    this.value = value;
                    postCompute(value);
                } else {
                    value = WrappedValues.unescapeThrowable(notValue);
                }
                this.storageManager.lock.unlock();
                return value;
            } catch (Throwable th) {
                this.storageManager.lock.unlock();
            }
        }

        @NotNull
        protected RecursionDetectedResult<T> recursionDetected(boolean z) {
            return this.storageManager.recursionDetectedDefault();
        }
    }

    private static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {
        private final ConcurrentMap<K, Object> cache;
        private final Function1<? super K, ? extends V> compute;
        private final LockBasedStorageManager storageManager;

        public MapBasedMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            this.storageManager = lockBasedStorageManager;
            this.cache = concurrentMap;
            this.compute = function1;
        }

        @Nullable
        public V invoke(K k) {
            Throwable raceCondition;
            NotValue notValue = this.cache.get(k);
            if (notValue != null && notValue != NotValue.COMPUTING) {
                return WrappedValues.unescapeExceptionOrNull(notValue);
            }
            this.storageManager.lock.lock();
            try {
                notValue = this.cache.get(k);
                if (notValue == NotValue.COMPUTING) {
                    throw recursionDetected(k);
                } else if (notValue != null) {
                    k = WrappedValues.unescapeExceptionOrNull(notValue);
                    return k;
                } else {
                    Throwable th = null;
                    try {
                        this.cache.put(k, NotValue.COMPUTING);
                        V invoke = this.compute.invoke(k);
                        NotValue put = this.cache.put(k, WrappedValues.escapeNull(invoke));
                        if (put != NotValue.COMPUTING) {
                            raceCondition = raceCondition(k, put);
                            try {
                                throw raceCondition;
                            } catch (Throwable th2) {
                                Throwable th3 = raceCondition;
                                raceCondition = th2;
                                th2 = th3;
                            }
                        } else {
                            this.storageManager.lock.unlock();
                            return invoke;
                        }
                    } catch (Throwable th4) {
                        raceCondition = th4;
                        if (ExceptionUtilsKt.isProcessCanceledException(raceCondition)) {
                            this.cache.remove(k);
                            throw ((RuntimeException) raceCondition);
                        } else if (raceCondition == th2) {
                            throw this.storageManager.exceptionHandlingStrategy.handleException(raceCondition);
                        } else {
                            notValue = this.cache.put(k, WrappedValues.escapeThrowable(raceCondition));
                            if (notValue != NotValue.COMPUTING) {
                                throw raceCondition(k, notValue);
                            }
                            throw this.storageManager.exceptionHandlingStrategy.handleException(raceCondition);
                        }
                    }
                }
            } finally {
                this.storageManager.lock.unlock();
            }
        }

        @NotNull
        private AssertionError recursionDetected(K k) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Recursion detected on input: ");
            stringBuilder.append(k);
            stringBuilder.append(" under ");
            stringBuilder.append(this.storageManager);
            return (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError(stringBuilder.toString()));
        }

        @NotNull
        private AssertionError raceCondition(K k, Object obj) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Race condition detected on input ");
            stringBuilder.append(k);
            stringBuilder.append(". Old value is ");
            stringBuilder.append(obj);
            stringBuilder.append(" under ");
            stringBuilder.append(this.storageManager);
            return (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError(stringBuilder.toString()));
        }

        protected LockBasedStorageManager getStorageManager() {
            return this.storageManager;
        }
    }

    private static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction$1 */
        class C185291 implements Function1<KeyWithComputation<K, V>, V> {
            C185291() {
            }

            public V invoke(KeyWithComputation<K, V> keyWithComputation) {
                return keyWithComputation.computation.invoke();
            }
        }

        private CacheWithNullableValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new C185291());
        }

        @Nullable
        public V computeIfAbsent(K k, @NotNull Function0<? extends V> function0) {
            return invoke(new KeyWithComputation(k, function0));
        }
    }

    private static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class cls = LockBasedStorageManager.class;
        }

        public LockBasedNotNullLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
        }

        @NotNull
        public T invoke() {
            return super.invoke();
        }
    }

    private static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class cls = LockBasedStorageManager.class;
        }

        public MapBasedMemoizedFunctionToNotNull(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
        }

        @NotNull
        public V invoke(K k) {
            return super.invoke(k);
        }
    }

    private static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class cls = LockBasedStorageManager.class;
        }

        private CacheWithNotNullValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(concurrentMap);
        }

        @NotNull
        public V computeIfAbsent(K k, @NotNull Function0<? extends V> function0) {
            return super.computeIfAbsent(k, function0);
        }
    }

    private static String defaultDebugName() {
        return "<unknown creating class>";
    }

    private LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull Lock lock) {
        this.lock = lock;
        this.exceptionHandlingStrategy = exceptionHandlingStrategy;
        this.debugText = str;
    }

    public LockBasedStorageManager() {
        this(defaultDebugName(), ExceptionHandlingStrategy.THROW, new ReentrantLock());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" (");
        stringBuilder.append(this.debugText);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        return createMemoizedFunction(function1, createConcurrentHashMap());
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        return new MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        return createMemoizedFunctionWithNullableValues(function1, createConcurrentHashMap());
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        return new MapBasedMemoizedFunction(this, concurrentMap, function1);
    }

    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull final T t) {
        return new LockBasedNotNullLazyValue<T>(this, function0) {
            @NotNull
            protected RecursionDetectedResult<T> recursionDetected(boolean z) {
                return RecursionDetectedResult.value(t);
            }
        };
    }

    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, C15813i> function12) {
        final Function1<? super Boolean, ? extends T> function13 = function1;
        final Function1<? super T, C15813i> function14 = function12;
        return new LockBasedNotNullLazyValue<T>(this, function0) {
            @NotNull
            protected RecursionDetectedResult<T> recursionDetected(boolean z) {
                if (function13 == null) {
                    return super.recursionDetected(z);
                }
                return RecursionDetectedResult.value(function13.invoke(Boolean.valueOf(z)));
            }

            protected void postCompute(@NotNull T t) {
                function14.invoke(t);
            }
        };
    }

    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        return new LockBasedLazyValue(this, function0);
    }

    @NotNull
    private static <K> ConcurrentMap<K, Object> createConcurrentHashMap() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    @NotNull
    protected <T> RecursionDetectedResult<T> recursionDetectedDefault() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Recursive call in a lazy value under ");
        stringBuilder.append(this);
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(stringBuilder.toString())));
    }

    @NotNull
    private static <T extends Throwable> T sanitizeStackTrace(@NotNull T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(PACKAGE_NAME)) {
                break;
            }
            i++;
        }
        i = -1;
        List subList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }
}
