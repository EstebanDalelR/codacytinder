package java8.util;

import java.util.NoSuchElementException;
import java8.util.function.Consumer;
import java8.util.function.Function;
import java8.util.function.Predicate;
import java8.util.function.Supplier;

public final class Optional<T> {
    /* renamed from: a */
    private static final Optional<?> f48742a = new Optional();
    /* renamed from: b */
    private final T f48743b;

    private Optional() {
        this.f48743b = null;
    }

    /* renamed from: a */
    public static <T> Optional<T> m59119a() {
        return f48742a;
    }

    private Optional(T t) {
        this.f48743b = Objects.m59115b(t);
    }

    /* renamed from: a */
    public static <T> Optional<T> m59120a(T t) {
        return new Optional(t);
    }

    /* renamed from: b */
    public static <T> Optional<T> m59121b(T t) {
        return t == null ? m59119a() : m59120a((Object) t);
    }

    /* renamed from: b */
    public T m59127b() {
        if (this.f48743b != null) {
            return this.f48743b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public boolean m59132c() {
        return this.f48743b != null;
    }

    /* renamed from: a */
    public void m59125a(Consumer<? super T> consumer) {
        if (this.f48743b != null) {
            consumer.accept(this.f48743b);
        }
    }

    /* renamed from: a */
    public void m59126a(Consumer<? super T> consumer, Runnable runnable) {
        if (this.f48743b != null) {
            consumer.accept(this.f48743b);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public Optional<T> m59123a(Predicate<? super T> predicate) {
        Objects.m59115b(predicate);
        if (!m59132c()) {
            return this;
        }
        return predicate.test(this.f48743b) != null ? this : m59119a();
    }

    /* renamed from: a */
    public <U> Optional<U> m59122a(Function<? super T, ? extends U> function) {
        Objects.m59115b(function);
        if (m59132c()) {
            return m59121b(function.apply(this.f48743b));
        }
        return m59119a();
    }

    /* renamed from: b */
    public <U> Optional<U> m59129b(Function<? super T, ? extends Optional<? extends U>> function) {
        Objects.m59115b(function);
        if (m59132c()) {
            return (Optional) Objects.m59115b((Optional) function.apply(this.f48743b));
        }
        return m59119a();
    }

    /* renamed from: a */
    public Optional<T> m59124a(Supplier<? extends Optional<? extends T>> supplier) {
        Objects.m59115b(supplier);
        if (m59132c()) {
            return this;
        }
        return (Optional) Objects.m59115b((Optional) supplier.get());
    }

    /* renamed from: c */
    public T m59130c(T t) {
        return this.f48743b != null ? this.f48743b : t;
    }

    /* renamed from: b */
    public T m59128b(Supplier<? extends T> supplier) {
        return this.f48743b != null ? this.f48743b : supplier.get();
    }

    /* renamed from: c */
    public <X extends Throwable> T m59131c(Supplier<? extends X> supplier) throws Throwable {
        if (this.f48743b != null) {
            return this.f48743b;
        }
        throw ((Throwable) supplier.get());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return null;
        }
        return Objects.m59114a(this.f48743b, ((Optional) obj).f48743b);
    }

    public int hashCode() {
        return Objects.m59112a(this.f48743b);
    }

    public String toString() {
        if (this.f48743b == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{this.f48743b});
    }
}
