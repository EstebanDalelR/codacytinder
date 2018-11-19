package com.tinder.match.navigation;

import com.tinder.match.provider.C9879g.C9878a;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class MatchTabSubscreenTracker$observe$2 extends PropertyReference1 {
    /* renamed from: a */
    public static final KProperty1 f45345a = new MatchTabSubscreenTracker$observe$2();

    MatchTabSubscreenTracker$observe$2() {
    }

    public String getName() {
        return "matchTabsPage";
    }

    public KDeclarationContainer getOwner() {
        return C15825i.a(C9878a.class);
    }

    public String getSignature() {
        return "getMatchTabsPage()Lcom/tinder/match/viewmodel/MatchTabsPage;";
    }

    @Nullable
    public Object get(@Nullable Object obj) {
        return ((C9878a) obj).m40640a();
    }
}
