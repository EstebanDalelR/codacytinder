package retrofit2.adapter.rxjava;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.CallAdapter.Factory;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.C2671a;
import rx.Completable;
import rx.Observable;
import rx.Single;

public final class RxJavaCallAdapterFactory extends Factory {
    private final boolean isAsync;
    @Nullable
    private final C2671a scheduler;

    public static RxJavaCallAdapterFactory create() {
        return new RxJavaCallAdapterFactory(null, false);
    }

    public static RxJavaCallAdapterFactory createAsync() {
        return new RxJavaCallAdapterFactory(null, true);
    }

    public static RxJavaCallAdapterFactory createWithScheduler(C2671a c2671a) {
        if (c2671a != null) {
            return new RxJavaCallAdapterFactory(c2671a, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    private RxJavaCallAdapterFactory(@Nullable C2671a c2671a, boolean z) {
        this.scheduler = c2671a;
        this.isAsync = z;
    }

    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        annotationArr = Factory.getRawType(type);
        boolean z = annotationArr == Single.class;
        retrofit = annotationArr == Completable.class ? true : null;
        if (annotationArr != Observable.class && !z && retrofit == null) {
            return null;
        }
        if (retrofit != null) {
            return new RxJavaCallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, true);
        }
        if ((type instanceof ParameterizedType) == null) {
            type = z ? "Single" : "Observable";
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
        boolean z2;
        boolean z3;
        type = Factory.getParameterUpperBound(0, (ParameterizedType) type);
        annotationArr = Factory.getRawType(type);
        if (annotationArr == Response.class) {
            if ((type instanceof ParameterizedType) == null) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = Factory.getParameterUpperBound(0, (ParameterizedType) type);
            z2 = false;
        } else if (annotationArr != Result.class) {
            parameterUpperBound = type;
            z2 = false;
            z3 = true;
            return new RxJavaCallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z2, z3, z, false);
        } else if ((type instanceof ParameterizedType) == null) {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        } else {
            parameterUpperBound = Factory.getParameterUpperBound(0, (ParameterizedType) type);
            z2 = true;
        }
        z3 = false;
        return new RxJavaCallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z2, z3, z, false);
    }
}
