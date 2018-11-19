package com.tinder.settings.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.tinder.R;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AccountDeleteVariant;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.profile.usecase.SetDiscoverability;
import com.tinder.settings.analytics.TrackExitSurveyEvent;
import com.tinder.settings.analytics.TrackExitSurveyEvent.Action;
import com.tinder.settings.analytics.TrackExitSurveyEvent.C14862a;
import com.tinder.settings.analytics.TrackExitSurveyEvent.C14862a.C14861a;
import com.tinder.settings.analytics.TrackExitSurveyEvent.EventCode;
import com.tinder.settings.model.ExitSurveyDetailsMode;
import com.tinder.settings.model.ExitSurveyReason;
import com.tinder.settings.p404b.C14864a;
import com.tinder.settings.presenter.ExitSurveyBasePresenter.DialogType;
import com.tinder.settings.targets.ExitSurveyTarget;
import com.tinder.settings.views.DeleteConfirmDialog.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;

/* renamed from: com.tinder.settings.presenter.i */
public class C16653i extends ExitSurveyBasePresenter {
    @DeadshotTarget
    /* renamed from: e */
    ExitSurveyTarget f51569e;
    @NonNull
    /* renamed from: f */
    private List<ExitSurveyReason> f51570f = new ArrayList();
    /* renamed from: g */
    private List<ExitSurveyReason> f51571g;

    @Inject
    public C16653i(TrackExitSurveyEvent trackExitSurveyEvent, SetDiscoverability setDiscoverability, C14864a c14864a, AbTestUtility abTestUtility) {
        this.a = trackExitSurveyEvent;
        this.b = setDiscoverability;
        this.d = abTestUtility;
        this.c = c14864a;
    }

    /* renamed from: h */
    public void mo12304h() {
        m62132l();
        if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY || this.d.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
            m62142j();
            if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY) {
                this.f51569e.setToolbarText(R.string.pause_account);
                this.f51569e.setTitleText(R.string.pause_confirmation);
            } else if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
                this.f51569e.setToolbarText(R.string.deactivate_account);
                this.f51569e.setTitleText(R.string.deactivate_confirmation);
            }
        }
    }

    /* renamed from: i */
    public void m62141i() {
        m56348a(new C14861a(EventCode.DEACTIVATE_INTRO, Action.SUBMIT).m56246a());
        m62142j();
    }

    @VisibleForTesting
    /* renamed from: j */
    void m62142j() {
        for (ExitSurveyReason exitSurveyReason : ExitSurveyReason.values()) {
            if (!(exitSurveyReason == ExitSurveyReason.OTHER || exitSurveyReason == ExitSurveyReason.JUST_DELETE)) {
                this.f51570f.add(exitSurveyReason);
            }
        }
        this.f51571g = new ArrayList(this.f51570f);
        Collections.shuffle(this.f51571g);
        this.f51571g.add(ExitSurveyReason.OTHER);
        this.f51570f.add(ExitSurveyReason.OTHER);
        StreamSupport.m59708a(this.f51571g).filter(C16654j.f51572a).findFirst().m59125a(C16655k.f51573a);
        m62134n().showReasons(this.f51571g);
        m62133m();
    }

    /* renamed from: c */
    static final /* synthetic */ boolean m62130c(ExitSurveyReason exitSurveyReason) {
        return exitSurveyReason == ExitSurveyReason.SOMETHING_BROKEN ? true : null;
    }

    /* renamed from: a */
    public void m62136a(@NonNull ExitSurveyReason exitSurveyReason) {
        m62131d(exitSurveyReason);
        if (exitSurveyReason == ExitSurveyReason.SOMETHING_BROKEN) {
            m62134n().navigateToDetailsScreen(ExitSurveyDetailsMode.FEEDBACK);
        } else if (exitSurveyReason == ExitSurveyReason.DONT_LIKE) {
            m62134n().navigateToDetailsScreen(ExitSurveyDetailsMode.DISLIKE);
        } else if (exitSurveyReason == ExitSurveyReason.OTHER) {
            m62134n().navigateToDetailsScreen(ExitSurveyDetailsMode.OTHER);
        } else if (exitSurveyReason == ExitSurveyReason.MET_SOMEONE) {
            if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY) {
                m62134n().showPauseDialog(R.string.pause_account);
            } else if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
                m62134n().showPauseDialog(R.string.deactivate_account);
            } else {
                m62134n().showConfirmDialog(Type.MET_SOMEONE);
            }
            m56356c((DialogType) m56360f());
        } else if (exitSurveyReason == ExitSurveyReason.FRESH_START) {
            m62134n().navigateToDetailsScreen(ExitSurveyDetailsMode.FRESH_START);
        } else {
            if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY) {
                m62134n().showPauseDialog(R.string.pause_account);
            } else if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
                m62134n().showPauseDialog(R.string.deactivate_account);
            } else {
                m62134n().showConfirmDialog(Type.OTHER);
            }
            m56356c((DialogType) m56360f());
        }
    }

    /* renamed from: k */
    public void m62143k() {
        m56347a(EventCode.ASK_REASONS);
        m62134n().closeView(3);
    }

    /* renamed from: l */
    private void m62132l() {
        m56348a(new C14861a(EventCode.INITIATE_DELETE, Action.SUBMIT).m56246a());
        m56348a(new C14861a(EventCode.DEACTIVATE_INTRO, Action.VIEW).m56246a());
    }

    /* renamed from: d */
    private void m62131d(ExitSurveyReason exitSurveyReason) {
        m56348a((C14862a) new C14861a(EventCode.ASK_REASONS, Action.SUBMIT).m56242a(exitSurveyReason).m56245a(this.f51570f).m56249b(this.f51571g).m56246a());
    }

    /* renamed from: m */
    private void m62133m() {
        m56348a(new C14861a(EventCode.ASK_REASONS, Action.VIEW).m56245a(this.f51570f).m56249b(this.f51571g).m56246a());
    }

    /* renamed from: n */
    private ExitSurveyTarget m62134n() {
        return this.f51569e;
    }

    /* renamed from: a */
    void mo12300a() {
        m62134n().closeView(1);
    }

    /* renamed from: b */
    void mo12301b() {
        m62134n().closeView(2);
    }

    /* renamed from: c */
    void mo12302c() {
        m62134n().showAccountHideFailed();
    }

    /* renamed from: d */
    void mo12303d() {
        m62134n().showPauseDialog(R.string.pause_account);
    }
}
