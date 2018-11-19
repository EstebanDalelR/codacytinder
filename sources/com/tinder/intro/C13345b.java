package com.tinder.intro;

import com.tinder.R;
import com.tinder.auth.interactor.C10333h;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.presenters.PresenterBase;
import javax.inject.Inject;

/* renamed from: com.tinder.intro.b */
public final class C13345b extends PresenterBase<IntroTarget> {
    /* renamed from: a */
    private final C10333h f42341a;
    /* renamed from: b */
    private final AbTestUtility f42342b;
    /* renamed from: c */
    private boolean f42343c;

    @Inject
    public C13345b(C10333h c10333h, AbTestUtility abTestUtility) {
        this.f42341a = c10333h;
        this.f42342b = abTestUtility;
    }

    /* renamed from: b */
    public void m51633b() {
        if (!this.f42342b.newNewExperiment().m36696e()) {
            IntroTarget introTarget = (IntroTarget) H();
            introTarget.setupPagerAdapter();
            introTarget.setUpPagerIndicator(R.color.tinder_red, R.color.tinder_gray);
        }
    }

    /* renamed from: a */
    public void m51632a(int i) {
        this.f42341a.m42139c(i);
    }

    /* renamed from: c */
    public void m51634c() {
        if (!this.f42342b.newNewExperiment().m36696e()) {
            a(C14045c.f44475a);
        }
        this.f42341a.m42124a();
        this.f42343c = true;
    }

    /* renamed from: a */
    static final /* synthetic */ void m51631a(IntroTarget introTarget) {
        introTarget.showFBDisclaimerContent();
        introTarget.showDisclaimerDismissButton();
    }

    /* renamed from: d */
    public void m51635d() {
        IntroTarget introTarget = (IntroTarget) H();
        introTarget.showViewPager();
        introTarget.hideDisclaimerContent();
        introTarget.showDisclaimerText();
        this.f42343c = false;
    }

    /* renamed from: e */
    public boolean m51636e() {
        if (this.f42342b.newNewExperiment().m36696e() || !this.f42343c) {
            return false;
        }
        m51635d();
        return true;
    }
}
