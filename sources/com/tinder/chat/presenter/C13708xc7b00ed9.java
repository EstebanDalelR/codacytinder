package com.tinder.chat.presenter;

import com.tinder.chat.view.model.MessageViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke", "kotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.ChatPresenter$onChatItemsInsertedToUI$$inlined$filterIsInstance$1 */
public final class C13708xc7b00ed9 extends Lambda implements Function1<Object, Boolean> {
    /* renamed from: a */
    public static final C13708xc7b00ed9 f43570a = new C13708xc7b00ed9();

    public C13708xc7b00ed9() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53247a(obj));
    }

    /* renamed from: a */
    public final boolean m53247a(@Nullable Object obj) {
        return obj instanceof MessageViewModel;
    }
}
