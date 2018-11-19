package com.tinder.places.settings.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.settings.target.PlacesSurveyOtherTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/settings/presenter/PlacesSurveyOtherPresenter;", "", "addPlacesManageEnabledEvent", "Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;", "(Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;)V", "target", "Lcom/tinder/places/settings/target/PlacesSurveyOtherTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/settings/target/PlacesSurveyOtherTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/settings/target/PlacesSurveyOtherTarget;)V", "selectCustomReason", "", "customReason", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.settings.presenter.h */
public final class C14321h {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesSurveyOtherTarget f45489a;
    /* renamed from: b */
    private final AddPlacesManageEnabledEvent f45490b;

    @Inject
    public C14321h(@NotNull AddPlacesManageEnabledEvent addPlacesManageEnabledEvent) {
        C2668g.b(addPlacesManageEnabledEvent, "addPlacesManageEnabledEvent");
        this.f45490b = addPlacesManageEnabledEvent;
    }

    /* renamed from: a */
    public final void m54639a(@Nullable String str) {
        if (str != null) {
            this.f45490b.a(str);
            str = this.f45489a;
            if (str == null) {
                C2668g.b("target");
            }
            str.onCustomReasonSuccess();
        }
    }
}
