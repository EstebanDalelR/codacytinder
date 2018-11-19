package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.api.TinderApi;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.request.ReportUserRequest;
import com.tinder.api.request.ReportUserRequest.Builder;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.common.usecase.UseCase;
import com.tinder.profile.p363b.aq.C14375a;
import javax.inject.Inject;
import retrofit2.Response;
import rx.Observable;

/* renamed from: com.tinder.profile.b.ao */
public class ao implements UseCase<C14375a, Response<LikeRatingResponse>> {
    @NonNull
    /* renamed from: a */
    private final TinderApi f49989a;

    @NonNull
    public /* synthetic */ Observable execute(@NonNull Object obj) {
        return m60847a((C14375a) obj);
    }

    @Inject
    ao(@NonNull TinderApi tinderApi) {
        this.f49989a = tinderApi;
    }

    @NonNull
    /* renamed from: a */
    public Observable<Response<LikeRatingResponse>> m60847a(@NonNull C14375a c14375a) {
        Builder cause = ReportUserRequest.builder().cause(c14375a.mo11602b());
        if (!C8578a.a(c14375a.mo11603c())) {
            cause.text(c14375a.mo11603c());
        }
        return this.f49989a.reportRec(c14375a.mo11601a(), cause.build());
    }
}
