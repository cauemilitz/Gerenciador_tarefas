package com.example.taskwise

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainCreate(navController: NavController) {
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



        Textarea()

        Spacer(Modifier.height(10.dp))

        Textarea1()

        Spacer(Modifier.height(10.dp))

        Textarea2()

        Spacer(Modifier.height(10.dp))

        Textarea3()

        Spacer(Modifier.height(150.dp))

        CustomChip4("salvar",0xFFB97FC9)
    }
}