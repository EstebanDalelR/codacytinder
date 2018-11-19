package retrofit2.adapter.rxjava;

import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;
import rx.C2671a;
import rx.Observable;
import rx.Observable.OnSubscribe;

final class RxJavaCallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    @Nullable
    private final C2671a scheduler;

    RxJavaCallAdapter(Type type, @Nullable C2671a c2671a, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.responseType = type;
        this.scheduler = c2671a;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isSingle = z4;
        this.isCompletable = z5;
    }

    public Type responseType() {
        return this.responseType;
    }

    public Object adapt(Call<R> call) {
        OnSubscribe callEnqueueOnSubscribe;
        if (this.isAsync) {
            callEnqueueOnSubscribe = new CallEnqueueOnSubscribe(call);
        } else {
            callEnqueueOnSubscribe = new CallExecuteOnSubscribe(call);
        }
        OnSubscribe resultOnSubscribe = this.isResult != null ? new ResultOnSubscribe(callEnqueueOnSubscribe) : this.isBody != null ? new BodyOnSubscribe(callEnqueueOnSubscribe) : callEnqueueOnSubscribe;
        call = Observable.m69620a(resultOnSubscribe);
        if (this.scheduler != null) {
            call = call.m69673b(this.scheduler);
        }
        if (this.isSingle) {
            return call.m69659a();
        }
        return this.isCompletable ? call.m69666b() : call;
    }
}
