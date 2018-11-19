package java8.util.stream;

import java8.util.Objects;
import java8.util.Spliterators.AbstractLongSpliterator;
import java8.util.function.LongConsumer;
import java8.util.function.LongPredicate;
import java8.util.function.LongUnaryOperator;

public final class LongStreams {

    /* renamed from: java8.util.stream.LongStreams$1 */
    static class C192561 extends AbstractLongSpliterator {
        /* renamed from: a */
        long f59754a;
        /* renamed from: b */
        boolean f59755b;
        /* renamed from: c */
        final /* synthetic */ LongUnaryOperator f59756c;
        /* renamed from: d */
        final /* synthetic */ long f59757d;

        public boolean tryAdvance(LongConsumer longConsumer) {
            long applyAsLong;
            Objects.m59115b(longConsumer);
            if (this.f59755b) {
                applyAsLong = this.f59756c.applyAsLong(this.f59754a);
            } else {
                applyAsLong = this.f59757d;
                this.f59755b = true;
            }
            this.f59754a = applyAsLong;
            longConsumer.accept(applyAsLong);
            return true;
        }
    }

    /* renamed from: java8.util.stream.LongStreams$2 */
    static class C192572 extends AbstractLongSpliterator {
        /* renamed from: a */
        long f59758a;
        /* renamed from: b */
        boolean f59759b;
        /* renamed from: c */
        boolean f59760c;
        /* renamed from: d */
        final /* synthetic */ LongUnaryOperator f59761d;
        /* renamed from: e */
        final /* synthetic */ long f59762e;
        /* renamed from: f */
        final /* synthetic */ LongPredicate f59763f;

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            if (this.f59760c) {
                return false;
            }
            long applyAsLong;
            if (this.f59759b) {
                applyAsLong = this.f59761d.applyAsLong(this.f59758a);
            } else {
                applyAsLong = this.f59762e;
                this.f59759b = true;
            }
            if (this.f59763f.test(applyAsLong)) {
                this.f59758a = applyAsLong;
                longConsumer.accept(applyAsLong);
                return true;
            }
            this.f59760c = true;
            return false;
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            if (!this.f59760c) {
                this.f59760c = true;
                long applyAsLong = this.f59759b ? this.f59761d.applyAsLong(this.f59758a) : this.f59762e;
                while (this.f59763f.test(applyAsLong)) {
                    longConsumer.accept(applyAsLong);
                    applyAsLong = this.f59761d.applyAsLong(applyAsLong);
                }
            }
        }
    }

    private LongStreams() {
    }
}
