package com.yordizisa.nutriforge.modelos

import android.os.Parcel
import android.os.Parcelable

data class Dieta(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val foto: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",  // Proporciona un valor por defecto en caso de que sea nula
        parcel.readString() ?: "",  // Proporciona un valor por defecto en caso de que sea nula
        parcel.readString() ?: ""   // Proporciona un valor por defecto en caso de que sea nula
    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(nombre)
        parcel.writeString(descripcion)
        parcel.writeString(foto)
    }

    companion object CREATOR : Parcelable.Creator<Dieta> {
        override fun createFromParcel(parcel: Parcel): Dieta {
            return Dieta(parcel)
        }

        override fun newArray(size: Int): Array<Dieta?> {
            return arrayOfNulls(size)
        }
    }
}




