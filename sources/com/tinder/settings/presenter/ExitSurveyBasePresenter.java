package com.tinder.settings.presenter;

import android.support.annotation.Nullable;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AccountDeleteVariant;
import com.tinder.domain.profile.usecase.SetDiscoverability;
import com.tinder.settings.analytics.TrackExitSurveyEvent;
import com.tinder.settings.analytics.TrackExitSurveyEvent.Action;
import com.tinder.settings.analytics.TrackExitSurveyEvent.C14862a;
import com.tinder.settings.analytics.TrackExitSurveyEvent.C14862a.C14861a;
import com.tinder.settings.analytics.TrackExitSurveyEvent.EventCode;
import com.tinder.settings.p404b.C14864a;
import com.tinder.utils.RxUtils;
import org.joda.time.Period;
import p000a.p001a.C0001a;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

public abstract class ExitSurveyBasePresenter {
    /* renamed from: a */
    TrackExitSurveyEvent f46578a;
    /* renamed from: b */
    SetDiscoverability f46579b;
    /* renamed from: c */
    C14864a f46580c;
    /* renamed from: d */
    AbTestUtility f46581d;

    public enum DialogType {
        DELETE_CONFIRM,
        PAUSE_CONFIRM
    }

    public enum HideSource {
        INTRO_SCREEN,
        ARE_YOU_SURE_DIALOG
    }

    /* renamed from: g */
    static final /* synthetic */ void m56344g() {
    }

    /* renamed from: a */
    abstract void mo12300a();

    /* renamed from: b */
    abstract void mo12301b();

    /* renamed from: c */
    abstract void mo12302c();

    /* renamed from: d */
    abstract void mo12303d();

    /* renamed from: a */
    public void m56349a(DialogType dialogType) {
        m56342d(dialogType);
    }

    /* renamed from: a */
    public void m56350a(HideSource hideSource) {
        if (this.f46581d.getAccountDeleteVariant() != AccountDeleteVariant.CONTROL) {
            mo12303d();
            return;
        }
        this.f46579b.execute(Boolean.valueOf(false)).a(RxUtils.a().m67520b()).a(new C18846a(this), new C18847b(this));
        m56340b(hideSource);
    }

    /* renamed from: c */
    final /* synthetic */ void m56357c(Throwable th) {
        mo12302c();
        C0001a.c(th);
    }

    /* renamed from: a */
    public void m56351a(@Nullable Period period) {
        m56341b(period);
        this.f46580c.m56284a(period).b(Schedulers.io()).a(C19397a.a()).a(new C18848c(this), new C18849d(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m56354b(Throwable th) {
        mo12302c();
        C0001a.c(th);
    }

    /* renamed from: e */
    public void m56359e() {
        mo12304h();
        mo12301b();
    }

    /* renamed from: b */
    public void m56353b(DialogType dialogType) {
        m56343e(dialogType);
    }

    /* renamed from: c */
    void m56356c(DialogType dialogType) {
        C14862a a;
        if (dialogType == DialogType.PAUSE_CONFIRM) {
            a = new C14861a(EventCode.PAUSE_CONFIRM, Action.VIEW).m56246a();
        } else {
            a = new C14861a(EventCode.ARE_YOU_SURE, Action.VIEW).m56246a();
        }
        m56348a(a);
    }

    /* renamed from: b */
    private void m56340b(HideSource hideSource) {
        if (hideSource == HideSource.ARE_YOU_SURE_DIALOG) {
            hideSource = EventCode.ARE_YOU_SURE;
        } else {
            hideSource = EventCode.DEACTIVATE_INTRO;
        }
        m56348a(new C14861a(hideSource, Action.HIDE).m56246a());
    }

    /* renamed from: h */
    private void mo12304h() {
        m56348a(new C14861a(EventCode.ARE_YOU_SURE, Action.DELETE).m56246a());
    }

    /* renamed from: b */
    private void m56341b(@Nullable Period period) {
        int i = 1;
        if (!Period.c(1).equals(period)) {
            i = Period.b(1).equals(period) ? 7 : Period.a(1).equals(period) != null ? 30 : 0;
        }
        m56348a(new C14861a(EventCode.PAUSE_CONFIRM, Action.PAUSE).m56241a(i).m56246a());
    }

    /* renamed from: d */
    private void m56342d(DialogType dialogType) {
        C14862a a;
        if (dialogType == DialogType.PAUSE_CONFIRM) {
            a = new C14861a(EventCode.PAUSE_CONFIRM, Action.CANCEL).m56246a();
        } else {
            a = new C14861a(EventCode.ARE_YOU_SURE, Action.CANCEL).m56246a();
        }
        m56348a(a);
    }

    /* renamed from: e */
    private void m56343e(DialogType dialogType) {
        C14862a a;
        if (dialogType == DialogType.PAUSE_CONFIRM) {
            a = new C14861a(EventCode.PAUSE_CONFIRM, Action.CANCEL_BACK_BUTTON).m56246a();
        } else {
            a = new C14861a(EventCode.ARE_YOU_SURE, Action.CANCEL_BACK_BUTTON).m56246a();
        }
        m56348a(a);
    }

    /* renamed from: a */
    void m56347a(EventCode eventCode) {
        m56348a(new C14861a(eventCode, Action.CANCEL_BACK_BUTTON).m56246a());
    }

    /* renamed from: a */
    void m56348a(C14862a c14862a) {
        this.f46578a.m62056a(c14862a).b(Schedulers.computation()).a(C19397a.a()).a(C18850e.f58437a, C18851f.f58438a);
    }

    /* renamed from: a */
    static final /* synthetic */ void m56339a(Throwable th) {
        C0001a.e("Error sending Account Delete event!", new Object[0]);
        C0001a.c(th);
    }

    /* renamed from: f */
    DialogType m56360f() {
        if (this.f46581d.getAccountDeleteVariant() != AccountDeleteVariant.PAUSE_ONLY) {
            if (this.f46581d.getAccountDeleteVariant() != AccountDeleteVariant.DEACTIVATE_ONLY) {
                return DialogType.DELETE_CONFIRM;
            }
        }
        return DialogType.PAUSE_CONFIRM;
    }
}
