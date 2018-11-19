package com.tinder.app.dagger.component;

import com.tinder.app.dagger.module.C8255z;
import com.tinder.module.ViewScope;
import com.tinder.profiletab.C14459a;
import com.tinder.profiletab.injector.ProfileTabViewInjector;
import com.tinder.profiletab.view.ProfileTabView;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ViewScope
@Subcomponent(modules = {C8255z.class, C14459a.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/app/dagger/component/ProfileTabViewComponent;", "Lcom/tinder/profiletab/injector/ProfileTabViewInjector;", "Builder", "InstallModule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ProfileTabViewComponent extends ProfileTabViewInjector {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/tinder/app/dagger/component/ProfileTabViewComponent$Builder;", "", "build", "Lcom/tinder/app/dagger/component/ProfileTabViewComponent;", "profileTabView", "Lcom/tinder/profiletab/view/ProfileTabView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        ProfileTabViewComponent build();

        @NotNull
        @BindsInstance
        Builder profileTabView(@NotNull ProfileTabView profileTabView);
    }

    @Module(subcomponents = {ProfileTabViewComponent.class})
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/app/dagger/component/ProfileTabViewComponent$InstallModule;", "", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.app.dagger.component.ProfileTabViewComponent$a */
    public static final class C8238a {
    }
}
