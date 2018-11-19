package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.p026d.C0987h;

/* renamed from: com.bumptech.glide.load.engine.i */
class C1033i {
    /* renamed from: a */
    private boolean f2834a;
    /* renamed from: b */
    private final Handler f2835b = new Handler(Looper.getMainLooper(), new C1032a());

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    private static class C1032a implements Callback {
        private C1032a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return null;
            }
            ((Resource) message.obj).recycle();
            return true;
        }
    }

    C1033i() {
    }

    /* renamed from: a */
    public void m3567a(Resource<?> resource) {
        C0987h.m3411a();
        if (this.f2834a) {
            this.f2835b.obtainMessage(1, resource).sendToTarget();
            return;
        }
        this.f2834a = true;
        resource.recycle();
        this.f2834a = null;
    }
}
