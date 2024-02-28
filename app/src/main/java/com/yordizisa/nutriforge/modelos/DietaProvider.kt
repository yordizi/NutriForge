package com.yordizisa.nutriforge.modelos

class DietaProvider {
    companion object {
        var favDietaList = mutableListOf<Int>()


        val listaItem: MutableList<Dieta> = mutableListOf(
            Dieta(
                id = 1,
                nombre = "Hipercalórica",
                descripcion = "Concebida para ganar peso",
                foto = "https://prodiet.com.br/wp-content/uploads/post/PRODIET-blog-dieta-hipercalorica.png",
            ),
            Dieta(
                id = 2,
                nombre = "Hipocalórica",
                descripcion = "Concebida para perder peso",
                foto = "https://eldiariony.com/wp-content/uploads/sites/2/2021/04/ensalada-hipocalorica-shutterstock_188331728.jpg?quality=80&strip=all",
            ),
            Dieta(
                id = 3,
                nombre = "Antiinflamatoria",
                descripcion = "Reduce la inflamación crónica",
                foto = "https://suplementosinvitta.com/blog/wp-content/uploads/2020/08/omega-3-in-vitta.png",
            ),
            Dieta(
                id = 4,
                nombre = "hiperproteica",
                descripcion = "mantener músculo y perder grasa",
                foto = "https://centronutricionydietacbg.com/img/cms/DIETA%20HIPERPROTEICA.jpg",
            )
        )
    }
}
