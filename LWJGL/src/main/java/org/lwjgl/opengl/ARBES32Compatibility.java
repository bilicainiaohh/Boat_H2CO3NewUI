/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_ES3_2_compatibility.txt">ARB_ES3_2_compatibility</a> extension.
 *
 * <p>This extension adds support for features of OpenGL ES 3.2 that are missing from OpenGL 4.5. Enabling these features will ease the process of porting
 * applications from OpenGL ES 3.2 to OpenGL.</p>
 *
 * <p>In particular this adds the following features:</p>
 *
 * <ul>
 * <li>Bounding box used to optimization tessellation processing (OES_primitive_bounding_box)</li>
 * <li>query for {@link #GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB MULTISAMPLE_LINE_WIDTH_RANGE_ARB}</li>
 * <li>support for the OpenGL ES 3.20 shading language</li>
 * </ul>
 *
 * <p>For full OpenGL ES 3.2 compatibility the implementation must support {@link KHRBlendEquationAdvanced KHR_blend_equation_advanced} and {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr}.
 * Those features are not defined in this extension spec since they are already defined at the KHR level.</p>
 *
 * <p>Requires {@link GL45 OpenGL 4.5}, {@link ARBES2Compatibility ARB_ES2_compatibility}, {@link ARBES3Compatibility ARB_ES3_compatibility} and {@link ARBES31Compatibility ARB_ES3_1_compatibility}.</p>
 */
public class ARBES32Compatibility {

    /**
     * Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.
     */
    public static final int
            GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE,
            GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB = 0x9381,
            GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;

    static {
        GL.initialize();
    }

    protected ARBES32Compatibility() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
                caps.glPrimitiveBoundingBoxARB
        );
    }

    // --- [ glPrimitiveBoundingBoxARB ] ---

    /**
     * Specifies the primitive bounding box.
     *
     * <p>Implementations may be able to optimize performance if the application provides bounds of primitives that will be generated by the tessellation
     * primitive generator or the geometry shader prior to executing those stages. If the provided bounds are incorrect and primitives extend beyond them, the
     * rasterizer may or may not generate fragments for the portions of primitives outside the bounds.</p>
     *
     * @param minX the minimum x clip space coordinate
     * @param minY the minimum y clip space coordinate
     * @param minZ the minimum z clip space coordinate
     * @param minW the minimum w clip space coordinate
     * @param maxX the maximum x clip space coordinate
     * @param maxY the maximum y clip space coordinate
     * @param maxZ the maximum z clip space coordinate
     * @param maxW the maximum w clip space coordinate
     */
    public static native void glPrimitiveBoundingBoxARB(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW);

}