package com.airbnb.lottie.model;

import android.os.AsyncTask;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.Cancellable;

/* renamed from: com.airbnb.lottie.model.b */
public abstract class C2985b<Params> extends AsyncTask<Params, Void, C0788c> implements Cancellable {
    public void cancel() {
        cancel(true);
    }
}
