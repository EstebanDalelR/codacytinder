package com.tinder.loops.ui.p285b;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import com.tinder.loops.engine.common.p273b.C9770a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"LOOP_ANIMATION_FRAME_INTERVAL_MS", "", "createAnimationDrawableFromVideoFrames", "Landroid/graphics/drawable/AnimationDrawable;", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "resources", "Landroid/content/res/Resources;", "getAnimationDrawableVideoFrames", "numberOfFrames", "loopsengine_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.ui.b.a */
public final class C9805a {
    @NotNull
    /* renamed from: a */
    public static final AnimationDrawable m40426a(@NotNull List<C9770a> list, @NotNull Resources resources) {
        C2668g.b(list, "$receiver");
        C2668g.b(resources, "resources");
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Iterable<C9770a> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C9770a a : iterable) {
            arrayList.add(new BitmapDrawable(resources, a.m40314a()));
        }
        List<C9770a> list2 = (List) arrayList;
        list = C19301m.b(list2, C19301m.c(C19301m.i(list2), 1)).iterator();
        while (list.hasNext() != null) {
            animationDrawable.addFrame((BitmapDrawable) list.next(), 50);
        }
        animationDrawable.setOneShot(null);
        return animationDrawable;
    }
}
