package com.tinder.di;

import com.tinder.data.recs.C8776g;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@EngineScope
@Component(modules = {C8839d.class, C8841k.class, C8838c.class, C8842l.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/di/RecsEngineComponent;", "", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "Builder", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface RecsEngineComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'J\u0016\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H'¨\u0006\u0013"}, d2 = {"Lcom/tinder/di/RecsEngineComponent$Builder;", "", "build", "Lcom/tinder/di/RecsEngineComponent;", "config", "Lcom/tinder/domain/recs/RecsEngine$Config;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "recsAdditionalDataPrefetcher", "Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;", "Lcom/tinder/domain/recs/model/Rec;", "recsAlreadySwipedProvider", "Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "recsApiClient", "Lcom/tinder/domain/recs/RecsApiClient;", "swipeProcessingRulesResolver", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "engine_release"}, k = 1, mv = {1, 1, 9})
    @dagger.Component.Builder
    public interface Builder {
        @NotNull
        RecsEngineComponent build();

        @NotNull
        @BindsInstance
        Builder config(@NotNull Config config);

        @NotNull
        @BindsInstance
        Builder connectivityProvider(@NotNull ConnectivityProvider connectivityProvider);

        @NotNull
        @BindsInstance
        Builder recSource(@NotNull Rec$Source rec$Source);

        @NotNull
        @BindsInstance
        Builder recsAdditionalDataPrefetcher(@NotNull RecsAdditionalDataPrefetcher<? super Rec> recsAdditionalDataPrefetcher);

        @NotNull
        @BindsInstance
        Builder recsAlreadySwipedProvider(@NotNull C8776g c8776g);

        @NotNull
        @BindsInstance
        Builder recsApiClient(@NotNull RecsApiClient recsApiClient);

        @NotNull
        @BindsInstance
        Builder swipeProcessingRulesResolver(@NotNull SwipeProcessingRulesResolver swipeProcessingRulesResolver);
    }

    @NotNull
    RecsEngine recsEngine();
}
