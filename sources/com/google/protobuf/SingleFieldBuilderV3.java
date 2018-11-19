package com.google.protobuf;

import com.google.protobuf.AbstractMessage.Builder;

public class SingleFieldBuilderV3<MType extends AbstractMessage, BType extends Builder, IType extends MessageOrBuilder> implements BuilderParent {
    private BType builder;
    private boolean isClean;
    private MType message;
    private BuilderParent parent;

    public SingleFieldBuilderV3(MType mType, BuilderParent builderParent, boolean z) {
        this.message = (AbstractMessage) Internal.checkNotNull(mType);
        this.parent = builderParent;
        this.isClean = z;
    }

    public void dispose() {
        this.parent = null;
    }

    public MType getMessage() {
        if (this.message == null) {
            this.message = (AbstractMessage) this.builder.buildPartial();
        }
        return this.message;
    }

    public MType build() {
        this.isClean = true;
        return getMessage();
    }

    public BType getBuilder() {
        if (this.builder == null) {
            this.builder = (Builder) this.message.newBuilderForType(this);
            this.builder.mergeFrom(this.message);
            this.builder.markClean();
        }
        return this.builder;
    }

    public IType getMessageOrBuilder() {
        if (this.builder != null) {
            return this.builder;
        }
        return this.message;
    }

    public SingleFieldBuilderV3<MType, BType, IType> setMessage(MType mType) {
        this.message = (AbstractMessage) Internal.checkNotNull(mType);
        if (this.builder != null) {
            this.builder.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilderV3<MType, BType, IType> mergeFrom(MType mType) {
        if (this.builder == null && this.message == this.message.getDefaultInstanceForType()) {
            this.message = mType;
        } else {
            getBuilder().mergeFrom((Message) mType);
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilderV3<MType, BType, IType> clear() {
        Message defaultInstanceForType;
        if (this.message != null) {
            defaultInstanceForType = this.message.getDefaultInstanceForType();
        } else {
            defaultInstanceForType = this.builder.getDefaultInstanceForType();
        }
        this.message = (AbstractMessage) defaultInstanceForType;
        if (this.builder != null) {
            this.builder.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    private void onChanged() {
        if (this.builder != null) {
            this.message = null;
        }
        if (this.isClean && this.parent != null) {
            this.parent.markDirty();
            this.isClean = false;
        }
    }

    public void markDirty() {
        onChanged();
    }
}
