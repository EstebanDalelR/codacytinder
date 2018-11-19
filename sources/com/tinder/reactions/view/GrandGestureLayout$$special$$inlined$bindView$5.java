package com.tinder.reactions.view;

import android.support.v7.widget.CardView;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "Landroid/view/View;", "invoke", "()Landroid/view/View;", "com/tinder/utils/ViewBindingKt$bindView$2"}, k = 3, mv = {1, 1, 10})
public final class GrandGestureLayout$$special$$inlined$bindView$5 extends Lambda implements Function0<CardView> {
    /* renamed from: a */
    final /* synthetic */ View f58269a;
    /* renamed from: b */
    final /* synthetic */ int f58270b;

    public GrandGestureLayout$$special$$inlined$bindView$5(View view, int i) {
        this.f58269a = view;
        this.f58270b = i;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67204a();
    }

    @NotNull
    /* renamed from: a */
    public final CardView m67204a() {
        View findViewById = this.f58269a.findViewById(this.f58270b);
        if (findViewById != null) {
            return findViewById;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't find view: ");
        stringBuilder.append(CardView.class.getSimpleName());
        stringBuilder.append(" with id: ");
        stringBuilder.append(this.f58270b);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
