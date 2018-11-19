package java8.util.stream;

import java8.util.Objects;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

interface Sink<T> extends Consumer<T> {

    public static abstract class ChainedReference<T, E_OUT> implements Sink<T> {
        /* renamed from: d */
        protected final Sink<? super E_OUT> f57730d;

        public ChainedReference(Sink<? super E_OUT> sink) {
            this.f57730d = (Sink) Objects.m59115b(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f57730d.mo13608a(j);
        }

        public void z_() {
            this.f57730d.z_();
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return this.f57730d.mo13612b();
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }
    }

    public interface OfDouble extends DoubleConsumer, Sink<Double> {
        void accept(double d);

        void accept(Double d);
    }

    public interface OfInt extends IntConsumer, Sink<Integer> {
        void accept(int i);

        void accept(Integer num);
    }

    public interface OfLong extends LongConsumer, Sink<Long> {
        void accept(long j);

        void accept(Long l);
    }

    public static abstract class ChainedDouble<E_OUT> implements OfDouble {
        /* renamed from: b */
        protected final Sink<? super E_OUT> f59271b;

        public ChainedDouble(Sink<? super E_OUT> sink) {
            this.f59271b = (Sink) Objects.m59115b(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59271b.mo13608a(j);
        }

        public void z_() {
            this.f59271b.z_();
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return this.f59271b.mo13612b();
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(Double d) {
            OfDouble.m59673a(this, d);
        }
    }

    public static abstract class ChainedInt<E_OUT> implements OfInt {
        /* renamed from: b */
        protected final Sink<? super E_OUT> f59272b;

        public ChainedInt(Sink<? super E_OUT> sink) {
            this.f59272b = (Sink) Objects.m59115b(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59272b.mo13608a(j);
        }

        public void z_() {
            this.f59272b.z_();
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return this.f59272b.mo13612b();
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        public void accept(Integer num) {
            OfInt.m59674a(this, num);
        }
    }

    public static abstract class ChainedLong<E_OUT> implements OfLong {
        /* renamed from: b */
        protected final Sink<? super E_OUT> f59273b;

        public ChainedLong(Sink<? super E_OUT> sink) {
            this.f59273b = (Sink) Objects.m59115b(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59273b.mo13608a(j);
        }

        public void z_() {
            this.f59273b.z_();
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return this.f59273b.mo13612b();
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(Long l) {
            OfLong.m59675a(this, l);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }
    }

    /* renamed from: a */
    void mo13608a(long j);

    void accept(double d);

    void accept(int i);

    void accept(long j);

    /* renamed from: b */
    boolean mo13612b();

    void z_();
}
