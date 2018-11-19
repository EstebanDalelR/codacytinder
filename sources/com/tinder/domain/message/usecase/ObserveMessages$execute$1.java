package com.tinder.domain.message.usecase;

import com.tinder.domain.message.Message;
import java.util.List;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "Lcom/tinder/domain/message/Message;", "earlierSentDateOptional", "Ljava8/util/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class ObserveMessages$execute$1<T, R> implements Func1<T, Observable<? extends R>> {
    final /* synthetic */ String $matchId;
    final /* synthetic */ ObserveMessages this$0;

    ObserveMessages$execute$1(ObserveMessages observeMessages, String str) {
        this.this$0 = observeMessages;
        this.$matchId = str;
    }

    @NotNull
    public final Observable<List<Message>> call(Optional<DateTime> optional) {
        ObserveMessages observeMessages = this.this$0;
        String str = this.$matchId;
        C2668g.a(optional, "earlierSentDateOptional");
        return observeMessages.messagesForMatch(str, optional);
    }
}
