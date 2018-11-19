package retrofit2.adapter.rxjava2;

import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.CallAdapter.Factory;
import retrofit2.Response;
import retrofit2.Retrofit;

public final class RxJava2CallAdapterFactory extends Factory {
    private final boolean isAsync;
    @Nullable
    private final C15679f scheduler;

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(C15679f c15679f) {
        if (c15679f != null) {
            return new RxJava2CallAdapterFactory(c15679f, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    private RxJava2CallAdapterFactory(@Nullable C15679f c15679f, boolean z) {
        this.scheduler = c15679f;
        this.isAsync = z;
    }

    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        annotationArr = Factory.getRawType(type);
        if (annotationArr == C3956a.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z = annotationArr == C3957b.class;
        boolean z2 = annotationArr == C3960g.class;
        boolean z3 = annotationArr == C3958c.class;
        if (annotationArr != C3959e.class && !z && !z2 && !z3) {
            return null;
        }
        if ((type instanceof ParameterizedType) == null) {
            type = z ? "Flowable" : z2 ? "Single" : z3 ? "Maybe" : "Observable";
            retrofit = new StringBuilder();
            retrofit.append(type);
            retrofit.append(" return type must be parameterized as ");
            retrofit.append(type);
            retrofit.append("<Foo> or ");
            retrofit.append(type);
            retrofit.append("<? extends Foo>");
            throw new IllegalStateException(retrofit.toString());
        }
        Type parameterUpperBound;
        boolean z4;
        boolean z5;
        type = Factory.getParameterUpperBound(0, (ParameterizedType) type);
        annotationArr = Factory.getRawType(type);
        if (annotationArr == Response.class) {
            if ((type instanceof ParameterizedType) == null) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = Factory.getParameterUpperBound(0, (ParameterizedType) type);
            z4 = false;
        } else if (annotationArr != Result.class) {
            parameterUpperBound = type;
            z4 = false;
            z5 = true;
            return new RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z4, z5, z, z2, z3, false);
        } else if ((type instanceof ParameterizedType) == null) {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        } else {
            parameterUpperBound = Factory.getParameterUpperBound(0, (ParameterizedType) type);
            z4 = true;
        }
        z5 = false;
        return new RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z4, z5, z, z2, z3, false);
    }
}
