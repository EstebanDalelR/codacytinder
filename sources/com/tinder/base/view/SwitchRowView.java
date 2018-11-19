package com.tinder.base.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.C8314i.C8311a;
import com.tinder.base.C8314i.C8312b;
import com.tinder.base.C8314i.C8313c;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001dJ\u000e\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\f¨\u0006*"}, d2 = {"Lcom/tinder/base/view/SwitchRowView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "secondarySwitchRowTextView", "Landroid/widget/TextView;", "getSecondarySwitchRowTextView", "()Landroid/widget/TextView;", "secondarySwitchRowTextView$delegate", "Lkotlin/Lazy;", "switch", "Landroid/widget/Switch;", "getSwitch", "()Landroid/widget/Switch;", "switch$delegate", "switchRowTextView", "getSwitchRowTextView", "switchRowTextView$delegate", "setCheckStatusListener", "", "onCheckedListener", "Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "setChecked", "isChecked", "", "shouldNotify", "setSecondaryText", "text", "", "setSecondaryTextStyle", "styleInt", "", "setSwitchEnabled", "isEnabled", "setText", "setTextStyle", "CheckStatusListener", "base_release"}, k = 1, mv = {1, 1, 10})
public class SwitchRowView extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33834a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(SwitchRowView.class), "switchRowTextView", "getSwitchRowTextView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(SwitchRowView.class), "secondarySwitchRowTextView", "getSecondarySwitchRowTextView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(SwitchRowView.class), "switch", "getSwitch()Landroid/widget/Switch;"))};
    /* renamed from: b */
    private final Lazy f33835b = C18451c.a(LazyThreadSafetyMode.NONE, new SwitchRowView$$special$$inlined$bindView$1(this, C8311a.new_switch_row_text_view));
    /* renamed from: c */
    private final Lazy f33836c = C18451c.a(LazyThreadSafetyMode.NONE, new SwitchRowView$$special$$inlined$bindView$2(this, C8311a.new_secondary_switch_row_text_view));
    /* renamed from: d */
    private final Lazy f33837d = C18451c.a(LazyThreadSafetyMode.NONE, new SwitchRowView$$special$$inlined$bindView$3(this, C8311a.new_switch_row_toggle));
    /* renamed from: e */
    private OnCheckedChangeListener f33838e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "", "onChecked", "", "onUnChecked", "base_release"}, k = 1, mv = {1, 1, 10})
    public interface CheckStatusListener {
        void onChecked();

        void onUnChecked();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.base.view.SwitchRowView$a */
    static final class C8316a implements OnCheckedChangeListener {
        /* renamed from: a */
        final /* synthetic */ CheckStatusListener f29597a;

        C8316a(CheckStatusListener checkStatusListener) {
            this.f29597a = checkStatusListener;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                compoundButton = this.f29597a;
                if (compoundButton != null) {
                    compoundButton.onChecked();
                    return;
                }
                return;
            }
            compoundButton = this.f29597a;
            if (compoundButton != null) {
                compoundButton.onUnChecked();
            }
        }
    }

    private final TextView getSecondarySwitchRowTextView() {
        Lazy lazy = this.f33836c;
        KProperty kProperty = f33834a[1];
        return (TextView) lazy.getValue();
    }

    private final Switch getSwitch() {
        Lazy lazy = this.f33837d;
        KProperty kProperty = f33834a[2];
        return (Switch) lazy.getValue();
    }

    private final TextView getSwitchRowTextView() {
        Lazy lazy = this.f33835b;
        KProperty kProperty = f33834a[0];
        return (TextView) lazy.getValue();
    }

    public SwitchRowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ConstraintLayout.inflate(context, C8312b.view_new_switch_row, this);
        context = context.getTheme().obtainStyledAttributes(attributeSet, C8313c.SwitchRowView, 0, 0);
        try {
            attributeSet = context.getString(C8313c.SwitchRowView_srv_switchText);
            if (attributeSet != null) {
                setText(attributeSet);
            }
            attributeSet = context.getResourceId(C8313c.SwitchRowView_srv_switchTextStyle, 0);
            if (attributeSet != null) {
                setTextStyle(attributeSet);
            }
            attributeSet = context.getString(C8313c.SwitchRowView_srv_secondary_switchText);
            if (attributeSet != null) {
                setSecondaryText(attributeSet);
            }
            setSecondaryTextStyle(context.getResourceId(C8313c.SwitchRowView_srv_secondary_switchTextStyle, 0));
        } finally {
            context.recycle();
        }
    }

    public final void setText(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        getSwitchRowTextView().setText(str);
    }

    public final void setChecked(boolean z) {
        getSwitch().setChecked(z);
    }

    public final void setSwitchEnabled(boolean z) {
        getSwitch().setEnabled(z);
    }

    /* renamed from: a */
    public final void m42194a(boolean z, boolean z2) {
        if (z2) {
            setChecked(z);
            return;
        }
        getSwitch().setOnCheckedChangeListener(null);
        setChecked(z);
        getSwitch().setOnCheckedChangeListener(this.f33838e);
    }

    public final void setTextStyle(int i) {
        TextViewCompat.a(getSwitchRowTextView(), i);
    }

    public final void setSecondaryText(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        getSecondarySwitchRowTextView().setVisibility(0);
        getSecondarySwitchRowTextView().setText(str);
    }

    public final void setSecondaryTextStyle(int i) {
        TextViewCompat.a(getSecondarySwitchRowTextView(), i);
    }

    public final void setCheckStatusListener(@Nullable CheckStatusListener checkStatusListener) {
        this.f33838e = new C8316a(checkStatusListener);
        getSwitch().setOnCheckedChangeListener(this.f33838e);
    }
}
