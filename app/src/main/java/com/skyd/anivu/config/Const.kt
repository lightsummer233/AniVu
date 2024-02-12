package com.skyd.anivu.config

import com.skyd.anivu.appContext
import java.io.File

object Const {
    const val GITHUB_REPO = "https://github.com/SkyD666/AniVu"
    const val TELEGRAM_GROUP = "https://t.me/SkyD666Chat"
    const val DISCORD_SERVER = "https://discord.gg/pEWEjeJTa3"

    const val RAYS_ANDROID_URL = "https://github.com/SkyD666/Rays-Android"
    const val RACA_ANDROID_URL = "https://github.com/SkyD666/Raca-Android"
    const val NIGHT_SCREEN_URL = "https://github.com/SkyD666/NightScreen"

    const val BASE_URL = "https://github.com/SkyD666/"

    val TEMP_TORRENT_DIR = File(appContext.cacheDir.path, "Torrent").apply {
        if (!exists()) mkdirs()
    }

    val DOWNLOADING_VIDEO_DIR = File(appContext.cacheDir.path, "DownloadingVideo").apply {
        if (!exists()) mkdirs()
    }

    val VIDEO_DIR = File(appContext.filesDir.path, "Video").apply {
        if (!exists()) mkdirs()
    }
}