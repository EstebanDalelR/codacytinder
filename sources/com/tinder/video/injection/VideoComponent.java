package com.tinder.video.injection;

import android.content.Context;
import com.tinder.module.ForApplication;
import com.tinder.video.activities.FullscreenVideoActivity;
import com.tinder.video.injection.p448a.C15414a;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class}, modules = {C15414a.class})
@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/video/injection/VideoComponent;", "", "inject", "", "fullscreenVideoActivity", "Lcom/tinder/video/activities/FullscreenVideoActivity;", "Parent", "video_release"}, k = 1, mv = {1, 1, 10})
public interface VideoComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Lcom/tinder/video/injection/VideoComponent$Parent;", "", "provideApplicationContext", "Landroid/content/Context;", "video_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        @ForApplication
        Context provideApplicationContext();
    }

    void inject(@NotNull FullscreenVideoActivity fullscreenVideoActivity);
}
