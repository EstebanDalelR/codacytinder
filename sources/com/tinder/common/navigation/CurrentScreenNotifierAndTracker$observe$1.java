package com.tinder.common.navigation;

import com.tinder.app.AppVisibilityTracker$Visibility;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/tinder/common/navigation/Screen;", "p1", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "Lkotlin/ParameterName;", "name", "visibility", "invoke"}, k = 3, mv = {1, 1, 10})
final class CurrentScreenNotifierAndTracker$observe$1 extends FunctionReference implements Function1<AppVisibilityTracker$Visibility, C3959e<Screen>> {
    CurrentScreenNotifierAndTracker$observe$1(C10694a c10694a) {
        super(1, c10694a);
    }

    public final String getName() {
        return "mapVisibilityToScreen";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10694a.class);
    }

    public final String getSignature() {
        return "mapVisibilityToScreen(Lcom/tinder/app/AppVisibilityTracker$Visibility;)Lio/reactivex/Observable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54055a((AppVisibilityTracker$Visibility) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Screen> m54055a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        C2668g.b(appVisibilityTracker$Visibility, "p1");
        return ((C10694a) this.receiver).m43012a(appVisibilityTracker$Visibility);
    }
}
