package com.tinder.feed.usecase;

import com.tinder.common.navigation.Screen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/common/navigation/Screen;", "Lkotlin/ParameterName;", "name", "screen", "invoke"}, k = 3, mv = {1, 1, 10})
final class ObserveFeedVisible$observe$1 extends FunctionReference implements Function1<Screen, Boolean> {
    ObserveFeedVisible$observe$1(C11707c c11707c) {
        super(1, c11707c);
    }

    public final String getName() {
        return "mapToFeedVisible";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C11707c.class);
    }

    public final String getSignature() {
        return "mapToFeedVisible(Lcom/tinder/common/navigation/Screen;)Z";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m54419a((Screen) obj));
    }

    /* renamed from: a */
    public final boolean m54419a(@NotNull Screen screen) {
        C2668g.b(screen, "p1");
        return ((C11707c) this.receiver).m47533a(screen);
    }
}
