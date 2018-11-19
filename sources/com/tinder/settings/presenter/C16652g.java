package com.tinder.settings.presenter;

import android.support.annotation.NonNull;
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
import com.tinder.settings.model.ExitSurveyDetailReason;
import com.tinder.settings.model.ExitSurveyDetailsMode;
import com.tinder.settings.model.ExitSurveyDislikeReason;
import com.tinder.settings.model.ExitSurveyFeedbackReason;
import com.tinder.settings.model.ExitSurveyFreshStartReason;
import com.tinder.settings.p404b.C14864a;
import com.tinder.settings.presenter.ExitSurveyBasePresenter.DialogType;
import com.tinder.settings.targets.ExitSurveyFeedbackTarget;
import com.tinder.settings.views.DeleteConfirmDialog.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;

/* renamed from: com.tinder.settings.presenter.g */
public class C16652g extends ExitSurveyBasePresenter {
    /* renamed from: h */
    private static final List<ExitSurveyFeedbackReason> f51561h = Arrays.asList(new ExitSurveyFeedbackReason[]{ExitSurveyFeedbackReason.APP_CRASHES, ExitSurveyFeedbackReason.MATCHES_GONE, ExitSurveyFeedbackReason.NO_MATCHES, ExitSurveyFeedbackReason.NOBODY_TO_SWIPE, ExitSurveyFeedbackReason.REPEAT_PEOPLE});
    /* renamed from: i */
    private static final List<ExitSurveyDislikeReason> f51562i = Arrays.asList(new ExitSurveyDislikeReason[]{ExitSurveyDislikeReason.NOBODY_TO_SWIPE, ExitSurveyDislikeReason.NO_MATCHES, ExitSurveyDislikeReason.PREFER_OTHER_APPS, ExitSurveyDislikeReason.NOT_MET_ANYBODY, ExitSurveyDislikeReason.APP_CRASHES, ExitSurveyDislikeReason.POOR_EXPERIENCE});
    /* renamed from: j */
    private static final List<ExitSurveyFreshStartReason> f51563j = Arrays.asList(new ExitSurveyFreshStartReason[]{ExitSurveyFreshStartReason.NOBODY_TO_SWIPE, ExitSurveyFreshStartReason.NO_MATCHES, ExitSurveyFreshStartReason.RESET_MATCHES, ExitSurveyFreshStartReason.INFO_SYNC});
    @DeadshotTarget
    /* renamed from: e */
    ExitSurveyFeedbackTarget f51564e;
    /* renamed from: f */
    private Set<ExitSurveyDetailReason> f51565f = new HashSet();
    /* renamed from: g */
    private String f51566g = "";
    /* renamed from: k */
    private List<ExitSurveyDetailReason> f51567k;
    /* renamed from: l */
    private ExitSurveyDetailsMode f51568l;

    @Inject
    public C16652g(@NonNull TrackExitSurveyEvent trackExitSurveyEvent, @NonNull SetDiscoverability setDiscoverability, @NonNull C14864a c14864a, @NonNull AbTestUtility abTestUtility) {
        this.a = trackExitSurveyEvent;
        this.b = setDiscoverability;
        this.c = c14864a;
        this.d = abTestUtility;
    }

    /* renamed from: a */
    public void m62122a(@NonNull ExitSurveyDetailsMode exitSurveyDetailsMode) {
        this.f51568l = exitSurveyDetailsMode;
        if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY) {
            this.f51564e.setTitleText(R.string.pause_account);
            this.f51564e.setSubtitleText(R.string.why_are_you_pausing);
            this.f51564e.setConfirmButtonText(R.string.submit_feedback_and_pause);
        } else if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
            this.f51564e.setTitleText(R.string.deactivate_account);
            this.f51564e.setSubtitleText(R.string.why_are_you_deactivating);
            this.f51564e.setConfirmButtonText(R.string.submit_feedback_and_deactivate);
        }
        if (exitSurveyDetailsMode == ExitSurveyDetailsMode.DISLIKE) {
            this.f51564e.showTextInputField(false);
            this.f51564e.setTextInputTitle(R.string.tell_us_more);
        } else if (exitSurveyDetailsMode == ExitSurveyDetailsMode.FRESH_START) {
            this.f51564e.showTextInputField(false);
            this.f51564e.setTitleText(R.string.fresh_start);
            this.f51564e.setSubtitleText(R.string.fresh_start_subtitle);
        } else {
            this.f51564e.showTextInputField(true);
            this.f51564e.setTextInputTitle(R.string.other);
        }
        if (exitSurveyDetailsMode == ExitSurveyDetailsMode.OTHER) {
            this.f51564e.hideReasons();
        } else {
            if (exitSurveyDetailsMode == ExitSurveyDetailsMode.FEEDBACK) {
                this.f51567k = new ArrayList(f51561h);
            } else if (exitSurveyDetailsMode == ExitSurveyDetailsMode.DISLIKE) {
                this.f51567k = new ArrayList(f51562i);
            } else if (exitSurveyDetailsMode == ExitSurveyDetailsMode.FRESH_START) {
                this.f51567k = new ArrayList(f51563j);
            }
            Collections.shuffle(this.f51567k);
            m62118j().showReasons(this.f51567k);
        }
        m62119k();
        m62117i();
    }

    /* renamed from: a */
    public void m62121a(ExitSurveyDetailReason exitSurveyDetailReason, boolean z) {
        if (exitSurveyDetailReason == ExitSurveyDislikeReason.POOR_EXPERIENCE) {
            this.f51564e.showTextInputField(z);
        }
        if (z) {
            this.f51565f.add(exitSurveyDetailReason);
        } else {
            this.f51565f.remove(exitSurveyDetailReason);
        }
        m62117i();
    }

    /* renamed from: a */
    public void m62124a(@NonNull String str) {
        m62116b(str);
        if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY) {
            m62118j().showPauseDialog(R.string.pause_account);
        } else if (this.d.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
            m62118j().showPauseDialog(R.string.deactivate_account);
        } else {
            m62118j().showConfirmDialog(Type.FEEDBACK);
        }
        m56356c((DialogType) m56360f());
    }

    /* renamed from: a */
    public void m62123a(@NonNull CharSequence charSequence) {
        this.f51566g = charSequence.toString();
        m62117i();
    }

    /* renamed from: h */
    public void mo12304h() {
        m56347a(EventCode.ASK_FEEDBACK);
        m62118j().closeView(3);
    }

    /* renamed from: i */
    private void m62117i() {
        Object obj = 1;
        if (this.f51568l != ExitSurveyDetailsMode.FRESH_START) {
            if (this.f51565f.size() <= 0) {
                if (this.f51566g.length() <= 0) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            m62118j().enableSubmitButton();
        } else {
            m62118j().disableSubmitButton();
        }
    }

    /* renamed from: j */
    private ExitSurveyFeedbackTarget m62118j() {
        return this.f51564e;
    }

    /* renamed from: k */
    private void m62119k() {
        C14862a a = this.f51568l == ExitSurveyDetailsMode.FEEDBACK ? new C14861a(EventCode.BUG_OPTIONS, Action.VIEW).m56252c(f51561h).m56253d(this.f51567k).m56246a() : this.f51568l == ExitSurveyDetailsMode.DISLIKE ? new C14861a(EventCode.DISLIKE_OPTIONS, Action.VIEW).m56254e(f51562i).m56255f(this.f51567k).m56246a() : this.f51568l == ExitSurveyDetailsMode.FRESH_START ? new C14861a(EventCode.FRESH_START_OPTIONS, Action.VIEW).m56256g(f51563j).m56257h(this.f51567k).m56246a() : this.f51568l == ExitSurveyDetailsMode.OTHER ? new C14861a(EventCode.OTHER_FEEDBACK, Action.VIEW).m56246a() : null;
        if (a != null) {
            m56348a(a);
        }
    }

    /* renamed from: b */
    private void m62116b(@NonNull String str) {
        str = this.f51568l == ExitSurveyDetailsMode.FEEDBACK ? new C14861a(EventCode.BUG_OPTIONS, Action.SUBMIT).m56247b(str).m56244a(this.f51565f).m56246a() : this.f51568l == ExitSurveyDetailsMode.DISLIKE ? new C14861a(EventCode.DISLIKE_OPTIONS, Action.SUBMIT).m56250c(str).m56248b(this.f51565f).m56246a() : this.f51568l == ExitSurveyDetailsMode.FRESH_START ? new C14861a(EventCode.FRESH_START_OPTIONS, Action.SUBMIT).m56251c(this.f51565f).m56246a() : this.f51568l == ExitSurveyDetailsMode.OTHER ? new C14861a(EventCode.OTHER_FEEDBACK, Action.SUBMIT).m56243a(str).m56246a() : null;
        if (str != null) {
            m56348a((C14862a) str);
        }
    }

    /* renamed from: a */
    void mo12300a() {
        m62118j().closeView(1);
    }

    /* renamed from: b */
    void mo12301b() {
        m62118j().closeView(2);
    }

    /* renamed from: c */
    void mo12302c() {
        m62118j().showAccountHideFailed();
    }

    /* renamed from: d */
    void mo12303d() {
        m62118j().showPauseDialog(R.string.pause_account);
    }
}
