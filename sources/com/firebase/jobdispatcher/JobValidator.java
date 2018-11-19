package com.firebase.jobdispatcher;

import android.support.annotation.Nullable;
import java.util.List;

public interface JobValidator {
    @Nullable
    List<String> validate(JobParameters jobParameters);

    @Nullable
    List<String> validate(RetryStrategy retryStrategy);

    @Nullable
    List<String> validate(C1885m c1885m);
}
