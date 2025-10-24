package xyz.mslx.pagedigi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xyz.mslx.pagedigi.ui.theme.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            enableEdgeToEdge()
            Main()
        }

    }
    @Preview(
        "a",
        device = Devices.NEXUS_5X,
        showBackground = true,
        widthDp = 420,
        heightDp = 1000
    )
    @Composable
    fun Main() {
        Column(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.White)
                .verticalScroll(rememberScrollState())

        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .background(color = Color.Red)
                    .height(2.dp)
            )

            Spacer(Modifier.size(50.dp))

            Image(painter = painterResource(R.drawable.product),
                "penguan",
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
            )
/*            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth().padding(5.dp)

            ) {
                Spacer(Modifier.size(10.dp))
                for (i in 1..3) {
                    Image(
                        painter = painterResource(R.drawable.arrow),
                        contentDescription = "a",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }*/
            Spacer(modifier = Modifier.size(15.dp))

            Text("دسگاه چسی - پرومکس",
                fontSize = 25.sp,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {

                Text(
                    "دیدگاه کاربران",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(end = 6.dp),
                    color = Skyblue,
                    textAlign = TextAlign.End
                )
                Text(
                    "8",
                    fontSize = 14.sp,
                    color = Skyblue,
                    textAlign = TextAlign.End

                )
                Box(Modifier
                    .padding(horizontal = 6.dp).size(5.dp).background(Color.Gray, shape = CircleShape)
                )
                Text(
                    "(11)",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.End
                )
                Text(
                    "4.2",
                    fontSize = 14.sp,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .padding(end = 4.dp),

                )
                Icon(
                    Icons.Default.Star,
                    "Icon-Star",
                    tint = Darkyellow,
                    modifier = Modifier.padding(end= 20.dp).size(18.dp)
                )

            }

 /*           Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 10.dp)
                    .background(color = Color.LightGray)
                    .height(2.dp)
            )*/

            Spacer(Modifier.height(30.dp))

            Box(Modifier
                .fillMaxWidth()
                .height(8.dp)
                .background(Lightgray)

            )
            Spacer(Modifier.height(20.dp))
            Text("ویژگی های محصول",
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth().padding(end = 16.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(Modifier.height(10.dp))
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text("امیر ای کن",
                    fontSize = 13.sp,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Text(":",
                    fontSize = 13.sp,
                    modifier = Modifier.padding(end = 4.dp),
                    color = Color.Gray
                )
                Text("کشور تولید",
                    fontSize = 13.sp,
                    modifier = Modifier.padding(end = 4.dp),
                    color = Color.Gray
                )
                Box(Modifier
                    .padding(start = 10.dp, end = 16.dp).size(5.dp).background(Color.Gray, shape = CircleShape)
                )
            }
            Spacer(Modifier.height(20.dp))

            Box(Modifier
                .padding(horizontal = 12.dp)
                .fillMaxWidth()
                .height(2.dp)
                .background(Lightgray)

            )
            Spacer(modifier = Modifier.height(15.dp))
            Row (
                Modifier.padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(R.drawable.arrow),
                    "",
                    Modifier.size(26.dp),
                    tint = Color.Gray
                )
                Text("ویژگی های محصول",
                    fontSize = 16.sp,
                    modifier = Modifier.fillMaxWidth().padding(end = 16.dp),
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )


            }
            Spacer(modifier = Modifier.height(15.dp))

            Box(Modifier
                .padding(horizontal = 12.dp)
                .fillMaxWidth()
                .height(2.dp)
                .background(Lightgray)

            )

            Spacer(modifier = Modifier.height(15.dp))

            Row (
                Modifier.padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(R.drawable.arrow),
                    "",
                    Modifier.size(26.dp),
                    tint = Color.Gray
                )
                Text("معرفی محصول",
                    fontSize = 16.sp,
                    modifier = Modifier.fillMaxWidth().padding(end = 16.dp),
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )


            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState(),
                        reverseScrolling = true
                    )
                    /*.background(Lightgray)*/
                    .padding(8.dp)
            ) {
                for (i in 1..8)
                Card(
                    Modifier.padding(horizontal = 2.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Row(Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.arrow),
                            "",
                            Modifier.size(26.dp),
                            tint = Color.Gray
                        )
                        Text("محصول $i",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(end = 15.dp),
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text("نظر",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(end = 4.dp, start = 10.dp),
                    color = Skyblue
                )
                Text("8",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(end = 12.dp),
                    color = Skyblue
                )
                Text("دیدگاه کاربران",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(end = 12.dp).fillMaxWidth(),
                    color = Color.Black,
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(Modifier.height(20.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState(),
                    reverseScrolling = true
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                for (i in 1..8) {
                    Spacer(Modifier.width(8.dp))

                    Card(
                        Modifier
                            .width(280.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        elevation = CardDefaults.cardElevation(8.dp)
                    ) {
                        Spacer(Modifier.height(20.dp))



                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {

                            Text("خریدار نیست",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(end = 6.dp),
                            color = Color.Gray,
                            textAlign = TextAlign.End,
                        )

                            Icon(Icons.Outlined.Person,
                               "اثمخ",
                                tint = Color.Gray,
                                modifier = Modifier.padding(end = 16.dp)
                                )
                        }
                        Text("به نظر من خیلی خوب بود و یکی از تجربه های خفن من هست",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 20.dp, start = 10.dp, top = 10.dp)
                                .fillMaxWidth(),
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End,
                        )
                        Spacer(Modifier.height(40.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier
                                .fillMaxWidth(),
                        ) {
                            Text("ممد",
                                fontSize = 14.sp,
                                color = Color.Gray,
                            )
                            Box(
                                Modifier
                                    .padding(horizontal = 12.dp)
                                    .size(4.dp)
                                    .background(
                                        color = Color.Gray,
                                        shape = CircleShape
                                    )
                            )
                            Text("ده دقیقه پیش",
                                fontSize = 14.sp,
                                color = Color.Gray,
                                modifier = Modifier.padding(end = 20.dp)
                            )
                        }
                        Spacer(Modifier.height(15.dp))
                    }

                    Spacer(Modifier.width(8.dp))

                }


            }
            Spacer(Modifier.height(20.dp))

            Card(
                Modifier.
                fillMaxWidth(),
                shape = RectangleShape,
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth().padding(horizontal = 16.dp,vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top,
                        modifier = Modifier.padding(start = 6.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("220,000",
                            fontSize = 12.sp,
                            modifier = Modifier.padding(end = 6.dp),
                            color = Color.Gray,
                        )
                            Text("12%",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .background(Color.Red, shape = CircleShape).padding(4.dp),
                            color = Color.White,
                        )
                        }
                        Spacer(Modifier.height(2.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("تومان",
                                fontSize = 14.sp,
                                modifier = Modifier.padding(end = 6.dp),
                            )
                            Text("97,000",
                                fontSize = 14.sp

                            )
                        }

                    }
                    Box(Modifier.fillMaxWidth(),contentAlignment = Alignment.CenterEnd){

                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Red,
                            )
                        ) {
                            Text("افزودن به سبد خرید",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }

                    }

                }

            }

        }
    }

}