package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;

final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    @Nullable
    private final C15679f scheduler;

    RxJava2CallAdapter(Type type, @Nullable C15679f c15679f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.responseType = type;
        this.scheduler = c15679f;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isFlowable = z4;
        this.isSingle = z5;
        this.isMaybe = z6;
        this.isCompletable = z7;
    }

    public Type responseType() {
        return this.responseType;
    }

    public Object adapt(Call<R> call) {
        C3959e callEnqueueObservable;
        if (this.isAsync) {
            callEnqueueObservable = new CallEnqueueObservable(call);
        } else {
            callEnqueueObservable = new CallExecuteObservable(call);
        }
        call = this.isResult != null ? new ResultObservable(callEnqueueObservable) : this.isBody != null ? new BodyObservable(callEnqueueObservable) : callEnqueueObservable;
        if (this.scheduler != null) {
            call = call.subscribeOn(this.scheduler);
        }
        if (this.isFlowable) {
            return call.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.isSingle) {
            return call.singleOrError();
        }
        if (this.isMaybe) {
            return call.singleElement();
        }
        return this.isCompletable ? call.ignoreElements() : call;
    }
}
