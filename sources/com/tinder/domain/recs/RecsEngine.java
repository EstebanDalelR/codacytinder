package com.tinder.domain.recs;

import com.tinder.data.recs.C10992i;
import com.tinder.data.recs.C8776g;
import com.tinder.data.recs.C8788l;
import com.tinder.di.C11105a;
import com.tinder.domain.recs.RecsRepository.DefaultImpls;
import com.tinder.domain.recs.engine.RecsLoader;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.engine.SwipeProcessor;
import com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Rewind.Reason;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.SwipeTerminationEvent;
import com.tinder.util.ConnectivityProvider;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005FGHIJB?\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\r\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aJ\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u0019H\u0007J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0'J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020*0'2\u0006\u0010,\u001a\u00020*J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0'J\u0006\u0010/\u001a\u00020\u0019J\u0016\u00100\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00101\u001a\u000202J\u0016\u00104\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00101\u001a\u000202J\u000e\u00105\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u00106\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d08J\u0010\u00109\u001a\u00020\u00192\b\b\u0002\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020\u0019H\u0007J\u000e\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020?J\u0016\u0010@\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?J6\u0010A\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u001e\u0010B\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d08\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0C2\u0006\u0010>\u001a\u00020?J\u0016\u0010D\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?J\u0010\u0010E\u001a\u00020\u00192\b\b\u0002\u0010:\u001a\u00020;R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine;", "", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "recsRepository", "Lcom/tinder/domain/recs/RecsRepository;", "recsDataStore", "Lcom/tinder/data/recs/RecsDataStore;", "recsLoader", "Lcom/tinder/domain/recs/engine/RecsLoader;", "swipeProcessor", "Lcom/tinder/domain/recs/engine/SwipeProcessor;", "rewindStack", "Lcom/tinder/data/recs/RewindStack;", "globalRecsConsumptionListenerRegistry", "Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry;", "(Lcom/tinder/domain/recs/model/Rec$Source;Lcom/tinder/domain/recs/RecsRepository;Lcom/tinder/data/recs/RecsDataStore;Lcom/tinder/domain/recs/engine/RecsLoader;Lcom/tinder/domain/recs/engine/SwipeProcessor;Lcom/tinder/data/recs/RewindStack;Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry;)V", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "cancelRewind", "Lrx/Completable;", "kotlin.jvm.PlatformType", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "dispose", "", "dispose$engine_release", "insertRec", "rec", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "insertRecAtTop", "isRewound", "", "recId", "", "loadMoreRecs", "observeLoadingStatusUpdates", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "observeRecsUpdates", "Lcom/tinder/domain/recs/model/RecsUpdate;", "observeRecsUpdatesSince", "recsUpdate", "observeSwipeTerminationEvents", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "pause", "processLikeOnRec", "swipeActionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "processPassOnRec", "processSuperlikeOnRec", "removeRec", "removeRecs", "recs", "", "reset", "resetReason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "resume", "rewindLastSwipe", "reason", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "rewindSwipeToPositionZero", "rewindSwipeToSelectedPosition", "positionSelector", "Lkotlin/Function2;", "rewindSwipeToSwipedPosition", "safeReset", "Config", "Configurator", "Factory", "LoadingRetryPolicy", "ResetReason", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RecsEngine {
    private final GlobalRecsConsumptionListenerRegistry globalRecsConsumptionListenerRegistry;
    @NotNull
    private final Rec$Source recSource;
    private final C10992i recsDataStore;
    private final RecsLoader recsLoader;
    private final RecsRepository recsRepository;
    private final C8788l rewindStack;
    private final SwipeProcessor swipeProcessor;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$Config;", "", "supportsParallelProcessing", "", "loaderType", "Lcom/tinder/domain/recs/RecsEngine$Config$LoaderType;", "lowOnRecsThreshold", "", "loadingLoadingRetryPolicy", "Lcom/tinder/domain/recs/RecsEngine$LoadingRetryPolicy;", "(ZLcom/tinder/domain/recs/RecsEngine$Config$LoaderType;ILcom/tinder/domain/recs/RecsEngine$LoadingRetryPolicy;)V", "getLoaderType", "()Lcom/tinder/domain/recs/RecsEngine$Config$LoaderType;", "getLoadingLoadingRetryPolicy", "()Lcom/tinder/domain/recs/RecsEngine$LoadingRetryPolicy;", "getLowOnRecsThreshold", "()I", "getSupportsParallelProcessing", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "LoaderType", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Config {
        @Deprecated
        public static final Companion Companion = new Companion();
        private static final LoadingRetryPolicy DEFAULT_LOADING_RETRY_POLICY = new LoadingRetryPolicy(2, 1000);
        private static final int DEFAULT_LOW_ON_RECS_THRESHOLD = 10;
        private static final int DEFAULT_RETRY_ON_ERROR_COUNT = 2;
        private static final int DEFAULT_RETRY_ON_ERROR_INTERVAL_MS = 1000;
        @NotNull
        private final LoaderType loaderType;
        @NotNull
        private final LoadingRetryPolicy loadingLoadingRetryPolicy;
        private final int lowOnRecsThreshold;
        private final boolean supportsParallelProcessing;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$Config$Companion;", "", "()V", "DEFAULT_LOADING_RETRY_POLICY", "Lcom/tinder/domain/recs/RecsEngine$LoadingRetryPolicy;", "getDEFAULT_LOADING_RETRY_POLICY", "()Lcom/tinder/domain/recs/RecsEngine$LoadingRetryPolicy;", "DEFAULT_LOW_ON_RECS_THRESHOLD", "", "DEFAULT_RETRY_ON_ERROR_COUNT", "DEFAULT_RETRY_ON_ERROR_INTERVAL_MS", "engine_release"}, k = 1, mv = {1, 1, 9})
        private static final class Companion {
            private Companion() {
            }

            private final LoadingRetryPolicy getDEFAULT_LOADING_RETRY_POLICY() {
                return Config.DEFAULT_LOADING_RETRY_POLICY;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$Config$LoaderType;", "", "(Ljava/lang/String;I)V", "CARD_STACK", "CARD_GRID", "engine_release"}, k = 1, mv = {1, 1, 9})
        public enum LoaderType {
        }

        @JvmOverloads
        public Config(boolean z, @NotNull LoaderType loaderType) {
            this(z, loaderType, 0, null, 12, null);
        }

        @JvmOverloads
        public Config(boolean z, @NotNull LoaderType loaderType, int i) {
            this(z, loaderType, i, null, 8, null);
        }

        @NotNull
        public static /* synthetic */ Config copy$default(Config config, boolean z, LoaderType loaderType, int i, LoadingRetryPolicy loadingRetryPolicy, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = config.supportsParallelProcessing;
            }
            if ((i2 & 2) != 0) {
                loaderType = config.loaderType;
            }
            if ((i2 & 4) != 0) {
                i = config.lowOnRecsThreshold;
            }
            if ((i2 & 8) != 0) {
                loadingRetryPolicy = config.loadingLoadingRetryPolicy;
            }
            return config.copy(z, loaderType, i, loadingRetryPolicy);
        }

        public final boolean component1() {
            return this.supportsParallelProcessing;
        }

        @NotNull
        public final LoaderType component2() {
            return this.loaderType;
        }

        public final int component3() {
            return this.lowOnRecsThreshold;
        }

        @NotNull
        public final LoadingRetryPolicy component4() {
            return this.loadingLoadingRetryPolicy;
        }

        @NotNull
        public final Config copy(boolean z, @NotNull LoaderType loaderType, int i, @NotNull LoadingRetryPolicy loadingRetryPolicy) {
            C2668g.b(loaderType, "loaderType");
            C2668g.b(loadingRetryPolicy, "loadingLoadingRetryPolicy");
            return new Config(z, loaderType, i, loadingRetryPolicy);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                Config config = (Config) obj;
                if ((this.supportsParallelProcessing == config.supportsParallelProcessing ? 1 : null) != null && C2668g.a(this.loaderType, config.loaderType)) {
                    return (this.lowOnRecsThreshold == config.lowOnRecsThreshold ? 1 : null) != null && C2668g.a(this.loadingLoadingRetryPolicy, config.loadingLoadingRetryPolicy);
                }
            }
        }

        public int hashCode() {
            int i = this.supportsParallelProcessing;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            LoaderType loaderType = this.loaderType;
            int i2 = 0;
            i = (((i + (loaderType != null ? loaderType.hashCode() : 0)) * 31) + this.lowOnRecsThreshold) * 31;
            LoadingRetryPolicy loadingRetryPolicy = this.loadingLoadingRetryPolicy;
            if (loadingRetryPolicy != null) {
                i2 = loadingRetryPolicy.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Config(supportsParallelProcessing=");
            stringBuilder.append(this.supportsParallelProcessing);
            stringBuilder.append(", loaderType=");
            stringBuilder.append(this.loaderType);
            stringBuilder.append(", lowOnRecsThreshold=");
            stringBuilder.append(this.lowOnRecsThreshold);
            stringBuilder.append(", loadingLoadingRetryPolicy=");
            stringBuilder.append(this.loadingLoadingRetryPolicy);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @JvmOverloads
        public Config(boolean z, @NotNull LoaderType loaderType, int i, @NotNull LoadingRetryPolicy loadingRetryPolicy) {
            C2668g.b(loaderType, "loaderType");
            C2668g.b(loadingRetryPolicy, "loadingLoadingRetryPolicy");
            this.supportsParallelProcessing = z;
            this.loaderType = loaderType;
            this.lowOnRecsThreshold = i;
            this.loadingLoadingRetryPolicy = loadingRetryPolicy;
        }

        public final boolean getSupportsParallelProcessing() {
            return this.supportsParallelProcessing;
        }

        @NotNull
        public final LoaderType getLoaderType() {
            return this.loaderType;
        }

        public final int getLowOnRecsThreshold() {
            return this.lowOnRecsThreshold;
        }

        @JvmOverloads
        public /* synthetic */ Config(boolean z, LoaderType loaderType, int i, LoadingRetryPolicy loadingRetryPolicy, int i2, C15823e c15823e) {
            if ((i2 & 4) != null) {
                i = 10;
            }
            if ((i2 & 8) != 0) {
                loadingRetryPolicy = Companion.getDEFAULT_LOADING_RETRY_POLICY();
            }
            this(z, loaderType, i, loadingRetryPolicy);
        }

        @NotNull
        public final LoadingRetryPolicy getLoadingLoadingRetryPolicy() {
            return this.loadingLoadingRetryPolicy;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001 BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$Configurator;", "", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "config", "Lcom/tinder/domain/recs/RecsEngine$Config;", "recsApiClient", "Lcom/tinder/domain/recs/RecsApiClient;", "recsAlreadySwipedProvider", "Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "recsAdditionalDataPrefetcher", "Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;", "Lcom/tinder/domain/recs/model/Rec;", "swipeProcessingRulesResolver", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "(Lcom/tinder/domain/recs/model/Rec$Source;Lcom/tinder/domain/recs/RecsEngine$Config;Lcom/tinder/domain/recs/RecsApiClient;Lcom/tinder/data/recs/RecsAlreadySwipedProvider;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;)V", "getConfig", "()Lcom/tinder/domain/recs/RecsEngine$Config;", "getConnectivityProvider", "()Lcom/tinder/util/ConnectivityProvider;", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "getRecsAdditionalDataPrefetcher", "()Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;", "getRecsAlreadySwipedProvider", "()Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "getRecsApiClient", "()Lcom/tinder/domain/recs/RecsApiClient;", "getSwipeProcessingRulesResolver", "()Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "Factory", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Configurator {
        @NotNull
        private final Config config;
        @NotNull
        private final ConnectivityProvider connectivityProvider;
        @NotNull
        private final Rec$Source recSource;
        @NotNull
        private final RecsAdditionalDataPrefetcher<Rec> recsAdditionalDataPrefetcher;
        @NotNull
        private final C8776g recsAlreadySwipedProvider;
        @NotNull
        private final RecsApiClient recsApiClient;
        @NotNull
        private final SwipeProcessingRulesResolver swipeProcessingRulesResolver;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$Configurator$Factory;", "", "create", "Lcom/tinder/domain/recs/RecsEngine$Configurator;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "engine_release"}, k = 1, mv = {1, 1, 9})
        public interface Factory {
            @NotNull
            Configurator create(@NotNull Rec$Source rec$Source);
        }

        public Configurator(@NotNull Rec$Source rec$Source, @NotNull Config config, @NotNull RecsApiClient recsApiClient, @NotNull C8776g c8776g, @NotNull ConnectivityProvider connectivityProvider, @NotNull RecsAdditionalDataPrefetcher<? super Rec> recsAdditionalDataPrefetcher, @NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver) {
            C2668g.b(rec$Source, "recSource");
            C2668g.b(config, "config");
            C2668g.b(recsApiClient, "recsApiClient");
            C2668g.b(c8776g, "recsAlreadySwipedProvider");
            C2668g.b(connectivityProvider, "connectivityProvider");
            C2668g.b(recsAdditionalDataPrefetcher, "recsAdditionalDataPrefetcher");
            C2668g.b(swipeProcessingRulesResolver, "swipeProcessingRulesResolver");
            this.recSource = rec$Source;
            this.config = config;
            this.recsApiClient = recsApiClient;
            this.recsAlreadySwipedProvider = c8776g;
            this.connectivityProvider = connectivityProvider;
            this.recsAdditionalDataPrefetcher = recsAdditionalDataPrefetcher;
            this.swipeProcessingRulesResolver = swipeProcessingRulesResolver;
        }

        @NotNull
        public final Rec$Source getRecSource() {
            return this.recSource;
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        @NotNull
        public final RecsApiClient getRecsApiClient() {
            return this.recsApiClient;
        }

        @NotNull
        public final C8776g getRecsAlreadySwipedProvider() {
            return this.recsAlreadySwipedProvider;
        }

        @NotNull
        public final ConnectivityProvider getConnectivityProvider() {
            return this.connectivityProvider;
        }

        @NotNull
        public final RecsAdditionalDataPrefetcher<Rec> getRecsAdditionalDataPrefetcher() {
            return this.recsAdditionalDataPrefetcher;
        }

        @NotNull
        public final SwipeProcessingRulesResolver getSwipeProcessingRulesResolver() {
            return this.swipeProcessingRulesResolver;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$Factory;", "", "()V", "create", "Lcom/tinder/domain/recs/RecsEngine;", "configurator", "Lcom/tinder/domain/recs/RecsEngine$Configurator;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Factory {
        @NotNull
        public final RecsEngine create(@NotNull Configurator configurator) {
            C2668g.b(configurator, "configurator");
            return C11105a.m43813a().recSource(configurator.getRecSource()).config(configurator.getConfig()).recsApiClient(configurator.getRecsApiClient()).recsAlreadySwipedProvider(configurator.getRecsAlreadySwipedProvider()).connectivityProvider(configurator.getConnectivityProvider()).recsAdditionalDataPrefetcher(configurator.getRecsAdditionalDataPrefetcher()).swipeProcessingRulesResolver(configurator.getSwipeProcessingRulesResolver()).build().recsEngine();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$LoadingRetryPolicy;", "", "retryCount", "", "retryIntervalMillis", "(II)V", "getRetryCount", "()I", "getRetryIntervalMillis", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class LoadingRetryPolicy {
        private final int retryCount;
        private final int retryIntervalMillis;

        @NotNull
        public static /* synthetic */ LoadingRetryPolicy copy$default(LoadingRetryPolicy loadingRetryPolicy, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = loadingRetryPolicy.retryCount;
            }
            if ((i3 & 2) != 0) {
                i2 = loadingRetryPolicy.retryIntervalMillis;
            }
            return loadingRetryPolicy.copy(i, i2);
        }

        public final int component1() {
            return this.retryCount;
        }

        public final int component2() {
            return this.retryIntervalMillis;
        }

        @NotNull
        public final LoadingRetryPolicy copy(int i, int i2) {
            return new LoadingRetryPolicy(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LoadingRetryPolicy) {
                LoadingRetryPolicy loadingRetryPolicy = (LoadingRetryPolicy) obj;
                if ((this.retryCount == loadingRetryPolicy.retryCount ? 1 : null) != null) {
                    if ((this.retryIntervalMillis == loadingRetryPolicy.retryIntervalMillis ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.retryCount * 31) + this.retryIntervalMillis;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LoadingRetryPolicy(retryCount=");
            stringBuilder.append(this.retryCount);
            stringBuilder.append(", retryIntervalMillis=");
            stringBuilder.append(this.retryIntervalMillis);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public LoadingRetryPolicy(int i, int i2) {
            this.retryCount = i;
            this.retryIntervalMillis = i2;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final int getRetryIntervalMillis() {
            return this.retryIntervalMillis;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "", "Default", "engine_release"}, k = 1, mv = {1, 1, 9})
    public interface ResetReason {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "()V", "EngineDisposed", "Unspecified", "Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default$Unspecified;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default$EngineDisposed;", "engine_release"}, k = 1, mv = {1, 1, 9})
        public static abstract class Default implements ResetReason {

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default$EngineDisposed;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
            public static final class EngineDisposed extends Default {
                public static final EngineDisposed INSTANCE = new EngineDisposed();

                private EngineDisposed() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = 0;
                    r1.<init>(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.RecsEngine.ResetReason.Default.EngineDisposed.<init>():void");
                }
            }

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default$Unspecified;", "Lcom/tinder/domain/recs/RecsEngine$ResetReason$Default;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
            public static final class Unspecified extends Default {
                public static final Unspecified INSTANCE = new Unspecified();

                private Unspecified() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = 0;
                    r1.<init>(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.RecsEngine.ResetReason.Default.Unspecified.<init>():void");
                }
            }

            private Default() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r0 = this;
                r0.<init>();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.RecsEngine.ResetReason.Default.<init>():void");
            }
        }
    }

    @Inject
    public RecsEngine(@NotNull Rec$Source rec$Source, @NotNull RecsRepository recsRepository, @NotNull C10992i c10992i, @NotNull RecsLoader recsLoader, @NotNull SwipeProcessor swipeProcessor, @NotNull C8788l c8788l, @NotNull GlobalRecsConsumptionListenerRegistry globalRecsConsumptionListenerRegistry) {
        C2668g.b(rec$Source, "recSource");
        C2668g.b(recsRepository, "recsRepository");
        C2668g.b(c10992i, "recsDataStore");
        C2668g.b(recsLoader, "recsLoader");
        C2668g.b(swipeProcessor, "swipeProcessor");
        C2668g.b(c8788l, "rewindStack");
        C2668g.b(globalRecsConsumptionListenerRegistry, "globalRecsConsumptionListenerRegistry");
        this.recSource = rec$Source;
        this.recsRepository = recsRepository;
        this.recsDataStore = c10992i;
        this.recsLoader = recsLoader;
        this.swipeProcessor = swipeProcessor;
        this.rewindStack = c8788l;
        this.globalRecsConsumptionListenerRegistry = globalRecsConsumptionListenerRegistry;
    }

    @NotNull
    public final Rec$Source getRecSource() {
        return this.recSource;
    }

    public final synchronized void resume() {
        this.globalRecsConsumptionListenerRegistry.register(this.recsDataStore);
        this.recsLoader.resume();
    }

    public final void pause() {
        this.recsLoader.pause();
    }

    public static /* synthetic */ void reset$default(RecsEngine recsEngine, ResetReason resetReason, int i, Object obj) {
        if ((i & 1) != 0) {
            resetReason = Unspecified.INSTANCE;
        }
        recsEngine.reset(resetReason);
    }

    public final void reset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "resetReason");
        this.recsLoader.reset(resetReason);
    }

    public static /* synthetic */ void safeReset$default(RecsEngine recsEngine, ResetReason resetReason, int i, Object obj) {
        if ((i & 1) != 0) {
            resetReason = Unspecified.INSTANCE;
        }
        recsEngine.safeReset(resetReason);
    }

    public final void safeReset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "resetReason");
        this.recsLoader.safeReset(resetReason);
    }

    public final synchronized void loadMoreRecs() {
        if (this.recsLoader instanceof CardGridRecsLoader) {
            ((CardGridRecsLoader) this.recsLoader).loadMoreRecs();
        }
    }

    @NotNull
    public final Completable insertRecAtTop(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        return insertRec(rec, 0);
    }

    @NotNull
    public final Completable insertRec(@NotNull Rec rec, int i) {
        C2668g.b(rec, "rec");
        return this.recsRepository.insertRec(rec, i);
    }

    @NotNull
    public final Completable removeRec(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        return this.recsRepository.removeRec(rec);
    }

    @NotNull
    public final Completable removeRecs(@NotNull List<? extends Rec> list) {
        C2668g.b(list, "recs");
        return this.recsRepository.removeRecs(list);
    }

    @NotNull
    public final Completable rewindSwipeToPositionZero(@NotNull Swipe swipe, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(reason, "reason");
        swipe = this.recsRepository.rewindSwipeToPositionZero(swipe, reason).b();
        C2668g.a(swipe, "recsRepository.rewindSwi…, reason).toCompletable()");
        return swipe;
    }

    @NotNull
    public final Completable rewindSwipeToSwipedPosition(@NotNull Swipe swipe, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(reason, "reason");
        swipe = this.recsRepository.rewindSwipeToSwipedPosition(swipe, reason).b();
        C2668g.a(swipe, "recsRepository.rewindSwi…, reason).toCompletable()");
        return swipe;
    }

    @NotNull
    public final Completable rewindSwipeToSelectedPosition(@NotNull Swipe swipe, @NotNull Function2<? super List<? extends Rec>, ? super Integer, Integer> function2, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(function2, "positionSelector");
        C2668g.b(reason, "reason");
        swipe = this.recsRepository.rewindSwipeToSelectedPosition(swipe, function2, reason).b();
        C2668g.a(swipe, "recsRepository.rewindSwi…, reason).toCompletable()");
        return swipe;
    }

    public final Completable cancelRewind(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        return this.recsRepository.cancelRewind(swipe).b();
    }

    public final boolean isRewound(@NotNull String str) {
        C2668g.b(str, "recId");
        return this.rewindStack.m37400a(str);
    }

    @NotNull
    public final Observable<RecsLoadingStatus> observeLoadingStatusUpdates() {
        return this.recsLoader.observeLoadingStatusUpdates();
    }

    @NotNull
    public final Observable<RecsUpdate> observeRecsUpdates() {
        return DefaultImpls.observeRecsUpdates$default(this.recsRepository, null, 1, null);
    }

    @NotNull
    public final Observable<RecsUpdate> observeRecsUpdatesSince(@NotNull RecsUpdate recsUpdate) {
        C2668g.b(recsUpdate, "recsUpdate");
        return this.recsRepository.observeRecsUpdates(recsUpdate);
    }

    public final void processLikeOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        this.swipeProcessor.processLikeOnRec(rec, swipeActionContext);
    }

    public final void processPassOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        this.swipeProcessor.processPassOnRec(rec, swipeActionContext);
    }

    public final void processSuperlikeOnRec(@NotNull Rec rec, @NotNull SwipeActionContext swipeActionContext) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeActionContext, "swipeActionContext");
        this.swipeProcessor.processSuperlikeOnRec(rec, swipeActionContext);
    }

    public final void rewindLastSwipe(@NotNull Reason reason) {
        C2668g.b(reason, "reason");
        this.swipeProcessor.rewindLastSwipe(reason);
    }

    @NotNull
    public final Observable<SwipeTerminationEvent> observeSwipeTerminationEvents() {
        return this.swipeProcessor.observeSwipeTerminationEvents();
    }

    public final synchronized void dispose$engine_release() {
        this.globalRecsConsumptionListenerRegistry.unregister(this.recsDataStore);
        this.recsLoader.pause();
        this.recsLoader.reset(EngineDisposed.INSTANCE);
    }
}
