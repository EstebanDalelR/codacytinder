package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C15964r;
import okhttp3.C15968t;
import retrofit2.Converter.Factory;
import retrofit2.http.Streaming;

final class BuiltInConverters extends Factory {

    static final class BufferingResponseBodyConverter implements Converter<C15968t, C15968t> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        public C15968t convert(C15968t c15968t) throws IOException {
            try {
                C15968t buffer = Utils.buffer(c15968t);
                return buffer;
            } finally {
                c15968t.close();
            }
        }
    }

    static final class RequestBodyConverter implements Converter<C15964r, C15964r> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        public C15964r convert(C15964r c15964r) throws IOException {
            return c15964r;
        }

        RequestBodyConverter() {
        }
    }

    static final class StreamingResponseBodyConverter implements Converter<C15968t, C15968t> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        public C15968t convert(C15968t c15968t) throws IOException {
            return c15968t;
        }

        StreamingResponseBodyConverter() {
        }
    }

    static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        ToStringConverter() {
        }

        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class VoidResponseBodyConverter implements Converter<C15968t, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        public Void convert(C15968t c15968t) throws IOException {
            c15968t.close();
            return null;
        }
    }

    BuiltInConverters() {
    }

    public Converter<C15968t, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type != C15968t.class) {
            return type == Void.class ? VoidResponseBodyConverter.INSTANCE : null;
        } else {
            if (Utils.isAnnotationPresent(annotationArr, Streaming.class) != null) {
                type = StreamingResponseBodyConverter.INSTANCE;
            } else {
                type = BufferingResponseBodyConverter.INSTANCE;
            }
            return type;
        }
    }

    public Converter<?, C15964r> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return C15964r.class.isAssignableFrom(Utils.getRawType(type)) != null ? RequestBodyConverter.INSTANCE : null;
    }
}
