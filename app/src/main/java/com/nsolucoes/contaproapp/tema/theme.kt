package com.nsolucoes.contaproapp.tema

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

private val TemaClaroCor = lightColors(
        primary = Purple500,
        primaryVariant = Purple700,
        secondary = Teal200,
        secondaryVariant = Teal700,
        background = Gray,
        surface = Color.White,
        error = Color.DarkGray ,
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Graydark,
        onSurface = Color.White,
        onError = Color.DarkGray,

    )
private val TemaEscuroCor = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
    secondaryVariant = Teal200,
    background = Gray,
    surface = Color.Black,
    error = Color.DarkGray ,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    onError = Color.DarkGray,
)



@Composable
fun AppTheme
            (darkTheme: Boolean, content: @Composable () -> Unit, ){
    MaterialTheme (colors = if (darkTheme) TemaEscuroCor else TemaClaroCor){

    }
        content()
}