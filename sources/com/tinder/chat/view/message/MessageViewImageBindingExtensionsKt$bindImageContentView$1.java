package com.tinder.chat.view.message;

import com.tinder.chat.view.model.C10636b;
import com.tinder.chat.view.model.C10643r;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C8499q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageViewImageBindingExtensionsKt$bindImageContentView$1 extends Lambda implements Function1<C12747i, List<? extends C10636b>> {
    /* renamed from: a */
    public static final MessageViewImageBindingExtensionsKt$bindImageContentView$1 f43686a = new MessageViewImageBindingExtensionsKt$bindImageContentView$1();

    MessageViewImageBindingExtensionsKt$bindImageContentView$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53294a((C12747i) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<C10636b> m53294a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "$receiver");
        c12747i = c12747i.m50169a();
        if (c12747i == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.view.model.InstagramNewMediaViewModel");
        }
        List<C10636b> list;
        C8499q c8499q = (C8499q) C19301m.g(((C10643r) c12747i).m42956f());
        if (c8499q != null) {
            c12747i = c8499q.m36420b();
            if (c12747i != null) {
                Collection arrayList = new ArrayList();
                for (Object next : (Iterable) c12747i) {
                    if (next instanceof C10636b) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
                return list == null ? list : C19301m.a();
            }
        }
        list = null;
        if (list == null) {
        }
    }
}
