package com.tinder.profile.adapters;

import android.support.annotation.NonNull;
import com.tinder.model.CommonConnection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.profile.adapters.d */
public class C14363d {
    @NonNull
    /* renamed from: a */
    public static List<CommonConnection> m54712a(@NonNull List<com.tinder.domain.common.model.CommonConnection> list) {
        List<CommonConnection> arrayList = new ArrayList(list.size());
        for (com.tinder.domain.common.model.CommonConnection commonConnection : list) {
            String image = commonConnection.image();
            arrayList.add(new CommonConnection(commonConnection.id(), commonConnection.degree(), commonConnection.name(), image, image, image));
        }
        return arrayList;
    }
}
