package br.com.fiap.rm98825.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.rm98825.model.Scan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    scan: Scan,
    onBack: () -> Unit
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(scan.title)
                },
                navigationIcon = {
                    TextButton(
                        onClick = onBack
                    ) {
                        Text("Voltar")
                    }
                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Text(
                text = "Scan LiDAR",
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Image(
                painter = painterResource(id = scan.scanImage),
                contentDescription = scan.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Text(
                text = scan.details,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            Divider()

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            Text(
                text = "Rover Responsável",
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Image(
                painter = painterResource(id = scan.roverImage),
                contentDescription = scan.roverName,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "Código: ${scan.roverName}",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text("Fabricante: SpaceMesh")

                    Text("Sistema: Autônomo")

                    Text("Sensor: LiDAR 360°")

                    Text("Status: Operacional")

                    Text("Autonomia: 12 horas")

                    Text("Velocidade Máxima: 0.12 m/s")
                }
            }

            Spacer(
                modifier = Modifier.height(24.dp)
            )
        }
    }
}