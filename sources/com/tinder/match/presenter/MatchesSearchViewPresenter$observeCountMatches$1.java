package com.tinder.match.presenter;

import com.tinder.match.target.MatchesSearchViewTarget;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "totalMatchCount", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchesSearchViewPresenter$observeCountMatches$1 extends FunctionReference implements Function1<Long, C15813i> {
    MatchesSearchViewPresenter$observeCountMatches$1(MatchesSearchViewTarget matchesSearchViewTarget) {
        super(1, matchesSearchViewTarget);
    }

    public final String getName() {
        return "updateSearchQueryHint";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(MatchesSearchViewTarget.class);
    }

    public final String getSignature() {
        return "updateSearchQueryHint(J)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m54433a(((Number) obj).longValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m54433a(long j) {
        ((MatchesSearchViewTarget) this.receiver).updateSearchQueryHint(j);
    }
}
