package com.tinder.profiletab.injector;

import com.tinder.profile.view.ControllaView;
import com.tinder.profiletab.view.ProfileTabView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\b\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/tinder/profiletab/injector/ProfileTabViewInjector;", "", "inject", "", "controllaView", "Lcom/tinder/profile/view/ControllaView;", "profileTabView", "Lcom/tinder/profiletab/view/ProfileTabView;", "Factory", "Owner", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ProfileTabViewInjector {
    void inject(@NotNull ControllaView controllaView);

    void inject(@NotNull ProfileTabView profileTabView);
}
