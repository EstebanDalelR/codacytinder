package com.tinder.data.updates;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.InsertMatches;
import io.reactivex.C3956a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "p1", "", "Lcom/tinder/domain/match/model/Match;", "Lkotlin/ParameterName;", "name", "request", "invoke"}, k = 3, mv = {1, 1, 10})
final class UpdatesResponseMatchesHandler$processMatches$4 extends FunctionReference implements Function1<List<? extends Match>, C3956a> {
    UpdatesResponseMatchesHandler$processMatches$4(InsertMatches insertMatches) {
        super(1, insertMatches);
    }

    public final String getName() {
        return "execute";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(InsertMatches.class);
    }

    public final String getSignature() {
        return "execute(Ljava/util/List;)Lio/reactivex/Completable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54401a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m54401a(@NotNull List<? extends Match> list) {
        C2668g.b(list, "p1");
        return ((InsertMatches) this.receiver).execute((List) list);
    }
}
