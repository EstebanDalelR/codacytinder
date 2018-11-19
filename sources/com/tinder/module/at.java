package com.tinder.module;

import com.tinder.app.dagger.component.MainActivityComponent;
import com.tinder.chat.injection.components.ChatActivitySubcomponent;
import com.tinder.fastmatch.FastMatchRecsActivityComponent;
import dagger.Module;

@Module(subcomponents = {MainActivityComponent.class, ChatActivitySubcomponent.class, CensorViewComponent.class, FastMatchRecsActivityComponent.class})
public class at {
}
