package com.tinder.chat.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final /* synthetic */ class aj implements OnCancelListener {
    /* renamed from: a */
    private final ChatInputBoxContainer f30144a;

    aj(ChatInputBoxContainer chatInputBoxContainer) {
        this.f30144a = chatInputBoxContainer;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f30144a.a(dialogInterface);
    }
}
