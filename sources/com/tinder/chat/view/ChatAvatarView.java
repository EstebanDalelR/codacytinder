package com.tinder.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.common.p192e.p193a.C10659a.C8531a;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lcom/tinder/chat/view/ChatAvatarView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bind", "", "url", "", "showAvatar", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ChatAvatarView extends ImageView {
    public ChatAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
    }

    public /* synthetic */ ChatAvatarView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* renamed from: a */
    public final void m36175a(@NotNull String str) {
        C2668g.b(str, "url");
        if ((C19303i.a(str) ^ 1) != 0) {
            m36174b(str);
        } else {
            setImageDrawable(null);
        }
    }

    /* renamed from: b */
    private final void m36174b(String str) {
        C8531a c8531a = new C8531a(getContext());
        C0994i.b(getContext()).a(str).a(new Transformation[]{c8531a.m36496a().m36499b()}).a(this);
    }
}
