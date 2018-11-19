package com.tinder.recs.presenter;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedExpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Loading;
import com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;
import com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;
import com.tinder.domain.recs.model.RecsLoadingStatus.RetryingUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import com.tinder.recs.model.RecsStatusMessageViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\nH\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/recs/presenter/RecsStatusMessageResolver;", "", "resources", "Landroid/content/res/Resources;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Landroid/content/res/Resources;Lcom/tinder/core/experiment/AbTestUtility;)V", "createNoOneAroundMessage", "Lcom/tinder/recs/presenter/RecsStatusMessageResolver$ResultViewModel;", "ageAndDistanceWithinLimit", "", "createResultViewModelForAnyMessageId", "viewShouldAnimate", "loadingMessage", "", "createViewModeFromMessageId", "messageId", "", "resolveMessage", "recsStatusMessageViewModel", "Lcom/tinder/recs/model/RecsStatusMessageViewModel;", "ResultViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsStatusMessageResolver {
    private final AbTestUtility abTestUtility;
    private final Resources resources;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/recs/presenter/RecsStatusMessageResolver$ResultViewModel;", "", "loadingMessage", "", "viewShouldAnimate", "", "(Ljava/lang/String;Z)V", "getLoadingMessage", "()Ljava/lang/String;", "getViewShouldAnimate", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class ResultViewModel {
        @NotNull
        private final String loadingMessage;
        private final boolean viewShouldAnimate;

        @NotNull
        public static /* synthetic */ ResultViewModel copy$default(ResultViewModel resultViewModel, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resultViewModel.loadingMessage;
            }
            if ((i & 2) != 0) {
                z = resultViewModel.viewShouldAnimate;
            }
            return resultViewModel.copy(str, z);
        }

        @NotNull
        public final String component1() {
            return this.loadingMessage;
        }

        public final boolean component2() {
            return this.viewShouldAnimate;
        }

        @NotNull
        public final ResultViewModel copy(@NotNull String str, boolean z) {
            C2668g.b(str, "loadingMessage");
            return new ResultViewModel(str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ResultViewModel) {
                ResultViewModel resultViewModel = (ResultViewModel) obj;
                if (C2668g.a(this.loadingMessage, resultViewModel.loadingMessage)) {
                    if ((this.viewShouldAnimate == resultViewModel.viewShouldAnimate ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.loadingMessage;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i = this.viewShouldAnimate;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ResultViewModel(loadingMessage=");
            stringBuilder.append(this.loadingMessage);
            stringBuilder.append(", viewShouldAnimate=");
            stringBuilder.append(this.viewShouldAnimate);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public ResultViewModel(@NotNull String str, boolean z) {
            C2668g.b(str, "loadingMessage");
            this.loadingMessage = str;
            this.viewShouldAnimate = z;
        }

        @NotNull
        public final String getLoadingMessage() {
            return this.loadingMessage;
        }

        public final boolean getViewShouldAnimate() {
            return this.viewShouldAnimate;
        }
    }

    @Inject
    public RecsStatusMessageResolver(@NotNull Resources resources, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(resources, "resources");
        C2668g.b(abTestUtility, "abTestUtility");
        this.resources = resources;
        this.abTestUtility = abTestUtility;
    }

    @NotNull
    public final ResultViewModel resolveMessage(@NotNull RecsStatusMessageViewModel recsStatusMessageViewModel) {
        C2668g.b(recsStatusMessageViewModel, "recsStatusMessageViewModel");
        RecsLoadingStatus loadingStatus = recsStatusMessageViewModel.getLoadingStatus();
        if (!(loadingStatus instanceof Uninitialized)) {
            if (!(loadingStatus instanceof Loading)) {
                if (!(loadingStatus instanceof LoadingMore)) {
                    if (loadingStatus instanceof RecsAvailable) {
                        return createViewModeFromMessageId(-1, false);
                    }
                    if (!(loadingStatus instanceof NoMoreRecsDupesOnly)) {
                        if (!(loadingStatus instanceof NoMoreRecs)) {
                            if ((loadingStatus instanceof RetryingUnknownLocation) != null) {
                                return createViewModeFromMessageId(R.string.recs_status_fetching_location, true);
                            }
                            recsStatusMessageViewModel = loadingStatus instanceof FetchFailedExpectedError;
                            int i = R.string.recs_status_unknown_error;
                            if (recsStatusMessageViewModel != null) {
                                if (((FetchFailedExpectedError) loadingStatus).getContextualInfo().getCode() == 42901) {
                                    i = R.string.recs_status_recs_limited;
                                }
                                return createViewModeFromMessageId(i, false);
                            }
                            if ((loadingStatus instanceof FetchFailedUnknownLocation) == null) {
                                if ((loadingStatus instanceof FetchFailedUnexpectedError) == null) {
                                    if ((loadingStatus instanceof FetchFailedNoConnection) != null) {
                                        return createViewModeFromMessageId(R.string.recs_status_no_connection, false);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return createViewModeFromMessageId(R.string.recs_status_unknown_error, false);
                        }
                    }
                    return createNoOneAroundMessage(recsStatusMessageViewModel.getRecsLoadingStatusInfo().isAgeAndDistanceWithinLimit());
                }
            }
        }
        return createViewModeFromMessageId(R.string.recs_status_loading, true);
    }

    private final ResultViewModel createViewModeFromMessageId(int i, boolean z) {
        i = i == -1 ? "" : this.resources.getString(i);
        C2668g.a(i, "loadingMessage");
        return createResultViewModelForAnyMessageId(z, i);
    }

    private final ResultViewModel createNoOneAroundMessage(boolean z) {
        if (!this.abTestUtility.isSettingsOnRecsEnabled()) {
            return createViewModeFromMessageId(true, false);
        }
        if (z) {
            return createViewModeFromMessageId(true, false);
        }
        return createViewModeFromMessageId(true, false);
    }

    private final ResultViewModel createResultViewModelForAnyMessageId(boolean z, String str) {
        return new ResultViewModel(str, z);
    }
}
