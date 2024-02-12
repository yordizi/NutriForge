package com.yordizisa.nutriforge.modelos

class DietaProvider {
    companion object {
        val listaItem: MutableList<Dieta> = mutableListOf(
            Dieta(
                nombre = "Hipercalórica",
                descripcion = "Concebida para ganar peso",
                foto = "https://prodiet.com.br/wp-content/uploads/post/PRODIET-blog-dieta-hipercalorica.png",
                esFavorita = false
            ),
            Dieta(
                nombre = "Hipocalórica",
                descripcion = "Concebida para perder peso",
                foto = "https://eldiariony.com/wp-content/uploads/sites/2/2021/04/ensalada-hipocalorica-shutterstock_188331728.jpg?quality=80&strip=all",
                esFavorita = false
            ),
            Dieta(
                nombre = "Antiinflamatoria",
                descripcion = "Reduce la inflamación crónica",
                foto = "https://suplementosinvitta.com/blog/wp-content/uploads/2020/08/omega-3-in-vitta.png",
                esFavorita = false
            ),
            Dieta(
                nombre = "hiperproteica",
                descripcion = "mantener músculo y perder grasa",
                foto = "https://centronutricionydietacbg.com/img/cms/DIETA%20HIPERPROTEICA.jpg",
                esFavorita = false
            )
        )
    }
}
