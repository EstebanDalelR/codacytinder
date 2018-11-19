package com.tinder.gold;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.view.SwitchRowView;
import com.tinder.base.view.SwitchRowView.CheckStatusListener;
import com.tinder.gold.C9692b.C9685a;
import com.tinder.gold.C9692b.C9687c;
import com.tinder.gold.C9692b.C9688d;
import com.tinder.gold.C9692b.C9689e;
import com.tinder.gold.C9692b.C9690f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.ranges.C19068g;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004/012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0012J\u0012\u0010,\u001a\b\u0012\u0004\u0012\u00020%0-*\u00020.H\u0002R\u001b\u0010\u0007\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u00063"}, d2 = {"Lcom/tinder/gold/DropdownOptionsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "optionsDropdown", "getOptionsDropdown", "()Landroid/widget/LinearLayout;", "optionsDropdown$delegate", "Lkotlin/Lazy;", "optionsSwitch", "Lcom/tinder/base/view/SwitchRowView;", "getOptionsSwitch", "()Lcom/tinder/base/view/SwitchRowView;", "optionsSwitch$delegate", "secondaryTextStyle", "", "Ljava/lang/Integer;", "settingsDropdownListener", "Lcom/tinder/gold/DropdownOptionsView$SettingsDropdownListener;", "getSettingsDropdownListener", "()Lcom/tinder/gold/DropdownOptionsView$SettingsDropdownListener;", "setSettingsDropdownListener", "(Lcom/tinder/gold/DropdownOptionsView$SettingsDropdownListener;)V", "textStyle", "addAndBindOption", "", "optionViewModel", "Lcom/tinder/gold/DropdownOptionsView$OptionViewModel;", "bind", "viewModel", "Lcom/tinder/gold/DropdownOptionsView$ViewModel;", "hidePreferenceChecks", "onOptionClick", "view", "Landroid/view/View;", "setDefaultOption", "defaultOption", "", "setSecondaryTextStyle", "styleInt", "setTextStyle", "views", "", "Landroid/view/ViewGroup;", "Factory", "OptionViewModel", "SettingsDropdownListener", "ViewModel", "gold_release"}, k = 1, mv = {1, 1, 10})
public class DropdownOptionsView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f32254a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(DropdownOptionsView.class), "optionsSwitch", "getOptionsSwitch()Lcom/tinder/base/view/SwitchRowView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(DropdownOptionsView.class), "optionsDropdown", "getOptionsDropdown()Landroid/widget/LinearLayout;"))};
    /* renamed from: b */
    private final Lazy f32255b = C18451c.a(LazyThreadSafetyMode.NONE, new DropdownOptionsView$$special$$inlined$bindView$1(this, C9687c.options_switch));
    /* renamed from: c */
    private final Lazy f32256c = C18451c.a(LazyThreadSafetyMode.NONE, new DropdownOptionsView$$special$$inlined$bindView$2(this, C9687c.options_dropdown));
    @Nullable
    /* renamed from: d */
    private SettingsDropdownListener f32257d;
    /* renamed from: e */
    private Integer f32258e;
    /* renamed from: f */
    private Integer f32259f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/gold/DropdownOptionsView$SettingsDropdownListener;", "", "onOptionSelect", "", "value", "onSwitchToggle", "isChecked", "", "gold_release"}, k = 1, mv = {1, 1, 10})
    public interface SettingsDropdownListener {
        void onOptionSelect(@NotNull Object obj);

        void onSwitchToggle(boolean z);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/gold/DropdownOptionsView$Factory;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "fromFastMatchNotificationOptions", "Lcom/tinder/gold/DropdownOptionsView$ViewModel;", "notificationOptions", "", "", "selectedOption", "defaultOption", "gold_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.DropdownOptionsView$a */
    public static final class C9679a {
        /* renamed from: a */
        private final Resources f32243a;

        @Inject
        public C9679a(@NotNull Resources resources) {
            C2668g.b(resources, "resources");
            this.f32243a = resources;
        }

        @NotNull
        /* renamed from: a */
        public final C9681c m40127a(@NotNull List<Integer> list, int i, int i2) {
            boolean z;
            C2668g.b(list, "notificationOptions");
            String string = this.f32243a.getString(C9690f.new_likes);
            String string2 = this.f32243a.getString(C9690f.new_likes_notification_description);
            Collection arrayList = new ArrayList();
            list = list.iterator();
            while (true) {
                int i3 = 0;
                z = true;
                if (!list.hasNext()) {
                    break;
                }
                Object next = list.next();
                if (((Number) next).intValue() > 0) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    arrayList.add(next);
                }
            }
            Iterable<Number> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(C19301m.a(iterable, 10));
            for (Number intValue : iterable) {
                int intValue2 = intValue.intValue();
                String quantityString = this.f32243a.getQuantityString(C9689e.every_x_new_like, intValue2, new Object[]{Integer.valueOf(intValue2)});
                C2668g.a(quantityString, "notificationOptionTitle");
                arrayList2.add(new C9680b(quantityString, Integer.valueOf(intValue2), intValue2 == i));
            }
            List list2 = (List) arrayList2;
            C2668g.a(string, ManagerWebServices.PARAM_JOB_TITLE);
            C2668g.a(string2, "subtitle");
            if (i == 0) {
                z = false;
            }
            return new C9681c(string, string2, z, list2, Integer.valueOf(i2));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tinder/gold/DropdownOptionsView$OptionViewModel;", "", "optionName", "", "value", "isSelected", "", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "()Z", "getOptionName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "gold_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.DropdownOptionsView$b */
    public static final class C9680b {
        @NotNull
        /* renamed from: a */
        private final String f32244a;
        @NotNull
        /* renamed from: b */
        private final Object f32245b;
        /* renamed from: c */
        private final boolean f32246c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9680b) {
                C9680b c9680b = (C9680b) obj;
                if (C2668g.a(this.f32244a, c9680b.f32244a) && C2668g.a(this.f32245b, c9680b.f32245b)) {
                    if ((this.f32246c == c9680b.f32246c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f32244a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.f32245b;
            if (obj != null) {
                i = obj.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f32246c;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OptionViewModel(optionName=");
            stringBuilder.append(this.f32244a);
            stringBuilder.append(", value=");
            stringBuilder.append(this.f32245b);
            stringBuilder.append(", isSelected=");
            stringBuilder.append(this.f32246c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9680b(@NotNull String str, @NotNull Object obj, boolean z) {
            C2668g.b(str, "optionName");
            C2668g.b(obj, "value");
            this.f32244a = str;
            this.f32245b = obj;
            this.f32246c = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m40128a() {
            return this.f32244a;
        }

        @NotNull
        /* renamed from: b */
        public final Object m40129b() {
            return this.f32245b;
        }

        /* renamed from: c */
        public final boolean m40130c() {
            return this.f32246c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/tinder/gold/DropdownOptionsView$ViewModel;", "", "title", "", "subtitle", "isChecked", "", "options", "", "Lcom/tinder/gold/DropdownOptionsView$OptionViewModel;", "defaultOption", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Object;)V", "getDefaultOption", "()Ljava/lang/Object;", "()Z", "getOptions", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "gold_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.DropdownOptionsView$c */
    public static final class C9681c {
        @NotNull
        /* renamed from: a */
        private final String f32247a;
        @NotNull
        /* renamed from: b */
        private final String f32248b;
        /* renamed from: c */
        private final boolean f32249c;
        @NotNull
        /* renamed from: d */
        private final List<C9680b> f32250d;
        @NotNull
        /* renamed from: e */
        private final Object f32251e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9681c) {
                C9681c c9681c = (C9681c) obj;
                if (C2668g.a(this.f32247a, c9681c.f32247a) && C2668g.a(this.f32248b, c9681c.f32248b)) {
                    return (this.f32249c == c9681c.f32249c ? 1 : null) != null && C2668g.a(this.f32250d, c9681c.f32250d) && C2668g.a(this.f32251e, c9681c.f32251e);
                }
            }
        }

        public int hashCode() {
            String str = this.f32247a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f32248b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            int i2 = this.f32249c;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            List list = this.f32250d;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            Object obj = this.f32251e;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewModel(title=");
            stringBuilder.append(this.f32247a);
            stringBuilder.append(", subtitle=");
            stringBuilder.append(this.f32248b);
            stringBuilder.append(", isChecked=");
            stringBuilder.append(this.f32249c);
            stringBuilder.append(", options=");
            stringBuilder.append(this.f32250d);
            stringBuilder.append(", defaultOption=");
            stringBuilder.append(this.f32251e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9681c(@NotNull String str, @NotNull String str2, boolean z, @NotNull List<C9680b> list, @NotNull Object obj) {
            C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
            C2668g.b(str2, "subtitle");
            C2668g.b(list, "options");
            C2668g.b(obj, "defaultOption");
            this.f32247a = str;
            this.f32248b = str2;
            this.f32249c = z;
            this.f32250d = list;
            this.f32251e = obj;
        }

        @NotNull
        /* renamed from: a */
        public final String m40131a() {
            return this.f32247a;
        }

        @NotNull
        /* renamed from: b */
        public final String m40132b() {
            return this.f32248b;
        }

        /* renamed from: c */
        public final boolean m40133c() {
            return this.f32249c;
        }

        @NotNull
        /* renamed from: d */
        public final List<C9680b> m40134d() {
            return this.f32250d;
        }

        @NotNull
        /* renamed from: e */
        public final Object m40135e() {
            return this.f32251e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.DropdownOptionsView$d */
    static final class C9682d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ DropdownOptionsView f32252a;
        /* renamed from: b */
        final /* synthetic */ C9680b f32253b;

        C9682d(DropdownOptionsView dropdownOptionsView, C9680b c9680b) {
            this.f32252a = dropdownOptionsView;
            this.f32253b = c9680b;
        }

        public final void onClick(View view) {
            DropdownOptionsView dropdownOptionsView = this.f32252a;
            C2668g.a(view, "it");
            dropdownOptionsView.m40139a(view, this.f32253b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/gold/DropdownOptionsView$bind$3", "Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "(Lcom/tinder/gold/DropdownOptionsView;Lcom/tinder/gold/DropdownOptionsView$ViewModel;)V", "onChecked", "", "onUnChecked", "gold_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.DropdownOptionsView$e */
    public static final class C11857e implements CheckStatusListener {
        /* renamed from: a */
        final /* synthetic */ DropdownOptionsView f38672a;
        /* renamed from: b */
        final /* synthetic */ C9681c f38673b;

        C11857e(DropdownOptionsView dropdownOptionsView, C9681c c9681c) {
            this.f38672a = dropdownOptionsView;
            this.f38673b = c9681c;
        }

        public void onChecked() {
            SettingsDropdownListener settingsDropdownListener = this.f38672a.getSettingsDropdownListener();
            if (settingsDropdownListener != null) {
                settingsDropdownListener.onSwitchToggle(true);
            }
            this.f38672a.getOptionsDropdown().setVisibility(0);
            this.f38672a.setDefaultOption(this.f38673b.m40135e());
            settingsDropdownListener = this.f38672a.getSettingsDropdownListener();
            if (settingsDropdownListener != null) {
                settingsDropdownListener.onOptionSelect(this.f38673b.m40135e());
            }
        }

        public void onUnChecked() {
            SettingsDropdownListener settingsDropdownListener = this.f38672a.getSettingsDropdownListener();
            if (settingsDropdownListener != null) {
                settingsDropdownListener.onSwitchToggle(false);
            }
            this.f38672a.getOptionsDropdown().setVisibility(8);
        }
    }

    private final LinearLayout getOptionsDropdown() {
        Lazy lazy = this.f32256c;
        KProperty kProperty = f32254a[1];
        return (LinearLayout) lazy.getValue();
    }

    private final SwitchRowView getOptionsSwitch() {
        Lazy lazy = this.f32255b;
        KProperty kProperty = f32254a[0];
        return (SwitchRowView) lazy.getValue();
    }

    public DropdownOptionsView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        LinearLayout.inflate(context, C9688d.dropdown_options_switch, this);
        setOrientation(1);
    }

    @Nullable
    public final SettingsDropdownListener getSettingsDropdownListener() {
        return this.f32257d;
    }

    public final void setSettingsDropdownListener(@Nullable SettingsDropdownListener settingsDropdownListener) {
        this.f32257d = settingsDropdownListener;
    }

    /* renamed from: a */
    public final void m40143a(@NotNull C9681c c9681c) {
        C2668g.b(c9681c, "viewModel");
        getOptionsSwitch().setText(c9681c.m40131a());
        getOptionsSwitch().setSecondaryText(c9681c.m40132b());
        Integer num = this.f32258e;
        if (num != null) {
            getOptionsSwitch().setTextStyle(num.intValue());
        }
        num = this.f32259f;
        if (num != null) {
            getOptionsSwitch().setSecondaryTextStyle(num.intValue());
        }
        getOptionsSwitch().setCheckStatusListener(new C11857e(this, c9681c));
        getOptionsSwitch().setChecked(c9681c.m40133c());
        getOptionsDropdown().removeAllViews();
        Iterable<C9680b> d = c9681c.m40134d();
        Collection arrayList = new ArrayList(C19301m.a(d, 10));
        for (C9680b a : d) {
            m40140a(a);
            arrayList.add(C15813i.f49016a);
        }
        List list = (List) arrayList;
        getOptionsDropdown().setVisibility(c9681c.m40133c() != null ? null : 8);
    }

    public final void setTextStyle(int i) {
        this.f32258e = Integer.valueOf(i);
    }

    public final void setSecondaryTextStyle(int i) {
        this.f32259f = Integer.valueOf(i);
    }

    /* renamed from: a */
    private final void m40140a(C9680b c9680b) {
        View inflate = LayoutInflater.from(getContext()).inflate(C9688d.dropdown_option_item, getOptionsDropdown(), false);
        TextView textView = (TextView) inflate.findViewById(C9687c.option_name);
        ImageView imageView = (ImageView) inflate.findViewById(C9687c.preference_check);
        C2668g.a(textView, "optionTitle");
        textView.setText(c9680b.m40128a());
        Integer num = this.f32258e;
        if (num != null) {
            TextViewCompat.a(textView, num.intValue());
        }
        Context context = getContext();
        C2668g.a(context, "context");
        imageView.setColorFilter(context.getResources().getColor(C9685a.tinder_dark_red));
        C2668g.a(imageView, "preferenceCheck");
        imageView.setVisibility(c9680b.m40130c() ? 0 : 8);
        inflate.setOnClickListener(new C9682d(this, c9680b));
        C2668g.a(inflate, "view");
        inflate.setVisibility(0);
        inflate.setTag(c9680b.m40129b());
        getOptionsDropdown().addView(inflate);
    }

    /* renamed from: a */
    private final void m40139a(View view, C9680b c9680b) {
        ImageView imageView = (ImageView) view.findViewById(C9687c.preference_check);
        C2668g.a(imageView, "preferenceCheck");
        if (imageView.getVisibility() != 0) {
            m40138a();
            imageView.setVisibility(0);
            view = this.f32257d;
            if (view != null) {
                view.onOptionSelect(c9680b.m40129b());
            }
        }
    }

    private final void setDefaultOption(Object obj) {
        Iterable<View> a = m40137a((ViewGroup) getOptionsDropdown());
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        for (View view : a) {
            ImageView imageView = (ImageView) view.findViewById(C9687c.preference_check);
            C2668g.a(imageView, "preferenceCheck");
            imageView.setVisibility(C2668g.a(view.getTag(), obj) ? 0 : 8);
            arrayList.add(C15813i.f49016a);
        }
        List list = (List) arrayList;
    }

    /* renamed from: a */
    private final void m40138a() {
        Iterable<View> a = m40137a((ViewGroup) getOptionsDropdown());
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        for (View findViewById : a) {
            ImageView imageView = (ImageView) findViewById.findViewById(C9687c.preference_check);
            C2668g.a(imageView, "preferenceCheck");
            imageView.setVisibility(8);
            arrayList.add(C15813i.f49016a);
        }
        List list = (List) arrayList;
    }

    /* renamed from: a */
    private final List<View> m40137a(@NotNull ViewGroup viewGroup) {
        Iterable b = C19068g.b(0, viewGroup.getChildCount());
        Collection arrayList = new ArrayList(C19301m.a(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((ab) it).b()));
        }
        return (List) arrayList;
    }
}
