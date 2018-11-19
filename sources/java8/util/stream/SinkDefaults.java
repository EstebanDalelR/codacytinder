package java8.util.stream;

final class SinkDefaults {

    static final class OfDouble {
        /* renamed from: a */
        static void m59673a(java8.util.stream.Sink.OfDouble ofDouble, Double d) {
            ofDouble.accept(d.doubleValue());
        }

        private OfDouble() {
        }
    }

    static final class OfInt {
        /* renamed from: a */
        static void m59674a(java8.util.stream.Sink.OfInt ofInt, Integer num) {
            ofInt.accept(num.intValue());
        }

        private OfInt() {
        }
    }

    static final class OfLong {
        /* renamed from: a */
        static void m59675a(java8.util.stream.Sink.OfLong ofLong, Long l) {
            ofLong.accept(l.longValue());
        }

        private OfLong() {
        }
    }

    /* renamed from: a */
    static <T> void m59677a(Sink<T> sink, int i) {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: a */
    static <T> void m59678a(Sink<T> sink, long j) {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: a */
    static <T> void m59676a(Sink<T> sink, double d) {
        throw new IllegalStateException("called wrong accept method");
    }

    private SinkDefaults() {
    }
}
