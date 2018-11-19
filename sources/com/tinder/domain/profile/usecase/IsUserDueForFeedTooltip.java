package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import io.reactivex.C3960g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/profile/usecase/IsUserDueForFeedTooltip;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "lastActivityDateRepository", "Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "feedTooltipDaysInactive", "", "(Lcom/tinder/domain/common/repository/LastActivityDateRepository;Lkotlin/jvm/functions/Function0;I)V", "execute", "Lio/reactivex/Single;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class IsUserDueForFeedTooltip implements SingleResultUseCase<Boolean> {
    private final Function0<DateTime> dateTimeProvider;
    private final int feedTooltipDaysInactive;
    private final LastActivityDateRepository lastActivityDateRepository;

    public IsUserDueForFeedTooltip(@NotNull LastActivityDateRepository lastActivityDateRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, int i) {
        C2668g.b(lastActivityDateRepository, "lastActivityDateRepository");
        C2668g.b(function0, "dateTimeProvider");
        this.lastActivityDateRepository = lastActivityDateRepository;
        this.dateTimeProvider = function0;
        this.feedTooltipDaysInactive = i;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> e = this.lastActivityDateRepository.getLastActivityDate().e().e(new IsUserDueForFeedTooltip$execute$1(this));
        C2668g.a(e, "lastActivityDateReposito…feedTooltipDaysInactive }");
        return e;
    }
}
