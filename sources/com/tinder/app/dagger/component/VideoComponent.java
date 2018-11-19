package com.tinder.app.dagger.component;

import com.tinder.video.injection.VideoInjector;
import com.tinder.video.injection.p448a.C15414a;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/app/dagger/component/VideoComponent;", "Lcom/tinder/video/injection/VideoInjector;", "Builder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Subcomponent(modules = {C15414a.class})
public interface VideoComponent extends VideoInjector {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/app/dagger/component/VideoComponent$Builder;", "", "build", "Lcom/tinder/app/dagger/component/VideoComponent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        VideoComponent build();
    }
}
