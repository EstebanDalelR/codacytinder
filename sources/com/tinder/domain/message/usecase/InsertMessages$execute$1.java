package com.tinder.domain.message.usecase;

import com.tinder.domain.message.Message;
import com.tinder.domain.message.usecase.InsertMessages.Request;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "currentUserId", "", "apply"}, k = 3, mv = {1, 1, 10})
final class InsertMessages$execute$1<T, R> implements Function<String, CompletableSource> {
    final /* synthetic */ Request $request;
    final /* synthetic */ InsertMessages this$0;

    InsertMessages$execute$1(InsertMessages insertMessages, Request request) {
        this.this$0 = insertMessages;
        this.$request = request;
    }

    @NotNull
    public final C3956a apply(@NotNull String str) {
        List access$allMessagesMarkedAsSeen;
        C2668g.b(str, "currentUserId");
        Request request = this.$request;
        String component1 = request.component1();
        DateTime component2 = request.component2();
        boolean component3 = request.component3();
        if (request.component4()) {
            access$allMessagesMarkedAsSeen = this.this$0.allMessagesMarkedAsSeen(this.$request.getMessages());
        } else {
            access$allMessagesMarkedAsSeen = this.$request.getMessages();
        }
        str = this.this$0.isFromUser(str, (Message) C19301m.h(access$allMessagesMarkedAsSeen)) | component3;
        str = Completable.b(new Completable[]{this.this$0.messageRepository.addMessages(access$allMessagesMarkedAsSeen), this.this$0.matchRepository.updateTouchAndLastActivityDate(component1, component2, str)});
        C2668g.a(str, "rx.Completable.concat(\n …      )\n                )");
        return RxJavaInteropExtKt.toV2Completable(str);
    }
}
