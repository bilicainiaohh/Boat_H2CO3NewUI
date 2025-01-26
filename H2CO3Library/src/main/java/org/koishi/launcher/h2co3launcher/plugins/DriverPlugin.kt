package org.koishi.launcher.h2co3launcher.plugins

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import org.koishi.launcher.h2co3launcher.utils.H2CO3LauncherTools

object DriverPlugin {
    data class Driver(val driver: String, val path: String)

    private var isInit = false;
    private const val PACKAGE_FLAGS =
        PackageManager.GET_META_DATA or PackageManager.GET_SHARED_LIBRARY_FILES

    @JvmStatic
    val driverList: MutableList<Driver> = mutableListOf()
        get() {
            if (!isInit) {
                init(H2CO3LauncherTools.CONTEXT)
            }
            return field
        }

    @JvmStatic
    var selected: Driver = Driver("Turnip", "")

    @JvmStatic
    @SuppressLint("QueryPermissionsNeeded")
    fun init(context: Context) {
        isInit = true
        driverList.add(Driver("Turnip", context.applicationInfo.nativeLibraryDir))
        selected = driverList[0]
        val queryIntentActivities =
            context.packageManager.queryIntentActivities(Intent("android.intent.action.MAIN"),
                PACKAGE_FLAGS
            )
        queryIntentActivities.forEach {
            parse(it.activityInfo.applicationInfo)
        }
    }

    private fun parse(info: ApplicationInfo) {
        if (info.flags and ApplicationInfo.FLAG_SYSTEM == 0) {
            val metaData = info.metaData ?: return
            if (metaData.getBoolean("h2co3LauncherPlugin", false)) {
                val driver = metaData.getString("driver") ?: return
                val nativeLibraryDir = info.nativeLibraryDir
                driverList.add(
                    Driver(
                        driver,
                        nativeLibraryDir
                    )
                )
            }
        }
    }
}