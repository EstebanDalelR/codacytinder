package com.google.android.gms.tasks;

import android.support.annotation.NonNull;

public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull C4500a<TResult> c4500a) throws Exception;
}
