package com.tinder.messageads.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.messageads.C9905b.C9900a;
import com.tinder.messageads.C9905b.C9902c;
import com.tinder.messageads.model.C9912b.C9911a;
import java.util.Map;
import kotlin.C15811g;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsRowItemView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "primaryTextView", "Landroid/widget/TextView;", "getPrimaryTextView", "()Landroid/widget/TextView;", "primaryTextView$delegate", "Lkotlin/Lazy;", "secondaryTextView", "getSecondaryTextView", "secondaryTextView$delegate", "switch", "Landroid/widget/Switch;", "getSwitch", "()Landroid/widget/Switch;", "switch$delegate", "typeOptInSetting", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "typeOptInSettingsStringMap", "", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "Lkotlin/Pair;", "", "bind", "", "setOnTypeOptInSettingChangedListener", "onCheckedListener", "Lcom/tinder/messageads/view/MessageAdSettingsRowItemView$OnCheckedListener;", "OnCheckedListener", "message-ads_release"}, k = 1, mv = {1, 1, 10})
public final class MessageAdSettingsRowItemView extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39372a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(MessageAdSettingsRowItemView.class), "primaryTextView", "getPrimaryTextView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(MessageAdSettingsRowItemView.class), "secondaryTextView", "getSecondaryTextView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(MessageAdSettingsRowItemView.class), "switch", "getSwitch()Landroid/widget/Switch;"))};
    /* renamed from: b */
    private final Map<Type, Pair<Integer, Integer>> f39373b = ae.a(C15811g.a(Type.SPONSORED, new Pair(Integer.valueOf(C9902c.sponsored_ads), Integer.valueOf(C9902c.sponsored_ads_companion_text))));
    /* renamed from: c */
    private final Lazy f39374c = C18451c.a(LazyThreadSafetyMode.NONE, new MessageAdSettingsRowItemView$$special$$inlined$bindView$1(this, C9900a.toggle_row_primary_text));
    /* renamed from: d */
    private final Lazy f39375d = C18451c.a(LazyThreadSafetyMode.NONE, new MessageAdSettingsRowItemView$$special$$inlined$bindView$2(this, C9900a.toggle_row_secondary_text));
    /* renamed from: e */
    private final Lazy f39376e = C18451c.a(LazyThreadSafetyMode.NONE, new MessageAdSettingsRowItemView$$special$$inlined$bindView$3(this, C9900a.toggle_row_switch));
    /* renamed from: f */
    private C9911a f39377f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/messageads/view/MessageAdSettingsRowItemView$OnCheckedListener;", "", "onChecked", "", "messageAdMatchType", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "onUnChecked", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    public interface OnCheckedListener {
        void onChecked(@NotNull Type type);

        void onUnChecked(@NotNull Type type);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "compoundButton", "Landroid/widget/CompoundButton;", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.view.MessageAdSettingsRowItemView$a */
    static final class C9914a implements OnCheckedChangeListener {
        /* renamed from: a */
        final /* synthetic */ MessageAdSettingsRowItemView f32770a;
        /* renamed from: b */
        final /* synthetic */ OnCheckedListener f32771b;

        C9914a(MessageAdSettingsRowItemView messageAdSettingsRowItemView, OnCheckedListener onCheckedListener) {
            this.f32770a = messageAdSettingsRowItemView;
            this.f32771b = onCheckedListener;
        }

        public final void onCheckedChanged(@NotNull CompoundButton compoundButton, boolean z) {
            C2668g.b(compoundButton, "compoundButton");
            if (z) {
                this.f32771b.onChecked(MessageAdSettingsRowItemView.m48285a(this.f32770a).m40750a());
            } else {
                this.f32771b.onUnChecked(MessageAdSettingsRowItemView.m48285a(this.f32770a).m40750a());
            }
        }
    }

    private final TextView getPrimaryTextView() {
        Lazy lazy = this.f39374c;
        KProperty kProperty = f39372a[0];
        return (TextView) lazy.getValue();
    }

    private final TextView getSecondaryTextView() {
        Lazy lazy = this.f39375d;
        KProperty kProperty = f39372a[1];
        return (TextView) lazy.getValue();
    }

    private final Switch getSwitch() {
        Lazy lazy = this.f39376e;
        KProperty kProperty = f39372a[2];
        return (Switch) lazy.getValue();
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ C9911a m48285a(MessageAdSettingsRowItemView messageAdSettingsRowItemView) {
        messageAdSettingsRowItemView = messageAdSettingsRowItemView.f39377f;
        if (messageAdSettingsRowItemView == null) {
            C2668g.b("typeOptInSetting");
        }
        return messageAdSettingsRowItemView;
    }

    public MessageAdSettingsRowItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m48286a(@NotNull C9911a c9911a) {
        C2668g.b(c9911a, "typeOptInSetting");
        this.f39377f = c9911a;
        getSwitch().setChecked(c9911a.m40751b());
        Pair pair = (Pair) this.f39373b.get(c9911a.m40750a());
        if (pair != null) {
            getPrimaryTextView().setText(((Number) pair.a()).intValue());
            getSecondaryTextView().setText(((Number) pair.b()).intValue());
            return;
        }
        throw ((Throwable) new IllegalStateException("No model available for given Message Ad Match Type."));
    }

    public final void setOnTypeOptInSettingChangedListener(@NotNull OnCheckedListener onCheckedListener) {
        C2668g.b(onCheckedListener, "onCheckedListener");
        getSwitch().setOnCheckedChangeListener(new C9914a(this, onCheckedListener));
    }
}
