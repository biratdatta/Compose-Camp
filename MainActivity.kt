package com.example.birthdaywish
//androidx.compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaywish.ui.theme.BirthdayWishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayWishTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BirthdayGreetImage(message = "Happy Birthday Firoz",from="-From Mukul")
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetImage(message:String,from:String)
{
    val image= painterResource(id = R.drawable.birthdayparty)
    Box{
        Image(painter=image,
            contentDescription = null,
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                contentScale= ContentScale.Crop
            )
        BirthdayGreetText(message = "Happy BirthDay Firoz", from ="-From Mukul" )
    }

}

@Composable
fun BirthdayGreetText(message:String,from:String)
{
    Column{
        Text(text=message,fontSize=36.sp,
            modifier=Modifier.fillMaxWidth().wrapContentWidth(Alignment.Start)
            )
        Text(text = from, fontSize = 24.sp,
            modifier=Modifier.fillMaxWidth().wrapContentWidth(Alignment.End)
            )
    }
    //Trailing Lambda Syntax
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayWishTheme {
    BirthdayGreetImage(message = "Happy Birthday Firoz",from="-From Mukul")
    }
}