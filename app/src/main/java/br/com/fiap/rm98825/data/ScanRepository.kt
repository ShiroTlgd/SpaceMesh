package br.com.fiap.rm98825.data

import br.com.fiap.rm98825.R
import br.com.fiap.rm98825.model.Scan

object ScanRepository {

    val scans = listOf(

        Scan(
            id = 1,
            title = "Depressão  sudoeste",
            description = "Mapeamento topográfico de formação montanhosa marciana",
            details = """
                Data: Sol 1249
                
                Área Escaneada:
                Sudoeste de Marte
                
                Resolução:
                0.05m/px

                Status:
                Concluído
                
                Coordenadas:
                12.46° N
                142.79° E
            """.trimIndent(),
            roverName = "SM-RV-001",
            scanImage = R.drawable.scan01,
            roverImage = R.drawable.rover01
        ),

        Scan(
            id = 2,
            title = "Scan Cratera Central",
            description = "Levantamento geoespacial de superfície rochosa",
            details = """
                Data: Sol 1251
                
                Área Escaneada:
                Centro de Marte
                
                Resolução:
                0.05m/px
               
                Status:
                Concluído
                
                Coordenadas:
                28.19° N
                33.72° E
            """.trimIndent(),
            roverName = "SM-RV-002",
            scanImage = R.drawable.scan02,
            roverImage = R.drawable.rover02
        ),

        Scan(
            id = 3,
            title = "Scan Vale do Norte",
            description = "Análise topográfica de cânions marcianos",
            details = """
                Data: Sol 1253
                
                Área Escaneada:
                Norte de marte
                
                Resolução:
                0.05m/px
                
                Status:
                Concluído
                
                Coordenadas:
                14.60° S
                59.30° W
            """.trimIndent(),
            roverName = "SM-RV-003",
            scanImage = R.drawable.scan03,
            roverImage = R.drawable.rover03
        )

    )
}