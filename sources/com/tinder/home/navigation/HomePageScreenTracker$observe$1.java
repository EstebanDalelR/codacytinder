package com.tinder.home.navigation;

import com.tinder.common.navigation.Screen;
import com.tinder.main.model.MainPage;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/tinder/common/navigation/Screen;", "p1", "Lcom/tinder/main/model/MainPage;", "Lkotlin/ParameterName;", "name", "homePage", "invoke"}, k = 3, mv = {1, 1, 10})
final class HomePageScreenTracker$observe$1 extends FunctionReference implements Function1<MainPage, C3959e<Screen>> {
    HomePageScreenTracker$observe$1(C9703a c9703a) {
        super(1, c9703a);
    }

    public final String getName() {
        return "mapHomePageToScreen";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C9703a.class);
    }

    public final String getSignature() {
        return "mapHomePageToScreen(Lcom/tinder/main/model/MainPage;)Lio/reactivex/Observable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54425a((MainPage) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Screen> m54425a(@NotNull MainPage mainPage) {
        C2668g.b(mainPage, "p1");
        return ((C9703a) this.receiver).m40165a(mainPage);
    }
}
