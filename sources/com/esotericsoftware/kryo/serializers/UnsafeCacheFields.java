package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.UnsafeMemoryOutput;
import com.esotericsoftware.kryo.io.UnsafeOutput;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

class UnsafeCacheFields {

    static abstract class UnsafeCachedField extends CachedField {
        UnsafeCachedField(long j) {
            this.offset = j;
        }
    }

    static final class UnsafeBooleanField extends UnsafeCachedField {
        public UnsafeBooleanField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeBoolean(UnsafeUtil.unsafe().getBoolean(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putBoolean(obj, this.offset, input.readBoolean());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putBoolean(obj2, this.offset, UnsafeUtil.unsafe().getBoolean(obj, this.offset));
        }
    }

    static final class UnsafeByteField extends UnsafeCachedField {
        public UnsafeByteField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeByte(UnsafeUtil.unsafe().getByte(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putByte(obj, this.offset, input.readByte());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putByte(obj2, this.offset, UnsafeUtil.unsafe().getByte(obj, this.offset));
        }
    }

    static final class UnsafeCharField extends UnsafeCachedField {
        public UnsafeCharField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeChar(UnsafeUtil.unsafe().getChar(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putChar(obj, this.offset, input.readChar());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putChar(obj2, this.offset, UnsafeUtil.unsafe().getChar(obj, this.offset));
        }
    }

    static final class UnsafeDoubleField extends UnsafeCachedField {
        public UnsafeDoubleField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeDouble(UnsafeUtil.unsafe().getDouble(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putDouble(obj, this.offset, input.readDouble());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putDouble(obj2, this.offset, UnsafeUtil.unsafe().getDouble(obj, this.offset));
        }
    }

    static final class UnsafeFloatField extends UnsafeCachedField {
        public UnsafeFloatField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeFloat(UnsafeUtil.unsafe().getFloat(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putFloat(obj, this.offset, input.readFloat());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putFloat(obj2, this.offset, UnsafeUtil.unsafe().getFloat(obj, this.offset));
        }
    }

    static final class UnsafeIntField extends UnsafeCachedField {
        public UnsafeIntField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            if (this.varIntsEnabled) {
                output.writeInt(UnsafeUtil.unsafe().getInt(obj, this.offset), false);
            } else {
                output.writeInt(UnsafeUtil.unsafe().getInt(obj, this.offset));
            }
        }

        public void read(Input input, Object obj) {
            if (this.varIntsEnabled) {
                UnsafeUtil.unsafe().putInt(obj, this.offset, input.readInt(false));
            } else {
                UnsafeUtil.unsafe().putInt(obj, this.offset, input.readInt());
            }
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putInt(obj2, this.offset, UnsafeUtil.unsafe().getInt(obj, this.offset));
        }
    }

    static final class UnsafeLongField extends UnsafeCachedField {
        public UnsafeLongField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            if (this.varIntsEnabled) {
                output.writeLong(UnsafeUtil.unsafe().getLong(obj, this.offset), null);
            } else {
                output.writeLong(UnsafeUtil.unsafe().getLong(obj, this.offset));
            }
        }

        public void read(Input input, Object obj) {
            if (this.varIntsEnabled) {
                UnsafeUtil.unsafe().putLong(obj, this.offset, input.readLong(false));
                return;
            }
            UnsafeUtil.unsafe().putLong(obj, this.offset, input.readLong());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putLong(obj2, this.offset, UnsafeUtil.unsafe().getLong(obj, this.offset));
        }
    }

    static final class UnsafeObjectField extends ObjectField {
        public UnsafeObjectField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            if (this.offset >= 0) {
                return UnsafeUtil.unsafe().getObject(obj, this.offset);
            }
            throw new KryoException("Unknown offset");
        }

        public void setField(Object obj, Object obj2) throws IllegalArgumentException, IllegalAccessException {
            if (this.offset != -1) {
                UnsafeUtil.unsafe().putObject(obj, this.offset, obj2);
                return;
            }
            throw new KryoException("Unknown offset");
        }

        public void copy(Object obj, Object obj2) {
            try {
                if (this.offset != -1) {
                    UnsafeUtil.unsafe().putObject(obj2, this.offset, this.kryo.copy(UnsafeUtil.unsafe().getObject(obj, this.offset)));
                    return;
                }
                throw new KryoException("Unknown offset");
            } catch (Object obj3) {
                obj2 = new StringBuilder();
                obj2.append(this);
                obj2.append(" (");
                obj2.append(this.type.getName());
                obj2.append(")");
                obj3.addTrace(obj2.toString());
                throw obj3;
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj3 = new StringBuilder();
                obj3.append(this);
                obj3.append(" (");
                obj3.append(this.type.getName());
                obj3.append(")");
                obj2.addTrace(obj3.toString());
                throw obj2;
            }
        }
    }

    static final class UnsafeRegionField extends UnsafeCachedField {
        static final boolean bulkReadsSupported = false;
        final long len;

        public UnsafeRegionField(long j, long j2) {
            super(j);
            this.len = j2;
        }

        public final void write(Output output, Object obj) {
            if (output instanceof UnsafeOutput) {
                ((UnsafeOutput) output).writeBytes(obj, this.offset, this.len);
            } else if (output instanceof UnsafeMemoryOutput) {
                ((UnsafeMemoryOutput) output).writeBytes(obj, this.offset, this.len);
            } else {
                Unsafe unsafe = UnsafeUtil.unsafe();
                long j = this.offset;
                while (j < (this.offset + this.len) - 8) {
                    output.writeLong(unsafe.getLong(obj, j));
                    j += 8;
                }
                if (j < this.offset + this.len) {
                    while (j < this.offset + this.len) {
                        output.write(unsafe.getByte(obj, j));
                        j++;
                    }
                }
            }
        }

        public final void read(Input input, Object obj) {
            readSlow(input, obj);
        }

        private void readSlow(Input input, Object obj) {
            Unsafe unsafe = UnsafeUtil.unsafe();
            long j = this.offset;
            while (true) {
                long j2 = j;
                if (j2 >= (this.offset + this.len) - 8) {
                    break;
                }
                unsafe.putLong(obj, j2, input.readLong());
                j = j2 + 8;
            }
            if (j2 < this.offset + this.len) {
                while (j2 < this.offset + this.len) {
                    unsafe.putByte(obj, j2, input.readByte());
                    j2++;
                }
            }
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().copyMemory(obj, this.offset, obj2, this.offset, this.len);
        }
    }

    static final class UnsafeShortField extends UnsafeCachedField {
        public UnsafeShortField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeShort(UnsafeUtil.unsafe().getShort(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putShort(obj, this.offset, input.readShort());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putShort(obj2, this.offset, UnsafeUtil.unsafe().getShort(obj, this.offset));
        }
    }

    static final class UnsafeStringField extends UnsafeCachedField {
        public UnsafeStringField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        public void write(Output output, Object obj) {
            output.writeString((String) UnsafeUtil.unsafe().getObject(obj, this.offset));
        }

        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putObject(obj, this.offset, input.readString());
        }

        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putObject(obj2, this.offset, UnsafeUtil.unsafe().getObject(obj, this.offset));
        }
    }

    UnsafeCacheFields() {
    }
}
