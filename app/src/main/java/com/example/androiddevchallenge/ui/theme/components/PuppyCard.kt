package com.example.androiddevchallenge.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.model.PuppyModel
import com.example.androiddevchallenge.ui.theme.*
import com.example.androiddevchallenge.R

@Composable
fun PuppyCard(puppy: PuppyModel, navController: NavHostController, index: Int) {

    Card(
        elevation = 32.dp,
        shape = RoundedCornerShape(32.dp),
        modifier = Modifier.padding(8.dp)
    ) {

            Row(
                verticalAlignment = Alignment.Top,
                modifier = Modifier.clickable {
                    navController.navigate("puppyDetail/$index") {
                        popUpTo(route = "puppyList") {}
                    }
                },

                ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Card(shape = RoundedCornerShape(16.dp)) {
                        Image(
                            painter = painterResource(id = puppy.image),
                            contentDescription = "Puppy Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(100.dp)
                                .height(100.dp)
                        )
                    }

                }


                Column(modifier = Modifier.padding(start = 8.dp, top = 16.dp, bottom = 8.dp, end = 8.dp)) {


                    Text(
                        text = puppy.name,
                        style = typography.body1,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )

                    Text(
                        text = puppy.tagline,
                        style = typography.body2,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )

                    Row(
                        modifier = Modifier.padding(top = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Chip(content = puppy.age, purple700, purple_base)
                        Spacer(modifier = Modifier.padding(4.dp))
                        Chip(content = puppy.gender, purple700, purple_base)
                    }
                    Row(
                        modifier = Modifier.padding(top = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_pawprint), contentDescription = "Paw Icon",
                            modifier = Modifier.size(15.dp,15.dp)
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(
                            text = puppy.breed,
                            style = typography.caption,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }


                }

            }

    }

}
