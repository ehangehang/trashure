package com.example.trashure.model

import android.os.Parcel
import android.os.Parcelable

data class Setoran(val id: String?, val date: String?, val status: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(date)
        parcel.writeString(status)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Setoran> {
        override fun createFromParcel(parcel: Parcel): Setoran {
            return Setoran(parcel)
        }

        override fun newArray(size: Int): Array<Setoran?> {
            return arrayOfNulls(size)
        }
    }

}