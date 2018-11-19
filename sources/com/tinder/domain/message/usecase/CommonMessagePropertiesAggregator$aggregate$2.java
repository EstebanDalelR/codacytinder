package com.tinder.domain.message.usecase;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "sentDate", "Lorg/joda/time/DateTime;", "call"}, k = 3, mv = {1, 1, 10})
final class CommonMessagePropertiesAggregator$aggregate$2<T1, T2, R> implements Func2<T, T2, R> {
    final /* synthetic */ String $matchId;
    final /* synthetic */ String $messageText;
    final /* synthetic */ CommonMessagePropertiesAggregator this$0;

    CommonMessagePropertiesAggregator$aggregate$2(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, String str, String str2) {
        this.this$0 = commonMessagePropertiesAggregator;
        this.$matchId = str;
        this.$messageText = str2;
    }

    @NotNull
    public final CommonMessageProperties call(Pair<String, String> pair, DateTime dateTime) {
        String str = (String) pair.c();
        String str2 = (String) pair.d();
        CommonMessagePropertiesAggregator commonMessagePropertiesAggregator = this.this$0;
        String str3 = this.$matchId;
        C2668g.a(dateTime, "sentDate");
        return commonMessagePropertiesAggregator.gatherCommonMessageProperties(str3, str, str2, dateTime, this.$messageText);
    }
}
