package com.tinder.settingsemail.email.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import com.tinder.settingsemail.email.adapter.EmailSettingsAdapter;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setEmailSettings", "", "listOfEmailSettingsRowViewModels", "", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettingsRecyclerView extends RecyclerView {
    public EmailSettingsRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        setLayoutManager((LayoutManager) new LinearLayoutManager(context));
    }

    public final void setEmailSettings(@NotNull List<? extends EmailSettingsRowViewModel> list) {
        C2668g.b(list, "listOfEmailSettingsRowViewModels");
        Adapter adapter = getAdapter();
        if (adapter == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.adapter.EmailSettingsAdapter");
        }
        ((EmailSettingsAdapter) adapter).m62195a((List) list);
    }
}
