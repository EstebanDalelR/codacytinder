package com.tinder.account.photos.photogrid;

import com.tinder.account.photos.photogrid.PhotoGridView.Listener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "fromIndex", "", "toIndex", "invoke"}, k = 3, mv = {1, 1, 10})
final class PhotoGridView$itemTouchHelper$1 extends Lambda implements Function2<Integer, Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ PhotoGridView f14633a;

    PhotoGridView$itemTouchHelper$1(PhotoGridView photoGridView) {
        this.f14633a = photoGridView;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m18176a(((Number) obj).intValue(), ((Number) obj2).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m18176a(int i, int i2) {
        Listener listener = this.f14633a.getListener();
        if (listener != null) {
            listener.onMove(i, i2);
        }
    }
}
