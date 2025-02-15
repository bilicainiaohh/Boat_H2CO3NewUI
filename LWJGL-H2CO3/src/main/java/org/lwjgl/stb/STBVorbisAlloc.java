/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import static org.lwjgl.system.Checks.check;
import static org.lwjgl.system.MemoryStack.stackGet;
import static org.lwjgl.system.MemoryUtil.NULL;
import static org.lwjgl.system.MemoryUtil.memAddress;
import static org.lwjgl.system.MemoryUtil.memByteBuffer;
import static org.lwjgl.system.MemoryUtil.memCopy;
import static org.lwjgl.system.MemoryUtil.memGetAddress;
import static org.lwjgl.system.MemoryUtil.memPutAddress;
import static org.lwjgl.system.MemoryUtil.nmemAllocChecked;
import static org.lwjgl.system.MemoryUtil.nmemCallocChecked;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

import java.nio.ByteBuffer;

import javax.annotation.Nullable;

/**
 * A buffer to use for allocations by {@link STBVorbis}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stb_vorbis_alloc {
 *     char * alloc_buffer;
 *     int alloc_buffer_length_in_bytes;
 * }</code></pre>
 */
@NativeType("struct stb_vorbis_alloc")
public class STBVorbisAlloc extends Struct<STBVorbisAlloc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC_BUFFER,
        ALLOC_BUFFER_LENGTH_IN_BYTES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOC_BUFFER = layout.offsetof(0);
        ALLOC_BUFFER_LENGTH_IN_BYTES = layout.offsetof(1);
    }

    protected STBVorbisAlloc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected STBVorbisAlloc create(long address, @Nullable ByteBuffer container) {
        return new STBVorbisAlloc(address, container);
    }

    /**
     * Creates a {@code STBVorbisAlloc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBVorbisAlloc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field. */
    @NativeType("char *")
    public ByteBuffer alloc_buffer() { return nalloc_buffer(address()); }
    /** @return the value of the {@code alloc_buffer_length_in_bytes} field. */
    public int alloc_buffer_length_in_bytes() { return nalloc_buffer_length_in_bytes(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
    public STBVorbisAlloc alloc_buffer(@NativeType("char *") ByteBuffer value) { nalloc_buffer(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBVorbisAlloc set(STBVorbisAlloc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBVorbisAlloc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBVorbisAlloc malloc() {
        return new STBVorbisAlloc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code STBVorbisAlloc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBVorbisAlloc calloc() {
        return new STBVorbisAlloc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code STBVorbisAlloc} instance allocated with {@link BufferUtils}. */
    public static STBVorbisAlloc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBVorbisAlloc(memAddress(container), container);
    }

    /** Returns a new {@code STBVorbisAlloc} instance for the specified memory address. */
    public static STBVorbisAlloc create(long address) {
        return new STBVorbisAlloc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBVorbisAlloc createSafe(long address) {
        return address == NULL ? null : new STBVorbisAlloc(address, null);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBVorbisAlloc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBVorbisAlloc malloc(MemoryStack stack) {
        return new STBVorbisAlloc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code STBVorbisAlloc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBVorbisAlloc calloc(MemoryStack stack) {
        return new STBVorbisAlloc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc_buffer() alloc_buffer}. */
    public static ByteBuffer nalloc_buffer(long struct) { return memByteBuffer(memGetAddress(struct + STBVorbisAlloc.ALLOC_BUFFER), nalloc_buffer_length_in_bytes(struct)); }
    /** Unsafe version of {@link #alloc_buffer_length_in_bytes}. */
    public static int nalloc_buffer_length_in_bytes(long struct) { return UNSAFE.getInt(null, struct + STBVorbisAlloc.ALLOC_BUFFER_LENGTH_IN_BYTES); }

    /** Unsafe version of {@link #alloc_buffer(ByteBuffer) alloc_buffer}. */
    public static void nalloc_buffer(long struct, ByteBuffer value) { memPutAddress(struct + STBVorbisAlloc.ALLOC_BUFFER, memAddress(value)); nalloc_buffer_length_in_bytes(struct, value.remaining()); }
    /** Sets the specified value to the {@code alloc_buffer_length_in_bytes} field of the specified {@code struct}. */
    public static void nalloc_buffer_length_in_bytes(long struct, int value) { UNSAFE.putInt(null, struct + STBVorbisAlloc.ALLOC_BUFFER_LENGTH_IN_BYTES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBVorbisAlloc.ALLOC_BUFFER));
    }

    // -----------------------------------

    /** An array of {@link STBVorbisAlloc} structs. */
    public static class Buffer extends StructBuffer<STBVorbisAlloc, Buffer> implements NativeResource {

        private static final STBVorbisAlloc ELEMENT_FACTORY = STBVorbisAlloc.create(-1L);

        /**
         * Creates a new {@code STBVorbisAlloc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBVorbisAlloc#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected STBVorbisAlloc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field. */
        @NativeType("char *")
        public ByteBuffer alloc_buffer() { return STBVorbisAlloc.nalloc_buffer(address()); }
        /** @return the value of the {@code alloc_buffer_length_in_bytes} field. */
        public int alloc_buffer_length_in_bytes() { return STBVorbisAlloc.nalloc_buffer_length_in_bytes(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
        public Buffer alloc_buffer(@NativeType("char *") ByteBuffer value) { STBVorbisAlloc.nalloc_buffer(address(), value); return this; }

    }

}