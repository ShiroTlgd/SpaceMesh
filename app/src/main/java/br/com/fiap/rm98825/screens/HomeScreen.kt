package br.com.fiap.rm98825.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.rm98825.model.Scan

@Composable
fun HomeScreen(
    scans: List<Scan>,
    onScanClick: (Int) -> Unit
) {

    LazyColumn {

        items(scans) { scan ->

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        onScanClick(scan.id)
                    }
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Image(
                        painter = painterResource(id = scan.scanImage),
                        contentDescription = scan.title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                    )

                    Text(
                        text = scan.title,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Text(
                        text = scan.description,
                        maxLines = 2
                    )
                }
            }
        }
    }
}