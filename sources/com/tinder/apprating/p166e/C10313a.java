package com.tinder.apprating.p166e;

import com.tinder.apprating.enums.AppRatingMode;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.usecase.SingleResultUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J4\u0010\b\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00070\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/apprating/usecase/CheckAppRatingMode;", "Lcom/tinder/domain/common/usecase/SingleResultUseCase;", "Lcom/tinder/apprating/enums/AppRatingMode;", "appRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "(Lcom/tinder/domain/apprating/AppRatingRepository;)V", "execute", "Lrx/Single;", "showMode", "kotlin.jvm.PlatformType", "mode", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.e.a */
public final class C10313a implements SingleResultUseCase<AppRatingMode> {
    /* renamed from: a */
    private final AppRatingRepository f33702a;

    @Inject
    public C10313a(@NotNull AppRatingRepository appRatingRepository) {
        C2668g.b(appRatingRepository, "appRatingRepository");
        this.f33702a = appRatingRepository;
    }

    @NotNull
    public Single<AppRatingMode> execute() {
        Single<AppRatingMode> a;
        if (this.f33702a.readIsFirstTimeAfterGooglePlayReview()) {
            a = m42088a(AppRatingMode.THANK_YOU);
            C2668g.a(a, "showMode(AppRatingMode.THANK_YOU)");
            return a;
        } else if (this.f33702a.readIsFeedbackDismissed()) {
            a = m42088a(AppRatingMode.FEEDBACK);
            C2668g.a(a, "showMode(AppRatingMode.FEEDBACK)");
            return a;
        } else if (this.f33702a.readIsRatingDismissed()) {
            a = m42088a(AppRatingMode.RATE);
            C2668g.a(a, "showMode(AppRatingMode.RATE)");
            return a;
        } else {
            a = m42088a(AppRatingMode.RATE);
            C2668g.a(a, "showMode(AppRatingMode.RATE)");
            return a;
        }
    }

    /* renamed from: a */
    private final Single<AppRatingMode> m42088a(AppRatingMode appRatingMode) {
        return Single.a(appRatingMode);
    }
}
