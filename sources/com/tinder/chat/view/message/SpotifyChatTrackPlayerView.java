package com.tinder.chat.view.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.common.feed.view.SpotifyTrackPlayerView;
import com.tinder.profile.p365d.C14398a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/chat/view/message/SpotifyChatTrackPlayerView;", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setupDagger", "", "setupDagger$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SpotifyChatTrackPlayerView extends SpotifyTrackPlayerView {
    /* renamed from: b */
    private HashMap f41113b;

    @JvmOverloads
    public SpotifyChatTrackPlayerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SpotifyChatTrackPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11002a(int i) {
        if (this.f41113b == null) {
            this.f41113b = new HashMap();
        }
        View view = (View) this.f41113b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f41113b.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ SpotifyChatTrackPlayerView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public SpotifyChatTrackPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo11003a() {
        Context a = C14398a.a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
    }
}
