package com.tinder.purchase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.Products;
import com.tinder.domain.profile.model.Variant;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\fJ>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\fH\u0002J \u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J&\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0006H\u0002J\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¨\u0006\u0019"}, d2 = {"Lcom/tinder/purchase/ProductsComparator;", "", "()V", "compareOffersForVariant", "Lcom/tinder/domain/profile/model/Variant;", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "variant", "getVariantsToUpdate", "products", "Lcom/tinder/domain/profile/model/Products;", "", "Lcom/tinder/domain/profile/model/ProductType;", "", "productsMap", "offersMap", "shouldUpdateVariant", "", "doesNotContainAll", "T", "items", "getDiscountIds", "", "toProductIds", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.a */
public final class C14481a {
    @NotNull
    /* renamed from: a */
    public final List<Variant> m55325a(@NotNull Products products, @NotNull Map<ProductType, ? extends Collection<? extends C14510e>> map) {
        C2668g.b(products, ManagerWebServices.PARAM_PRODUCTS);
        C2668g.b(map, "offers");
        return m55321a(products.asMap(), (Map) map);
    }

    /* renamed from: a */
    private final List<Variant> m55321a(Map<ProductType, Variant> map, Map<ProductType, ? extends Collection<? extends C14510e>> map2) {
        Collection arrayList = new ArrayList();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            Collection collection = (Collection) map2.get(entry.getKey());
            if (collection == null) {
                collection = C17554o.m64195a();
            }
            Variant a = m55319a(C19299w.m68840l(collection), (Variant) entry.getValue());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    private final Variant m55319a(List<? extends C14510e> list, Variant variant) {
        return (variant == null || m55324b(list, variant) == null) ? null : variant;
    }

    /* renamed from: b */
    private final boolean m55324b(List<? extends C14510e> list, Variant variant) {
        return m55322a(C19299w.m68809b((Collection) m55320a(list), (Iterable) m55323b(list)), C19299w.m68809b((Collection) variant.getDiscountProductIds(), (Iterable) variant.getRegularProductIds()));
    }

    /* renamed from: a */
    private final List<String> m55320a(@NotNull List<? extends C14510e> list) {
        Collection arrayList = new ArrayList();
        for (C14510e c14510e : list) {
            Object a;
            if (c14510e != null) {
                C14509b g = c14510e.mo11845g();
                if (g != null) {
                    a = g.mo11860a();
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            a = null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private final List<String> m55323b(@NotNull List<? extends C14510e> list) {
        Collection arrayList = new ArrayList();
        for (C14510e c14510e : list) {
            Object a;
            if (c14510e != null) {
                a = c14510e.mo11839a();
            } else {
                a = null;
            }
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    private final <T> boolean m55322a(@NotNull List<? extends T> list, List<? extends T> list2) {
        return list.containsAll(list2) ^ 1;
    }
}
