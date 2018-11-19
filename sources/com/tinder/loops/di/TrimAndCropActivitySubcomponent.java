package com.tinder.loops.di;

import com.tinder.loops.activity.TrimAndCropActivity;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/loops/di/TrimAndCropActivitySubcomponent;", "", "inject", "", "trimAndCropActivity", "Lcom/tinder/loops/activity/TrimAndCropActivity;", "Builder", "loops_release"}, k = 1, mv = {1, 1, 10})
@Subcomponent
public interface TrimAndCropActivitySubcomponent {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/loops/di/TrimAndCropActivitySubcomponent$Builder;", "", "build", "Lcom/tinder/loops/di/TrimAndCropActivitySubcomponent;", "loops_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        TrimAndCropActivitySubcomponent build();
    }

    void inject(@NotNull TrimAndCropActivity trimAndCropActivity);
}
