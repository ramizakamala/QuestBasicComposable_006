package com.example.activity2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Login",
            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Bold),
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "Halaman Login",
            style = TextStyle(fontSize = 16.sp, color = Color.Gray)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.logo_umy),
            contentDescription = "Logo Universitas",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Nama",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
        Text(
            text = "Ramiza Kamala Tatsuru",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "20220140006",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(14.dp))

        Surface(
            shape = CircleShape,
            modifier = Modifier
                .size(350.dp)
                .border(4.dp, Color.White, CircleShape),
            tonalElevation = 6.dp
        )
    }
}