package eu.ottop.yamlauncher

import android.content.pm.LauncherActivityInfo
import android.os.UserHandle

data class AppEntry(
    val info: LauncherActivityInfo,
    val user: UserHandle,
    val profile: Int,
    val displayName: String,
    val displayNameLower: String,
    val cleanedName: String,
    val cleanedNameLower: String
)
