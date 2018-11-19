package java8.util.stream;

import java8.util.Objects;
import java8.util.Spliterators.AbstractSpliterator;
import java8.util.function.Consumer;
import java8.util.function.Predicate;
import java8.util.function.UnaryOperator;

public final class RefStreams {

    /* renamed from: java8.util.stream.RefStreams$1 */
    static class C184461 extends AbstractSpliterator<T> {
        /* renamed from: a */
        S f57720a;
        /* renamed from: b */
        boolean f57721b;
        /* renamed from: c */
        final /* synthetic */ UnaryOperator f57722c;
        /* renamed from: d */
        final /* synthetic */ Object f57723d;

        public boolean tryAdvance(Consumer<? super T> consumer) {
            Object apply;
            Objects.m59115b(consumer);
            if (this.f57721b) {
                apply = this.f57722c.apply(this.f57720a);
            } else {
                apply = this.f57723d;
                this.f57721b = true;
            }
            this.f57720a = apply;
            consumer.accept(apply);
            return true;
        }
    }

    /* renamed from: java8.util.stream.RefStreams$2 */
    static class C184472 extends AbstractSpliterator<T> {
        /* renamed from: a */
        S f57724a;
        /* renamed from: b */
        boolean f57725b;
        /* renamed from: c */
        boolean f57726c;
        /* renamed from: d */
        final /* synthetic */ UnaryOperator f57727d;
        /* renamed from: e */
        final /* synthetic */ Object f57728e;
        /* renamed from: f */
        final /* synthetic */ Predicate f57729f;

        public boolean tryAdvance(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            if (this.f57726c) {
                return false;
            }
            Object apply;
            if (this.f57725b) {
                apply = this.f57727d.apply(this.f57724a);
            } else {
                apply = this.f57728e;
                this.f57725b = true;
            }
            if (this.f57729f.test(apply)) {
                this.f57724a = apply;
                consumer.accept(apply);
                return true;
            }
            this.f57724a = null;
            this.f57726c = true;
            return false;
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            if (!this.f57726c) {
                this.f57726c = true;
                Object apply = this.f57725b ? this.f57727d.apply(this.f57724a) : this.f57728e;
                this.f57724a = null;
                while (this.f57729f.test(apply)) {
                    consumer.accept(apply);
                    apply = this.f57727d.apply(apply);
                }
            }
        }
    }

    private RefStreams() {
    }
}
