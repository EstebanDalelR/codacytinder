package com.tinder.chat.presenter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19303i;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatInputBoxPresenter$sendBitmojiImageMessage$request$1 extends Lambda implements Function0<Boolean> {
    /* renamed from: a */
    final /* synthetic */ String f43569a;

    ChatInputBoxPresenter$sendBitmojiImageMessage$request$1(String str) {
        this.f43569a = str;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Boolean.valueOf(m53246a());
    }

    /* renamed from: a */
    public final boolean m53246a() {
        return C19303i.b(this.f43569a, "sdk.bitmoji.com", false, 2, null);
    }
}
