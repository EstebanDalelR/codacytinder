package com.tinder.account.photos.photogrid;

import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.model.RemoteProfilePhoto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¨\u0006\u000f"}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoGridEntryFactory;", "", "()V", "createPhotoLabel", "", "index", "", "numProfilePhotosOffset", "fromProfilePhotos", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "profilePhotos", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "numEmptyPhotos", "topPhotoId", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.photogrid.e */
public final class C2627e {
    /* renamed from: a */
    public static final C2627e f8199a = new C2627e();

    private C2627e() {
    }

    @NotNull
    /* renamed from: a */
    public final List<C2626d> m9847a(@NotNull List<? extends ProfilePhoto> list, int i, @Nullable String str) {
        C2668g.m10309b(list, "profilePhotos");
        int size = list.size();
        Iterable<ProfilePhoto> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        int i2 = 0;
        int i3 = 0;
        for (ProfilePhoto profilePhoto : iterable) {
            Object c3914c;
            int i4 = i3 + 1;
            if (!(profilePhoto instanceof LocalProfilePhoto)) {
                if (!(profilePhoto instanceof PendingFacebookPhoto)) {
                    if (profilePhoto instanceof RemoteProfilePhoto) {
                        c3914c = new C3914c(f8199a.m9846a(i3, 0), ((RemoteProfilePhoto) profilePhoto).getUri(), C2668g.m10308a(profilePhoto.getId(), (Object) str));
                        arrayList.add(c3914c);
                        i3 = i4;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            c3914c = new C3913b(f8199a.m9846a(i3, 0));
            arrayList.add(c3914c);
            i3 = i4;
        }
        arrayList = (List) arrayList;
        Iterable b = C19068g.b(0, i);
        Collection collection = (Collection) new ArrayList(C19301m.a(b, 10));
        list = b.iterator();
        while (list.hasNext() != null) {
            ((ab) list).b();
            str = i2 + 1;
            collection.add(new C3912a(f8199a.m9846a(i2, size)));
            i2 = str;
        }
        return C19301m.b(arrayList, (List) collection);
    }

    /* renamed from: a */
    private final String m9846a(int i, int i2) {
        Object obj = Locale.getDefault();
        C2668g.m10305a(obj, "Locale.getDefault()");
        Object[] objArr = new Object[]{Integer.valueOf((i + i2) + 1)};
        Object format = String.format(obj, "%d", Arrays.copyOf(objArr, objArr.length));
        C2668g.m10305a(format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
}
