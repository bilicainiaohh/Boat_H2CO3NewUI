//
// Created by cainiaohh on 2022/10/11.
//

#include <sys/time.h>
#include <time.h>

#include <internal.h>


//////////////////////////////////////////////////////////////////////////
//////                       GLFW internal API                      //////
//////////////////////////////////////////////////////////////////////////

// Initialise timer
//
void _glfwInitTimerPOSIX(void)
{
#if defined(CLOCK_MONOTONIC)
    struct timespec ts;

    if (clock_gettime(CLOCK_MONOTONIC, &ts) == 0)
    {
        _glfw.timer.posix.monotonic = GLFW_TRUE;
        _glfw.timer.posix.frequency = 1000000000;
    }
    else
#endif
    {
        _glfw.timer.posix.monotonic = GLFW_FALSE;
        _glfw.timer.posix.frequency = 1000000;
    }
}


//////////////////////////////////////////////////////////////////////////
//////                       GLFW platform API                      //////
//////////////////////////////////////////////////////////////////////////

uint64_t _glfwPlatformGetTimerValue(void)
{
#if defined(CLOCK_MONOTONIC)
    if (_glfw.timer.posix.monotonic)
    {
        struct timespec ts;
        clock_gettime(CLOCK_MONOTONIC, &ts);
        return (uint64_t) ts.tv_sec * (uint64_t) 1000000000 + (uint64_t) ts.tv_nsec;
    }
    else
#endif
    {
        struct timeval tv;
        gettimeofday(&tv, NULL);
        return (uint64_t) tv.tv_sec * (uint64_t) 1000000 + (uint64_t) tv.tv_usec;
    }
}

uint64_t _glfwPlatformGetTimerFrequency(void)
{
    return _glfw.timer.posix.frequency;
}

