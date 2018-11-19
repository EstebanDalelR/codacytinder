package com.tinder.domain.profile.usecase;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.ReadableInstant;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/joda/time/DateTime;", "apply"}, k = 3, mv = {1, 1, 10})
final class IsUserDueForFeedTooltip$execute$1<T, R> implements Function<T, R> {
    final /* synthetic */ IsUserDueForFeedTooltip this$0;

    IsUserDueForFeedTooltip$execute$1(IsUserDueForFeedTooltip isUserDueForFeedTooltip) {
        this.this$0 = isUserDueForFeedTooltip;
    }

    public /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(apply((DateTime) obj));
    }

    public final boolean apply(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "it");
        dateTime = Days.a(dateTime, (ReadableInstant) this.this$0.dateTimeProvider.invoke());
        C2668g.a(dateTime, "Days.daysBetween(it, dateTimeProvider())");
        return dateTime.b() >= this.this$0.feedTooltipDaysInactive ? true : null;
    }
}
