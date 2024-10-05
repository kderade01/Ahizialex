package com.example.learntogether2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learntogether2.ui.theme.LearnTogether2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogether2Theme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){
                            Check()
                         }


                }
            }
        }
    }


@Composable
fun Check(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),


        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter= painterResource(id=R.drawable.ic_task_completed),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 300.dp)


        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(text= stringResource(R.string.task))
        Text(text= stringResource(R.string.task1))

    }

}

@Preview(showBackground = true)
@Composable
fun checkview() {
    LearnTogether2Theme {
       Check()
    }
}