package com.tinder.api.moshi;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5987p.C5986a;
import com.squareup.moshi.C7190m;
import com.squareup.moshi.JsonAdapter.Factory;
import com.tinder.api.adapter.JsonObjectOrFalseAdapter;

public final class MoshiFactory {
    public static C5987p create() {
        Factory create = TinderMoshiAdapterFactory.create();
        return new C5986a().a(JsonObjectOrFalseAdapter.Factory.create(create)).a(create).a(new C7190m()).a();
    }
}
