package com.tinder.core.experiment;

import com.tinder.domain.auth.UniqueIdFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/core/experiment/DeviceVariantMapper;", "VARIANT", "", "uniqueIdFactory", "Lcom/tinder/domain/auth/UniqueIdFactory;", "(Lcom/tinder/domain/auth/UniqueIdFactory;)V", "variantMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getVariant", "detailsProvider", "Lcom/tinder/core/experiment/AuthExperimentDetailsProvider;", "(Lcom/tinder/core/experiment/AuthExperimentDetailsProvider;)Ljava/lang/Object;", "populateVariantMap", "", "variants", "", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.g */
public final class C8593g<VARIANT> {
    /* renamed from: a */
    private final HashMap<Character, VARIANT> f30414a = new HashMap();
    /* renamed from: b */
    private final UniqueIdFactory f30415b;

    @Inject
    public C8593g(@NotNull UniqueIdFactory uniqueIdFactory) {
        C2668g.b(uniqueIdFactory, "uniqueIdFactory");
        this.f30415b = uniqueIdFactory;
    }

    /* renamed from: a */
    public final VARIANT m36685a(@NotNull AuthExperimentDetailsProvider<VARIANT> authExperimentDetailsProvider) {
        C2668g.b(authExperimentDetailsProvider, "detailsProvider");
        if (this.f30414a.isEmpty()) {
            m36684a(authExperimentDetailsProvider.getVariants());
        }
        VARIANT variant = this.f30414a.get(Character.valueOf(C19303i.e(this.f30415b.getInstanceId())));
        return variant != null ? variant : authExperimentDetailsProvider.getControl();
    }

    /* renamed from: a */
    private final void m36684a(Map<VARIANT, Integer> map) {
        if (C19301m.s(map.values()) != C8594h.f30416a.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Values for all variants MUST total ");
            stringBuilder.append(C8594h.f30416a.length);
            stringBuilder.append('!');
            throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
        Iterable<Object> keySet = map.keySet();
        Collection arrayList = new ArrayList(C19301m.a(keySet, 10));
        for (Object valueOf : keySet) {
            arrayList.add(String.valueOf(valueOf));
        }
        if (((List) arrayList).contains("CONTROL")) {
            map = map.entrySet().iterator();
            int i = 0;
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                int intValue = ((Number) entry.getValue()).intValue();
                int i2 = i;
                i = 0;
                while (i < intValue) {
                    int i3 = i2 + 1;
                    this.f30414a.put(C8594h.f30416a[i2], entry.getKey());
                    i++;
                    i2 = i3;
                }
                i = i2;
            }
            return;
        }
        throw ((Throwable) new IllegalArgumentException("One variant MUST be named `CONTROL`"));
    }
}
