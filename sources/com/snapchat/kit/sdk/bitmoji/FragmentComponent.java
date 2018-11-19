package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5892d;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment;
import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = {C5897j.class, C5892d.class})
public interface FragmentComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        FragmentComponent build();

        Builder fragmentModule(C5897j c5897j);
    }

    void inject(BitmojiFragment bitmojiFragment);
}
