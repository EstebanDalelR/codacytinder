package com.tinder.recs.view;

import android.view.View;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardStackLayout.OnCardPresentedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "card", "Lcom/tinder/cardstack/model/Card;", "", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "onCardPresented"}, k = 3, mv = {1, 1, 10})
final class RecsView$onCardPresentedListener$1 implements OnCardPresentedListener {
    final /* synthetic */ RecsView this$0;

    RecsView$onCardPresentedListener$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public final void onCardPresented(@NotNull C8395a<Object> c8395a, @NotNull View view) {
        C2668g.b(c8395a, "card");
        C2668g.b(view, "view");
        if ((view instanceof RecCardView) != null) {
            RecsView.access$setTopRecCardView$p(this.this$0, (RecCardView) view);
            c8395a = RecsView.access$getTopRec$p(this.this$0);
            if (c8395a != null) {
                this.this$0.getPresenter$Tinder_release().onRecPresented(c8395a);
                return;
            }
            return;
        }
        view = new StringBuilder();
        view.append("View should be instance of:");
        view.append(RecCardView.class);
        throw ((Throwable) new IllegalStateException(view.toString()));
    }
}
