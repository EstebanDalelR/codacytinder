package com.tinder.analytics.fireworks;

import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.EtlField;
import com.tinder.etl.event.fw;
import java.util.Map.Entry;
import javax.annotation.Nonnull;

/* renamed from: com.tinder.analytics.fireworks.g */
class C3917g implements EventAdapter<EtlEvent> {
    C3917g() {
    }

    @Nonnull
    public /* synthetic */ C2632i createFireworksEvent(@Nonnull Object obj) {
        return m14683a((EtlEvent) obj);
    }

    @Nonnull
    /* renamed from: a */
    public C2632i m14683a(@Nonnull EtlEvent etlEvent) {
        etlEvent = m14682b(etlEvent);
        C2631a a = C2632i.m9865a(etlEvent.a());
        etlEvent = etlEvent.b();
        if (etlEvent != null) {
            if (!etlEvent.isEmpty()) {
                for (Entry entry : etlEvent.entrySet()) {
                    a.m9863a(m14681a((EtlField) entry.getKey()), entry.getValue());
                }
                return a.m9864a();
            }
        }
        return a.m9864a();
    }

    @Nonnull
    /* renamed from: a */
    private C2633r m14681a(@Nonnull EtlField etlField) {
        return C2633r.m9871a(etlField.name(), etlField.type());
    }

    /* renamed from: b */
    private fw m14682b(EtlEvent etlEvent) {
        return etlEvent.getDescriptorFactory().createDescriptor(etlEvent);
    }
}
