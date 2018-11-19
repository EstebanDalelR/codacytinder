package com.tinder.messageads.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tinder.messageads.C9905b.C9900a;
import com.tinder.messageads.C9905b.C9901b;
import com.tinder.messageads.model.C9912b.C9911a;
import com.tinder.messageads.view.MessageAdSettingsRowItemView.OnCheckedListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "confirmButton", "Landroid/widget/TextView;", "recyclerView", "Lcom/tinder/messageads/view/MessageAdSettingsRecyclerView;", "bind", "", "typeOptInSettings", "", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "setConfirmListener", "confirmListener", "Lcom/tinder/messageads/view/MessageAdSettingsView$ConfirmListener;", "setItemCheckChangeListener", "onCheckedListener", "Lcom/tinder/messageads/view/MessageAdSettingsRowItemView$OnCheckedListener;", "ConfirmListener", "message-ads_release"}, k = 1, mv = {1, 1, 10})
public final class MessageAdSettingsView extends CardView {
    /* renamed from: a */
    private final MessageAdSettingsRecyclerView f39378a;
    /* renamed from: b */
    private final TextView f39379b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsView$ConfirmListener;", "", "onConfirmClicked", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    public interface ConfirmListener {
        void onConfirmClicked();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.view.MessageAdSettingsView$a */
    static final class C9915a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ConfirmListener f32772a;

        C9915a(ConfirmListener confirmListener) {
            this.f32772a = confirmListener;
        }

        public final void onClick(View view) {
            this.f32772a.onConfirmClicked();
        }
    }

    public MessageAdSettingsView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        CardView.inflate(context, C9901b.message_ad_settings_view, this);
        context = findViewById(C9900a.message_ad_settings_recycler_view);
        C2668g.a(context, "findViewById(R.id.messag…d_settings_recycler_view)");
        this.f39378a = (MessageAdSettingsRecyclerView) context;
        context = findViewById(C9900a.manage_ad_message_preferences_confirm_button);
        C2668g.a(context, "findViewById(R.id.manage…eferences_confirm_button)");
        this.f39379b = (TextView) context;
    }

    /* renamed from: a */
    public final void m48287a(@NotNull List<C9911a> list) {
        C2668g.b(list, "typeOptInSettings");
        this.f39378a.setTypeOptInSettings(list);
    }

    public final void setConfirmListener(@NotNull ConfirmListener confirmListener) {
        C2668g.b(confirmListener, "confirmListener");
        this.f39379b.setOnClickListener(new C9915a(confirmListener));
    }

    public final void setItemCheckChangeListener(@NotNull OnCheckedListener onCheckedListener) {
        C2668g.b(onCheckedListener, "onCheckedListener");
        this.f39378a.setItemCheckChangeListener(onCheckedListener);
    }
}
