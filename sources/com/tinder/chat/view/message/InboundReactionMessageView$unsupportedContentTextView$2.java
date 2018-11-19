package com.tinder.chat.view.message;

import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.views.CustomTextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 1, 10})
final class InboundReactionMessageView$unsupportedContentTextView$2 extends Lambda implements Function0<TextView> {
    /* renamed from: a */
    final /* synthetic */ C10633w f43664a;

    InboundReactionMessageView$unsupportedContentTextView$2(C10633w c10633w) {
        this.f43664a = c10633w;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53274a();
    }

    @NotNull
    /* renamed from: a */
    public final TextView m53274a() {
        CustomTextView customTextView = (CustomTextView) this.f43664a.m42889a(C6248a.chatReactionMessageUnsupportedContent);
        if (customTextView != null) {
            return customTextView;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
