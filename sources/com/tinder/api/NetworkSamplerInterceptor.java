package com.tinder.api;

import android.content.Context;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.managers.bk;
import com.tinder.managers.bs;
import com.tinder.utils.DateUtils;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.C15966s;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

@Singleton
public class NetworkSamplerInterceptor implements Interceptor {
    private static final String URL_PATH_UPDATES = "updates";
    private final bk managerSharedPreferences;
    private final bs networkQualitySampler;
    private final long samplingFreqMs;

    @Inject
    public NetworkSamplerInterceptor(@NonNull Context context, @NonNull bs bsVar, @NonNull bk bkVar) {
        this.networkQualitySampler = bsVar;
        this.managerSharedPreferences = bkVar;
        this.samplingFreqMs = (long) context.getResources().getInteger(R.integer.sampling_frequency);
    }

    public C15966s intercept(Chain chain) throws IOException {
        Object obj;
        if (isUpdatesRequest(chain.request().a()) && isBeyondFiveMinutes()) {
            obj = 1;
            this.networkQualitySampler.a();
        } else {
            obj = null;
        }
        chain = chain.proceed(chain.request());
        if (obj != null) {
            this.networkQualitySampler.b();
        }
        return chain;
    }

    private boolean isUpdatesRequest(@NonNull HttpUrl httpUrl) {
        httpUrl = httpUrl.k();
        boolean z = false;
        if (httpUrl == null || httpUrl.isEmpty()) {
            return false;
        }
        String str = (String) httpUrl.get(0);
        if (!(str == null || str.equals(URL_PATH_UPDATES) == null)) {
            z = true;
        }
        return z;
    }

    private boolean isBeyondFiveMinutes() {
        return DateUtils.a(this.managerSharedPreferences.Z(), this.samplingFreqMs);
    }
}
