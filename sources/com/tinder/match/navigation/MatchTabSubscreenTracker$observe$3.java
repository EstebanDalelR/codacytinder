package com.tinder.match.navigation;

import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.match.p291b.C12042a;
import com.tinder.match.viewmodel.MatchTabsPage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "p1", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "Lkotlin/ParameterName;", "name", "matchTabsPage", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchTabSubscreenTracker$observe$3 extends FunctionReference implements Function1<MatchTabsPage, Subscreen> {
    MatchTabSubscreenTracker$observe$3(C12042a c12042a) {
        super(1, c12042a);
    }

    public final String getName() {
        return "map";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C12042a.class);
    }

    public final String getSignature() {
        return "map(Lcom/tinder/match/viewmodel/MatchTabsPage;)Lcom/tinder/common/navigation/Screen$Matches$Subscreen;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54432a((MatchTabsPage) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Subscreen m54432a(@NotNull MatchTabsPage matchTabsPage) {
        C2668g.b(matchTabsPage, "p1");
        return ((C12042a) this.receiver).m48143a(matchTabsPage);
    }
}
