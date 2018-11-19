package retrofit2.converter.moshi;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5987p.C5986a;
import com.squareup.moshi.JsonQualifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C15964r;
import okhttp3.C15968t;
import retrofit2.Converter;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit;

public final class MoshiConverterFactory extends Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final C5987p moshi;
    private final boolean serializeNulls;

    public static MoshiConverterFactory create() {
        return create(new C5986a().a());
    }

    public static MoshiConverterFactory create(C5987p c5987p) {
        if (c5987p != null) {
            return new MoshiConverterFactory(c5987p, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    private MoshiConverterFactory(C5987p c5987p, boolean z, boolean z2, boolean z3) {
        this.moshi = c5987p;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public Converter<C15968t, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        type = this.moshi.a(type, jsonAnnotations(annotationArr));
        if (this.lenient != null) {
            type = type.lenient();
        }
        if (this.failOnUnknown != null) {
            type = type.failOnUnknown();
        }
        if (this.serializeNulls != null) {
            type = type.serializeNulls();
        }
        return new MoshiResponseBodyConverter(type);
    }

    public Converter<?, C15964r> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        type = this.moshi.a(type, jsonAnnotations(annotationArr));
        if (this.lenient != null) {
            type = type.lenient();
        }
        if (this.failOnUnknown != null) {
            type = type.failOnUnknown();
        }
        if (this.serializeNulls != null) {
            type = type.serializeNulls();
        }
        return new MoshiRequestBodyConverter(type);
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        Set set = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (set == null) {
                    set = new LinkedHashSet();
                }
                set.add(annotation);
            }
        }
        return set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
    }
}
