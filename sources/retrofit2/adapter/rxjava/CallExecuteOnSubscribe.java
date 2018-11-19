package retrofit2.adapter.rxjava;

import retrofit2.Call;
import retrofit2.Response;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;

final class CallExecuteOnSubscribe<T> implements OnSubscribe<Response<T>> {
    private final Call<T> originalCall;

    CallExecuteOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    public void call(C19571c<? super Response<T>> c19571c) {
        Call clone = this.originalCall.clone();
        CallArbiter callArbiter = new CallArbiter(clone, c19571c);
        c19571c.add(callArbiter);
        c19571c.setProducer(callArbiter);
        try {
            callArbiter.emitResponse(clone.execute());
        } catch (C19571c<? super Response<T>> c19571c2) {
            C19410a.m69874b(c19571c2);
            callArbiter.emitError(c19571c2);
        }
    }
}
