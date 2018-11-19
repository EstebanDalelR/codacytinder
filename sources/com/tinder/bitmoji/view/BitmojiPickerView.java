package com.tinder.bitmoji.view;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.snapchat.kit.sdk.bitmoji.ui.BitmojiFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/bitmoji/view/BitmojiPickerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "loadPicker", "", "supportFragmentManager", "Landroid/support/v4/app/FragmentManager;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public final class BitmojiPickerView extends FrameLayout {
    public BitmojiPickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m35456a(@NotNull FragmentManager fragmentManager) {
        C2668g.b(fragmentManager, "supportFragmentManager");
        fragmentManager.a().a(getId(), new BitmojiFragment()).c();
    }
}
