package com.tinder.apprating.p087d;

import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/apprating/reporter/AppRatingSaveTimeStampOnFirstLaunch;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "appRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/apprating/AppRatingRepository;Lkotlin/jvm/functions/Function0;)V", "execute", "", "saveTimeStampOnAppFirstLaunch", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.d.a */
public final class C3920a implements SimpleVoidUseCase {
    /* renamed from: a */
    private final AppRatingRepository f12217a;
    /* renamed from: b */
    private final Function0<DateTime> f12218b;

    @Inject
    public C3920a(@NotNull AppRatingRepository appRatingRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.m10309b(appRatingRepository, "appRatingRepository");
        C2668g.m10309b(function0, "dateTimeProvider");
        this.f12217a = appRatingRepository;
        this.f12218b = function0;
    }

    public void execute() {
        Completable.m10366a((Action0) new a$a(this)).m10386b(Schedulers.io()).m10394b(RxUtils.m10187b());
    }

    /* renamed from: a */
    private final void m14708a() {
        if (this.f12217a.readSessionTimeStamp() == 0) {
            this.f12217a.writeSessionTimeStamp(((DateTime) this.f12218b.invoke()).getMillis());
        }
    }
}
