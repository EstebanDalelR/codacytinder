package com.firebase.jobdispatcher;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.List;

public class ValidationEnforcer implements JobValidator {
    /* renamed from: a */
    private final JobValidator f10524a;

    public static final class ValidationException extends RuntimeException {
        /* renamed from: a */
        private final List<String> f5105a;

        public ValidationException(String str, @NonNull List<String> list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(TextUtils.join("\n  - ", list));
            super(stringBuilder.toString());
            this.f5105a = list;
        }
    }

    public ValidationEnforcer(JobValidator jobValidator) {
        this.f10524a = jobValidator;
    }

    @Nullable
    public List<String> validate(JobParameters jobParameters) {
        return this.f10524a.validate(jobParameters);
    }

    @Nullable
    public List<String> validate(C1885m c1885m) {
        return this.f10524a.validate(c1885m);
    }

    @Nullable
    public List<String> validate(RetryStrategy retryStrategy) {
        return this.f10524a.validate(retryStrategy);
    }

    /* renamed from: a */
    public final void m13236a(JobParameters jobParameters) {
        m13235a(validate(jobParameters));
    }

    /* renamed from: a */
    private static void m13235a(List<String> list) {
        if (list != null) {
            throw new ValidationException("JobParameters is invalid", list);
        }
    }
}
