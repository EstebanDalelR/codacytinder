package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscription;

public final class FlowableInternalHelper {

    public enum RequestMax implements Consumer<Subscription> {
        INSTANCE;

        public void accept(Subscription subscription) throws Exception {
            subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
        }
    }
}
