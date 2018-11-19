package com.tinder.app.dagger.component;

import com.tinder.app.dagger.module.p163e.C8249k;
import com.tinder.superlikeable.injector.SuperLikeableInjector;
import com.tinder.superlikeable.scope.SuperLikeableViewScope;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@SuperLikeableViewScope
@Subcomponent(modules = {C8249k.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/app/dagger/component/SuperLikeableViewComponent;", "Lcom/tinder/superlikeable/injector/SuperLikeableInjector;", "Builder", "InstallModule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface SuperLikeableViewComponent extends SuperLikeableInjector {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/tinder/app/dagger/component/SuperLikeableViewComponent$Builder;", "", "build", "Lcom/tinder/app/dagger/component/SuperLikeableViewComponent;", "superLikeableView", "superLikeableViewContainer", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        SuperLikeableViewComponent build();

        @NotNull
        @BindsInstance
        Builder superLikeableView(@NotNull SuperLikeableViewContainer superLikeableViewContainer);
    }

    @Module(subcomponents = {SuperLikeableViewComponent.class})
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/app/dagger/component/SuperLikeableViewComponent$InstallModule;", "", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.app.dagger.component.SuperLikeableViewComponent$a */
    public static final class C8239a {
    }
}
