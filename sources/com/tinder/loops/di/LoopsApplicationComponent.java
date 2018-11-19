package com.tinder.loops.di;

import android.content.Context;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.profile.usecase.CheckTutorialViewedStatus;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewedStatus;
import com.tinder.loops.di.TrimAndCropActivitySubcomponent.Builder;
import com.tinder.loops.di.p271a.C9767a;
import com.tinder.loops.domain.C9768a;
import com.tinder.loops.ui.viewmodels.C9811a;
import com.tinder.module.ForApplication;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class}, modules = {C9767a.class, C9811a.class, C9768a.class})
@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/loops/di/LoopsApplicationComponent;", "", "TrimAndCropActivitySubcomponentBuilder", "Lcom/tinder/loops/di/TrimAndCropActivitySubcomponent$Builder;", "mediaSelectorActivityComponentBuilder", "Lcom/tinder/loops/di/MediaSelectorActivitySubComponent$Builder;", "Parent", "loops_release"}, k = 1, mv = {1, 1, 10})
public interface LoopsApplicationComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/loops/di/LoopsApplicationComponent$Parent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "provideApplicationContext", "Landroid/content/Context;", "provideCheckedTutorialViewedStatus", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewedStatus;", "provideConfirmTutorialViewedStatus", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewedStatus;", "loops_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        C2630h fireworks();

        @NotNull
        @ForApplication
        Context provideApplicationContext();

        @NotNull
        CheckTutorialViewedStatus provideCheckedTutorialViewedStatus();

        @NotNull
        ConfirmTutorialsViewedStatus provideConfirmTutorialViewedStatus();
    }

    @NotNull
    Builder TrimAndCropActivitySubcomponentBuilder();

    @NotNull
    MediaSelectorActivitySubComponent.Builder mediaSelectorActivityComponentBuilder();
}
