package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qm;
import com.tinder.etl.event.qm.C9204a;
import com.tinder.places.settings.presenter.PlacesDisabledSurveyPresenter.Reason;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0011J\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "add", "", "placesEnabled", "", "reasonSelected", "", "customReason", "", "source", "Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent$Source;", "disablePlacesWithCustomReason", "disablePlacesWithReason", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "error", "errorCode", "", "(Ljava/lang/Integer;Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent$Source;)V", "setEnabled", "Source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddPlacesManageEnabledEvent {
    /* renamed from: a */
    private final C2630h f33073a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent$Source;", "", "(Ljava/lang/String;I)V", "SETTINGS", "PLACES_DISABLED", "ONBOARDING", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesManageEnabledEvent$a */
    static final class C14133a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesManageEnabledEvent f44841a;
        /* renamed from: b */
        final /* synthetic */ boolean f44842b;
        /* renamed from: c */
        final /* synthetic */ Number f44843c;
        /* renamed from: d */
        final /* synthetic */ String f44844d;
        /* renamed from: e */
        final /* synthetic */ Source f44845e;

        C14133a(AddPlacesManageEnabledEvent addPlacesManageEnabledEvent, boolean z, Number number, String str, Source source) {
            this.f44841a = addPlacesManageEnabledEvent;
            this.f44842b = z;
            this.f44843c = number;
            this.f44844d = str;
            this.f44845e = source;
        }

        public final void call() {
            C9204a a = qm.m45912a().m38617a(Boolean.valueOf(this.f44842b)).m38621b(this.f44843c).m38619a(this.f44844d);
            String name = this.f44845e.name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            name = name.toLowerCase();
            C2668g.a(name, "(this as java.lang.String).toLowerCase()");
            this.f44841a.f33073a.a(a.m38622b(name).m38620a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesManageEnabledEvent$b */
    static final class C14134b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesManageEnabledEvent f44846a;
        /* renamed from: b */
        final /* synthetic */ Integer f44847b;
        /* renamed from: c */
        final /* synthetic */ Source f44848c;

        C14134b(AddPlacesManageEnabledEvent addPlacesManageEnabledEvent, Integer num, Source source) {
            this.f44846a = addPlacesManageEnabledEvent;
            this.f44847b = num;
            this.f44848c = source;
        }

        public final void call() {
            C9204a a = qm.m45912a().m38618a((Number) this.f44847b);
            String name = this.f44848c.name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            name = name.toLowerCase();
            C2668g.a(name, "(this as java.lang.String).toLowerCase()");
            this.f44846a.f33073a.a(a.m38622b(name).m38620a());
        }
    }

    @Inject
    public AddPlacesManageEnabledEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33073a = c2630h;
    }

    /* renamed from: a */
    public final void m41305a(@NotNull Reason reason) {
        C2668g.b(reason, "reasonSelected");
        m41304a(false, Integer.valueOf(reason.getReasonCode()), null, Source.SETTINGS);
    }

    /* renamed from: a */
    public final void m41307a(@NotNull String str) {
        C2668g.b(str, "customReason");
        m41304a(false, Integer.valueOf(Reason.OTHER.getReasonCode()), str, Source.SETTINGS);
    }

    /* renamed from: a */
    public final void m41308a(boolean z, @NotNull Source source) {
        C2668g.b(source, "source");
        m41304a(z, null, null, source);
    }

    /* renamed from: a */
    private final void m41304a(boolean z, Number number, String str, Source source) {
        Completable.a(new C14133a(this, z, number, str, source)).b(RxUtils.a("AddPlacesManageEnabledEvent failed"));
    }

    /* renamed from: a */
    public final void m41306a(@Nullable Integer num, @NotNull Source source) {
        C2668g.b(source, "source");
        Completable.a(new C14134b(this, num, source)).b(RxUtils.a("AddPlacesManageEnabledEvent failed"));
    }
}
