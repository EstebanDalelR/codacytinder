package com.tinder.api.timeout;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"TIMEOUT_ERROR_CODE", "", "TIMEOUT_RESPONSE_CODE", "isTimeout", "", "T", "Lretrofit2/Response;", "api_release"}, k = 2, mv = {1, 1, 10})
public final class TimeoutInterceptorKt {
    public static final int TIMEOUT_ERROR_CODE = 50402;
    private static final int TIMEOUT_RESPONSE_CODE = 504;

    public static final <T> boolean isTimeout(@NotNull Response<T> response) {
        C2668g.b(response, "$receiver");
        return response.code() == TIMEOUT_RESPONSE_CODE ? true : null;
    }
}
