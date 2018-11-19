package com.tinder.match.provider;

import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.domain.match.usecase.GetMessagesMatches;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "p1", "", "Lkotlin/ParameterName;", "name", "query", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageMatchesUpdateProvider$observe$1 extends FunctionReference implements Function1<String, Observable<MessageMatchesUpdate>> {
    MessageMatchesUpdateProvider$observe$1(GetMessagesMatches getMessagesMatches) {
        super(1, getMessagesMatches);
    }

    public final String getName() {
        return "execute";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(GetMessagesMatches.class);
    }

    public final String getSignature() {
        return "execute(Ljava/lang/String;)Lrx/Observable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54434a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Observable<MessageMatchesUpdate> m54434a(@NotNull String str) {
        C2668g.b(str, "p1");
        return ((GetMessagesMatches) this.receiver).execute(str);
    }
}
