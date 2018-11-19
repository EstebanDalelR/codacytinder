package com.tinder.places.settings.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.settings.target.PlacesDisabledSurveyTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter;", "", "addPlacesManageEnabledEvent", "Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;", "(Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;)V", "target", "Lcom/tinder/places/settings/target/PlacesDisabledSurveyTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/settings/target/PlacesDisabledSurveyTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/settings/target/PlacesDisabledSurveyTarget;)V", "selectReason", "", "reason", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "Reason", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesDisabledSurveyPresenter {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesDisabledSurveyTarget f45467a;
    /* renamed from: b */
    private final AddPlacesManageEnabledEvent f45468b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "", "reasonCode", "", "(Ljava/lang/String;II)V", "getReasonCode", "()I", "MORE_CONTROL", "CONFUSED", "NEED_A_BREAK", "PRIVACY", "SOMETHING_BROKEN", "OTHER", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Reason {
        ;
        
        private final int reasonCode;

        protected Reason(int i) {
            this.reasonCode = i;
        }

        public final int getReasonCode() {
            return this.reasonCode;
        }
    }

    @Inject
    public PlacesDisabledSurveyPresenter(@NotNull AddPlacesManageEnabledEvent addPlacesManageEnabledEvent) {
        C2668g.b(addPlacesManageEnabledEvent, "addPlacesManageEnabledEvent");
        this.f45468b = addPlacesManageEnabledEvent;
    }

    /* renamed from: a */
    public final void m54603a(@NotNull Reason reason) {
        C2668g.b(reason, "reason");
        if (C14316a.f45469a[reason.ordinal()] != 1) {
            this.f45468b.a(reason);
            reason = this.f45467a;
            if (reason == null) {
                C2668g.b("target");
            }
            reason.onSurveySuccess();
            return;
        }
        reason = this.f45467a;
        if (reason == null) {
            C2668g.b("target");
        }
        reason.launchCustomReason();
    }
}
