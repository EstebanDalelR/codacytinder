package com.tinder.editprofile.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView.BufferType;
import com.tinder.deadshot.Deadshot;
import com.tinder.editprofile.p237a.C8947a;
import com.tinder.editprofile.target.EditFeedSettingItemTarget;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.feed.activity.FeedSettingsActivity;
import com.tinder.settings.feed.activity.FeedSettingsActivity.C14870a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\b\u0010\u001c\u001a\u00020\u000fH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tinder/editprofile/view/EditFeedSettingItemView;", "Landroid/support/v7/widget/AppCompatTextView;", "Lcom/tinder/editprofile/target/EditFeedSettingItemTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/editprofile/presenter/EditFeedSettingItemPresenter;", "getPresenter", "()Lcom/tinder/editprofile/presenter/EditFeedSettingItemPresenter;", "setPresenter", "(Lcom/tinder/editprofile/presenter/EditFeedSettingItemPresenter;)V", "disableFeedSettings", "", "onAttachedToWindow", "onDetachedFromWindow", "setOnClickListener", "", "onClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListenerInternal", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "showFeedSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class EditFeedSettingItemView extends AppCompatTextView implements EditFeedSettingItemTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8947a f41825a;

    public /* synthetic */ void setOnClickListener(OnClickListener onClickListener) {
        m51088a(onClickListener);
    }

    public EditFeedSettingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        setClickable(true);
        setOnClickListenerInternal((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m37729b();
            }
        });
    }

    @NotNull
    public final C8947a getPresenter() {
        C8947a c8947a = this.f41825a;
        if (c8947a == null) {
            C2668g.b("presenter");
        }
        return c8947a;
    }

    public final void setPresenter(@NotNull C8947a c8947a) {
        C2668g.b(c8947a, "<set-?>");
        this.f41825a = c8947a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8947a c8947a = this.f41825a;
        if (c8947a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c8947a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    @NotNull
    /* renamed from: a */
    public Void m51088a(@NotNull OnClickListener onClickListener) {
        C2668g.b(onClickListener, "onClickListener");
        throw ((Throwable) new UnsupportedOperationException("Clicking this view should only open Feed Settings"));
    }

    private final void setOnClickListenerInternal(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setText(@Nullable CharSequence charSequence, @Nullable BufferType bufferType) {
        String str = null;
        if (VERSION.SDK_INT >= 24) {
            if (charSequence != null) {
                str = charSequence.toString();
            }
            super.setText(Html.fromHtml(str, null), bufferType);
            return;
        }
        if (charSequence != null) {
            str = charSequence.toString();
        }
        super.setText(Html.fromHtml(str), bufferType);
    }

    public void disableFeedSettings() {
        setVisibility(8);
    }

    public void showFeedSettings() {
        C14870a c14870a = FeedSettingsActivity.f60019a;
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c14870a.a(context));
    }
}
