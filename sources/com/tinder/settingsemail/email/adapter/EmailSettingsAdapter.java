package com.tinder.settingsemail.email.adapter;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.settingsemail.C14921a.C14918d;
import com.tinder.settingsemail.email.view.EmailSettingsEmailRowView;
import com.tinder.settingsemail.email.view.EmailSettingsSwitchesView;
import com.tinder.settingsemail.email.view.EmailSettingsSwitchesView.OnCheckedListener;
import com.tinder.settingsemail.email.view.EmailSettingsUnsubscribeView;
import com.tinder.settingsemail.email.view.OnEmailInputChangedListener;
import com.tinder.settingsemail.email.viewmodel.C16710a;
import com.tinder.settingsemail.email.viewmodel.C16711b;
import com.tinder.settingsemail.email.viewmodel.C16712d;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.Type;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0014\u0010'\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter$EmailSettingsViewHolder;", "()V", "emailSettingsViewModel", "", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "itemCheckedChangeListener", "Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$OnCheckedListener;", "getItemCheckedChangeListener", "()Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$OnCheckedListener;", "setItemCheckedChangeListener", "(Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$OnCheckedListener;)V", "onEmailInputChangedListener", "Lcom/tinder/settingsemail/email/view/OnEmailInputChangedListener;", "getOnEmailInputChangedListener", "()Lcom/tinder/settingsemail/email/view/OnEmailInputChangedListener;", "setOnEmailInputChangedListener", "(Lcom/tinder/settingsemail/email/view/OnEmailInputChangedListener;)V", "typeMap", "", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Type;", "", "unsubscribeListener", "Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter$UnsubscribeListener;", "getUnsubscribeListener", "()Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter$UnsubscribeListener;", "setUnsubscribeListener", "(Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter$UnsubscribeListener;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "listOfEmailSettingsRowViewModels", "EmailSettingsViewHolder", "UnsubscribeListener", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettingsAdapter extends Adapter<C16697a> {
    @Nullable
    /* renamed from: a */
    private UnsubscribeListener f51668a;
    @Nullable
    /* renamed from: b */
    private OnCheckedListener f51669b;
    @Nullable
    /* renamed from: c */
    private OnEmailInputChangedListener f51670c;
    /* renamed from: d */
    private List<? extends EmailSettingsRowViewModel> f51671d = C17554o.m64195a();
    /* renamed from: e */
    private final Map<Type, Integer> f51672e = ah.m66889a(C15811g.m59834a(Type.EMAIL, Integer.valueOf(1)), C15811g.m59834a(Type.SETTING_OPTIONS, Integer.valueOf(2)), C15811g.m59834a(Type.UNSUBSCRIBE, Integer.valueOf(3)));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter$UnsubscribeListener;", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "onUnsubscribeClick", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    public interface UnsubscribeListener extends OnClickListener {

        @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.settingsemail.email.adapter.EmailSettingsAdapter$UnsubscribeListener$a */
        public static final class C14924a {
            /* renamed from: a */
            public static void m56388a(UnsubscribeListener unsubscribeListener, @Nullable View view) {
                unsubscribeListener.onUnsubscribeClick();
            }
        }

        void onClick(@Nullable View view);

        void onUnsubscribeClick();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter$EmailSettingsViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/ViewGroup;", "layoutRes", "", "(Landroid/view/ViewGroup;I)V", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.adapter.EmailSettingsAdapter$a */
    public static final class C16697a extends ViewHolder {
        public C16697a(@NotNull ViewGroup viewGroup, @LayoutRes int i) {
            C2668g.b(viewGroup, "container");
            super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m62192a((C16697a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m62190a(viewGroup, i);
    }

    /* renamed from: a */
    public final void m62191a(@Nullable UnsubscribeListener unsubscribeListener) {
        this.f51668a = unsubscribeListener;
    }

    /* renamed from: a */
    public final void m62193a(@Nullable OnCheckedListener onCheckedListener) {
        this.f51669b = onCheckedListener;
    }

    /* renamed from: a */
    public final void m62194a(@Nullable OnEmailInputChangedListener onEmailInputChangedListener) {
        this.f51670c = onEmailInputChangedListener;
    }

    @NotNull
    /* renamed from: a */
    public C16697a m62190a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        Integer num = (Integer) this.f51672e.get(Type.EMAIL);
        if (num != null) {
            if (i == num.intValue()) {
                i = C14918d.view_email_row;
                return new C16697a(viewGroup, i);
            }
        }
        num = (Integer) this.f51672e.get(Type.SETTING_OPTIONS);
        if (num != null) {
            if (i == num.intValue()) {
                i = C14918d.view_email_settings_switches;
                return new C16697a(viewGroup, i);
            }
        }
        num = (Integer) this.f51672e.get(Type.UNSUBSCRIBE);
        if (num != null) {
            if (i == num.intValue()) {
                i = C14918d.view_unsubscribe;
                return new C16697a(viewGroup, i);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unconfigured viewType ");
        stringBuilder.append(i);
        throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
    }

    public int getItemViewType(int i) {
        i = this.f51672e.get(((EmailSettingsRowViewModel) this.f51671d.get(i)).getType());
        if (i != 0) {
            return ((Number) i).intValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public int getItemCount() {
        return this.f51671d.size();
    }

    /* renamed from: a */
    public void m62192a(@NotNull C16697a c16697a, int i) {
        C2668g.b(c16697a, "holder");
        EmailSettingsRowViewModel emailSettingsRowViewModel = (EmailSettingsRowViewModel) this.f51671d.get(i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View model is: ");
        stringBuilder.append(this.f51671d);
        int i2 = 0;
        C0001a.b(stringBuilder.toString(), new Object[0]);
        switch (C14925a.f46618a[emailSettingsRowViewModel.getType().ordinal()]) {
            case 1:
                c16697a = c16697a.itemView;
                if (c16697a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.view.EmailSettingsEmailRowView");
                }
                EmailSettingsEmailRowView emailSettingsEmailRowView = (EmailSettingsEmailRowView) c16697a;
                if (emailSettingsRowViewModel == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.viewmodel.EmailSettingsEmailRowViewModel");
                }
                emailSettingsEmailRowView.m56406a((C16710a) emailSettingsRowViewModel);
                i = this.f51670c;
                if (i == 0) {
                    throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
                }
                emailSettingsEmailRowView.setTextChangedListener(i);
                return;
            case 2:
                c16697a = c16697a.itemView;
                if (c16697a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.view.EmailSettingsSwitchesView");
                }
                EmailSettingsSwitchesView emailSettingsSwitchesView = (EmailSettingsSwitchesView) c16697a;
                if (emailSettingsRowViewModel == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.viewmodel.EmailSettingsOptionRowViewModel");
                }
                C16711b c16711b = (C16711b) emailSettingsRowViewModel;
                emailSettingsSwitchesView.m56410a((EmailSettingsRowViewModel) c16711b);
                int size = c16711b.m62221a().size();
                while (i2 < size) {
                    OnCheckedListener onCheckedListener = this.f51669b;
                    if (onCheckedListener == null) {
                        throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
                    }
                    emailSettingsSwitchesView.m56409a(onCheckedListener, ((EmailSettingOption) c16711b.m62221a().get(i2)).getType());
                    i2++;
                }
                return;
            case 3:
                c16697a = c16697a.itemView;
                if (c16697a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.view.EmailSettingsUnsubscribeView");
                }
                EmailSettingsUnsubscribeView emailSettingsUnsubscribeView = (EmailSettingsUnsubscribeView) c16697a;
                UnsubscribeListener unsubscribeListener = this.f51668a;
                if (unsubscribeListener == null) {
                    throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
                }
                emailSettingsUnsubscribeView.setButtonClickListener(unsubscribeListener);
                if (emailSettingsRowViewModel == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.viewmodel.EmailSettingsUnsubscribeRowViewModel");
                }
                emailSettingsUnsubscribeView.m56411a((C16712d) emailSettingsRowViewModel);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void m62195a(@NotNull List<? extends EmailSettingsRowViewModel> list) {
        C2668g.b(list, "listOfEmailSettingsRowViewModels");
        this.f51671d = list;
        notifyDataSetChanged();
    }
}
