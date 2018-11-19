package com.tinder.recs.presenter;

import com.tinder.domain.profile.model.TutorialViewStatus;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class GamepadPresenter$showBoostReminderTooltipIfNecessary$2<T> implements Consumer<TutorialViewStatus> {
    final /* synthetic */ GamepadPresenter this$0;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recs.presenter.GamepadPresenter$showBoostReminderTooltipIfNecessary$2$1 */
    static final class C163941 implements Action {
        public static final C163941 INSTANCE = new C163941();

        C163941() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recs.presenter.GamepadPresenter$showBoostReminderTooltipIfNecessary$2$2 */
    static final class C163952<T> implements Consumer<Throwable> {
        public static final C163952 INSTANCE = new C163952();

        C163952() {
        }

        public final void accept(Throwable th) {
            C0001a.b(th);
        }
    }

    GamepadPresenter$showBoostReminderTooltipIfNecessary$2(GamepadPresenter gamepadPresenter) {
        this.this$0 = gamepadPresenter;
    }

    public final void accept(TutorialViewStatus tutorialViewStatus) {
        this.this$0.getTarget$Tinder_release().showBoostReminderToolTip();
        this.this$0.addBoostReminderViewEvent.a().b(C15756a.m59010b()).a(C163941.INSTANCE, C163952.INSTANCE);
    }
}
