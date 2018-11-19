package com.tinder.reactions.drawer.view;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tinder.chat.view.provider.ChatTextInputState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 1, 10})
final class ChatInputEditText$a implements OnFocusChangeListener {
    /* renamed from: a */
    final /* synthetic */ ChatInputEditText f46168a;

    ChatInputEditText$a(ChatInputEditText chatInputEditText) {
        this.f46168a = chatInputEditText;
    }

    public final void onFocusChange(View view, boolean z) {
        view = this.f46168a.getChatInputTextStateUpdatesNotifier$Tinder_release();
        if (z) {
            z = ChatTextInputState.ACTIVE;
        } else {
            z = ChatTextInputState.INACTIVE;
        }
        view.notify(z);
    }
}
