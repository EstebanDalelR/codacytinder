package java8.util.stream;

import java8.util.function.Supplier;

interface TerminalSink<T, R> extends Supplier<R>, Sink<T> {
}
