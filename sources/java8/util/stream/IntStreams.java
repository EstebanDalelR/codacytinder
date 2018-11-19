package java8.util.stream;

import java8.util.Objects;
import java8.util.Spliterators.AbstractIntSpliterator;
import java8.util.function.IntConsumer;
import java8.util.function.IntPredicate;
import java8.util.function.IntUnaryOperator;

public final class IntStreams {

    /* renamed from: java8.util.stream.IntStreams$1 */
    static class C192371 extends AbstractIntSpliterator {
        /* renamed from: a */
        int f59720a;
        /* renamed from: b */
        boolean f59721b;
        /* renamed from: c */
        final /* synthetic */ IntUnaryOperator f59722c;
        /* renamed from: d */
        final /* synthetic */ int f59723d;

        public boolean tryAdvance(IntConsumer intConsumer) {
            int applyAsInt;
            Objects.m59115b(intConsumer);
            if (this.f59721b) {
                applyAsInt = this.f59722c.applyAsInt(this.f59720a);
            } else {
                applyAsInt = this.f59723d;
                this.f59721b = true;
            }
            this.f59720a = applyAsInt;
            intConsumer.accept(applyAsInt);
            return true;
        }
    }

    /* renamed from: java8.util.stream.IntStreams$2 */
    static class C192382 extends AbstractIntSpliterator {
        /* renamed from: a */
        int f59724a;
        /* renamed from: b */
        boolean f59725b;
        /* renamed from: c */
        boolean f59726c;
        /* renamed from: d */
        final /* synthetic */ IntUnaryOperator f59727d;
        /* renamed from: e */
        final /* synthetic */ int f59728e;
        /* renamed from: f */
        final /* synthetic */ IntPredicate f59729f;

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            if (this.f59726c) {
                return false;
            }
            int applyAsInt;
            if (this.f59725b) {
                applyAsInt = this.f59727d.applyAsInt(this.f59724a);
            } else {
                applyAsInt = this.f59728e;
                this.f59725b = true;
            }
            if (this.f59729f.test(applyAsInt)) {
                this.f59724a = applyAsInt;
                intConsumer.accept(applyAsInt);
                return true;
            }
            this.f59726c = true;
            return false;
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            if (!this.f59726c) {
                this.f59726c = true;
                int applyAsInt = this.f59725b ? this.f59727d.applyAsInt(this.f59724a) : this.f59728e;
                while (this.f59729f.test(applyAsInt)) {
                    intConsumer.accept(applyAsInt);
                    applyAsInt = this.f59727d.applyAsInt(applyAsInt);
                }
            }
        }
    }

    private IntStreams() {
    }
}
