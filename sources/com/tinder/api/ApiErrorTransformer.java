package com.tinder.api;

import retrofit2.Response;
import rx.Observable;
import rx.Observable$Transformer;
import rx.functions.Func1;

public class ApiErrorTransformer<T> implements Observable$Transformer<Response<T>, T> {
    private ErrorHandler<T> errorHandler;

    public interface ErrorHandler<T> {
        Observable<T> handleError(Response response);
    }

    /* renamed from: com.tinder.api.ApiErrorTransformer$1 */
    class C80251 implements Func1<Response<T>, Observable<T>> {
        C80251() {
        }

        public Observable<T> call(Response<T> response) {
            if (response.isSuccessful()) {
                return Observable.a(response.body());
            }
            return ApiErrorTransformer.this.errorHandler.handleError(response);
        }
    }

    public ApiErrorTransformer(ErrorHandler<T> errorHandler) {
        this.errorHandler = errorHandler;
    }

    public Observable<T> call(Observable<Response<T>> observable) {
        return observable.h(new C80251());
    }
}
