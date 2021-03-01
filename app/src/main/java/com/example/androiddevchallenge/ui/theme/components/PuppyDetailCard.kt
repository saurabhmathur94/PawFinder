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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.PuppyModel
import com.example.androiddevchallenge.ui.theme.purple700
import com.example.androiddevchallenge.ui.theme.purple_base
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun PuppyDetailCard(puppy: PuppyModel) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(bottomEnd = 32.dp, bottomStart = 32.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = puppy.image),
                contentDescription = "Puppy Image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = puppy.name,
            style = typography.h4,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = puppy.tagline,
            style = typography.body2,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        Row(
            modifier = Modifier.padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Chip(content = puppy.age, purple700, purple_base)
            Spacer(modifier = Modifier.padding(4.dp))
            Chip(content = puppy.gender, purple700, purple_base)
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Row(
            modifier = Modifier.padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_pawprint), contentDescription = "Paw Icon",
                modifier = Modifier.size(20.dp, 20.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                text = puppy.breed,
                style = typography.body2,
                modifier = Modifier.padding(bottom = 4.dp, start = 2.dp)
            )
        }

        Row(
            modifier = Modifier.padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_location),
                contentDescription = "Location Icon",
            )
            Spacer(modifier = Modifier.padding(4.dp))

            Text(
                text = puppy.location,
                style = typography.body2,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }

        Row(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = "About",
                style = typography.h6,
                fontWeight = FontWeight.Medium
            )
        }
        Row(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = stringResource(id = puppy.description),
                style = typography.body1,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }

    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(start = 32.dp, top = 16.dp, bottom = 16.dp, end = 32.dp)
            .fillMaxWidth()

    ) {
        Text(
            text = "Adopt Me!",
            modifier = Modifier.padding(8.dp),
        )
    }
}
