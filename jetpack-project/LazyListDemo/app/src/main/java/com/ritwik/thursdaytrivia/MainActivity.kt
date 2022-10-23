package com.ritwik.thursdaytrivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    val restaurants: List<Restaurant> = listOf(
        Restaurant(
            R.drawable.restaurant1,
            "Chai Point",
            "Tea, Beverage, Shake, Fast Food",
            4.1f,
            203.00f
        ),
        Restaurant(
            R.drawable.restaurant2,
            "Rim Naam - The Oberoi",
            "Thai, Asian, Seafood, Desserts",
            4.8f,
            403.00f
        ),
        Restaurant(
            R.drawable.restaurant3,
            "Ministers of Food",
            "Indian, Chinese",
            4.7f,
            612.00f
        )
    )
    val searchKey = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 30.dp)
    ) {
        OutlinedTextField(
            value = searchKey.value,
            onValueChange = {searchKey.value = it},
            placeholder = {
                Text(
                    text = "Restaurant name or a dish",
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 12.sp
                    )
                )
            },
            singleLine = true,
            leadingIcon = {Icon(imageVector = Icons.Outlined.Search, contentDescription = "Search")},
            shape = RoundedCornerShape(corner = CornerSize(size = 20.dp)),
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(corner = CornerSize(size = 20.dp)))
                .background(color = Color.White)
        )
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(
             modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ){
            items(restaurants) { restaurant ->
                RestaurantCard(restaurant)
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant){
    Surface(
        elevation = 10.dp,
        shape = RoundedCornerShape(corner = CornerSize(17.dp))
    ) {
        Card(
            elevation = 100.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(color = Color.White),
        ) {
            Column(){
                Image(
                    painter = painterResource(id = restaurant.imageId),
                    contentDescription = restaurant.restaurantName,
                    modifier = Modifier
                        .height(175.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp)
                ) {
                    Column {
                        Text(
                            text = restaurant.restaurantName,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.W700,
                                color = Color.Black
                            )
                        )
                        Text(
                            text = restaurant.restaurantDesc,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W500
                            )
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .width(50.dp)
                                .height(25.dp)
                                .clip(shape = RoundedCornerShape(corner = CornerSize(10.dp)))
                                .background(color = Color(0xFF2B582B))
                        ) {
                            Text(
                                text = restaurant.ratings.toString(),
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W800
                                )
                            )
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "${restaurant.ratings} rating",
                                tint = Color.Yellow,
                                modifier = Modifier.size(17.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Rs. ${restaurant.price} for one",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.Black
                            )
                        )
                    }
                }

            }
        }
    }
}

data class Restaurant(
    val imageId: Int,
    val restaurantName: String,
    val restaurantDesc: String,
    val ratings: Float,
    val price: Float
)