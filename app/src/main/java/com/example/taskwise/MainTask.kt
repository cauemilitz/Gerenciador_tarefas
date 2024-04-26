package com.example.taskwise

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTask(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("taskwise")
                },

                )
        }
    ) { paddingValues ->
        Column(Modifier.fillMaxSize().padding(paddingValues)) {

        }

    }

    Card(Modifier.padding(
        horizontal = 24.dp,
        vertical = 56.dp
    ).fillMaxWidth()) {

        Column(
            Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                 Text("sua tarefa:")

                 Spacer(Modifier.height(10.dp))

                 Text("_______")

                    Column(Modifier.fillMaxWidth().padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally)
                    {
                        Row {
                            CustomChip5("voltar",0xFFB97FC9)
                        }
                    }
}

            }
        }
    }
}