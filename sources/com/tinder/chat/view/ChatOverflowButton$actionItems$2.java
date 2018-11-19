package com.tinder.chat.view;

import android.content.Context;
import com.tinder.R;
import com.tinder.overflow.actionitem.C10020a;
import com.tinder.overflow.actionitem.C12225b;
import com.tinder.overflow.actionitem.C12226c;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashSet;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lkotlin/collections/LinkedHashSet;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatOverflowButton$actionItems$2 extends Lambda implements Function0<LinkedHashSet<C10020a>> {
    /* renamed from: a */
    final /* synthetic */ ChatOverflowButton f43629a;
    /* renamed from: b */
    final /* synthetic */ Context f43630b;

    ChatOverflowButton$actionItems$2(ChatOverflowButton chatOverflowButton, Context context) {
        this.f43629a = chatOverflowButton;
        this.f43630b = context;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53263a();
    }

    @NotNull
    /* renamed from: a */
    public final LinkedHashSet<C10020a> m53263a() {
        C10020a[] c10020aArr = new C10020a[2];
        Context context = this.f43630b;
        String string = this.f43629a.getResources().getString(R.string.view_ad_message_preferences);
        C2668g.a(string, "resources.getString(R.st…w_ad_message_preferences)");
        c10020aArr[0] = new C12225b(context, string, null, 4, null);
        context = this.f43630b;
        string = this.f43629a.getResources().getString(R.string.delete_sponsored_message);
        C2668g.a(string, "resources.getString(R.st…delete_sponsored_message)");
        c10020aArr[1] = new C12226c(context, string, this.f43629a.getOnDeleteSponsoredMessageSelected());
        return ak.c(c10020aArr);
    }
}
