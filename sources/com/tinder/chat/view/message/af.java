package com.tinder.chat.view.message;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.chat.view.action.C10591r;
import com.tinder.chat.view.action.ReactionClickingActionHandler;
import com.tinder.chat.view.action.ai;
import com.tinder.chat.view.model.ag;
import com.tinder.common.view.extension.C8587g;
import com.tinder.domain.reactions.model.GrandGestureType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0000\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eH\u0000¨\u0006\u000f"}, d2 = {"bind", "", "gestureImageView", "Landroid/widget/ImageView;", "unsupportedContentTextView", "Landroid/widget/TextView;", "viewModel", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "actionHandler", "Lcom/tinder/chat/view/action/ReactionClickingActionHandler;", "bindGestureView", "Lcom/tinder/chat/view/message/InboundReactionMessageView;", "Lcom/tinder/chat/view/action/InboundReactionMessageViewActionHandler;", "Lcom/tinder/chat/view/message/OutboundReactionMessageView;", "Lcom/tinder/chat/view/action/OutboundReactionMessageViewActionHandler;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class af {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.af$a */
    static final class C8487a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ReactionClickingActionHandler f30180a;
        /* renamed from: b */
        final /* synthetic */ ag f30181b;

        C8487a(ReactionClickingActionHandler reactionClickingActionHandler, ag agVar) {
            this.f30180a = reactionClickingActionHandler;
            this.f30181b = agVar;
        }

        public final void onClick(View view) {
            this.f30180a.onReactionClicked(this.f30181b.m50164a().getId());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.af$b */
    static final class C8488b implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ ReactionClickingActionHandler f30182a;
        /* renamed from: b */
        final /* synthetic */ ag f30183b;

        C8488b(ReactionClickingActionHandler reactionClickingActionHandler, ag agVar) {
            this.f30182a = reactionClickingActionHandler;
            this.f30183b = agVar;
        }

        public final boolean onLongClick(View view) {
            this.f30182a.onReactionLongClicked(this.f30183b.m42898e(), this.f30183b.m42905l(), this.f30183b.m42907n().m36429a(), this.f30183b.m50164a().getId(), this.f30183b.m42903j());
            return true;
        }
    }

    /* renamed from: a */
    public static final void m36298a(@NotNull C10633w c10633w, @NotNull ag agVar, @NotNull C10591r c10591r) {
        CharSequence charSequence;
        C2668g.b(c10633w, "$receiver");
        C2668g.b(agVar, "viewModel");
        C2668g.b(c10591r, "actionHandler");
        TextView messageStatusTextView$Tinder_release = c10633w.getMessageStatusTextView$Tinder_release();
        String string;
        if (agVar.m50165b() > 1) {
            if (ag.f30184a[agVar.m50166c().ordinal()] != 1) {
                string = c10633w.getResources().getString(R.string.they_sent_many_reactions, new Object[]{agVar.m50167q(), String.valueOf(agVar.m50165b())});
            } else {
                string = c10633w.getResources().getString(R.string.they_sent_many_ball_is_in_your_court, new Object[]{String.valueOf(agVar.m50165b())});
            }
            charSequence = string;
        } else {
            if (ag.f30185b[agVar.m50166c().ordinal()] != 1) {
                string = c10633w.getResources().getString(R.string.they_sent_one_reaction, new Object[]{agVar.m50167q()});
            } else {
                string = c10633w.getResources().getString(R.string.they_sent_one_ball_is_in_your_court);
            }
            charSequence = string;
        }
        messageStatusTextView$Tinder_release.setText(charSequence);
        m36296a(c10633w.getGestureImageView$Tinder_release(), c10633w.getUnsupportedContentTextView$Tinder_release(), agVar, c10591r);
    }

    /* renamed from: a */
    public static final void m36297a(@NotNull be beVar, @NotNull ag agVar, @NotNull ai aiVar) {
        CharSequence charSequence;
        C2668g.b(beVar, "$receiver");
        C2668g.b(agVar, "viewModel");
        C2668g.b(aiVar, "actionHandler");
        TextView messageStatusTextView$Tinder_release = beVar.getMessageStatusTextView$Tinder_release();
        if (agVar.m42905l()) {
            charSequence = "";
        } else if (agVar.m50165b() > 1) {
            charSequence = beVar.getResources().getString(R.string.you_sent_many_reactions, new Object[]{String.valueOf(agVar.m50165b())});
        } else {
            charSequence = beVar.getResources().getString(R.string.you_sent_one_reaction);
        }
        messageStatusTextView$Tinder_release.setText(charSequence);
        m36296a(beVar.getGestureImageView$Tinder_release(), beVar.getUnsupportedContentTextView$Tinder_release(), agVar, aiVar);
    }

    /* renamed from: a */
    private static final void m36296a(ImageView imageView, TextView textView, ag agVar, ReactionClickingActionHandler reactionClickingActionHandler) {
        GrandGestureType c = agVar.m50166c();
        boolean z = false;
        C8587g.m36614a(imageView, c != GrandGestureType.UNSUPPORTED);
        View view = textView;
        if (c == GrandGestureType.UNSUPPORTED) {
            z = true;
        }
        C8587g.m36614a(view, z);
        switch (ag.f30186c[c.ordinal()]) {
            case 1:
                imageView.setImageResource(R.drawable.chat_gesture_heart);
                break;
            case 2:
                imageView.setImageResource(R.drawable.chat_gesture_laugh);
                break;
            case 3:
                imageView.setImageResource(R.drawable.chat_gesture_clap);
                break;
            case 4:
                imageView.setImageResource(R.drawable.chat_gesture_really);
                break;
            case 5:
                imageView.setImageResource(R.drawable.chat_gesture_ugh);
                break;
            case 6:
                imageView.setImageResource(R.drawable.chat_gesture_nope);
                break;
            case 7:
                imageView.setImageResource(R.drawable.chat_gesture_eyeroll);
                break;
            case 8:
                imageView.setImageResource(R.drawable.chat_gesture_strike1);
                break;
            case 9:
                imageView.setImageResource(R.drawable.chat_gesture_strike2);
                break;
            case 10:
                imageView.setImageResource(R.drawable.chat_gesture_strike3);
                break;
            case 11:
                imageView.setImageResource(R.drawable.chat_gesture_martini);
                break;
            case 12:
                imageView.setImageResource(R.drawable.chat_gesture_ball);
                break;
            case 13:
                textView.setText(agVar.m42899f());
                break;
            default:
                break;
        }
        imageView.setOnClickListener((OnClickListener) new C8487a(reactionClickingActionHandler, agVar));
        imageView.setOnLongClickListener((OnLongClickListener) new C8488b(reactionClickingActionHandler, agVar));
    }
}
