/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;

import javax.annotation.*;

/**
 * This class contains native methods that can be used to call dynamically loaded functions. It is used internally by the LWJGL bindings, but can also
 * be used to call other dynamically loaded functions. Not all possible signatures are available, only those needed by the LWJGL bindings. To call a
 * function that does not have a matching JNI method, {@link org.lwjgl.system.dyncall.DynCall DynCall} can used.
 *
 * <p>All JNI methods in this class take an extra parameter, called {@code __functionAddress}. This must be a valid pointer to a native function with a
 * matching signature. Due to overloading, method names are partially mangled:</p>
 *
 * <ul>
 * <li>{@code call} or {@code invoke}
 *
 * <p>Methods with the {@code invoke} prefix will invoke the native function with the default calling convention. Methods with the {@code call}
 * prefix will invoke the native function with the {@code __stdcall} calling convention on Windows and the default calling convention on other
 * systems.</p></li>
 * <li>a {@code J} or a {@code P} for each {@code long} parameter
 *
 * <p>{@code J} parameters represent 64-bit integer values. {@code P} parameters represent pointer addresses. A pointer address is a 32-bit value on
 * 32-bit architectures and a 64-bit value on 64-bit architectures.</p></li>
 * <li>the return value <a href="http://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/types.html#type_signatures">JNI type signature</a></li>
 * </ul>
 */
public final class JNI {

    static {
        Library.initialize();
    }

    private JNI() {
    }

    // Pointer API

    public static native double invokeD(long __functionAddress);

    public static native double invokeD(int param0, long __functionAddress);

    public static native double invokePD(long param0, int param1, long __functionAddress);

    public static native float invokeF(int param0, long __functionAddress);

    public static native float invokePF(long param0, long __functionAddress);

    public static native int invokeI(long __functionAddress);

    public static native int invokeI(int param0, long __functionAddress);

    public static native int invokePI(long param0, long __functionAddress);

    public static native int invokePI(int param0, long param1, long __functionAddress);

    public static native int invokePI(long param0, int param1, long __functionAddress);

    public static native int invokePNI(long param0, long param1, long __functionAddress);

    public static native int invokePPI(long param0, long param1, long __functionAddress);

    public static native int invokePPI(int param0, long param1, long param2, long __functionAddress);

    public static native int invokePPI(long param0, long param1, int param2, long __functionAddress);

    public static native int invokePPPI(long param0, long param1, long param2, long __functionAddress);

    public static native int invokePPPPI(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native int invokePNNPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress);

    public static native int invokePPPPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native int invokePPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress);

    public static native int invokePNNPPPI(long param0, long param1, long param2, int param3, int param4, long param5, long param6, long param7, long __functionAddress);

    public static native long invokeJ(long __functionAddress);

    public static native long invokePJ(long param0, long __functionAddress);

    public static native long invokePJ(long param0, int param1, long __functionAddress);

    public static native long invokePN(long param0, long __functionAddress);

    public static native long invokePN(long param0, int param1, long __functionAddress);

    public static native long invokePNPN(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native long invokePNPNPN(long param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, long param10, long param11, long __functionAddress);

    public static native long invokeP(long __functionAddress);

    public static native long invokeP(int param0, long __functionAddress);

    public static native long invokeP(int param0, int param1, long __functionAddress);

    public static native long invokePP(long param0, long __functionAddress);

    public static native long invokePP(int param0, long param1, long __functionAddress);

    public static native long invokePP(long param0, int param1, long __functionAddress);

    public static native long invokePP(long param0, int param1, int param2, long __functionAddress);

    public static native long invokePP(long param0, short param1, boolean param2, long __functionAddress);

    public static native long invokePP(long param0, int param1, int param2, int param3, long __functionAddress);

    public static native long invokePP(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress);

    public static native long invokePPP(long param0, long param1, long __functionAddress);

    public static native long invokePPP(long param0, long param1, int param2, long __functionAddress);

    public static native long invokePPP(long param0, int param1, long param2, int param3, long __functionAddress);

    public static native long invokePPP(long param0, long param1, boolean param2, boolean param3, long __functionAddress);

    public static native long invokePPP(long param0, boolean param1, boolean param2, long param3, long __functionAddress);

    public static native long invokePPPP(long param0, long param1, long param2, long __functionAddress);

    public static native long invokePPPP(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native long invokePPPP(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native long invokePPPP(int param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native long invokeJPPP(int param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native long invokePPPPP(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native long invokePPPPP(long param0, long param1, int param2, long param3, long param4, long __functionAddress);

    public static native long invokePJPPP(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native long invokePNNNPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native long invokePPPPPPP(long param0, long param1, long param2, int param3, long param4, long param5, long param6, long __functionAddress);

    public static native long invokePPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, int param6, long __functionAddress);

    public static native void invokeV(long __functionAddress);

    public static native void invokeV(double param0, long __functionAddress);

    public static native void invokeV(float param0, long __functionAddress);

    public static native void invokeV(int param0, long __functionAddress);

    public static native void invokeV(int param0, float param1, long __functionAddress);

    public static native void invokeV(int param0, int param1, long __functionAddress);

    public static native void invokeV(int param0, int param1, double param2, long __functionAddress);

    public static native void invokeV(int param0, int param1, float param2, long __functionAddress);

    public static native void invokeV(int param0, int param1, int param2, long __functionAddress);

    public static native void invokeV(int param0, float param1, float param2, float param3, long __functionAddress);

    public static native void invokeV(int param0, int param1, int param2, int param3, long __functionAddress);

    public static native void invokeV(int param0, int param1, double param2, double param3, double param4, long __functionAddress);

    public static native void invokeV(int param0, int param1, float param2, float param3, float param4, long __functionAddress);

    public static native void invokeV(int param0, int param1, int param2, int param3, int param4, long __functionAddress);

    public static native void invokePV(long param0, long __functionAddress);

    public static native void invokePV(int param0, long param1, long __functionAddress);

    public static native void invokePV(long param0, float param1, long __functionAddress);

    public static native void invokePV(long param0, int param1, long __functionAddress);

    public static native void invokePV(long param0, boolean param1, long __functionAddress);

    public static native void invokeJV(int param0, int param1, long param2, long __functionAddress);

    public static native void invokePV(int param0, int param1, long param2, long __functionAddress);

    public static native void invokePV(long param0, double param1, double param2, long __functionAddress);

    public static native void invokePV(long param0, float param1, float param2, long __functionAddress);

    public static native void invokePV(long param0, int param1, double param2, long __functionAddress);

    public static native void invokePV(long param0, int param1, int param2, long __functionAddress);

    public static native void invokePV(long param0, int param1, int param2, int param3, long __functionAddress);

    public static native void invokePV(int param0, int param1, long param2, int param3, int param4, long __functionAddress);

    public static native void invokePV(long param0, int param1, int param2, int param3, int param4, long __functionAddress);

    public static native void invokePJV(long param0, long param1, long __functionAddress);

    public static native void invokePPV(long param0, long param1, long __functionAddress);

    public static native void invokePJV(long param0, int param1, long param2, long __functionAddress);

    public static native void invokePPV(long param0, int param1, long param2, long __functionAddress);

    public static native void invokePPV(long param0, long param1, int param2, long __functionAddress);

    public static native void invokePPV(long param0, long param1, boolean param2, long __functionAddress);

    public static native void invokePPV(long param0, int param1, int param2, long param3, long __functionAddress);

    public static native void invokePPV(long param0, long param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress);

    public static native void invokePNPV(long param0, long param1, long param2, long __functionAddress);

    public static native void invokePPPV(long param0, long param1, long param2, long __functionAddress);

    public static native void invokePPPV(int param0, long param1, long param2, long param3, long __functionAddress);

    public static native void invokePPPV(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native void invokePPPV(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native void invokeJJJV(int param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native void invokePPPV(int param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native void invokePPPV(long param0, long param1, long param2, boolean param3, boolean param4, long __functionAddress);

    public static native void invokePPPV(long param0, long param1, long param2, int param3, boolean param4, boolean param5, long __functionAddress);

    public static native void invokePNPPV(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native void invokePPPPV(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native void invokePPPPV(long param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native void invokePPPPPV(long param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native boolean invokeZ(int param0, long __functionAddress);

    public static native boolean invokePZ(long param0, long __functionAddress);

    public static native boolean invokePZ(long param0, int param1, int param2, int param3, long __functionAddress);

    public static native boolean invokePPZ(long param0, long param1, long __functionAddress);

    public static native boolean invokePPPZ(long param0, long param1, long param2, long __functionAddress);

    public static native boolean invokePPPZ(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native boolean invokePPPZ(long param0, long param1, long param2, boolean param3, int param4, long __functionAddress);

    public static native boolean invokePPPPZ(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native boolean invokePPPPZ(long param0, long param1, long param2, byte param3, long param4, long __functionAddress);

    public static native boolean invokePPPPPZ(long param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress);

    public static native boolean invokePPPPPZ(long param0, long param1, long param2, long param3, long param4, boolean param5, int param6, long __functionAddress);

    public static native float callF(int param0, int param1, int param2, long __functionAddress);

    public static native int callI(long __functionAddress);

    public static native int callI(int param0, long __functionAddress);

    public static native int callI(int param0, int param1, long __functionAddress);

    public static native int callI(int param0, int param1, int param2, long __functionAddress);

    public static native int callPI(long param0, long __functionAddress);

    public static native int callPI(int param0, long param1, long __functionAddress);

    public static native int callPI(long param0, float param1, long __functionAddress);

    public static native int callPI(long param0, int param1, long __functionAddress);

    public static native int callPI(int param0, int param1, long param2, long __functionAddress);

    public static native int callPI(int param0, long param1, int param2, long __functionAddress);

    public static native int callPI(long param0, int param1, int param2, long __functionAddress);

    public static native int callPI(int param0, int param1, int param2, long param3, long __functionAddress);

    public static native int callPI(int param0, int param1, int param2, int param3, long param4, long __functionAddress);

    public static native int callPI(long param0, int param1, int param2, int param3, int param4, long __functionAddress);

    public static native int callPI(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress);

    public static native int callPI(int param0, long param1, int param2, int param3, float param4, int param5, long __functionAddress);

    public static native int callPI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress);

    public static native int callPI(int param0, int param1, long param2, int param3, int param4, int param5, int param6, float param7, long __functionAddress);

    public static native int callPJI(long param0, long param1, long __functionAddress);

    public static native int callPPI(long param0, long param1, long __functionAddress);

    public static native int callPJI(long param0, int param1, long param2, long __functionAddress);

    public static native int callPJI(long param0, long param1, int param2, long __functionAddress);

    public static native int callJPI(long param0, long param1, int param2, int param3, int param4, long __functionAddress);

    public static native int callPPI(int param0, long param1, long param2, long __functionAddress);

    public static native int callPPI(long param0, int param1, long param2, long __functionAddress);

    public static native int callPPI(long param0, long param1, float param2, long __functionAddress);

    public static native int callPPI(long param0, long param1, int param2, long __functionAddress);

    public static native int callPPI(int param0, int param1, long param2, long param3, long __functionAddress);

    public static native int callPPI(long param0, int param1, int param2, long param3, long __functionAddress);

    public static native int callPPI(long param0, int param1, long param2, int param3, long __functionAddress);

    public static native int callPPI(long param0, long param1, int param2, int param3, long __functionAddress);

    public static native int callPPI(long param0, int param1, int param2, int param3, long param4, long __functionAddress);

    public static native int callPPI(long param0, long param1, int param2, int param3, int param4, long __functionAddress);

    public static native int callPPI(long param0, long param1, int param2, int param3, int param4, int param5, long __functionAddress);

    public static native int callPPI(long param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress);

    public static native int callPPI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress);

    public static native int callPPI(int param0, int param1, long param2, long param3, int param4, int param5, int param6, int param7, float param8, long __functionAddress);

    public static native int callPPI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, long __functionAddress);

    public static native int callPJPI(long param0, long param1, long param2, long __functionAddress);

    public static native int callPPJI(long param0, long param1, long param2, long __functionAddress);

    public static native int callPPPI(long param0, long param1, long param2, long __functionAddress);

    public static native int callPJPI(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native int callPJPI(long param0, long param1, int param2, long param3, long __functionAddress);

    public static native int callPPJI(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native int callPPJI(long param0, long param1, int param2, long param3, long __functionAddress);

    public static native int callPPNI(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native int callPPPI(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native int callPPPI(long param0, long param1, int param2, long param3, long __functionAddress);

    public static native int callPPPI(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native int callPPJI(long param0, int param1, long param2, int param3, long param4, long __functionAddress);

    public static native int callPPPI(long param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress);

    public static native int callPPPI(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress);

    public static native int callPPPI(long param0, long param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress);

    public static native int callPJJJI(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native int callPPNPI(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native int callPPPPI(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress);

    public static native int callPPPPI(long param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native int callPPPPI(long param0, long param1, long param2, int param3, long param4, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, int param2, int param3, long param4, long param5, long __functionAddress);

    public static native int callPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native int callPPPPI(int param0, long param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, long param21, long param22, long __functionAddress);

    public static native int callPJPPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native int callPPPPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native int callPJJJPI(long param0, long param1, long param2, long param3, int param4, long param5, long __functionAddress);

    public static native int callPJPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native int callPPPPPI(long param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress);

    public static native int callPPPPPI(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress);

    public static native int callJPPPPI(int param0, int param1, long param2, long param3, int param4, long param5, long param6, long param7, long __functionAddress);

    public static native int callPJPPJI(long param0, long param1, int param2, int param3, long param4, long param5, long param6, int param7, long __functionAddress);

    public static native int callPJJJJPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress);

    public static native int callPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress);

    public static native int callPPPPPPI(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress);

    public static native long callJ(long __functionAddress);

    public static native long callJ(int param0, long __functionAddress);

    public static native long callJ(int param0, int param1, long __functionAddress);

    public static native long callJ(int param0, int param1, boolean param2, int param3, int param4, long __functionAddress);

    public static native long callPPJ(long param0, long param1, long __functionAddress);

    public static native long callPN(long param0, long __functionAddress);

    public static native long callP(long __functionAddress);

    public static native long callP(int param0, long __functionAddress);

    public static native long callP(int param0, int param1, long __functionAddress);

    public static native long callP(int param0, float param1, float param2, float param3, long __functionAddress);

    public static native long callPP(long param0, long __functionAddress);

    public static native long callPP(int param0, long param1, long __functionAddress);

    public static native long callPP(long param0, int param1, long __functionAddress);

    public static native long callPP(int param0, long param1, int param2, long __functionAddress);

    public static native long callPP(long param0, int param1, int param2, long __functionAddress);

    public static native long callPNP(long param0, long param1, long __functionAddress);

    public static native long callPPP(long param0, long param1, long __functionAddress);

    public static native long callPPP(int param0, long param1, long param2, long __functionAddress);

    public static native long callPPP(long param0, int param1, long param2, long __functionAddress);

    public static native long callPPP(long param0, long param1, int param2, long __functionAddress);

    public static native long callPPP(int param0, long param1, long param2, int param3, long __functionAddress);

    public static native long callPPP(int param0, int param1, int param2, long param3, long param4, long __functionAddress);

    public static native long callPPP(long param0, int param1, int param2, int param3, long param4, long __functionAddress);

    public static native long callPPP(long param0, long param1, int param2, int param3, int param4, long __functionAddress);

    public static native long callPPNP(long param0, long param1, long param2, long __functionAddress);

    public static native long callPPPP(long param0, long param1, long param2, long __functionAddress);

    public static native long callPPPP(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native long callPPPP(long param0, long param1, int param2, long param3, long __functionAddress);

    public static native long callPPPP(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native long callPPPP(long param0, long param1, int param2, int param3, long param4, long __functionAddress);

    public static native long callPPPP(long param0, long param1, int param2, long param3, int param4, long __functionAddress);

    public static native long callPPNPP(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native long callPPPPP(long param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, int param2, long param3, long param4, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, long param2, int param3, long param4, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, long param2, long param3, int param4, long __functionAddress);

    public static native long callPPPPPPPP(int param0, long param1, long param2, int param3, int param4, int param5, int param6, long param7, long param8, long param9, int param10, long param11, long param12, long __functionAddress);

    public static native short callS(int param0, long __functionAddress);

    public static native void callV(long __functionAddress);

    public static native void callV(byte param0, long __functionAddress);

    public static native void callV(double param0, long __functionAddress);

    public static native void callV(float param0, long __functionAddress);

    public static native void callV(int param0, long __functionAddress);

    public static native void callV(short param0, long __functionAddress);

    public static native void callV(boolean param0, long __functionAddress);

    public static native void callV(double param0, double param1, long __functionAddress);

    public static native void callV(float param0, float param1, long __functionAddress);

    public static native void callV(float param0, boolean param1, long __functionAddress);

    public static native void callV(int param0, double param1, long __functionAddress);

    public static native void callV(int param0, float param1, long __functionAddress);

    public static native void callV(int param0, int param1, long __functionAddress);

    public static native void callV(int param0, short param1, long __functionAddress);

    public static native void callV(int param0, boolean param1, long __functionAddress);

    public static native void callV(short param0, short param1, long __functionAddress);

    public static native void callV(byte param0, byte param1, byte param2, long __functionAddress);

    public static native void callV(double param0, double param1, double param2, long __functionAddress);

    public static native void callV(float param0, float param1, float param2, long __functionAddress);

    public static native void callV(int param0, double param1, double param2, long __functionAddress);

    public static native void callV(int param0, float param1, float param2, long __functionAddress);

    public static native void callV(int param0, int param1, double param2, long __functionAddress);

    public static native void callV(int param0, int param1, float param2, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, long __functionAddress);

    public static native void callV(int param0, int param1, boolean param2, long __functionAddress);

    public static native void callV(int param0, short param1, short param2, long __functionAddress);

    public static native void callV(short param0, short param1, short param2, long __functionAddress);

    public static native void callV(byte param0, byte param1, byte param2, byte param3, long __functionAddress);

    public static native void callV(double param0, double param1, double param2, double param3, long __functionAddress);

    public static native void callV(float param0, float param1, float param2, float param3, long __functionAddress);

    public static native void callV(int param0, double param1, double param2, double param3, long __functionAddress);

    public static native void callV(int param0, float param1, float param2, float param3, long __functionAddress);

    public static native void callV(int param0, int param1, double param2, double param3, long __functionAddress);

    public static native void callV(int param0, int param1, float param2, float param3, long __functionAddress);

    public static native void callV(int param0, int param1, float param2, int param3, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, double param3, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, float param3, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, boolean param3, long __functionAddress);

    public static native void callV(int param0, int param1, boolean param2, int param3, long __functionAddress);

    public static native void callV(int param0, short param1, short param2, short param3, long __functionAddress);

    public static native void callV(short param0, short param1, short param2, short param3, long __functionAddress);

    public static native void callV(boolean param0, boolean param1, boolean param2, boolean param3, long __functionAddress);

    public static native void callV(int param0, byte param1, byte param2, byte param3, byte param4, long __functionAddress);

    public static native void callV(int param0, double param1, double param2, double param3, double param4, long __functionAddress);

    public static native void callV(int param0, float param1, float param2, float param3, float param4, long __functionAddress);

    public static native void callV(int param0, int param1, double param2, double param3, double param4, long __functionAddress);

    public static native void callV(int param0, int param1, float param2, float param3, float param4, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, float param3, int param4, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, boolean param3, int param4, long __functionAddress);

    public static native void callV(int param0, short param1, short param2, short param3, short param4, long __functionAddress);

    public static native void callV(int param0, boolean param1, boolean param2, boolean param3, boolean param4, long __functionAddress);

    public static native void callV(double param0, double param1, double param2, double param3, double param4, double param5, long __functionAddress);

    public static native void callV(int param0, double param1, double param2, int param3, double param4, double param5, long __functionAddress);

    public static native void callV(int param0, float param1, float param2, int param3, float param4, float param5, long __functionAddress);

    public static native void callV(int param0, int param1, double param2, double param3, double param4, double param5, long __functionAddress);

    public static native void callV(int param0, int param1, float param2, float param3, float param4, float param5, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, boolean param5, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, boolean param4, int param5, long __functionAddress);

    public static native void callV(int param0, double param1, double param2, double param3, double param4, double param5, double param6, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, double param3, double param4, double param5, double param6, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, float param3, float param4, float param5, float param6, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callV(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, long __functionAddress);

    public static native void callV(int param0, int param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, long __functionAddress);

    public static native void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, long __functionAddress);

    public static native void callJV(long param0, long __functionAddress);

    public static native void callPV(long param0, long __functionAddress);

    public static native void callJV(int param0, long param1, long __functionAddress);

    public static native void callJV(long param0, int param1, long __functionAddress);

    public static native void callPV(int param0, long param1, long __functionAddress);

    public static native void callPV(long param0, float param1, long __functionAddress);

    public static native void callPV(long param0, int param1, long __functionAddress);

    public static native void callJV(int param0, int param1, long param2, long __functionAddress);

    public static native void callPV(int param0, int param1, long param2, long __functionAddress);

    public static native void callPV(int param0, long param1, int param2, long __functionAddress);

    public static native void callPV(long param0, float param1, float param2, long __functionAddress);

    public static native void callPV(long param0, int param1, int param2, long __functionAddress);

    public static native void callPV(long param0, int param1, short param2, long __functionAddress);

    public static native void callJV(int param0, long param1, int param2, int param3, long __functionAddress);

    public static native void callNV(long param0, int param1, int param2, int param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, long param3, long __functionAddress);

    public static native void callPV(int param0, int param1, long param2, int param3, long __functionAddress);

    public static native void callPV(int param0, int param1, boolean param2, long param3, long __functionAddress);

    public static native void callPV(int param0, long param1, int param2, int param3, long __functionAddress);

    public static native void callPV(long param0, float param1, float param2, float param3, long __functionAddress);

    public static native void callPV(long param0, int param1, int param2, int param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, long param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, long param3, int param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, long param3, boolean param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, long param4, long __functionAddress);

    public static native void callPV(int param0, int param1, long param2, int param3, int param4, long __functionAddress);

    public static native void callPV(int param0, long param1, int param2, int param3, int param4, long __functionAddress);

    public static native void callPV(int param0, boolean param1, int param2, int param3, long param4, long __functionAddress);

    public static native void callPV(long param0, int param1, int param2, int param3, int param4, long __functionAddress);

    public static native void callJV(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPV(int param0, double param1, double param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPV(int param0, float param1, float param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, long param4, boolean param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, long param3, int param4, int param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, long param5, long __functionAddress);

    public static native void callPV(int param0, int param1, long param2, int param3, int param4, int param5, long __functionAddress);

    public static native void callPV(int param0, boolean param1, int param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPV(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress);

    public static native void callJV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress);

    public static native void callPV(int param0, int param1, float param2, float param3, float param4, float param5, long param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, long param5, int param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, long param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callPV(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callJV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress);

    public static native void callJV(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, long param7, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, long param7, long __functionAddress);

    public static native void callJV(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, long param8, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, long param8, long __functionAddress);

    public static native void callPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, int param7, float param8, long __functionAddress);

    public static native void callPV(int param0, double param1, double param2, int param3, int param4, double param5, double param6, int param7, int param8, long param9, long __functionAddress);

    public static native void callPV(int param0, float param1, float param2, int param3, int param4, float param5, float param6, int param7, int param8, long param9, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, long __functionAddress);

    public static native void callJV(long param0, int param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, long param10, long __functionAddress);

    public static native void callPV(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, long param11, long __functionAddress);

    public static native void callPJV(long param0, long param1, long __functionAddress);

    public static native void callPPV(long param0, long param1, long __functionAddress);

    public static native void callJJV(int param0, long param1, long param2, long __functionAddress);

    public static native void callPJV(long param0, int param1, long param2, long __functionAddress);

    public static native void callPJV(long param0, long param1, int param2, long __functionAddress);

    public static native void callPPV(int param0, long param1, long param2, long __functionAddress);

    public static native void callPPV(long param0, int param1, long param2, long __functionAddress);

    public static native void callPPV(long param0, long param1, int param2, long __functionAddress);

    public static native void callJJV(int param0, int param1, long param2, long param3, long __functionAddress);

    public static native void callJPV(int param0, int param1, long param2, long param3, long __functionAddress);

    public static native void callJPV(int param0, long param1, int param2, long param3, long __functionAddress);

    public static native void callPJV(int param0, long param1, int param2, long param3, long __functionAddress);

    public static native void callPJV(long param0, int param1, long param2, int param3, long __functionAddress);

    public static native void callPJV(long param0, long param1, int param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, long param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, int param2, long param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, long param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, long param2, boolean param3, long __functionAddress);

    public static native void callPPV(long param0, int param1, int param2, long param3, long __functionAddress);

    public static native void callPPV(long param0, long param1, int param2, int param3, long __functionAddress);

    public static native void callPJV(long param0, long param1, int param2, int param3, int param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, long param3, long param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, long param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, long param3, int param4, long __functionAddress);

    public static native void callPPV(int param0, long param1, int param2, long param3, int param4, long __functionAddress);

    public static native void callPPV(int param0, long param1, long param2, int param3, int param4, long __functionAddress);

    public static native void callPPV(long param0, int param1, int param2, int param3, long param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, long param3, int param4, int param5, long __functionAddress);

    public static native void callPPV(int param0, long param1, long param2, int param3, int param4, int param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, int param4, long param5, long param6, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, long param3, int param4, int param5, long param6, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, long param6, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, long param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long param7, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, long param4, int param5, int param6, long param7, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, long param3, int param4, float param5, float param6, int param7, long param8, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, int param7, long param8, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, long param6, int param7, int param8, float param9, long __functionAddress);

    public static native void callPJJV(long param0, long param1, long param2, long __functionAddress);

    public static native void callPJPV(long param0, long param1, long param2, long __functionAddress);

    public static native void callPPNV(long param0, long param1, long param2, long __functionAddress);

    public static native void callPPPV(long param0, long param1, long param2, long __functionAddress);

    public static native void callJJJV(int param0, long param1, long param2, long param3, long __functionAddress);

    public static native void callPJJV(long param0, long param1, long param2, int param3, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, long param3, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, long param3, long __functionAddress);

    public static native void callPPPV(long param0, int param1, long param2, long param3, long __functionAddress);

    public static native void callPPPV(long param0, long param1, int param2, long param3, long __functionAddress);

    public static native void callJJJV(int param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native void callPJJV(long param0, int param1, long param2, long param3, int param4, long __functionAddress);

    public static native void callPJJV(long param0, long param1, long param2, int param3, int param4, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, long param4, long __functionAddress);

    public static native void callPPPV(int param0, long param1, int param2, long param3, long param4, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, int param3, long param4, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, long param3, int param4, long __functionAddress);

    public static native void callPPPV(long param0, int param1, int param2, long param3, long param4, long __functionAddress);

    public static native void callPPPV(long param0, int param1, long param2, int param3, long param4, long __functionAddress);

    public static native void callPJPV(long param0, int param1, long param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPPJV(long param0, int param1, long param2, int param3, long param4, int param5, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, int param3, long param4, long param5, long __functionAddress);

    public static native void callPPPV(int param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress);

    public static native void callPJJV(long param0, int param1, int param2, long param3, long param4, int param5, int param6, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, int param3, long param4, long param5, long param6, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, long param6, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, int param3, long param4, int param5, long param6, long param7, long __functionAddress);

    public static native void callPPPV(long param0, int param1, int param2, int param3, int param4, int param5, long param6, long param7, long __functionAddress);

    public static native void callPPPV(long param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, long param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, long __functionAddress);

    public static native void callPJJPV(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native void callPJPPV(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native void callPPPNV(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native void callPPPPV(long param0, long param1, long param2, long param3, long __functionAddress);

    public static native void callJJJJV(int param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native void callPJJJV(long param0, long param1, long param2, long param3, int param4, long __functionAddress);

    public static native void callPJJPV(long param0, long param1, long param2, int param3, long param4, long __functionAddress);

    public static native void callPPPPV(long param0, long param1, long param2, long param3, int param4, long __functionAddress);

    public static native void callJJJJV(int param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress);

    public static native void callPJJPV(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress);

    public static native void callPJJPV(long param0, long param1, long param2, int param3, int param4, long param5, long __functionAddress);

    public static native void callPJPPV(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress);

    public static native void callPPPPV(int param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native void callPPPPV(int param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress);

    public static native void callPPPPV(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);

    public static native void callPJJPV(long param0, long param1, int param2, long param3, int param4, int param5, long param6, long __functionAddress);

    public static native void callPPPPV(int param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress);

    public static native void callPPPPV(int param0, int param1, long param2, long param3, long param4, long param5, int param6, long __functionAddress);

    public static native void callPJJPV(long param0, long param1, int param2, long param3, int param4, int param5, long param6, int param7, long __functionAddress);

    public static native void callPJPPV(long param0, int param1, long param2, int param3, int param4, long param5, int param6, long param7, long __functionAddress);

    public static native void callPPPPV(long param0, int param1, int param2, int param3, int param4, long param5, int param6, long param7, int param8, long param9, long __functionAddress);

    public static native void callPJJJPV(long param0, long param1, long param2, long param3, long param4, long __functionAddress);

    public static native void callPJJJJV(long param0, long param1, long param2, long param3, long param4, int param5, int param6, long __functionAddress);

    public static native void callPPPPPV(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress);

    public static native void callPJJJJV(long param0, long param1, int param2, int param3, long param4, long param5, long param6, int param7, long __functionAddress);

    public static native void callPJPPPV(long param0, int param1, int param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress);

    public static native void callPPPPPV(long param0, int param1, long param2, int param3, int param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress);

    public static native void callPPPPPPV(long param0, long param1, long param2, int param3, int param4, long param5, long param6, long param7, long __functionAddress);

    public static native void callPPPPPPPV(int param0, int param1, int param2, long param3, int param4, long param5, long param6, long param7, long param8, long param9, long param10, long __functionAddress);

    public static native void callPPJJJJJJV(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, long param8, long __functionAddress);

    public static native void callPJJJJJJJJJJJV(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, long param11, int param12, int param13, int param14, long __functionAddress);

    public static native boolean callZ(int param0, long __functionAddress);

    public static native boolean callZ(int param0, int param1, long __functionAddress);

    public static native boolean callZ(int param0, float param1, float param2, long __functionAddress);

    public static native boolean callZ(int param0, int param1, float param2, float param3, long __functionAddress);

    public static native boolean callJZ(long param0, long __functionAddress);

    public static native boolean callPZ(long param0, long __functionAddress);

    public static native boolean callJZ(int param0, long param1, long __functionAddress);

    public static native boolean callPZ(int param0, long param1, long __functionAddress);

    public static native boolean callJZ(int param0, long param1, int param2, long __functionAddress);

    public static native boolean callPPZ(int param0, long param1, long param2, long __functionAddress);

    public static native boolean callPPPPZ(int param0, int param1, int param2, float param3, long param4, long param5, long param6, long param7, long __functionAddress);

    // Array API

    public static native int invokePPI(int param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native int invokePPPPI(long param0, long param1, long param2, @Nullable long[] param3, long __functionAddress);

    public static native int invokePNNPPPI(long param0, long param1, long param2, int param3, int param4, @Nullable int[] param5, @Nullable int[] param6, long param7, long __functionAddress);

    public static native long invokePPP(long param0, @Nullable int[] param1, long __functionAddress);

    public static native void invokePV(int param0, @Nullable double[] param1, long __functionAddress);

    public static native void invokePV(int param0, @Nullable float[] param1, long __functionAddress);

    public static native void invokePV(int param0, @Nullable int[] param1, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable double[] param2, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable float[] param2, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable int[] param2, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable long[] param2, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable float[] param2, int param3, int param4, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable int[] param2, int param3, int param4, long __functionAddress);

    public static native void invokePV(int param0, int param1, @Nullable short[] param2, int param3, int param4, long __functionAddress);

    public static native void invokePPV(long param0, @Nullable float[] param1, int param2, long __functionAddress);

    public static native void invokePPV(long param0, @Nullable int[] param1, int param2, long __functionAddress);

    public static native void invokePPV(long param0, @Nullable short[] param1, int param2, long __functionAddress);

    public static native void invokePPV(long param0, int param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native void invokePPV(long param0, int param1, int param2, @Nullable long[] param3, long __functionAddress);

    public static native void invokePNPV(long param0, long param1, @Nullable short[] param2, long __functionAddress);

    public static native void invokePPPV(long param0, @Nullable double[] param1, @Nullable double[] param2, long __functionAddress);

    public static native void invokePPPV(long param0, @Nullable float[] param1, @Nullable float[] param2, long __functionAddress);

    public static native void invokePPPV(long param0, @Nullable int[] param1, @Nullable int[] param2, long __functionAddress);

    public static native void invokePPPV(@Nullable int[] param0, @Nullable int[] param1, @Nullable int[] param2, long __functionAddress);

    public static native void invokePPPV(int param0, @Nullable float[] param1, @Nullable float[] param2, @Nullable float[] param3, long __functionAddress);

    public static native void invokePPPV(int param0, int param1, @Nullable double[] param2, @Nullable double[] param3, @Nullable double[] param4, long __functionAddress);

    public static native void invokePPPV(int param0, int param1, @Nullable float[] param2, @Nullable float[] param3, @Nullable float[] param4, long __functionAddress);

    public static native void invokePPPV(int param0, int param1, @Nullable long[] param2, @Nullable long[] param3, @Nullable long[] param4, long __functionAddress);

    public static native void invokePNPPV(long param0, long param1, long param2, @Nullable short[] param3, long __functionAddress);

    public static native void invokePPPPPV(long param0, @Nullable int[] param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native boolean invokePPZ(long param0, @Nullable int[] param1, long __functionAddress);

    public static native int callPI(@Nullable int[] param0, long __functionAddress);

    public static native int callPI(int param0, @Nullable int[] param1, long __functionAddress);

    public static native int callPI(@Nullable int[] param0, int param1, long __functionAddress);

    public static native int callPI(int param0, int param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPI(int param0, @Nullable int[] param1, int param2, long __functionAddress);

    public static native int callPI(int param0, int param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPI(int param0, int param1, int param2, int param3, @Nullable float[] param4, long __functionAddress);

    public static native int callPI(int param0, int param1, int param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native int callPPI(long param0, @Nullable int[] param1, long __functionAddress);

    public static native int callPPI(@Nullable int[] param0, long param1, long __functionAddress);

    public static native int callPPI(int param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPPI(long param0, int param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPPI(long param0, int param1, @Nullable long[] param2, long __functionAddress);

    public static native int callPPI(long param0, int param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPJPI(long param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPPPI(long param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPPPI(long param0, long param1, @Nullable long[] param2, long __functionAddress);

    public static native int callPPPI(long param0, @Nullable int[] param1, long param2, long __functionAddress);

    public static native int callPPPI(long param0, @Nullable int[] param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPPPI(@Nullable int[] param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native int callPJPI(long param0, int param1, long param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPJPI(long param0, long param1, int param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPPPI(long param0, int param1, @Nullable int[] param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPPPI(long param0, int param1, @Nullable int[] param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPPPI(long param0, long param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPPPI(long param0, long param1, int param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPPPI(long param0, long param1, @Nullable int[] param2, int param3, long __functionAddress);

    public static native int callPPJI(long param0, int param1, @Nullable long[] param2, int param3, long param4, long __functionAddress);

    public static native int callPPPI(long param0, int param1, int param2, int param3, @Nullable int[] param4, @Nullable float[] param5, long __functionAddress);

    public static native int callPPPI(long param0, int param1, int param2, int param3, @Nullable int[] param4, @Nullable int[] param5, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, long param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, @Nullable int[] param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, @Nullable int[] param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPPNPI(long param0, long param1, long param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPPPPI(long param0, long param1, long param2, @Nullable long[] param3, long __functionAddress);

    public static native int callPPPPI(long param0, long param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native int callPPPPI(long param0, long param1, @Nullable int[] param2, @Nullable int[] param3, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, int param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native int callPJPPI(long param0, long param1, int param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native int callPPPPI(long param0, int param1, long param2, long param3, @Nullable long[] param4, long __functionAddress);

    public static native int callPPPPI(long param0, int param1, long param2, @Nullable long[] param3, @Nullable long[] param4, long __functionAddress);

    public static native int callPPPPI(long param0, long param1, long param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native int callPPPPI(long param0, @Nullable int[] param1, long param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native int callPPPPI(long param0, int param1, int param2, @Nullable long[] param3, @Nullable int[] param4, @Nullable int[] param5, long __functionAddress);

    public static native int callPPPPI(int param0, @Nullable int[] param1, @Nullable long[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, @Nullable int[] param21, @Nullable long[] param22, long __functionAddress);

    public static native int callPJPPPI(long param0, long param1, long param2, long param3, @Nullable long[] param4, long __functionAddress);

    public static native int callPPPPPI(long param0, long param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native int callPPPPPI(long param0, long param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable long[] param4, long __functionAddress);

    public static native int callPPPPPI(long param0, @Nullable int[] param1, @Nullable int[] param2, @Nullable int[] param3, long param4, long __functionAddress);

    public static native int callPJPPPI(long param0, long param1, int param2, long param3, long param4, @Nullable long[] param5, long __functionAddress);

    public static native int callPPPPPI(long param0, @Nullable int[] param1, @Nullable float[] param2, int param3, @Nullable int[] param4, @Nullable int[] param5, long __functionAddress);

    public static native int callPPPPPI(int param0, int param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable int[] param4, @Nullable int[] param5, long param6, long __functionAddress);

    public static native int callPJPPJI(long param0, long param1, int param2, int param3, long param4, @Nullable int[] param5, long param6, int param7, long __functionAddress);

    public static native int callPJPPJI(long param0, long param1, int param2, int param3, long param4, @Nullable long[] param5, long param6, int param7, long __functionAddress);

    public static native int callPJJJJPI(long param0, long param1, long param2, long param3, long param4, @Nullable int[] param5, long __functionAddress);

    public static native int callPPPPPPI(long param0, @Nullable int[] param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable int[] param4, @Nullable int[] param5, long __functionAddress);

    public static native int callPPPPPPI(int param0, int param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable int[] param4, @Nullable int[] param5, @Nullable int[] param6, long param7, long __functionAddress);

    public static native long callPP(@Nullable int[] param0, long __functionAddress);

    public static native long callPPP(long param0, @Nullable int[] param1, long __functionAddress);

    public static native long callPPP(int param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native long callPPP(long param0, int param1, @Nullable int[] param2, long __functionAddress);

    public static native long callPPP(int param0, int param1, int param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native long callPPP(long param0, int param1, int param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native long callPPPP(long param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native long callPPPP(long param0, int param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native long callPPPP(long param0, long param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native long callPPPP(long param0, long param1, int param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native long callPPNPP(long param0, long param1, long param2, @Nullable int[] param3, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, long param2, @Nullable int[] param3, long __functionAddress);

    public static native long callPPPPP(long param0, int param1, long param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, int param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native long callPPPPP(long param0, long param1, long param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native long callPPPPPPPP(int param0, @Nullable int[] param1, @Nullable long[] param2, int param3, int param4, int param5, int param6, long param7, long param8, long param9, int param10, @Nullable int[] param11, @Nullable long[] param12, long __functionAddress);

    public static native void callPV(@Nullable double[] param0, long __functionAddress);

    public static native void callPV(@Nullable float[] param0, long __functionAddress);

    public static native void callPV(@Nullable int[] param0, long __functionAddress);

    public static native void callPV(@Nullable short[] param0, long __functionAddress);

    public static native void callPV(int param0, @Nullable double[] param1, long __functionAddress);

    public static native void callPV(int param0, @Nullable float[] param1, long __functionAddress);

    public static native void callPV(int param0, @Nullable int[] param1, long __functionAddress);

    public static native void callPV(int param0, @Nullable long[] param1, long __functionAddress);

    public static native void callPV(int param0, @Nullable short[] param1, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable double[] param2, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable float[] param2, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable int[] param2, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable long[] param2, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable short[] param2, long __functionAddress);

    public static native void callPV(int param0, @Nullable int[] param1, int param2, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, @Nullable double[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, @Nullable float[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, @Nullable long[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, @Nullable short[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, boolean param2, @Nullable double[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, boolean param2, @Nullable float[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, boolean param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable int[] param2, int param3, long __functionAddress);

    public static native void callPV(int param0, @Nullable int[] param1, int param2, int param3, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, @Nullable double[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, @Nullable float[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, @Nullable long[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, @Nullable short[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, @Nullable double[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, @Nullable float[] param4, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, @Nullable int[] param3, boolean param4, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable int[] param2, int param3, int param4, long __functionAddress);

    public static native void callPV(int param0, boolean param1, int param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPV(int param0, double param1, double param2, int param3, int param4, @Nullable double[] param5, long __functionAddress);

    public static native void callPV(int param0, float param1, float param2, int param3, int param4, @Nullable float[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, @Nullable double[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, @Nullable float[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, @Nullable int[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, @Nullable short[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, @Nullable int[] param4, boolean param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, @Nullable float[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, @Nullable int[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, @Nullable short[] param5, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, @Nullable double[] param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, @Nullable float[] param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, @Nullable int[] param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, @Nullable short[] param6, long __functionAddress);

    public static native void callPV(int param0, int param1, @Nullable int[] param2, int param3, int param4, int param5, int param6, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, @Nullable double[] param7, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, @Nullable float[] param7, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, @Nullable int[] param7, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, @Nullable short[] param7, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, @Nullable double[] param8, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, @Nullable float[] param8, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, @Nullable int[] param8, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, @Nullable short[] param8, long __functionAddress);

    public static native void callPV(int param0, double param1, double param2, int param3, int param4, double param5, double param6, int param7, int param8, @Nullable double[] param9, long __functionAddress);

    public static native void callPV(int param0, float param1, float param2, int param3, int param4, float param5, float param6, int param7, int param8, @Nullable float[] param9, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, @Nullable double[] param9, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, @Nullable float[] param9, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, @Nullable int[] param9, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, @Nullable short[] param9, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, @Nullable double[] param10, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, @Nullable float[] param10, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, @Nullable int[] param10, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, @Nullable short[] param10, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, @Nullable double[] param11, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, @Nullable float[] param11, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, @Nullable int[] param11, long __functionAddress);

    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, @Nullable short[] param11, long __functionAddress);

    public static native void callPPV(long param0, @Nullable float[] param1, long __functionAddress);

    public static native void callPPV(long param0, @Nullable int[] param1, long __functionAddress);

    public static native void callPPV(@Nullable double[] param0, @Nullable double[] param1, long __functionAddress);

    public static native void callPPV(@Nullable float[] param0, @Nullable float[] param1, long __functionAddress);

    public static native void callPPV(@Nullable int[] param0, @Nullable int[] param1, long __functionAddress);

    public static native void callPPV(@Nullable short[] param0, @Nullable short[] param1, long __functionAddress);

    public static native void callPPV(int param0, long param1, @Nullable int[] param2, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, @Nullable float[] param2, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, @Nullable int[] param2, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, @Nullable long[] param2, long __functionAddress);

    public static native void callPPV(@Nullable int[] param0, int param1, @Nullable int[] param2, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPPV(int param0, int param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native void callPPV(int param0, int param1, @Nullable int[] param2, @Nullable float[] param3, long __functionAddress);

    public static native void callPPV(int param0, int param1, @Nullable int[] param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPPV(int param0, int param1, @Nullable int[] param2, @Nullable long[] param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, @Nullable double[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, @Nullable float[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, @Nullable int[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, @Nullable long[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, long param1, @Nullable short[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, @Nullable int[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, @Nullable long[] param1, @Nullable int[] param2, int param3, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, @Nullable int[] param3, long param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, @Nullable int[] param3, int param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, @Nullable int[] param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, int param2, long param3, int param4, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, int param2, @Nullable int[] param3, int param4, long __functionAddress);

    public static native void callPPV(int param0, @Nullable int[] param1, long param2, int param3, int param4, long __functionAddress);

    public static native void callPPV(long param0, int param1, int param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, @Nullable int[] param4, long param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, @Nullable float[] param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, @Nullable short[] param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, @Nullable int[] param2, long param3, int param4, int param5, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, long param3, int param4, int param5, @Nullable float[] param6, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, @Nullable float[] param6, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, long param4, int param5, int param6, @Nullable float[] param7, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, int param3, long param4, int param5, int param6, @Nullable short[] param7, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, @Nullable float[] param7, long __functionAddress);

    public static native void callPPV(int param0, int param1, int param2, long param3, int param4, float param5, float param6, int param7, @Nullable float[] param8, long __functionAddress);

    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, int param7, @Nullable float[] param8, long __functionAddress);

    public static native void callPJPV(long param0, long param1, @Nullable long[] param2, long __functionAddress);

    public static native void callPPPV(long param0, @Nullable int[] param1, long param2, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, @Nullable double[] param3, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, @Nullable float[] param3, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, @Nullable long[] param3, long __functionAddress);

    public static native void callPPPV(int param0, long param1, long param2, @Nullable short[] param3, long __functionAddress);

    public static native void callPPPV(long param0, int param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native void callPPPV(long param0, int param1, @Nullable long[] param2, long param3, long __functionAddress);

    public static native void callPPPV(long param0, long param1, int param2, @Nullable int[] param3, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, @Nullable double[] param4, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, @Nullable float[] param4, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, @Nullable short[] param4, long __functionAddress);

    public static native void callPPPV(int param0, int param1, @Nullable int[] param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPPV(int param0, int param1, @Nullable int[] param2, @Nullable int[] param3, long param4, long __functionAddress);

    public static native void callPPPV(int param0, long param1, int param2, @Nullable int[] param3, long param4, long __functionAddress);

    public static native void callPPPV(int param0, long param1, int param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPPV(int param0, @Nullable int[] param1, @Nullable int[] param2, int param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPPV(long param0, int param1, int param2, @Nullable int[] param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPPPV(long param0, int param1, int param2, @Nullable long[] param3, @Nullable long[] param4, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, @Nullable double[] param5, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, @Nullable float[] param5, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, @Nullable int[] param5, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, @Nullable long[] param5, long __functionAddress);

    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, @Nullable short[] param5, long __functionAddress);

    public static native void callPPJV(long param0, int param1, @Nullable long[] param2, int param3, long param4, int param5, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, @Nullable int[] param3, long param4, long param5, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, @Nullable int[] param3, long param4, @Nullable int[] param5, long __functionAddress);

    public static native void callPPPV(int param0, int param1, @Nullable int[] param2, int param3, @Nullable int[] param4, @Nullable int[] param5, long __functionAddress);

    public static native void callPPPV(int param0, @Nullable int[] param1, int param2, long param3, int param4, @Nullable int[] param5, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, @Nullable float[] param6, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, @Nullable int[] param6, long __functionAddress);

    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, @Nullable short[] param6, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, int param3, @Nullable int[] param4, int param5, @Nullable int[] param6, @Nullable float[] param7, long __functionAddress);

    public static native void callPPPV(int param0, int param1, int param2, int param3, @Nullable int[] param4, int param5, @Nullable int[] param6, @Nullable int[] param7, long __functionAddress);

    public static native void callPPPV(long param0, int param1, int param2, int param3, int param4, int param5, @Nullable int[] param6, long param7, long __functionAddress);

    public static native void callPJPPV(long param0, long param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native void callPPPPV(long param0, long param1, @Nullable int[] param2, long param3, long __functionAddress);

    public static native void callPPPPV(@Nullable long[] param0, @Nullable int[] param1, @Nullable int[] param2, @Nullable int[] param3, int param4, long __functionAddress);

    public static native void callPPPPV(int param0, long param1, @Nullable int[] param2, @Nullable int[] param3, @Nullable int[] param4, int param5, long __functionAddress);

    public static native void callPPPPV(long param0, int param1, int param2, @Nullable long[] param3, @Nullable long[] param4, @Nullable long[] param5, long __functionAddress);

    public static native void callPPPPV(int param0, int param1, int param2, @Nullable int[] param3, @Nullable int[] param4, @Nullable int[] param5, long param6, long __functionAddress);

    public static native void callPPPPV(int param0, int param1, long param2, long param3, @Nullable int[] param4, @Nullable int[] param5, int param6, long __functionAddress);

    public static native void callPJPPV(long param0, int param1, long param2, int param3, int param4, @Nullable long[] param5, int param6, @Nullable int[] param7, long __functionAddress);

    public static native void callPJJJPV(long param0, long param1, long param2, long param3, @Nullable double[] param4, long __functionAddress);

    public static native void callPJJJPV(long param0, long param1, long param2, long param3, @Nullable float[] param4, long __functionAddress);

    public static native void callPJJJPV(long param0, long param1, long param2, long param3, @Nullable int[] param4, long __functionAddress);

    public static native void callPJJJPV(long param0, long param1, long param2, long param3, @Nullable long[] param4, long __functionAddress);

    public static native void callPJJJPV(long param0, long param1, long param2, long param3, @Nullable short[] param4, long __functionAddress);

    public static native void callPPPPPV(int param0, int param1, long param2, @Nullable int[] param3, @Nullable int[] param4, @Nullable int[] param5, @Nullable int[] param6, long __functionAddress);

    public static native void callPPPPPV(long param0, int param1, @Nullable long[] param2, int param3, int param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress);

    public static native void callPPPPPPPV(int param0, int param1, int param2, long param3, int param4, long param5, @Nullable int[] param6, @Nullable int[] param7, @Nullable int[] param8, @Nullable int[] param9, @Nullable long[] param10, long __functionAddress);

    public static native boolean callPPZ(int param0, @Nullable int[] param1, long param2, long __functionAddress);

    public static native boolean callPPPPZ(int param0, int param1, int param2, float param3, @Nullable float[] param4, @Nullable float[] param5, @Nullable float[] param6, @Nullable float[] param7, long __functionAddress);

}
