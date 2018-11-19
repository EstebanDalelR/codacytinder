package com.tinder.domain.recs.model;

import com.tinder.domain.recs.model.ContextualInfo.Default.Empty;
import com.tinder.domain.recs.model.ContextualInfo.Default.ExpectedError;
import com.tinder.domain.recs.model.ContextualInfo.Default.UnexpectedError;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "", "contextualInfo", "Lcom/tinder/domain/recs/model/ContextualInfo;", "(Lcom/tinder/domain/recs/model/ContextualInfo;)V", "getContextualInfo", "()Lcom/tinder/domain/recs/model/ContextualInfo;", "FetchFailedExpectedError", "FetchFailedNoConnection", "FetchFailedUnexpectedError", "FetchFailedUnknownLocation", "Loading", "LoadingMore", "NoMoreRecs", "NoMoreRecsDupesOnly", "RecsAvailable", "RetryingUnknownLocation", "Uninitialized", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$Uninitialized;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$Loading;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$RecsAvailable;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$LoadingMore;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$NoMoreRecs;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$NoMoreRecsDupesOnly;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$RetryingUnknownLocation;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedUnknownLocation;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedExpectedError;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedUnexpectedError;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedNoConnection;", "engine_release"}, k = 1, mv = {1, 1, 9})
public abstract class RecsLoadingStatus {
    @NotNull
    private final ContextualInfo contextualInfo;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedExpectedError;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "contextualInfo", "Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;", "(Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;)V", "getContextualInfo", "()Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class FetchFailedExpectedError extends RecsLoadingStatus {
        @NotNull
        private final ExpectedError contextualInfo;

        @NotNull
        public static /* synthetic */ FetchFailedExpectedError copy$default(FetchFailedExpectedError fetchFailedExpectedError, ExpectedError expectedError, int i, Object obj) {
            if ((i & 1) != 0) {
                expectedError = fetchFailedExpectedError.getContextualInfo();
            }
            return fetchFailedExpectedError.copy(expectedError);
        }

        @NotNull
        public final ExpectedError component1() {
            return getContextualInfo();
        }

        @NotNull
        public final FetchFailedExpectedError copy(@NotNull ExpectedError expectedError) {
            C2668g.b(expectedError, "contextualInfo");
            return new FetchFailedExpectedError(expectedError);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FetchFailedExpectedError) {
                    if (C2668g.a(getContextualInfo(), ((FetchFailedExpectedError) obj).getContextualInfo())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ExpectedError contextualInfo = getContextualInfo();
            return contextualInfo != null ? contextualInfo.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FetchFailedExpectedError(contextualInfo=");
            stringBuilder.append(getContextualInfo());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public ExpectedError getContextualInfo() {
            return this.contextualInfo;
        }

        public FetchFailedExpectedError(@NotNull ExpectedError expectedError) {
            C2668g.b(expectedError, "contextualInfo");
            super(expectedError);
            this.contextualInfo = expectedError;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedNoConnection;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class FetchFailedNoConnection extends RecsLoadingStatus {
        public static final FetchFailedNoConnection INSTANCE = new FetchFailedNoConnection();

        private FetchFailedNoConnection() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedUnexpectedError;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "contextualInfo", "Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;", "(Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;)V", "getContextualInfo", "()Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class FetchFailedUnexpectedError extends RecsLoadingStatus {
        @NotNull
        private final UnexpectedError contextualInfo;

        @NotNull
        public static /* synthetic */ FetchFailedUnexpectedError copy$default(FetchFailedUnexpectedError fetchFailedUnexpectedError, UnexpectedError unexpectedError, int i, Object obj) {
            if ((i & 1) != 0) {
                unexpectedError = fetchFailedUnexpectedError.getContextualInfo();
            }
            return fetchFailedUnexpectedError.copy(unexpectedError);
        }

        @NotNull
        public final UnexpectedError component1() {
            return getContextualInfo();
        }

        @NotNull
        public final FetchFailedUnexpectedError copy(@NotNull UnexpectedError unexpectedError) {
            C2668g.b(unexpectedError, "contextualInfo");
            return new FetchFailedUnexpectedError(unexpectedError);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FetchFailedUnexpectedError) {
                    if (C2668g.a(getContextualInfo(), ((FetchFailedUnexpectedError) obj).getContextualInfo())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            UnexpectedError contextualInfo = getContextualInfo();
            return contextualInfo != null ? contextualInfo.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FetchFailedUnexpectedError(contextualInfo=");
            stringBuilder.append(getContextualInfo());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        public UnexpectedError getContextualInfo() {
            return this.contextualInfo;
        }

        public FetchFailedUnexpectedError(@NotNull UnexpectedError unexpectedError) {
            C2668g.b(unexpectedError, "contextualInfo");
            super(unexpectedError);
            this.contextualInfo = unexpectedError;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$FetchFailedUnknownLocation;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class FetchFailedUnknownLocation extends RecsLoadingStatus {
        public static final FetchFailedUnknownLocation INSTANCE = new FetchFailedUnknownLocation();

        private FetchFailedUnknownLocation() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$Loading;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Loading extends RecsLoadingStatus {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$LoadingMore;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class LoadingMore extends RecsLoadingStatus {
        public static final LoadingMore INSTANCE = new LoadingMore();

        private LoadingMore() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$NoMoreRecs;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class NoMoreRecs extends RecsLoadingStatus {
        public static final NoMoreRecs INSTANCE = new NoMoreRecs();

        private NoMoreRecs() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$NoMoreRecsDupesOnly;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class NoMoreRecsDupesOnly extends RecsLoadingStatus {
        public static final NoMoreRecsDupesOnly INSTANCE = new NoMoreRecsDupesOnly();

        private NoMoreRecsDupesOnly() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$RecsAvailable;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class RecsAvailable extends RecsLoadingStatus {
        public static final RecsAvailable INSTANCE = new RecsAvailable();

        private RecsAvailable() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$RetryingUnknownLocation;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class RetryingUnknownLocation extends RecsLoadingStatus {
        public static final RetryingUnknownLocation INSTANCE = new RetryingUnknownLocation();

        private RetryingUnknownLocation() {
            super(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/RecsLoadingStatus$Uninitialized;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Uninitialized extends RecsLoadingStatus {
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
            super(null, 1, null);
        }
    }

    private RecsLoadingStatus(ContextualInfo contextualInfo) {
        this.contextualInfo = contextualInfo;
    }

    /* synthetic */ RecsLoadingStatus(ContextualInfo contextualInfo, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            contextualInfo = Empty.INSTANCE;
        }
        this(contextualInfo);
    }

    @NotNull
    public ContextualInfo getContextualInfo() {
        return this.contextualInfo;
    }
}
