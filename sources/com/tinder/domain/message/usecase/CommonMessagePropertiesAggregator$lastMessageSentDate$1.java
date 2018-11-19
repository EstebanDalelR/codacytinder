package com.tinder.domain.message.usecase;

import java8.util.Optional;
import kotlin.Metadata;
import org.joda.time.DateTime;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "sentDateOptional", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
final class CommonMessagePropertiesAggregator$lastMessageSentDate$1<T, R> implements Func1<T, R> {
    final /* synthetic */ CommonMessagePropertiesAggregator this$0;

    CommonMessagePropertiesAggregator$lastMessageSentDate$1(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator) {
        this.this$0 = commonMessagePropertiesAggregator;
    }

    public final DateTime call(Optional<DateTime> optional) {
        return (DateTime) optional.c(this.this$0.fallbackMessageSentDateProvider.invoke());
    }
}
