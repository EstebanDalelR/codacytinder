package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.minlog.Log;

public class TaggedFieldSerializerConfig extends FieldSerializerConfig {
    private boolean skipUnknownTags = false;

    @Deprecated
    public boolean isIgnoreUnknownTags() {
        return false;
    }

    @Deprecated
    public void setIgnoreUnknownTags(boolean z) {
    }

    public void setSkipUnknownTags(boolean z) {
        this.skipUnknownTags = z;
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setSkipUnknownTags: ");
            stringBuilder.append(z);
            Log.trace("kryo.TaggedFieldSerializerConfig", stringBuilder.toString());
        }
    }

    public boolean isSkipUnknownTags() {
        return this.skipUnknownTags;
    }

    protected TaggedFieldSerializerConfig clone() {
        return (TaggedFieldSerializerConfig) super.clone();
    }
}
