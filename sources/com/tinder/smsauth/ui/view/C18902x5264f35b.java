package com.tinder.smsauth.ui.view;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "box", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCodeBoxEditText;", "invoke", "com/tinder/smsauth/ui/view/OneTimePasswordCodeInputView$createNewBox$1$2"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView$createNewBox$$inlined$apply$lambda$2 */
final class C18902x5264f35b extends Lambda implements Function1<OneTimePasswordCodeBoxEditText, C15813i> {
    /* renamed from: a */
    final /* synthetic */ OneTimePasswordCodeInputView f58543a;

    C18902x5264f35b(OneTimePasswordCodeInputView oneTimePasswordCodeInputView) {
        this.f58543a = oneTimePasswordCodeInputView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67382a((OneTimePasswordCodeBoxEditText) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67382a(@NotNull OneTimePasswordCodeBoxEditText oneTimePasswordCodeBoxEditText) {
        C2668g.b(oneTimePasswordCodeBoxEditText, "box");
        oneTimePasswordCodeBoxEditText = this.f58543a.m56617b(this.f58543a.indexOfChild(oneTimePasswordCodeBoxEditText) - 1);
        if (oneTimePasswordCodeBoxEditText != null) {
            oneTimePasswordCodeBoxEditText.m65824a();
        }
    }
}
