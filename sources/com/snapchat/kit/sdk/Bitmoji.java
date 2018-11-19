package com.snapchat.kit.sdk;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.snapchat.kit.sdk.bitmoji.BitmojiComponent;
import com.snapchat.kit.sdk.bitmoji.C5894b;
import com.snapchat.kit.sdk.bitmoji.C5897j;
import com.snapchat.kit.sdk.bitmoji.C7122i;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSelectedListener;
import com.snapchat.kit.sdk.bitmoji.networking.FetchAvatarUrlCallback;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiIconFragment;

public final class Bitmoji {
    @VisibleForTesting
    /* renamed from: a */
    static BitmojiComponent f21547a;

    private Bitmoji() {
    }

    @NonNull
    /* renamed from: a */
    private static synchronized BitmojiComponent m25382a(@NonNull Context context) {
        synchronized (Bitmoji.class) {
            if (f21547a == null) {
                f21547a = C7122i.m30705a().m25446a(SnapKit.getComponent(context)).m25447a(new C5894b()).m25445a();
            }
            context = f21547a;
        }
        return context;
    }

    public static void fetchAvatarUrl(@NonNull Context context, @NonNull FetchAvatarUrlCallback fetchAvatarUrlCallback) {
        m25382a(context).bitmojiClient().m25460a(fetchAvatarUrlCallback);
    }

    public static void inject(BitmojiFragment bitmojiFragment, OnBitmojiSelectedListener onBitmojiSelectedListener, OnBitmojiSearchFocusChangeListener onBitmojiSearchFocusChangeListener, View view) {
        m25382a(bitmojiFragment.getActivity()).fragmentComponentBuilder().fragmentModule(new C5897j(bitmojiFragment, onBitmojiSelectedListener, onBitmojiSearchFocusChangeListener, view)).build().inject(bitmojiFragment);
    }

    public static void inject(BitmojiIconFragment bitmojiIconFragment) {
        m25382a(bitmojiIconFragment.getActivity()).inject(bitmojiIconFragment);
    }
}
