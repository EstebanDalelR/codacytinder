package com.tinder.chat.view.p189a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.tinder.chat.adapter.C10518c;
import com.tinder.chat.adapter.C8409a;
import com.tinder.chat.view.message.C10599a;
import com.tinder.chat.view.message.C10608c;
import com.tinder.chat.view.message.C10612e;
import com.tinder.chat.view.message.C10616g;
import com.tinder.chat.view.message.C10618i;
import com.tinder.chat.view.message.C10620k;
import com.tinder.chat.view.message.C10622m;
import com.tinder.chat.view.message.C10624o;
import com.tinder.chat.view.message.C10626q;
import com.tinder.chat.view.message.C10629s;
import com.tinder.chat.view.message.C10633w;
import com.tinder.chat.view.message.InboundGifMessageView;
import com.tinder.chat.view.message.InboundImageMessageView;
import com.tinder.chat.view.message.InboundTextMessageView;
import com.tinder.chat.view.message.OutboundGifMessageView;
import com.tinder.chat.view.message.OutboundImageMessageView;
import com.tinder.chat.view.message.OutboundTextMessageView;
import com.tinder.chat.view.message.SystemMessageView;
import com.tinder.chat.view.message.ai;
import com.tinder.chat.view.message.ak;
import com.tinder.chat.view.message.am;
import com.tinder.chat.view.message.ao;
import com.tinder.chat.view.message.aq;
import com.tinder.chat.view.message.as;
import com.tinder.chat.view.message.au;
import com.tinder.chat.view.message.aw;
import com.tinder.chat.view.message.ay;
import com.tinder.chat.view.message.ba;
import com.tinder.chat.view.message.be;
import com.tinder.chat.view.message.bh;
import com.tinder.chat.view.model.C10640k;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C12748m;
import com.tinder.chat.view.model.C12749o;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.ag;
import com.tinder.chat.view.model.al;
import com.tinder.chat.view.model.an;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/chat/view/factory/ChatItemViewFactory;", "", "activityMessageViewTypeResolver", "Lcom/tinder/chat/adapter/ActivityMessageViewTypeResolver;", "(Lcom/tinder/chat/adapter/ActivityMessageViewTypeResolver;)V", "createViewHolder", "Lcom/tinder/chat/adapter/ChatItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "createViewHolder$Tinder_release", "getViewType", "chatItem", "Lcom/tinder/chat/view/model/ChatItem;", "getViewType$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.a.a */
public final class C8452a {
    /* renamed from: a */
    private final C8409a f30095a;

    @Inject
    public C8452a(@NotNull C8409a c8409a) {
        C2668g.b(c8409a, "activityMessageViewTypeResolver");
        this.f30095a = c8409a;
    }

    @NotNull
    /* renamed from: a */
    public final C10518c m36181a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = viewGroup.getContext();
        if (i != 999) {
            switch (i) {
                case 1:
                    C2668g.a(viewGroup, "context");
                    i = (View) new OutboundTextMessageView(viewGroup);
                    break;
                case 2:
                    C2668g.a(viewGroup, "context");
                    i = (View) new InboundTextMessageView(viewGroup);
                    break;
                case 3:
                    C2668g.a(viewGroup, "context");
                    i = (View) new OutboundGifMessageView(viewGroup, null, 2, null);
                    break;
                case 4:
                    C2668g.a(viewGroup, "context");
                    i = (View) new InboundGifMessageView(viewGroup, null, 2, null);
                    break;
                case 5:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10633w(viewGroup);
                    break;
                case 6:
                    C2668g.a(viewGroup, "context");
                    i = (View) new be(viewGroup);
                    break;
                case 7:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10608c(viewGroup);
                    break;
                case 8:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10612e(viewGroup);
                    break;
                case 9:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10618i(viewGroup);
                    break;
                case 10:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10629s(viewGroup);
                    break;
                case 11:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10599a(viewGroup);
                    break;
                case 12:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10620k(viewGroup);
                    break;
                case 13:
                    C2668g.a(viewGroup, "context");
                    i = (View) new as(viewGroup);
                    break;
                case 14:
                    C2668g.a(viewGroup, "context");
                    i = (View) new aq(viewGroup);
                    break;
                case 15:
                    C2668g.a(viewGroup, "context");
                    i = (View) new ai(viewGroup);
                    break;
                case 16:
                    C2668g.a(viewGroup, "context");
                    i = (View) new ba(viewGroup);
                    break;
                case 17:
                    C2668g.a(viewGroup, "context");
                    i = (View) new ak(viewGroup);
                    break;
                case 18:
                    C2668g.a(viewGroup, "context");
                    i = (View) new am(viewGroup);
                    break;
                case 19:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10616g(viewGroup);
                    break;
                case 20:
                    C2668g.a(viewGroup, "context");
                    i = (View) new ao(viewGroup);
                    break;
                case 21:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10622m(viewGroup);
                    break;
                case 22:
                    C2668g.a(viewGroup, "context");
                    i = (View) new au(viewGroup);
                    break;
                case 23:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10626q(viewGroup);
                    break;
                case 24:
                    C2668g.a(viewGroup, "context");
                    i = (View) new ay(viewGroup);
                    break;
                case 25:
                    C2668g.a(viewGroup, "context");
                    i = (View) new C10624o(viewGroup);
                    break;
                case 26:
                    C2668g.a(viewGroup, "context");
                    i = (View) new aw(viewGroup);
                    break;
                case 27:
                    C2668g.a(viewGroup, "context");
                    i = (View) new SystemMessageView(viewGroup, null, 2, null);
                    break;
                case 28:
                    C2668g.a(viewGroup, "context");
                    i = (View) new bh(viewGroup);
                    break;
                case 29:
                    C2668g.a(viewGroup, "context");
                    i = (View) new InboundImageMessageView(viewGroup, null, 2, null);
                    break;
                case 30:
                    C2668g.a(viewGroup, "context");
                    i = (View) new OutboundImageMessageView(viewGroup, null, 2, null);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown ChatMessage viewType: ");
                    stringBuilder.append(i);
                    throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
        }
        i = new View(viewGroup);
        i.setLayoutParams((LayoutParams) new LinearLayout.LayoutParams(-1, 1));
        return new C10518c(i);
    }

    /* renamed from: a */
    public final int m36180a(@NotNull ChatItem chatItem) {
        C2668g.b(chatItem, "chatItem");
        if (chatItem instanceof com.tinder.chat.view.model.am) {
            if (C8453b.f30096a[((com.tinder.chat.view.model.am) chatItem).m42902i().ordinal()] != 1) {
                return 1;
            }
            return 2;
        } else if (chatItem instanceof C12748m) {
            return C8453b.f30097b[((C12748m) chatItem).m42902i().ordinal()] != 1 ? 3 : 4;
        } else if (chatItem instanceof ag) {
            return C8453b.f30098c[((ag) chatItem).m42902i().ordinal()] != 1 ? 6 : 5;
        } else if (chatItem instanceof C12749o) {
            return C8453b.f30099d[((C12749o) chatItem).m42902i().ordinal()] != 1 ? 30 : 29;
        } else if (chatItem instanceof al) {
            return 27;
        } else {
            if (chatItem instanceof C10640k) {
                return 999;
            }
            if (chatItem instanceof an) {
                return 28;
            }
            if (chatItem instanceof C12747i) {
                return this.f30095a.m35885a((C12747i) chatItem);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown MessageViewModel: ");
            stringBuilder.append(chatItem.getClass().getSimpleName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
