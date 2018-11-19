package io.reactivex.internal.schedulers;

import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;

@Experimental
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i, @NonNull C17362c c17362c);
    }

    void createWorkers(int i, @NonNull WorkerCallback workerCallback);
}
