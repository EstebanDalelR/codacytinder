package com.tinder.verification;

import android.view.View;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "Landroid/view/View;", "invoke", "()Landroid/view/View;", "com/tinder/utils/ViewBindingKt$bindView$2"}, k = 3, mv = {1, 1, 10})
public final class VerificationView$$special$$inlined$bindView$7 extends Lambda implements Function0<ProgressBar> {
    /* renamed from: a */
    final /* synthetic */ View f58757a;
    /* renamed from: b */
    final /* synthetic */ int f58758b;

    public VerificationView$$special$$inlined$bindView$7(View view, int i) {
        this.f58757a = view;
        this.f58758b = i;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67527a();
    }

    @NotNull
    /* renamed from: a */
    public final ProgressBar m67527a() {
        View findViewById = this.f58757a.findViewById(this.f58758b);
        if (findViewById != null) {
            return findViewById;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't find view: ");
        stringBuilder.append(ProgressBar.class.getSimpleName());
        stringBuilder.append(" with id: ");
        stringBuilder.append(this.f58758b);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
