package com.tinder.pushnotifications.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.text.emoji.widget.EmojiAppCompatTextView;
import android.support.v4.content.C0432b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.pushnotifications.model.C16254e;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.model.TinderNotification.NotificationOrigin;
import com.tinder.shimmy.ShimmerFrameLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/pushnotifications/view/InAppNotificationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "notification", "Lcom/tinder/pushnotifications/model/TinderNotification;", "(Landroid/content/Context;Lcom/tinder/pushnotifications/model/TinderNotification;)V", "listener", "Lcom/tinder/pushnotifications/view/InAppNotificationView$Listener;", "navigateToDeeplink", "", "path", "", "setInAppNotificationClickedListener", "Listener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class InAppNotificationView extends FrameLayout {
    /* renamed from: a */
    private Listener f46014a;
    /* renamed from: b */
    private HashMap f46015b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/pushnotifications/view/InAppNotificationView$Listener;", "", "onInAppNotificationClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onInAppNotificationClicked();
    }

    /* renamed from: a */
    public View m55617a(int i) {
        if (this.f46015b == null) {
            this.f46015b = new HashMap();
        }
        View view = (View) this.f46015b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f46015b.put(Integer.valueOf(i), view);
        return view;
    }

    public InAppNotificationView(@NotNull Context context, @NotNull final TinderNotification tinderNotification) {
        C2668g.b(context, "context");
        C2668g.b(tinderNotification, "notification");
        super(context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) applicationContext).h().inject(this);
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) systemService).inflate(R.layout.view_in_app_notification, this, true);
        ((ConstraintLayout) m55617a(C6248a.notificationRoot)).setBackgroundResource(tinderNotification.mo11927a());
        ((ConstraintLayout) m55617a(C6248a.notificationRoot)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (this.f46014a == null) {
                    this.m55616a(tinderNotification.mo11930c());
                    return;
                }
                view = this.f46014a;
                if (view != null) {
                    view.onInAppNotificationClicked();
                }
            }
        });
        if (tinderNotification instanceof C16254e) {
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) m55617a(C6248a.shimmerBackground);
            C2668g.a(shimmerFrameLayout, "shimmerBackground");
            shimmerFrameLayout.setVisibility(0);
        }
        ((EmojiAppCompatTextView) m55617a(C6248a.titleText)).setTextColor(C0432b.c(context, tinderNotification.mo11935f()));
        ((EmojiAppCompatTextView) m55617a(C6248a.bodyText)).setTextColor(C0432b.c(context, tinderNotification.mo11936g()));
        EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) m55617a(C6248a.titleText);
        C2668g.a(emojiAppCompatTextView, "titleText");
        emojiAppCompatTextView.setText(tinderNotification.m55599n());
        emojiAppCompatTextView = (EmojiAppCompatTextView) m55617a(C6248a.bodyText);
        C2668g.a(emojiAppCompatTextView, "bodyText");
        emojiAppCompatTextView.setText(tinderNotification.m55598m());
        if (tinderNotification.m55595j() != null) {
            ((ImageView) m55617a(C6248a.mainImage)).setImageBitmap(tinderNotification.m55595j());
            if (tinderNotification.mo11928b() != null) {
                ((ImageView) m55617a(C6248a.bottomRightBadge)).setImageBitmap(tinderNotification.m55600o());
            }
        } else {
            ((ImageView) m55617a(C6248a.mainImage)).setImageBitmap(tinderNotification.m55600o());
        }
        if (tinderNotification.mo11937h() != null) {
            context = m55617a(C6248a.rightBadge);
            C2668g.a(context, "rightBadge");
            context.setVisibility(0);
        }
    }

    public final void setInAppNotificationClickedListener(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f46014a = listener;
    }

    /* renamed from: a */
    private final void m55616a(String str) {
        if (!C2668g.a(str, "tinder://")) {
            if (C19296q.m68678b(str, "tinder://", false, 2, null)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.putExtra("notification_source", NotificationOrigin.FOREGROUND);
                getContext().startActivity(intent);
            }
        }
    }
}
