package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.reflect.Field;
import java.util.List;

final class FieldSerializerUnsafeUtilImpl implements FieldSerializerUnsafeUtil {
    private FieldSerializer serializer;

    public FieldSerializerUnsafeUtilImpl(FieldSerializer fieldSerializer) {
        this.serializer = fieldSerializer;
    }

    public void createUnsafeCacheFieldsAndRegions(List<Field> list, List<CachedField> list2, int i, IntArray intArray) {
        FieldSerializerUnsafeUtilImpl fieldSerializerUnsafeUtilImpl = this;
        List<CachedField> list3 = list2;
        int size = list.size();
        long j = -1;
        long j2 = 0;
        Field field = null;
        int i2 = 0;
        Object obj = null;
        int i3 = 0;
        int i4 = -1;
        while (i2 < size) {
            int i5;
            long objectFieldOffset;
            long fieldSizeOf;
            Field field2 = (Field) list.get(i2);
            if (fieldSerializerUnsafeUtilImpl.serializer.access != null) {
                i5 = size;
                if (intArray.get(i + i2) == 1) {
                    size = ((FieldAccess) fieldSerializerUnsafeUtilImpl.serializer.access).getIndex(field2.getName());
                    objectFieldOffset = UnsafeUtil.unsafe().objectFieldOffset(field2);
                    fieldSizeOf = objectFieldOffset + ((long) fieldSizeOf(field2.getType()));
                    if (field2.getType().isPrimitive() && obj != null) {
                        if (i3 > 1) {
                            if (Log.TRACE) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Class ");
                                stringBuilder.append(fieldSerializerUnsafeUtilImpl.serializer.getType().getName());
                                stringBuilder.append(". Found a set of consecutive primitive fields. Number of fields = ");
                                stringBuilder.append(i3);
                                stringBuilder.append(". Byte length = ");
                                stringBuilder.append(j - j2);
                                stringBuilder.append(" Start offset = ");
                                stringBuilder.append(j2);
                                stringBuilder.append(" endOffset=");
                                stringBuilder.append(j);
                                Log.trace("kryo", stringBuilder.toString());
                            }
                            CachedField unsafeRegionField = new UnsafeRegionField(j2, j - j2);
                            unsafeRegionField.field = field;
                            list3.add(unsafeRegionField);
                        } else if (field != null) {
                            list3.add(fieldSerializerUnsafeUtilImpl.serializer.newCachedField(field, list2.size(), i4));
                        }
                        list3.add(fieldSerializerUnsafeUtilImpl.serializer.newCachedField(field2, list2.size(), size));
                        obj = null;
                    } else if (!field2.getType().isPrimitive()) {
                        list3.add(fieldSerializerUnsafeUtilImpl.serializer.newCachedField(field2, list2.size(), size));
                    } else if (obj != null) {
                        j2 = objectFieldOffset;
                        obj = 1;
                        i3 = 1;
                    } else {
                        i3++;
                    }
                    i2++;
                    i4 = size;
                    field = field2;
                    size = i5;
                    j = fieldSizeOf;
                }
            } else {
                IntArray intArray2 = intArray;
                i5 = size;
            }
            size = -1;
            objectFieldOffset = UnsafeUtil.unsafe().objectFieldOffset(field2);
            fieldSizeOf = objectFieldOffset + ((long) fieldSizeOf(field2.getType()));
            if (field2.getType().isPrimitive()) {
            }
            if (!field2.getType().isPrimitive()) {
                list3.add(fieldSerializerUnsafeUtilImpl.serializer.newCachedField(field2, list2.size(), size));
            } else if (obj != null) {
                i3++;
            } else {
                j2 = objectFieldOffset;
                obj = 1;
                i3 = 1;
            }
            i2++;
            i4 = size;
            field = field2;
            size = i5;
            j = fieldSizeOf;
        }
        if (!fieldSerializerUnsafeUtilImpl.serializer.getUseAsmEnabled() && fieldSerializerUnsafeUtilImpl.serializer.getUseMemRegions() && obj != null) {
            if (i3 > 1) {
                if (Log.TRACE) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Class ");
                    stringBuilder2.append(fieldSerializerUnsafeUtilImpl.serializer.getType().getName());
                    stringBuilder2.append(". Found a set of consecutive primitive fields. Number of fields = ");
                    stringBuilder2.append(i3);
                    stringBuilder2.append(". Byte length = ");
                    stringBuilder2.append(j - j2);
                    stringBuilder2.append(" Start offset = ");
                    stringBuilder2.append(j2);
                    stringBuilder2.append(" endOffset=");
                    stringBuilder2.append(j);
                    Log.trace("kryo", stringBuilder2.toString());
                }
                CachedField unsafeRegionField2 = new UnsafeRegionField(j2, j - j2);
                unsafeRegionField2.field = field;
                list3.add(unsafeRegionField2);
            } else if (field != null) {
                list3.add(fieldSerializerUnsafeUtilImpl.serializer.newCachedField(field, list2.size(), i4));
            }
        }
    }

    private int fieldSizeOf(Class<?> cls) {
        if (cls != Integer.TYPE) {
            if (cls != Float.TYPE) {
                if (cls != Long.TYPE) {
                    if (cls != Double.TYPE) {
                        if (cls != Byte.TYPE) {
                            if (cls != Boolean.TYPE) {
                                if (cls != Short.TYPE) {
                                    if (cls != Character.TYPE) {
                                        return UnsafeUtil.unsafe().addressSize();
                                    }
                                }
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
                return 8;
            }
        }
        return 4;
    }

    public long getObjectFieldOffset(Field field) {
        return UnsafeUtil.unsafe().objectFieldOffset(field);
    }
}
