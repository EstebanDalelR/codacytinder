package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class bx extends Handler {
    /* renamed from: a */
    private /* synthetic */ bv f7509a;

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                PendingResult pendingResult = (PendingResult) message.obj;
                synchronized (this.f7509a.f11949e) {
                    if (pendingResult == null) {
                        this.f7509a.f11946b.m14313a(new Status(13, "Transform returned null"));
                    } else if (pendingResult instanceof bk) {
                        this.f7509a.f11946b.m14313a(((bk) pendingResult).m14310d());
                    } else {
                        this.f7509a.f11946b.m14324a(pendingResult);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "TransformedResultImpl";
                String str2 = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw runtimeException;
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(70);
                stringBuilder.append("TransformationResultHandler received unknown message type: ");
                stringBuilder.append(i);
                Log.e("TransformedResultImpl", stringBuilder.toString());
                return;
        }
    }
}
