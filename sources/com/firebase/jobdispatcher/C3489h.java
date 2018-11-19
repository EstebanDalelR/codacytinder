package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.NonNull;

/* renamed from: com.firebase.jobdispatcher.h */
class C3489h implements JobCallback {
    /* renamed from: a */
    private final Messenger f10532a;
    /* renamed from: b */
    private final String f10533b;

    C3489h(Messenger messenger, String str) {
        this.f10532a = messenger;
        this.f10533b = str;
    }

    public void jobFinished(int i) {
        try {
            this.f10532a.send(m13252a(i));
        } catch (int i2) {
            throw new RuntimeException(i2);
        }
    }

    @NonNull
    /* renamed from: a */
    private Message m13252a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        i = new Bundle();
        i.putString("tag", this.f10533b);
        obtain.setData(i);
        return obtain;
    }
}
