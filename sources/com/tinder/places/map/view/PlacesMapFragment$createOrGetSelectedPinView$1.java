package com.tinder.places.map.view;

import android.content.Context;
import android.graphics.Bitmap;
import com.tinder.places.viewmodel.C14351c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesMapFragment$createOrGetSelectedPinView$1 extends Lambda implements Function0<Bitmap> {
    /* renamed from: a */
    final /* synthetic */ C14217c f45035a;
    /* renamed from: b */
    final /* synthetic */ C14351c f45036b;
    /* renamed from: c */
    final /* synthetic */ String f45037c;

    PlacesMapFragment$createOrGetSelectedPinView$1(C14217c c14217c, C14351c c14351c, String str) {
        this.f45035a = c14217c;
        this.f45036b = c14351c;
        this.f45037c = str;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53940a();
    }

    @NotNull
    /* renamed from: a */
    public final Bitmap m53940a() {
        Context context = this.f45035a.getContext();
        if (context == null) {
            C2668g.a();
        }
        C2668g.a(context, "context!!");
        PlacePinView placePinView = new PlacePinView(context, null);
        placePinView.m48789a(this.f45036b, true);
        Bitmap c = placePinView.m48791c();
        this.f45035a.f45055f.put(this.f45037c, c);
        return c;
    }
}
