package com.tinder.usecase;

import android.support.annotation.NonNull;
import com.tinder.api.module.OkHttpQualifiers$Public;
import com.tinder.domain.common.usecase.UseCase;
import javax.inject.Inject;
import okhttp3.C15963q.C15962a;
import okhttp3.C17692o;
import org.json.JSONObject;
import rx.Observable;

/* renamed from: com.tinder.usecase.f */
public class C17223f implements UseCase<String, JSONObject> {
    /* renamed from: a */
    private final C17692o f52800a;
    /* renamed from: b */
    private final C15962a f52801b;

    @NonNull
    public /* synthetic */ Observable execute(@NonNull Object obj) {
        return m63111a((String) obj);
    }

    @Inject
    public C17223f(@OkHttpQualifiers$Public C17692o c17692o, C15962a c15962a) {
        this.f52800a = c17692o;
        this.f52801b = c15962a;
    }

    @NonNull
    /* renamed from: a */
    public Observable<JSONObject> m63111a(@NonNull String str) {
        return Observable.a(new C15343g(this, str));
    }

    /* renamed from: b */
    final /* synthetic */ JSONObject m63112b(@NonNull String str) throws Exception {
        str = this.f52800a.newCall(this.f52801b.m60510a(str).m60524d()).execute();
        if (str.m60556d()) {
            return new JSONObject(str.m60560h().string());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response was not successful: ");
        stringBuilder.append(str.m60555c());
        throw new IllegalStateException(stringBuilder.toString());
    }
}
