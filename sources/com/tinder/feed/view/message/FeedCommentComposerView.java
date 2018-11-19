package com.tinder.feed.view.message;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageButton;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.Container;
import com.tinder.common.view.extension.C8587g;
import com.tinder.deadshot.Deadshot;
import com.tinder.feed.presenter.C9464a;
import com.tinder.feed.target.FeedCommentTarget;
import com.tinder.feed.view.message.C9533a.C11762a;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.utils.C14616a;
import com.tinder.views.AvatarView;
import com.tinder.views.CustomEditText;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u001c\u0010\u001b\u001a\u00020\u001a2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0014J\b\u0010!\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0014J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0010H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0010H\u0016J\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020\u001aH\u0002R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006/"}, d2 = {"Lcom/tinder/feed/view/message/FeedCommentComposerView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/feed/target/FeedCommentTarget;", "Lcom/tinder/common/view/Container;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedItemId", "", "isAnimating", "", "presenter", "Lcom/tinder/feed/presenter/FeedCommentComposerPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedCommentComposerPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedCommentComposerPresenter;)V", "animateIn", "", "bind", "feedItem", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "carouselItemId", "close", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "scaleDownButton", "Landroid/view/ViewPropertyAnimator;", "scaleUpAvatar", "scaleUpInput", "setAvatarUrl", "url", "setComment", "comment", "setGuidelineY", "y", "", "setupSendButton", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedCommentComposerView extends ConstraintLayout implements Container, FeedCommentTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9464a f38437a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C9542a f38438b;
    /* renamed from: c */
    private boolean f38439c;
    /* renamed from: d */
    private String f38440d;
    /* renamed from: e */
    private HashMap f38441e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$a */
    static final class C9524a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ FeedCommentComposerView f31886a;

        C9524a(FeedCommentComposerView feedCommentComposerView) {
            this.f31886a = feedCommentComposerView;
        }

        public final void run() {
            this.f31886a.m47647c();
            this.f31886a.m47649d();
            this.f31886a.m47651e().withEndAction(new Runnable() {
                public final void run() {
                    CustomEditText customEditText = (CustomEditText) this.f31886a.m47652a(C6248a.feedChatInput);
                    C2668g.a(customEditText, "feedChatInput");
                    customEditText.setVisibility(0);
                    this.f31886a.m47646b();
                    C14616a.f46121a.a((CustomEditText) this.f31886a.m47652a(C6248a.feedChatInput));
                    this.f31886a.f38439c = false;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$b */
    static final class C9525b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeedCommentComposerView f31887a;

        C9525b(FeedCommentComposerView feedCommentComposerView) {
            this.f31887a = feedCommentComposerView;
        }

        public final void onClick(View view) {
            this.f31887a.close();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$c */
    static final class C9526c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeedCommentComposerView f31888a;

        C9526c(FeedCommentComposerView feedCommentComposerView) {
            this.f31888a = feedCommentComposerView;
        }

        public final void onClick(View view) {
            this.f31888a.close();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$d */
    static final class C13276d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ FeedCommentComposerView f42068a;

        C13276d(FeedCommentComposerView feedCommentComposerView) {
            this.f42068a = feedCommentComposerView;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51360a((Void) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m51360a(Void voidR) {
            CustomEditText customEditText = (CustomEditText) this.f42068a.m47652a(C6248a.feedChatInput);
            C2668g.a(customEditText, "feedChatInput");
            return customEditText.getText().toString();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$f */
    static final class C13277f<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13277f f42069a = new C13277f();

        C13277f() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51361a((CharSequence) obj));
        }

        /* renamed from: a */
        public final boolean m51361a(CharSequence charSequence) {
            C2668g.a(charSequence, "it");
            return C19303i.a(charSequence) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$e */
    static final class C14016e<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ FeedCommentComposerView f44376a;

        C14016e(FeedCommentComposerView feedCommentComposerView) {
            this.f44376a = feedCommentComposerView;
        }

        public /* synthetic */ void call(Object obj) {
            m53653a((String) obj);
        }

        /* renamed from: a */
        public final void m53653a(String str) {
            C9464a presenter$Tinder_release = this.f44376a.getPresenter$Tinder_release();
            C2668g.a(str, "it");
            presenter$Tinder_release.m39575a(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isVisible", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.FeedCommentComposerView$g */
    static final class C14017g<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ FeedCommentComposerView f44377a;

        C14017g(FeedCommentComposerView feedCommentComposerView) {
            this.f44377a = feedCommentComposerView;
        }

        public /* synthetic */ void call(Object obj) {
            m53654a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m53654a(Boolean bool) {
            ImageButton imageButton = (ImageButton) this.f44377a.m47652a(C6248a.feedChatSendButton);
            C2668g.a(imageButton, "feedChatSendButton");
            View view = imageButton;
            C2668g.a(bool, "isVisible");
            C8587g.m36614a(view, bool.booleanValue());
        }
    }

    /* renamed from: a */
    public View m47652a(int i) {
        if (this.f38441e == null) {
            this.f38441e = new HashMap();
        }
        View view = (View) this.f38441e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f38441e.put(Integer.valueOf(i), view);
        return view;
    }

    public FeedCommentComposerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            attributeSet = C14398a.a(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) attributeSet).provideFeedViewComponent().inject(this);
        }
        ConstraintLayout.inflate(context, R.layout.feed_comment_composer_view, this);
        setLayoutParams(C8529a.f30276a.m36493a());
        setBackgroundResource(R.color.feed_message_composer_background);
        setClickable(true);
        setVisibility(4);
    }

    @NotNull
    public final C9464a getPresenter$Tinder_release() {
        C9464a c9464a = this.f38437a;
        if (c9464a == null) {
            C2668g.b("presenter");
        }
        return c9464a;
    }

    public final void setPresenter$Tinder_release(@NotNull C9464a c9464a) {
        C2668g.b(c9464a, "<set-?>");
        this.f38437a = c9464a;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f38438b;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f38438b = c9542a;
    }

    public final void setGuidelineY(int i) {
        Guideline guideline = (Guideline) m47652a(C6248a.guideline);
        C2668g.a(guideline, "guideline");
        LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f298a = i;
        Guideline guideline2 = (Guideline) m47652a(C6248a.guideline);
        C2668g.a(guideline2, "guideline");
        guideline2.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final void m47654a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, @Nullable String str) {
        C2668g.b(activityFeedViewModel, "feedItem");
        this.f38440d = activityFeedViewModel.getId();
        C9464a c9464a = this.f38437a;
        if (c9464a == null) {
            C2668g.b("presenter");
        }
        c9464a.m39574a(activityFeedViewModel, str);
    }

    /* renamed from: a */
    public final void m47653a() {
        if (!this.f38439c) {
            this.f38439c = true;
            setVisibility(0);
            ImageButton imageButton = (ImageButton) m47652a(C6248a.feedSendMessageButton);
            C2668g.a(imageButton, "feedSendMessageButton");
            imageButton.setVisibility(0);
            View a = m47652a(C6248a.feedChatInputBubble);
            C2668g.a(a, "feedChatInputBubble");
            a.setVisibility(4);
            CustomEditText customEditText = (CustomEditText) m47652a(C6248a.feedChatInput);
            C2668g.a(customEditText, "feedChatInput");
            customEditText.setVisibility(4);
            ImageButton imageButton2 = (ImageButton) m47652a(C6248a.feedChatSendButton);
            C2668g.a(imageButton2, "feedChatSendButton");
            imageButton2.setVisibility(4);
            post(new C9524a(this));
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9464a c9464a = this.f38437a;
        if (c9464a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9464a);
        setOnClickListener(new C9525b(this));
        ((AvatarView) m47652a(C6248a.feedChatAvatar)).setOnClickListener(new C9526c(this));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void close() {
        if (!this.f38439c) {
            C9542a c9542a = this.f38438b;
            if (c9542a == null) {
                C2668g.b("feedComposerProvider");
            }
            String str = this.f38440d;
            if (str == null) {
                C2668g.b("feedItemId");
            }
            c9542a.m39818a(new C11762a(str));
            C9464a c9464a = this.f38437a;
            if (c9464a == null) {
                C2668g.b("presenter");
            }
            CustomEditText customEditText = (CustomEditText) m47652a(C6248a.feedChatInput);
            C2668g.a(customEditText, "feedChatInput");
            c9464a.m39577b(customEditText.getText().toString());
            C14616a.f46121a.b((CustomEditText) m47652a(C6248a.feedChatInput));
            ViewParent parent = getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) parent).removeView(this);
        }
    }

    public void setAvatarUrl(@NotNull String str) {
        C2668g.b(str, "url");
        ((AvatarView) m47652a(C6248a.feedChatAvatar)).setAvatars(new String[]{str});
    }

    public void setComment(@NotNull String str) {
        C2668g.b(str, "comment");
        ((CustomEditText) m47652a(C6248a.feedChatInput)).setText(str);
        ((CustomEditText) m47652a(C6248a.feedChatInput)).setSelection(str.length());
    }

    public boolean onBackPressed() {
        close();
        return true;
    }

    /* renamed from: b */
    private final void m47646b() {
        C5707b.b((ImageButton) m47652a(C6248a.feedChatSendButton)).k(new C13276d(this)).d(new C14016e(this));
        C5698c.a((CustomEditText) m47652a(C6248a.feedChatInput)).k(C13277f.f42069a).d(new C14017g(this));
    }

    /* renamed from: c */
    private final ViewPropertyAnimator m47647c() {
        ImageButton imageButton = (ImageButton) m47652a(C6248a.feedSendMessageButton);
        C2668g.a(imageButton, "feedSendMessageButton");
        imageButton.setScaleX(1.0f);
        imageButton = (ImageButton) m47652a(C6248a.feedSendMessageButton);
        C2668g.a(imageButton, "feedSendMessageButton");
        imageButton.setScaleY(1.0f);
        ViewPropertyAnimator scaleY = ((ImageButton) m47652a(C6248a.feedSendMessageButton)).animate().setDuration(200).setInterpolator(new AnticipateInterpolator()).scaleX(0.0f).scaleY(0.0f);
        C2668g.a(scaleY, "feedSendMessageButton.an…              .scaleY(0f)");
        return scaleY;
    }

    /* renamed from: d */
    private final ViewPropertyAnimator m47649d() {
        AvatarView avatarView = (AvatarView) m47652a(C6248a.feedChatAvatar);
        C2668g.a(avatarView, "feedChatAvatar");
        avatarView.setScaleX(0.0f);
        avatarView = (AvatarView) m47652a(C6248a.feedChatAvatar);
        C2668g.a(avatarView, "feedChatAvatar");
        avatarView.setScaleY(0.0f);
        ViewPropertyAnimator scaleY = ((AvatarView) m47652a(C6248a.feedChatAvatar)).animate().setInterpolator(new OvershootInterpolator()).setDuration(200).setStartDelay(200).scaleX(1.0f).scaleY(1.0f);
        C2668g.a(scaleY, "feedChatAvatar.animate()…              .scaleY(1f)");
        return scaleY;
    }

    /* renamed from: e */
    private final ViewPropertyAnimator m47651e() {
        View a = m47652a(C6248a.feedChatInputBubble);
        a.setVisibility(0);
        a.setScaleX(0.0f);
        a.setScaleY(0.0f);
        a.setPivotX((float) a.getWidth());
        a.setPivotY((float) a.getHeight());
        ViewPropertyAnimator scaleY = m47652a(C6248a.feedChatInputBubble).animate().setInterpolator(new OvershootInterpolator()).setDuration(200).setStartDelay(200).scaleX(1.0f).scaleY(1.0f);
        C2668g.a(scaleY, "feedChatInputBubble.anim…              .scaleY(1f)");
        return scaleY;
    }
}
