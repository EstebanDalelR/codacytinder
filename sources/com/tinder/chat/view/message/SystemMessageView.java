package com.tinder.chat.view.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.al;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/view/message/SystemMessageView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/SystemMessageViewModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "setTextMessageContentView$Tinder_release", "(Landroid/widget/TextView;)V", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SystemMessageView extends FrameLayout implements BindableChatItemView<al> {
    @NotNull
    @BindView(2131362089)
    public TextView textMessageContentView;

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42725a((al) chatItem);
    }

    public /* synthetic */ SystemMessageView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public SystemMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.inflate(context, R.layout.chat_message_system_view, this);
        ButterKnife.a(this);
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        TextView textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        return textView;
    }

    public final void setTextMessageContentView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.textMessageContentView = textView;
    }

    /* renamed from: a */
    public void m42725a(@NotNull al alVar) {
        C2668g.b(alVar, "viewModel");
        TextView textView = this.textMessageContentView;
        if (textView == null) {
            C2668g.b("textMessageContentView");
        }
        textView.setText(alVar.m42899f());
    }
}
