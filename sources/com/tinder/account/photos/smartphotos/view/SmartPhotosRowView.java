package com.tinder.account.photos.smartphotos.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tinder.account.C2612a.C2608e;
import com.tinder.account.C2612a.C2609f;
import com.tinder.base.view.SwitchRowView;
import com.tinder.base.view.SwitchRowView.CheckStatusListener;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000eR\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/account/photos/smartphotos/view/SmartPhotosRowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "switchRowView", "Lcom/tinder/base/view/SwitchRowView;", "getSwitchRowView", "()Lcom/tinder/base/view/SwitchRowView;", "switchRowView$delegate", "Lkotlin/Lazy;", "isToggleEnabled", "", "setSmartPhotosToggleListener", "", "checkStatusListener", "Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "setSmartPhotosToggleStatus", "isChecked", "account_release"}, k = 1, mv = {1, 1, 10})
public final class SmartPhotosRowView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f8200a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(SmartPhotosRowView.class), "switchRowView", "getSwitchRowView()Lcom/tinder/base/view/SwitchRowView;"))};
    /* renamed from: b */
    private final Lazy f8201b = C18451c.a(LazyThreadSafetyMode.NONE, new SmartPhotosRowView$$special$$inlined$bindView$1(this, C2608e.smart_photos_switch_row_view));

    private final SwitchRowView getSwitchRowView() {
        Lazy lazy = this.f8201b;
        KProperty kProperty = f8200a[0];
        return (SwitchRowView) lazy.getValue();
    }

    public SmartPhotosRowView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(attributeSet, "attributeSet");
        super(context, attributeSet);
        View.inflate(context, C2609f.view_smart_photos, this);
    }

    public final void setSmartPhotosToggleListener(@NotNull CheckStatusListener checkStatusListener) {
        C2668g.m10309b(checkStatusListener, "checkStatusListener");
        getSwitchRowView().setCheckStatusListener(checkStatusListener);
    }

    public final void setSmartPhotosToggleStatus(boolean z) {
        getSwitchRowView().a(z, false);
    }

    /* renamed from: a */
    public final boolean m9848a() {
        return getSwitchRowView().isEnabled();
    }
}
