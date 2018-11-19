package com.tinder.domain.message.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.usecase.InsertMessageLikes.Request;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "userId", "", "apply"}, k = 3, mv = {1, 1, 10})
final class InsertMessageLikes$execute$1<T, R> implements Function<String, CompletableSource> {
    final /* synthetic */ Request $request;
    final /* synthetic */ InsertMessageLikes this$0;

    InsertMessageLikes$execute$1(InsertMessageLikes insertMessageLikes, Request request) {
        this.this$0 = insertMessageLikes;
        this.$request = request;
    }

    public final C3956a apply(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        return C3956a.a(new CompletableSource[]{RxJavaInteropExtKt.toV2Completable(this.this$0.messageRepository.insertLikes(this.$request.getMessageLikes())), this.this$0.updateMatchTouchState(str, this.$request.getMessageLikes(), this.$request.getForceMatchTouched())});
    }
}
