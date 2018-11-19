package com.tinder.module;

import com.tinder.chat.view.CensorOverflowMenu;
import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {})
public interface CensorViewComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        CensorViewComponent build();
    }

    void inject(CensorOverflowMenu censorOverflowMenu);
}
