package retrofit2.adapter.rxjava;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;

final class CallEnqueueOnSubscribe<T> implements OnSubscribe<Response<T>> {
    private final Call<T> originalCall;

    CallEnqueueOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    public void call(C19571c<? super Response<T>> c19571c) {
        Call clone = this.originalCall.clone();
        final CallArbiter callArbiter = new CallArbiter(clone, c19571c);
        c19571c.add(callArbiter);
        c19571c.setProducer(callArbiter);
        clone.enqueue(new Callback<T>() {
            public void onResponse(Call<T> call, Response<T> response) {
                callArbiter.emitResponse(response);
            }

            public void onFailure(Call<T> call, Throwable th) {
                C19410a.m69874b(th);
                callArbiter.emitError(th);
            }
        });
    }
}
