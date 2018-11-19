package com.tinder.recs.model;

import com.tinder.domain.recs.model.RecsLoadingStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/recs/model/RecsStatusMessageViewModel;", "", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsLoadingStatusInfo", "Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "(Lcom/tinder/domain/recs/model/RecsLoadingStatus;Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;)V", "getLoadingStatus", "()Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "getRecsLoadingStatusInfo", "()Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsStatusMessageViewModel {
    @NotNull
    private final RecsLoadingStatus loadingStatus;
    @NotNull
    private final RecsDecoratedLoadingStatusInfo recsLoadingStatusInfo;

    @NotNull
    public static /* synthetic */ RecsStatusMessageViewModel copy$default(RecsStatusMessageViewModel recsStatusMessageViewModel, RecsLoadingStatus recsLoadingStatus, RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            recsLoadingStatus = recsStatusMessageViewModel.loadingStatus;
        }
        if ((i & 2) != 0) {
            recsDecoratedLoadingStatusInfo = recsStatusMessageViewModel.recsLoadingStatusInfo;
        }
        return recsStatusMessageViewModel.copy(recsLoadingStatus, recsDecoratedLoadingStatusInfo);
    }

    @NotNull
    public final RecsLoadingStatus component1() {
        return this.loadingStatus;
    }

    @NotNull
    public final RecsDecoratedLoadingStatusInfo component2() {
        return this.recsLoadingStatusInfo;
    }

    @NotNull
    public final RecsStatusMessageViewModel copy(@NotNull RecsLoadingStatus recsLoadingStatus, @NotNull RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo) {
        C2668g.b(recsLoadingStatus, "loadingStatus");
        C2668g.b(recsDecoratedLoadingStatusInfo, "recsLoadingStatusInfo");
        return new RecsStatusMessageViewModel(recsLoadingStatus, recsDecoratedLoadingStatusInfo);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecsStatusMessageViewModel) {
                RecsStatusMessageViewModel recsStatusMessageViewModel = (RecsStatusMessageViewModel) obj;
                if (C2668g.a(this.loadingStatus, recsStatusMessageViewModel.loadingStatus) && C2668g.a(this.recsLoadingStatusInfo, recsStatusMessageViewModel.recsLoadingStatusInfo)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        RecsLoadingStatus recsLoadingStatus = this.loadingStatus;
        int i = 0;
        int hashCode = (recsLoadingStatus != null ? recsLoadingStatus.hashCode() : 0) * 31;
        RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo = this.recsLoadingStatusInfo;
        if (recsDecoratedLoadingStatusInfo != null) {
            i = recsDecoratedLoadingStatusInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecsStatusMessageViewModel(loadingStatus=");
        stringBuilder.append(this.loadingStatus);
        stringBuilder.append(", recsLoadingStatusInfo=");
        stringBuilder.append(this.recsLoadingStatusInfo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecsStatusMessageViewModel(@NotNull RecsLoadingStatus recsLoadingStatus, @NotNull RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo) {
        C2668g.b(recsLoadingStatus, "loadingStatus");
        C2668g.b(recsDecoratedLoadingStatusInfo, "recsLoadingStatusInfo");
        this.loadingStatus = recsLoadingStatus;
        this.recsLoadingStatusInfo = recsDecoratedLoadingStatusInfo;
    }

    @NotNull
    public final RecsLoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @NotNull
    public final RecsDecoratedLoadingStatusInfo getRecsLoadingStatusInfo() {
        return this.recsLoadingStatusInfo;
    }
}
