/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun Chip(content: String, textColor: androidx.compose.ui.graphics.Color, bgColor: androidx.compose.ui.graphics.Color) {
    Text(
        text = content,
        style = typography.caption,
        color = textColor,
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .background(color = bgColor, shape = RoundedCornerShape(12.dp))
            .padding(top = 4.dp, start = 10.dp, bottom = 4.dp, end = 10.dp)
    )
}
