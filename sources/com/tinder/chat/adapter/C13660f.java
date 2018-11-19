package com.tinder.chat.adapter;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/chat/adapter/NoMorphTypingIndicatorItemAnimator;", "Landroid/support/v7/widget/DefaultItemAnimator;", "()V", "canReuseUpdatedViewHolder", "", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.adapter.f */
public final class C13660f extends DefaultItemAnimator {
    public boolean canReuseUpdatedViewHolder(@NotNull ViewHolder viewHolder, @NotNull List<Object> list) {
        C2668g.b(viewHolder, "viewHolder");
        C2668g.b(list, "payloads");
        return list.contains("TYPING_INDICATOR") ^ 1;
    }
}
