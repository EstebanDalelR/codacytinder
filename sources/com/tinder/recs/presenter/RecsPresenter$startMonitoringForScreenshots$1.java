package com.tinder.recs.presenter;

import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import io.reactivex.functions.BiFunction;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "screen", "Lcom/tinder/common/navigation/Screen;", "apply"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$startMonitoringForScreenshots$1<T1, T2, R> implements BiFunction<C14826a, Screen, C15813i> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$startMonitoringForScreenshots$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void apply(@NotNull C14826a c14826a, @NotNull Screen screen) {
        C2668g.b(c14826a, "screenshot");
        C2668g.b(screen, "screen");
        if (this.this$0.abTestUtility.isScreenshotNotificationEnabled() && C2668g.a(screen, C10692k.f35033a)) {
            this.this$0.getTarget().sendScreenshotInAppNotification(c14826a);
        }
        if (C2668g.a(screen, C10692k.f35033a) != null) {
            this.this$0.getTarget().notifyScreenshotCaptured(c14826a instanceof C16570a);
        }
    }
}
