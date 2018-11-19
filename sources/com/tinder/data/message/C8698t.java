package com.tinder.data.message;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.database.DBv2;
import com.tinder.data.gif.C10781a;
import com.tinder.data.gif.GifApiClient;
import com.tinder.data.message.p225a.C10810c;
import com.tinder.domain.message.GifRepository;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesNotifier;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesProvider;
import com.tinder.domain.message.MessageIdGenerator;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.MessageSentDate;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

@Module
/* renamed from: com.tinder.data.message.t */
public class C8698t {
    @Singleton
    @Provides
    /* renamed from: a */
    GifApiClient m37155a(C10781a c10781a) {
        return c10781a;
    }

    @Provides
    /* renamed from: a */
    GifRepository m37157a(C10810c c10810c) {
        return c10810c;
    }

    @Provides
    /* renamed from: a */
    MessageDeliveryStatusUpdatesProvider m37158a(aj ajVar) {
        return ajVar;
    }

    @Provides
    /* renamed from: b */
    MessageDeliveryStatusUpdatesNotifier m37161b(aj ajVar) {
        return ajVar;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    ag m37156a(@DBv2 BriteDatabase briteDatabase) {
        return new ag(briteDatabase);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    MessageRepository m37159a(ag agVar, C8697q c8697q, MessageDeliveryStatusUpdatesNotifier messageDeliveryStatusUpdatesNotifier) {
        return new ae(agVar, c8697q, messageDeliveryStatusUpdatesNotifier);
    }

    @MessageIdGenerator
    @Provides
    /* renamed from: a */
    Function0<String> m37160a() {
        return C12959u.f41514a;
    }

    @MessageSentDate
    @Provides
    /* renamed from: b */
    Function0<DateTime> m37162b() {
        return C12960v.f41515a;
    }
}
