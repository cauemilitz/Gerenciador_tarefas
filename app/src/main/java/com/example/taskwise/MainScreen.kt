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
fun MainScreen(navController: NavController) {
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

    //Spacer(Modifier.height(50.dp))
    Card(
        //Modifier.
        Modifier.padding(
            horizontal = 24.dp,
            vertical = 56.dp
        ).fillMaxWidth()
    ) {
        Column(
            Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row {
                        Text("nome tarefa")

                        Spacer(Modifier.width(10.dp))

                        Text("importante")

                        Spacer(Modifier.width(10.dp))

                        Text("30 dias restantes")

                    }
                    Row { Spacer(Modifier.width(10.dp))
                        CustomChip("ver",0xFFB97FC9)

                        Spacer(Modifier.width(10.dp))

                        CustomChip1("delete",0xFFB97FC9)

                        Spacer(Modifier.width(10.dp))

                        CustomChip2("editar",0xFFB97FC9) }
                }
            }
        }
        Spacer(Modifier.width(10.dp))
        Column(
            Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row {
                        Text("nome tarefa")
                        Spacer(Modifier.width(10.dp))
                        Text("não importante")
                        Spacer(Modifier.width(10.dp))
                        Text("15 dias restantes")
                    }
                    Row {
                        Spacer(Modifier.width(10.dp))

                        CustomChip("ver",0xFFB97FC9)

                        Spacer(Modifier.width(10.dp))

                        CustomChip1("delete",0xFFB97FC9)

                        Spacer(Modifier.width(10.dp))

                        CustomChip2("editar",0xFFB97FC9) }
                }
            }
            Spacer(Modifier.width(10.dp))
            Column(
                Modifier.fillMaxWidth().padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row {
                            Text("nome tarefa")

                            Spacer(Modifier.width(10.dp))

                            Text("muito importante")

                            Spacer(Modifier.width(10.dp))

                            Text("5 dias restantes")

                        }
                        Row {
                            Spacer(Modifier.width(10.dp))

                            CustomChip("ver", 0xFFB97FC9)

                            Spacer(Modifier.width(10.dp))

                            CustomChip1("delete", 0xFFB97FC9)

                            Spacer(Modifier.width(10.dp))

                            CustomChip2("editar", 0xFFB97FC9)
                        }

                        Spacer(Modifier.height(150.dp))

                        Row {
                            CustomChip3("criar",0xFFB97FC9)
                        }
                    }
                }
            }
        }
    }
}