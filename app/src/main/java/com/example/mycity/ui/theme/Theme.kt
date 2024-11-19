package com.example.mycity.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Light theme color scheme
private val lightColors = lightColorScheme(
    primary = DeepNavyBlue,
    onPrimary = IvoryWhite,
    primaryContainer = ChampagneGold,
    onPrimaryContainer = CharcoalBlack,
    secondary = EmeraldGreen,
    onSecondary = CharcoalBlack,
    secondaryContainer = RoyalBurgundy,
    onSecondaryContainer = IvoryWhite,
    background = CharcoalBlack,
    onBackground = IvoryWhite,
    surface = IvoryWhite,
    onSurface = DeepNavyBlue,
    surfaceVariant = WarmTaupe,
    onSurfaceVariant = DarkSlate,
    outline = PlatinumSilver,
    error = CrimsonRed
)

// Dark theme color scheme
private val darkColors = darkColorScheme(
    primary = DeepNavyBlue,
    onPrimary = IvoryWhite,
    primaryContainer = ChampagneGold,
    onPrimaryContainer = CharcoalBlack,
    secondary = EmeraldGreen,
    onSecondary = CharcoalBlack,
    secondaryContainer = RoyalBurgundy,
    onSecondaryContainer = IvoryWhite,
    background = CharcoalBlack,
    onBackground = IvoryWhite,
    surface = CharcoalBlack,
    onSurface = IvoryWhite,
    surfaceVariant = WarmTaupe,
    onSurfaceVariant = DarkSlate,
    outline = PlatinumSilver,
    error = CrimsonRed
)

// City App Theme
@Composable
fun MyCityTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> darkColors
        else -> lightColors
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
