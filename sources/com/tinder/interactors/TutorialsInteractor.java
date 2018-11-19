package com.tinder.interactors;

import com.tinder.api.ManagerWebServices;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.profile.model.Tutorial.BitmojiIntro;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bk;
import com.tinder.model.UserMeta;
import javax.inject.Inject;

public class TutorialsInteractor {
    /* renamed from: a */
    private final AbTestUtility f32289a;
    /* renamed from: b */
    private final UserMetaManager f32290b;
    /* renamed from: c */
    private final bk f32291c;
    /* renamed from: d */
    private final FastMatchConfigProvider f32292d;
    /* renamed from: e */
    private final CheckTutorialViewed f32293e;

    public enum IntroTutorialType {
        FAST_MATCH(ManagerWebServices.PARAM_TUTORIAL_FAST_MATCH),
        REACTIONS_INTRO(ManagerWebServices.PARAM_TUTORIAL_REACTIONS_INTRO),
        BITMOJI_INTRO("unused_param"),
        UNKNOWN("");
        
        private String mTutorialName;

        private IntroTutorialType(String str) {
            this.mTutorialName = str;
        }

        public String getTutorialName() {
            return this.mTutorialName;
        }
    }

    @Inject
    public TutorialsInteractor(AbTestUtility abTestUtility, UserMetaManager userMetaManager, bk bkVar, FastMatchConfigProvider fastMatchConfigProvider, CheckTutorialViewed checkTutorialViewed) {
        this.f32289a = abTestUtility;
        this.f32290b = userMetaManager;
        this.f32291c = bkVar;
        this.f32292d = fastMatchConfigProvider;
        this.f32293e = checkTutorialViewed;
    }

    /* renamed from: a */
    public boolean m40175a() {
        if (this.f32290b.getMetaUser() == null || !m40174a(ManagerWebServices.PARAM_TUTORIAL_FAST_MATCH) || this.f32291c.ad()) {
            return true;
        }
        this.f32291c.F(false);
        return false;
    }

    /* renamed from: b */
    public boolean m40176b() {
        if (this.f32290b.getMetaUser() == null || !m40174a(ManagerWebServices.PARAM_TUTORIAL_REACTIONS_INTRO) || this.f32291c.ae()) {
            return true;
        }
        this.f32291c.G(false);
        return false;
    }

    /* renamed from: c */
    public boolean m40177c() {
        return ((Boolean) this.f32293e.execute(BitmojiIntro.INSTANCE).e(C11870o.f38707a).a()).booleanValue();
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m40173a(TutorialViewStatus tutorialViewStatus) throws Exception {
        return Boolean.valueOf(tutorialViewStatus == TutorialViewStatus.VIEWED ? true : null);
    }

    /* renamed from: d */
    public boolean m40178d() {
        if (this.f32289a.isGrandGesturesEnabled() && (!this.f32292d.get().isEnabled() || m40175a())) {
            if (!m40176b()) {
                return m40174a(ManagerWebServices.PARAM_TUTORIAL_REACTIONS_INTRO);
            }
        }
        return false;
    }

    /* renamed from: e */
    public IntroTutorialType m40179e() {
        if (this.f32292d.get().isEnabled() && !this.f32291c.ad() && m40174a(IntroTutorialType.FAST_MATCH.getTutorialName())) {
            return IntroTutorialType.FAST_MATCH;
        }
        if (this.f32289a.isBitmojiEnabled() && !m40177c()) {
            return IntroTutorialType.BITMOJI_INTRO;
        }
        if (this.f32289a.isBitmojiEnabled() || !this.f32289a.isGrandGesturesEnabled() || this.f32291c.ae() || !m40174a(IntroTutorialType.REACTIONS_INTRO.getTutorialName())) {
            return IntroTutorialType.UNKNOWN;
        }
        return IntroTutorialType.REACTIONS_INTRO;
    }

    /* renamed from: a */
    private boolean m40174a(String str) {
        UserMeta metaUser = this.f32290b.getMetaUser();
        if (metaUser == null) {
            return null;
        }
        return metaUser.getTutorials().contains(str);
    }
}
