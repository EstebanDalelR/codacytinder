package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.bumptech.glide.load.a */
public class C3021a<T> implements Transformation<T> {
    /* renamed from: a */
    private final Collection<? extends Transformation<T>> f9417a;
    /* renamed from: b */
    private String f9418b;

    @SafeVarargs
    public C3021a(Transformation<T>... transformationArr) {
        if (transformationArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f9417a = Arrays.asList(transformationArr);
    }

    public Resource<T> transform(Resource<T> resource, int i, int i2) {
        Resource<T> resource2 = resource;
        for (Transformation transform : this.f9417a) {
            Resource<T> transform2 = transform.transform(resource2, i, i2);
            if (!(resource2 == null || resource2.equals(resource) || resource2.equals(transform2))) {
                resource2.recycle();
            }
            resource2 = transform2;
        }
        return resource2;
    }

    public String getId() {
        if (this.f9418b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Transformation id : this.f9417a) {
                stringBuilder.append(id.getId());
            }
            this.f9418b = stringBuilder.toString();
        }
        return this.f9418b;
    }
}
