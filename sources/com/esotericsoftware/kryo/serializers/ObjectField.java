package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;

class ObjectField extends CachedField {
    final FieldSerializer fieldSerializer;
    public Class[] generics;
    final Kryo kryo;
    final Class type;

    static final class ObjectBooleanField extends ObjectField {
        public ObjectBooleanField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Boolean.valueOf(this.field.getBoolean(obj));
        }

        public void write(Output output, Object obj) {
            try {
                output.writeBoolean(this.field.getBoolean(obj));
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                this.field.setBoolean(obj, input.readBoolean());
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setBoolean(obj2, this.field.getBoolean(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectByteField extends ObjectField {
        public ObjectByteField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Byte.valueOf(this.field.getByte(obj));
        }

        public void write(Output output, Object obj) {
            try {
                output.writeByte(this.field.getByte(obj));
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                this.field.setByte(obj, input.readByte());
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setByte(obj2, this.field.getByte(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectCharField extends ObjectField {
        public ObjectCharField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Character.valueOf(this.field.getChar(obj));
        }

        public void write(Output output, Object obj) {
            try {
                output.writeChar(this.field.getChar(obj));
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                this.field.setChar(obj, input.readChar());
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setChar(obj2, this.field.getChar(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectDoubleField extends ObjectField {
        public ObjectDoubleField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Double.valueOf(this.field.getDouble(obj));
        }

        public void write(Output output, Object obj) {
            try {
                output.writeDouble(this.field.getDouble(obj));
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                this.field.setDouble(obj, input.readDouble());
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setDouble(obj2, this.field.getDouble(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectFloatField extends ObjectField {
        public ObjectFloatField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Float.valueOf(this.field.getFloat(obj));
        }

        public void write(Output output, Object obj) {
            try {
                output.writeFloat(this.field.getFloat(obj));
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                this.field.setFloat(obj, input.readFloat());
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setFloat(obj2, this.field.getFloat(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectIntField extends ObjectField {
        public ObjectIntField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Integer.valueOf(this.field.getInt(obj));
        }

        public void write(Output output, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    output.writeInt(this.field.getInt(obj), false);
                } else {
                    output.writeInt(this.field.getInt(obj));
                }
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    this.field.setInt(obj, input.readInt(false));
                } else {
                    this.field.setInt(obj, input.readInt());
                }
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setInt(obj2, this.field.getInt(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectLongField extends ObjectField {
        public ObjectLongField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Long.valueOf(this.field.getLong(obj));
        }

        public void write(Output output, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    output.writeLong(this.field.getLong(obj), null);
                } else {
                    output.writeLong(this.field.getLong(obj));
                }
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    this.field.setLong(obj, input.readLong(false));
                } else {
                    this.field.setLong(obj, input.readLong());
                }
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setLong(obj2, this.field.getLong(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    static final class ObjectShortField extends ObjectField {
        public ObjectShortField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Short.valueOf(this.field.getShort(obj));
        }

        public void write(Output output, Object obj) {
            try {
                output.writeShort(this.field.getShort(obj));
            } catch (Throwable e) {
                obj = new KryoException(e);
                output = new StringBuilder();
                output.append(this);
                output.append(" (");
                output.append(this.type.getName());
                output.append(")");
                obj.addTrace(output.toString());
                throw obj;
            }
        }

        public void read(Input input, Object obj) {
            try {
                this.field.setShort(obj, input.readShort());
            } catch (Throwable e) {
                obj = new KryoException(e);
                input = new StringBuilder();
                input.append(this);
                input.append(" (");
                input.append(this.type.getName());
                input.append(")");
                obj.addTrace(input.toString());
                throw obj;
            }
        }

        public void copy(Object obj, Object obj2) {
            try {
                this.field.setShort(obj2, this.field.getShort(obj));
            } catch (Throwable e) {
                obj2 = new KryoException(e);
                obj = new StringBuilder();
                obj.append(this);
                obj.append(" (");
                obj.append(this.type.getName());
                obj.append(")");
                obj2.addTrace(obj.toString());
                throw obj2;
            }
        }
    }

    ObjectField(FieldSerializer fieldSerializer) {
        this.fieldSerializer = fieldSerializer;
        this.kryo = fieldSerializer.kryo;
        this.type = fieldSerializer.type;
    }

    public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
        return this.field.get(obj);
    }

    public void setField(Object obj, Object obj2) throws IllegalArgumentException, IllegalAccessException {
        this.field.set(obj, obj2);
    }

    public void write(Output output, Object obj) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        try {
            if (Log.TRACE) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Write field: ");
                stringBuilder.append(this);
                stringBuilder.append(" (");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append(") pos=");
                stringBuilder.append(output.position());
                Log.trace("kryo", stringBuilder.toString());
            }
            Object field = getField(obj);
            Serializer serializer = this.serializer;
            if (this.valueClass != null) {
                if (serializer == null) {
                    serializer = this.kryo.getSerializer(this.valueClass);
                    this.serializer = serializer;
                }
                serializer.setGenerics(this.kryo, this.generics);
                if (this.canBeNull) {
                    this.kryo.writeObjectOrNull(output, field, serializer);
                } else if (field == null) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Field value is null but canBeNull is false: ");
                    stringBuilder2.append(this);
                    stringBuilder2.append(" (");
                    stringBuilder2.append(obj.getClass().getName());
                    stringBuilder2.append(")");
                    throw new KryoException(stringBuilder2.toString());
                } else {
                    this.kryo.writeObject(output, field, serializer);
                }
            } else if (field == null) {
                this.kryo.writeClass(output, null);
            } else {
                Registration writeClass = this.kryo.writeClass(output, field.getClass());
                if (serializer == null) {
                    serializer = writeClass.getSerializer();
                }
                serializer.setGenerics(this.kryo, this.generics);
                this.kryo.writeObject(output, field, serializer);
            }
        } catch (Output output2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error accessing field: ");
            stringBuilder.append(this);
            stringBuilder.append(" (");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(")");
            throw new KryoException(stringBuilder.toString(), output2);
        } catch (Output output22) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this);
            stringBuilder2.append(" (");
            stringBuilder2.append(obj.getClass().getName());
            stringBuilder2.append(")");
            output22.addTrace(stringBuilder2.toString());
            throw output22;
        } catch (Throwable e) {
            KryoException kryoException = new KryoException(e);
            output22 = new StringBuilder();
            output22.append(this);
            output22.append(" (");
            output22.append(obj.getClass().getName());
            output22.append(")");
            kryoException.addTrace(output22.toString());
            throw kryoException;
        }
    }

    public void read(Input input, Object obj) {
        try {
            if (Log.TRACE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Read field: ");
                stringBuilder.append(this);
                stringBuilder.append(" (");
                stringBuilder.append(this.type.getName());
                stringBuilder.append(") pos=");
                stringBuilder.append(input.position());
                Log.trace("kryo", stringBuilder.toString());
            }
            Class cls = this.valueClass;
            Serializer serializer = this.serializer;
            if (cls == null) {
                Registration readClass = this.kryo.readClass(input);
                if (readClass == null) {
                    input = null;
                } else {
                    if (serializer == null) {
                        serializer = readClass.getSerializer();
                    }
                    serializer.setGenerics(this.kryo, this.generics);
                    input = this.kryo.readObject(input, readClass.getType(), serializer);
                }
            } else {
                if (serializer == null) {
                    serializer = this.kryo.getSerializer(this.valueClass);
                    this.serializer = serializer;
                }
                serializer.setGenerics(this.kryo, this.generics);
                if (this.canBeNull) {
                    input = this.kryo.readObjectOrNull(input, cls, serializer);
                } else {
                    input = this.kryo.readObject(input, cls, serializer);
                }
            }
            setField(obj, input);
        } catch (Input input2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Error accessing field: ");
            stringBuilder2.append(this);
            stringBuilder2.append(" (");
            stringBuilder2.append(this.type.getName());
            stringBuilder2.append(")");
            throw new KryoException(stringBuilder2.toString(), input2);
        } catch (Input input22) {
            obj = new StringBuilder();
            obj.append(this);
            obj.append(" (");
            obj.append(this.type.getName());
            obj.append(")");
            input22.addTrace(obj.toString());
            throw input22;
        } catch (Throwable e) {
            obj = new KryoException(e);
            input22 = new StringBuilder();
            input22.append(this);
            input22.append(" (");
            input22.append(this.type.getName());
            input22.append(")");
            obj.addTrace(input22.toString());
            throw obj;
        }
    }

    public void copy(Object obj, Object obj2) {
        try {
            if (this.accessIndex != -1) {
                FieldAccess fieldAccess = (FieldAccess) this.fieldSerializer.access;
                fieldAccess.set(obj2, this.accessIndex, this.kryo.copy(fieldAccess.get(obj, this.accessIndex)));
                return;
            }
            setField(obj2, this.kryo.copy(getField(obj)));
        } catch (Object obj3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error accessing field: ");
            stringBuilder.append(this);
            stringBuilder.append(" (");
            stringBuilder.append(this.type.getName());
            stringBuilder.append(")");
            throw new KryoException(stringBuilder.toString(), obj3);
        } catch (Object obj32) {
            obj2 = new StringBuilder();
            obj2.append(this);
            obj2.append(" (");
            obj2.append(this.type.getName());
            obj2.append(")");
            obj32.addTrace(obj2.toString());
            throw obj32;
        } catch (Throwable e) {
            obj2 = new KryoException(e);
            obj32 = new StringBuilder();
            obj32.append(this);
            obj32.append(" (");
            obj32.append(this.type.getName());
            obj32.append(")");
            obj2.addTrace(obj32.toString());
            throw obj2;
        }
    }
}
