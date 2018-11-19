package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C2635n;
import com.tinder.analytics.performance.C6242m;
import com.tinder.analytics.performance.C8151o;
import com.tinder.api.TinderApi;
import com.tinder.api.model.profile.Share;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.profile.exception.ShareTextException;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import java.util.Collections;
import javax.inject.Inject;
import org.json.JSONException;
import retrofit2.Response;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.Single;

/* renamed from: com.tinder.profile.b.ab */
public class ab {
    @NonNull
    /* renamed from: a */
    private final TinderApi f45568a;
    /* renamed from: b */
    private final C8151o f45569b;

    @Inject
    public ab(@NonNull TinderApi tinderApi, @NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        this.f45568a = tinderApi;
        this.f45569b = new C8151o(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    public Single<String> m54751a(@NonNull String str) {
        return this.f45568a.getShareLink(str).b(new ac(this)).a(RxUtils.a()).b(new ad(this, str)).l(ae.f55381a).k(af.f55382a).k(ag.f55383a).a();
    }

    /* renamed from: a */
    final /* synthetic */ void m54752a() {
        this.f45569b.a("SHARE_LINK_TIMER_KEY");
    }

    /* renamed from: a */
    final /* synthetic */ void m54753a(@NonNull String str, Response response) {
        m54750a("SHARE_LINK_TIMER_KEY", str, response);
    }

    /* renamed from: a */
    static final /* synthetic */ Observable m54749a(Throwable th) {
        ad.c(th.toString());
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            if (httpException.code() == 403 && httpException.message().equalsIgnoreCase("User is hidden")) {
                return Observable.a(ShareTextException.m54888c());
            }
        }
        if ((th instanceof JSONException) != null) {
            return Observable.a(ShareTextException.m54886a());
        }
        return Observable.a(ShareTextException.m54887b());
    }

    /* renamed from: a */
    private void m54750a(String str, String str2, Response<Share> response) {
        this.f45569b.b(str);
        String str3 = str2;
        String str4 = str;
        this.f45569b.a(str3, str4, C2635n.a(response.raw().m60553a().m60526a().toString(), Collections.singletonMap(str2, InstrumentationConstantsKt.REPLACE_USER_ID_WITH)), response.raw().m60553a().m60527b(), response.code(), C6242m.a().a(str2).a());
    }
}
