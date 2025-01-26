package org.koishi.launcher.h2co3library.skin.cube.head;

import org.koishi.launcher.h2co3library.skin.cube.MainCube;

public class Head extends MainCube {

    protected float[] headTexCoordinates;
    
    public Head(float scale) {
        super(8.0f * scale, 8.0f * scale, 8.0f * scale, 0.0f * scale, 12.0f * scale, 0.0f * scale);
        this.headTexCoordinates = new float[] {
                0.125f, 0.25f, 0.125f, 0.125f, 0.25f, 0.125f, 0.25f, 0.25f,
                0.125f, 0.125f, 0.125f, 0.0f, 0.25f, 0.0f, 0.25f, 0.125f,
                0.25f, 0.125f, 0.25f, 0.0f, 0.375f, 0.0f, 0.375f, 0.125f,
                0.25f, 0.25f, 0.25f, 0.125f, 0.375f, 0.125f, 0.375f, 0.25f,
                0.0f, 0.25f, 0.0f, 0.125f, 0.125f, 0.125f, 0.125f, 0.25f,
                0.375f, 0.25f, 0.375f, 0.125f, 0.5f, 0.125f, 0.5f, 0.25f
        };
        addTextures(this.headTexCoordinates);
    }
}
