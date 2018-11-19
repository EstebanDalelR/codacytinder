package rx.schedulers;

import rx.C2671a;
import rx.a$a;

@Deprecated
public final class ImmediateScheduler extends C2671a {
    public a$a createWorker() {
        return null;
    }

    private ImmediateScheduler() {
        throw new IllegalStateException("No instances!");
    }
}
