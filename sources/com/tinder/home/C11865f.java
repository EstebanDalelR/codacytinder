package com.tinder.home;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.model.Tutorial.ProfileAwarenessMarker;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.main.Badgeable;
import com.tinder.main.Badgeable$Trigger;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/home/ProfileTabBadgeTrigger;", "Lcom/tinder/main/Badgeable$Trigger;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/core/experiment/AbTestUtility;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "register", "", "badgeable", "Lcom/tinder/main/Badgeable;", "unregister", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.f */
public final class C11865f implements Badgeable$Trigger {
    /* renamed from: a */
    private final C17356a f38699a = new C17356a();
    /* renamed from: b */
    private final CheckTutorialViewed f38700b;
    /* renamed from: c */
    private final AbTestUtility f38701c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "status", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.f$a */
    static final class C11864a<T> implements Consumer<TutorialViewStatus> {
        /* renamed from: a */
        final /* synthetic */ C11865f f38697a;
        /* renamed from: b */
        final /* synthetic */ Badgeable f38698b;

        C11864a(C11865f c11865f, Badgeable badgeable) {
            this.f38697a = c11865f;
            this.f38698b = badgeable;
        }

        public /* synthetic */ void accept(Object obj) {
            m47836a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final void m47836a(TutorialViewStatus tutorialViewStatus) {
            if (tutorialViewStatus != TutorialViewStatus.UNSEEN || this.f38697a.f38701c.newNewExperiment().m36692a() == null) {
                this.f38698b.hideBadge();
            } else {
                this.f38698b.showBadge();
            }
        }
    }

    @Inject
    public C11865f(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(abTestUtility, "abTestUtility");
        this.f38700b = checkTutorialViewed;
        this.f38701c = abTestUtility;
    }

    public void register(@NotNull Badgeable badgeable) {
        C2668g.b(badgeable, "badgeable");
        this.f38699a.add(this.f38700b.execute(ProfileAwarenessMarker.INSTANCE).b(C15756a.b()).a(C15674a.a()).d(new C11864a(this, badgeable)));
    }

    public void unregister() {
        this.f38699a.a();
    }
}
