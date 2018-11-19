package com.tinder.smsauth.sdk.reader;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.phone.C2442a;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.tinder.common.logger.Logger;
import com.tinder.smsauth.entity.SmsRepository;
import com.tinder.smsauth.sdk.reader.SmsBroadcastReceiver.Listener;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/smsauth/sdk/reader/SmsRetrieverRepository;", "Lcom/tinder/smsauth/entity/SmsRepository;", "context", "Landroid/content/Context;", "logger", "Lcom/tinder/common/logger/Logger;", "(Landroid/content/Context;Lcom/tinder/common/logger/Logger;)V", "readSms", "Lio/reactivex/Observable;", "", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.reader.a */
public final class C16769a implements SmsRepository {
    /* renamed from: a */
    private final Context f51785a;
    /* renamed from: b */
    private final Logger f51786b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.sdk.reader.a$a */
    static final class C16768a<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C16769a f51784a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/tinder/smsauth/sdk/reader/SmsRetrieverRepository$readSms$1$receiver$1", "Lcom/tinder/smsauth/sdk/reader/SmsBroadcastReceiver$Listener;", "(Lio/reactivex/ObservableEmitter;)V", "onError", "", "error", "", "onSuccess", "message", "", "sdk_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.sdk.reader.a$a$a */
        public static final class C16767a implements Listener {
            /* renamed from: a */
            final /* synthetic */ ObservableEmitter f51783a;

            C16767a(ObservableEmitter observableEmitter) {
                this.f51783a = observableEmitter;
            }

            public void onError(@NotNull Throwable th) {
                C2668g.b(th, "error");
                this.f51783a.onError(th);
            }

            public void onSuccess(@NotNull String str) {
                C2668g.b(str, "message");
                this.f51783a.onNext(str);
            }
        }

        C16768a(C16769a c16769a) {
            this.f51784a = c16769a;
        }

        public final void subscribe(@NotNull ObservableEmitter<String> observableEmitter) {
            C2668g.b(observableEmitter, "emitter");
            final SmsBroadcastReceiver smsBroadcastReceiver = new SmsBroadcastReceiver(new C16767a(observableEmitter));
            this.f51784a.f51785a.registerReceiver(smsBroadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
            C4500a startSmsRetriever = C2442a.a(this.f51784a.f51785a).startSmsRetriever();
            startSmsRetriever.a(new OnSuccessListener<Void>() {
                public /* synthetic */ void onSuccess(Object obj) {
                    m62290a((Void) obj);
                }

                /* renamed from: a */
                public final void m62290a(Void voidR) {
                    this.f51784a.f51786b.debug("Started listening for sms");
                }
            });
            startSmsRetriever.a(new OnFailureListener() {
                public final void onFailure(@NotNull Exception exception) {
                    C2668g.b(exception, "error");
                    this.f51784a.f51786b.warn(exception, "Unable to listen for sms");
                }
            });
            observableEmitter.setCancellable(new Cancellable() {
                public final void cancel() {
                    this.f51784a.f51785a.unregisterReceiver(smsBroadcastReceiver);
                }
            });
        }
    }

    @Inject
    public C16769a(@NotNull Context context, @NotNull Logger logger) {
        C2668g.b(context, "context");
        C2668g.b(logger, "logger");
        this.f51785a = context;
        this.f51786b = logger;
    }

    @NotNull
    public C3959e<String> readSms() {
        C3959e<String> create = C3959e.create(new C16768a(this));
        C2668g.a(create, "Observable.create { emit…)\n            }\n        }");
        return create;
    }
}
