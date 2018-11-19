package com.tinder.feed.p341b;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.feed.model.FeedExperimentUtility;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "Lcom/tinder/domain/feed/model/FeedExperimentUtility;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "feedEnabled", "", "getFeedEnabled", "()Z", "feedMatchSubtabsEnabled", "getFeedMatchSubtabsEnabled", "feedMessagesEnabled", "getFeedMessagesEnabled", "feedSettingsEnabled", "getFeedSettingsEnabled", "feedTopLevelNavEnabled", "getFeedTopLevelNavEnabled", "profileAddLoopEnabled", "getProfileAddLoopEnabled", "profileChangeBioEnabled", "getProfileChangeBioEnabled", "profileChangeSchoolEnabled", "getProfileChangeSchoolEnabled", "profileChangeWorkEnabled", "getProfileChangeWorkEnabled", "spotifyEnabled", "getSpotifyEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.b.a */
public final class C11695a implements FeedExperimentUtility {
    /* renamed from: a */
    private final boolean f38198a;
    /* renamed from: b */
    private final boolean f38199b;
    /* renamed from: c */
    private final boolean f38200c;
    /* renamed from: d */
    private final boolean f38201d;
    /* renamed from: e */
    private final boolean f38202e;
    /* renamed from: f */
    private final boolean f38203f;
    /* renamed from: g */
    private final boolean f38204g;
    /* renamed from: h */
    private final boolean f38205h;
    /* renamed from: i */
    private final boolean f38206i;
    /* renamed from: j */
    private final boolean f38207j;

    @Inject
    public C11695a(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f38198a = abTestUtility.activityMessagesEnabled();
        boolean z = false;
        boolean z2 = this.f38198a && abTestUtility.activityFeedEnabled();
        this.f38199b = z2;
        z2 = this.f38199b && abTestUtility.activityFeedSettingEnabled();
        this.f38200c = z2;
        z2 = this.f38199b && abTestUtility.feedTopLevelNavEnabled();
        this.f38201d = z2;
        z2 = this.f38199b && !this.f38201d;
        this.f38202e = z2;
        this.f38203f = abTestUtility.isFeedProfileChangeBioEnabled();
        this.f38204g = abTestUtility.isFeedProfileChangeWorkEnabled();
        this.f38205h = abTestUtility.isFeedProfileChangeSchoolEnabled();
        if (abTestUtility.loopsEnabled() && abTestUtility.loopsFeedEnabled()) {
            z = true;
        }
        this.f38206i = z;
        this.f38207j = abTestUtility.isSpotifyEnabled();
    }

    /* renamed from: a */
    public final boolean m47522a() {
        return this.f38198a;
    }

    /* renamed from: b */
    public final boolean m47523b() {
        return this.f38199b;
    }

    /* renamed from: c */
    public final boolean m47524c() {
        return this.f38200c;
    }

    /* renamed from: d */
    public final boolean m47525d() {
        return this.f38201d;
    }

    /* renamed from: e */
    public final boolean m47526e() {
        return this.f38202e;
    }

    public boolean getProfileChangeBioEnabled() {
        return this.f38203f;
    }

    public boolean getProfileChangeWorkEnabled() {
        return this.f38204g;
    }

    public boolean getProfileChangeSchoolEnabled() {
        return this.f38205h;
    }

    public boolean getProfileAddLoopEnabled() {
        return this.f38206i;
    }

    public boolean getSpotifyEnabled() {
        return this.f38207j;
    }
}
