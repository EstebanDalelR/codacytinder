package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.bitmoji.FragmentComponent.Builder;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.BitmojiScope;
import com.snapchat.kit.sdk.bitmoji.networking.C5900a;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiIconFragment;
import dagger.Component;

@Component(dependencies = {SnapKitComponent.class}, modules = {C5894b.class})
@BitmojiScope
public interface BitmojiComponent {
    C5900a bitmojiClient();

    Builder fragmentComponentBuilder();

    void inject(BitmojiIconFragment bitmojiIconFragment);
}
