package com.tinder.account.photos.photogrid;

import com.tinder.account.photos.photogrid.PhotoGridAdapter.Listener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PhotoGridAdapter$onBindViewHolder$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ PhotoGridAdapter f14628a;
    /* renamed from: b */
    final /* synthetic */ C3915f f14629b;

    PhotoGridAdapter$onBindViewHolder$1(PhotoGridAdapter photoGridAdapter, C3915f c3915f) {
        this.f14628a = photoGridAdapter;
        this.f14629b = c3915f;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m18173a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m18173a() {
        Listener b = this.f14628a.m14658b();
        if (b != null) {
            b.onDeleteClicked(this.f14629b);
        }
    }
}
