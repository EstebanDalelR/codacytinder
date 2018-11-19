package com.tinder.data.feed;

import com.tinder.domain.feed.model.FeedExperimentUtility;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/feed/FeedEventTypeMaskProvider;", "", "feedExperimentUtility", "Lcom/tinder/domain/feed/model/FeedExperimentUtility;", "(Lcom/tinder/domain/feed/model/FeedExperimentUtility;)V", "mask", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.k */
public final class C8660k {
    /* renamed from: a */
    private final FeedExperimentUtility f30511a;

    @Inject
    public C8660k(@NotNull FeedExperimentUtility feedExperimentUtility) {
        C2668g.b(feedExperimentUtility, "feedExperimentUtility");
        this.f30511a = feedExperimentUtility;
    }

    /* renamed from: a */
    public final long m36932a() {
        long j = 0;
        for (FeedEventBitMask feedEventBitMask : FeedEventBitMask.values()) {
            boolean z;
            switch (C8661l.f30512a[feedEventBitMask.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    z = true;
                    break;
                case 5:
                case 6:
                    z = this.f30511a.getSpotifyEnabled();
                    break;
                case 7:
                    z = this.f30511a.getProfileChangeBioEnabled();
                    break;
                case 8:
                    z = this.f30511a.getProfileChangeWorkEnabled();
                    break;
                case 9:
                    z = this.f30511a.getProfileChangeSchoolEnabled();
                    break;
                case 10:
                    z = this.f30511a.getProfileAddLoopEnabled();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (z) {
                j |= feedEventBitMask.getBitMask();
            }
        }
        return j;
    }
}
