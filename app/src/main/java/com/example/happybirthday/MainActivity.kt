package com.example.happybirthday

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
                        text1 = "GUENE",
                        text2 = "DEVELOPPEUR FULL-STACK",
                        text3 = "Cocody Riviera",
                        text4 = "+225 01 41 25 14 25",
                        text5 = "moumouigue@outlock.com",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun GreetingText(text1: String, text2: String, modifier: Modifier = Modifier ) {
   Column(
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally

   ) {
       Text(
           text = text1,
           fontSize = 30.sp,
            color = Color(0xFF6200EE),
           modifier = Modifier.padding(5.dp, top = 6.dp)
       )
       Text(
           text = text2,
           modifier = Modifier.padding(5.dp)
       )

   }
}
@Composable
fun CardText(text3: String, text4: String, text5 : String, modifier: Modifier = Modifier ) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start

    ) {
      Row{
          Icon(
              imageVector = Icons.Default.Place,
              contentDescription = null,
              modifier = Modifier.padding(5.dp, top = 6.dp),
              tint = Color(0xFF6200EE)

              )
          Text(
              text = text3,
              fontSize = 20.sp,
              modifier = Modifier.padding(5.dp, top = 6.dp)
          )
      }
      Row {
          Icon(
              imageVector = Icons.Filled.Call,
              contentDescription = null,
              tint = Color(0xFF6200EE)


              )
          Text(
              text = text4,
              fontSize = 20.sp,
              modifier = Modifier.padding(5.dp)
          )

      }
     Row {
         Icon(
             imageVector = Icons.Filled.Email,
             contentDescription = null,
             tint = Color(0xFF6200EE)
         )
         Text(
             text = text5,
             fontSize = 20.sp,

         )

     }

    }
}

@Composable
fun GreetingImage(text1: String, text2: String, text3: String, text4: String, text5: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.img_20241018_191305)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ) {
        Box(
            modifier = Modifier.padding(bottom = 30.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center,
                    modifier = Modifier.size(150.dp).clip(RoundedCornerShape(16.dp))

                    )

                GreetingText(text1 = text1, text2 = text2,
                    modifier = Modifier.fillMaxSize().padding(8.dp))
            }

        }
        Box(modifier = Modifier.padding(top = 90.dp)){
            CardText(text3 = text3, text4 = text4, text5 = text5,
                modifier = Modifier.fillMaxSize())
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingTogether() {
    HappyBirthdayTheme {
     GreetingImage(
         text1 = "GUENE ",
         text2 = "DEVELOPPEUR FULL-STACK",
         text3 = "Cocody Riviera",
         text4 = "+225 01 41 25 14 25",
         text5 = "moumouigue@outlock.com"

     )  }  }