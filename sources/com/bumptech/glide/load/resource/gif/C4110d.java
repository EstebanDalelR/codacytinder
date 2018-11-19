package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.resource.p028a.C3075a;
import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.load.resource.gif.d */
public class C4110d extends C3075a<C3101b> {
    public C4110d(C3101b c3101b) {
        super(c3101b);
    }

    public int getSize() {
        return ((C3101b) this.a).m12062d().length + C0987h.m3406a(((C3101b) this.a).m12060b());
    }

    public void recycle() {
        ((C3101b) this.a).stop();
        ((C3101b) this.a).m12064f();
    }
}
