package com.tinder.base.view;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "Landroid/view/View;", "invoke", "()Landroid/view/View;", "com/tinder/utils/ViewBindingKt$bindView$2"}, k = 3, mv = {1, 1, 10})
public final class SwitchRowView$$special$$inlined$bindView$1 extends Lambda implements Function0<TextView> {
    /* renamed from: a */
    final /* synthetic */ View f43451a;
    /* renamed from: b */
    final /* synthetic */ int f43452b;

    public SwitchRowView$$special$$inlined$bindView$1(View view, int i) {
        this.f43451a = view;
        this.f43452b = i;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53164a();
    }

    @NotNull
    /* renamed from: a */
    public final TextView m53164a() {
        View findViewById = this.f43451a.findViewById(this.f43452b);
        if (findViewById != null) {
            return findViewById;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't find view: ");
        stringBuilder.append(TextView.class.getSimpleName());
        stringBuilder.append(" with id: ");
        stringBuilder.append(this.f43452b);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
