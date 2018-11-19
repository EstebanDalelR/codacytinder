package java8.util.stream;

import java8.util.Objects;
import java8.util.Spliterators.AbstractDoubleSpliterator;
import java8.util.function.DoubleConsumer;
import java8.util.function.DoublePredicate;
import java8.util.function.DoubleUnaryOperator;

public final class DoubleStreams {

    /* renamed from: java8.util.stream.DoubleStreams$1 */
    static class C192171 extends AbstractDoubleSpliterator {
        /* renamed from: a */
        double f59678a;
        /* renamed from: b */
        boolean f59679b;
        /* renamed from: c */
        final /* synthetic */ DoubleUnaryOperator f59680c;
        /* renamed from: d */
        final /* synthetic */ double f59681d;

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            double applyAsDouble;
            Objects.m59115b(doubleConsumer);
            if (this.f59679b) {
                applyAsDouble = this.f59680c.applyAsDouble(this.f59678a);
            } else {
                applyAsDouble = this.f59681d;
                this.f59679b = true;
            }
            this.f59678a = applyAsDouble;
            doubleConsumer.accept(applyAsDouble);
            return true;
        }
    }

    /* renamed from: java8.util.stream.DoubleStreams$2 */
    static class C192182 extends AbstractDoubleSpliterator {
        /* renamed from: a */
        double f59682a;
        /* renamed from: b */
        boolean f59683b;
        /* renamed from: c */
        boolean f59684c;
        /* renamed from: d */
        final /* synthetic */ DoubleUnaryOperator f59685d;
        /* renamed from: e */
        final /* synthetic */ double f59686e;
        /* renamed from: f */
        final /* synthetic */ DoublePredicate f59687f;

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            if (this.f59684c) {
                return false;
            }
            double applyAsDouble;
            if (this.f59683b) {
                applyAsDouble = this.f59685d.applyAsDouble(this.f59682a);
            } else {
                applyAsDouble = this.f59686e;
                this.f59683b = true;
            }
            if (this.f59687f.test(applyAsDouble)) {
                this.f59682a = applyAsDouble;
                doubleConsumer.accept(applyAsDouble);
                return true;
            }
            this.f59684c = true;
            return false;
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            if (!this.f59684c) {
                this.f59684c = true;
                double applyAsDouble = this.f59683b ? this.f59685d.applyAsDouble(this.f59682a) : this.f59686e;
                while (this.f59687f.test(applyAsDouble)) {
                    doubleConsumer.accept(applyAsDouble);
                    applyAsDouble = this.f59685d.applyAsDouble(applyAsDouble);
                }
            }
        }
    }

    private DoubleStreams() {
    }
}
