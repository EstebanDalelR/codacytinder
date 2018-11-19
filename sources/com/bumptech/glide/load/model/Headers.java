package com.bumptech.glide.load.model;

import com.bumptech.glide.load.model.C3061h.C1038a;
import java.util.Collections;
import java.util.Map;

public interface Headers {
    @Deprecated
    /* renamed from: a */
    public static final Headers f2836a = new C30501();
    /* renamed from: b */
    public static final Headers f2837b = new C1038a().m3584a();

    /* renamed from: com.bumptech.glide.load.model.Headers$1 */
    static class C30501 implements Headers {
        C30501() {
        }

        public Map<String, String> getHeaders() {
            return Collections.emptyMap();
        }
    }

    Map<String, String> getHeaders();
}
