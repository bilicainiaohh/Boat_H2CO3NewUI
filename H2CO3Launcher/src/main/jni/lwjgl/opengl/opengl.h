/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#pragma once
#include "lwjgl/common_tools.h"

#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
#define APIENTRY
#endif

#define tlsGetFunction(index) (uintptr_t)((void **)(*__env)->reserved3)[index]
