package com.example.androiddevchallenge.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun MainHeader() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = 24.dp,
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 42.dp,
            bottomEnd = 42.dp
        )
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.paw), contentDescription = "Paw Image",
                    modifier = Modifier.size(50.dp,50.dp)
                )

                Text(
                    text = "Paw Finder",
                    modifier = Modifier.padding(start = 16.dp),
                    style = typography.h5,
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }
}