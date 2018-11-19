package com.tinder.notifications.view;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tinder.base.view.SwitchRowView.CheckStatusListener;
import com.tinder.common.view.C10707b;
import com.tinder.domain.pushnotifications.model.LikesYouPushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.pushnotifications.model.SimplePushNotificationSetting;
import com.tinder.gold.DropdownOptionsView.SettingsDropdownListener;
import com.tinder.notifications.C9953h.C9948b;
import com.tinder.notifications.C9953h.C9950d;
import com.tinder.utils.au;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingsRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter;", "setOnPushNotificationSettingChangedListener", "", "onPushNotificationSettingChangedListener", "Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$OnPushNotificationSettingChangedListener;", "setPushNotificationSettings", "pushNotificationSettings", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "NotificationSettingsAdapter", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
public final class NotificationSettingsRecyclerView extends RecyclerView {
    /* renamed from: a */
    private final NotificationSettingsAdapter f44616a = new NotificationSettingsAdapter(new ArrayList());

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$NotificationSettingViewHolder;", "items", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "onPushNotificationSettingChangedListener", "Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$OnPushNotificationSettingChangedListener;", "getOnPushNotificationSettingChangedListener", "()Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$OnPushNotificationSettingChangedListener;", "setOnPushNotificationSettingChangedListener", "(Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$OnPushNotificationSettingChangedListener;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChangedPushNotificationSettingFactory", "NotificationSettingViewHolder", "OnPushNotificationSettingChangedListener", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
    public static final class NotificationSettingsAdapter extends Adapter<C12147b> {
        @Nullable
        /* renamed from: a */
        private OnPushNotificationSettingChangedListener f39395a;
        @NotNull
        /* renamed from: b */
        private List<? extends PushNotificationSetting> f39396b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$OnPushNotificationSettingChangedListener;", "", "onPushNotificationSettingChangedListener", "", "pushNotificationSetting", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
        public interface OnPushNotificationSettingChangedListener {
            void onPushNotificationSettingChangedListener(@NotNull PushNotificationSetting pushNotificationSetting);
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$ChangedPushNotificationSettingFactory;", "", "()V", "fromOnLikesYouFrequencyChanged", "Lcom/tinder/domain/pushnotifications/model/LikesYouPushNotificationSetting;", "likesYouPushNotificationSetting", "value", "", "fromOnLikesYouToggled", "isChecked", "", "fromOnSimplePushNotificationToggled", "Lcom/tinder/domain/pushnotifications/model/SimplePushNotificationSetting;", "simplePushNotificationSetting", "enabled", "getFrequencyFromCheck", "default", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.notifications.view.NotificationSettingsRecyclerView$NotificationSettingsAdapter$a */
        public static final class C9954a {
            /* renamed from: a */
            public static final C9954a f32794a = new C9954a();

            /* renamed from: a */
            private final int m40919a(boolean z, int i) {
                return z ? i : 0;
            }

            private C9954a() {
            }

            @NotNull
            /* renamed from: a */
            public final SimplePushNotificationSetting m40922a(@NotNull SimplePushNotificationSetting simplePushNotificationSetting, boolean z) {
                C2668g.b(simplePushNotificationSetting, "simplePushNotificationSetting");
                return new SimplePushNotificationSetting(simplePushNotificationSetting.getPushNotificationType(), simplePushNotificationSetting.getChannelEnabled(), z);
            }

            @NotNull
            /* renamed from: a */
            public final LikesYouPushNotificationSetting m40921a(@NotNull LikesYouPushNotificationSetting likesYouPushNotificationSetting, boolean z) {
                C2668g.b(likesYouPushNotificationSetting, "likesYouPushNotificationSetting");
                return new LikesYouPushNotificationSetting(m40919a(z, likesYouPushNotificationSetting.getLikesYouNotificationSettingConfig().getFrequencyDefault()), likesYouPushNotificationSetting.getLikesYouNotificationSettingConfig());
            }

            @NotNull
            /* renamed from: a */
            public final LikesYouPushNotificationSetting m40920a(@NotNull LikesYouPushNotificationSetting likesYouPushNotificationSetting, int i) {
                C2668g.b(likesYouPushNotificationSetting, "likesYouPushNotificationSetting");
                return new LikesYouPushNotificationSetting(i, likesYouPushNotificationSetting.getLikesYouNotificationSettingConfig());
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$NotificationSettingViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/ViewGroup;", "layoutRes", "", "(Landroid/view/ViewGroup;I)V", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.notifications.view.NotificationSettingsRecyclerView$NotificationSettingsAdapter$b */
        public static final class C12147b extends ViewHolder {
            public C12147b(@NotNull ViewGroup viewGroup, @LayoutRes int i) {
                C2668g.b(viewGroup, "container");
                super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$onBindViewHolder$1", "Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "(Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter;Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;)V", "onChecked", "", "onUnChecked", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.notifications.view.NotificationSettingsRecyclerView$NotificationSettingsAdapter$c */
        public static final class C12148c implements CheckStatusListener {
            /* renamed from: a */
            final /* synthetic */ NotificationSettingsAdapter f39391a;
            /* renamed from: b */
            final /* synthetic */ PushNotificationSetting f39392b;

            C12148c(NotificationSettingsAdapter notificationSettingsAdapter, PushNotificationSetting pushNotificationSetting) {
                this.f39391a = notificationSettingsAdapter;
                this.f39392b = pushNotificationSetting;
            }

            public void onChecked() {
                OnPushNotificationSettingChangedListener a = this.f39391a.m48293a();
                if (a != null) {
                    a.onPushNotificationSettingChangedListener(C9954a.f32794a.m40922a((SimplePushNotificationSetting) this.f39392b, true));
                }
            }

            public void onUnChecked() {
                OnPushNotificationSettingChangedListener a = this.f39391a.m48293a();
                if (a != null) {
                    a.onPushNotificationSettingChangedListener(C9954a.f32794a.m40922a((SimplePushNotificationSetting) this.f39392b, false));
                }
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$onBindViewHolder$2", "Lcom/tinder/gold/DropdownOptionsView$SettingsDropdownListener;", "(Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter;Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;)V", "onOptionSelect", "", "value", "", "onSwitchToggle", "isChecked", "", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.notifications.view.NotificationSettingsRecyclerView$NotificationSettingsAdapter$d */
        public static final class C12149d implements SettingsDropdownListener {
            /* renamed from: a */
            final /* synthetic */ NotificationSettingsAdapter f39393a;
            /* renamed from: b */
            final /* synthetic */ PushNotificationSetting f39394b;

            C12149d(NotificationSettingsAdapter notificationSettingsAdapter, PushNotificationSetting pushNotificationSetting) {
                this.f39393a = notificationSettingsAdapter;
                this.f39394b = pushNotificationSetting;
            }

            public void onSwitchToggle(boolean z) {
                OnPushNotificationSettingChangedListener a = this.f39393a.m48293a();
                if (a != null) {
                    a.onPushNotificationSettingChangedListener(C9954a.f32794a.m40921a((LikesYouPushNotificationSetting) this.f39394b, z));
                }
            }

            public void onOptionSelect(@NotNull Object obj) {
                C2668g.b(obj, "value");
                OnPushNotificationSettingChangedListener a = this.f39393a.m48293a();
                if (a != null) {
                    a.onPushNotificationSettingChangedListener(C9954a.f32794a.m40920a((LikesYouPushNotificationSetting) this.f39394b, ((Integer) obj).intValue()));
                }
            }
        }

        /* renamed from: a */
        public final void m48297a(@NotNull List<? extends PushNotificationSetting> list) {
            C2668g.b(list, "<set-?>");
            this.f39396b = list;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m48296a((C12147b) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m48294a(viewGroup, i);
        }

        public NotificationSettingsAdapter(@NotNull List<? extends PushNotificationSetting> list) {
            C2668g.b(list, "items");
            this.f39396b = list;
        }

        @Nullable
        /* renamed from: a */
        public final OnPushNotificationSettingChangedListener m48293a() {
            return this.f39395a;
        }

        /* renamed from: a */
        public final void m48295a(@Nullable OnPushNotificationSettingChangedListener onPushNotificationSettingChangedListener) {
            this.f39395a = onPushNotificationSettingChangedListener;
        }

        @NotNull
        /* renamed from: a */
        public C12147b m48294a(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            switch (i) {
                case 0:
                    i = C9950d.view_push_notification_setting_item;
                    break;
                case 1:
                    i = C9950d.view_likes_you_notification_setting_item;
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unconfigured viewType ");
                    stringBuilder.append(i);
                    throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
            return new C12147b(viewGroup, i);
        }

        public int getItemCount() {
            return this.f39396b.size();
        }

        /* renamed from: a */
        public void m48296a(@NotNull C12147b c12147b, int i) {
            C2668g.b(c12147b, "holder");
            PushNotificationSetting pushNotificationSetting = (PushNotificationSetting) this.f39396b.get(i);
            if (pushNotificationSetting instanceof SimplePushNotificationSetting) {
                c12147b = c12147b.itemView;
                if (c12147b == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.notifications.view.NotificationSettingItemView");
                }
                ((NotificationSettingItemView) c12147b).m52612a((SimplePushNotificationSetting) pushNotificationSetting, new C12148c(this, pushNotificationSetting));
            } else if (pushNotificationSetting instanceof LikesYouPushNotificationSetting) {
                c12147b = c12147b.itemView;
                if (c12147b == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.notifications.view.LikesYouNotificationSettingItemView");
                }
                ((LikesYouNotificationSettingItemView) c12147b).m48292a((LikesYouPushNotificationSetting) pushNotificationSetting, new C12149d(this, pushNotificationSetting));
            }
        }

        public int getItemViewType(int i) {
            PushNotificationSetting pushNotificationSetting = (PushNotificationSetting) this.f39396b.get(i);
            if (pushNotificationSetting instanceof SimplePushNotificationSetting) {
                return 0;
            }
            if ((pushNotificationSetting instanceof LikesYouPushNotificationSetting) != 0) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public NotificationSettingsRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setAdapter((Adapter) this.f44616a);
        setLayoutManager((LayoutManager) new LinearLayoutManager(context));
        addItemDecoration((ItemDecoration) new C10707b((int) au.a(this, C9948b.divider_height)));
    }

    public final void setPushNotificationSettings(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "pushNotificationSettings");
        this.f44616a.m48297a(C19301m.l(set));
        this.f44616a.notifyDataSetChanged();
    }

    public final void setOnPushNotificationSettingChangedListener(@NotNull OnPushNotificationSettingChangedListener onPushNotificationSettingChangedListener) {
        C2668g.b(onPushNotificationSettingChangedListener, "onPushNotificationSettingChangedListener");
        this.f44616a.m48295a(onPushNotificationSettingChangedListener);
    }
}
