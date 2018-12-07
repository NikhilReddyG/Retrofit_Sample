package com.test.app.retrofitsample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Model{
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("realname")
    @Expose
    private var realname: String? = null
    @SerializedName("team")
    @Expose
    private var team: String? = null
    @SerializedName("firstappearance")
    @Expose
    private var firstappearance: String? = null
    @SerializedName("createdby")
    @Expose
    private var createdby: String? = null
    @SerializedName("publisher")
    @Expose
    private var publisher: String? = null
    @SerializedName("imageurl")
    @Expose
    private var imageurl: String? = null
    @SerializedName("bio")
    @Expose
    private var bio: String? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getRealname(): String? {
        return realname
    }

    fun setRealname(realname: String) {
        this.realname = realname
    }

    fun getTeam(): String? {
        return team
    }

    fun setTeam(team: String) {
        this.team = team
    }

    fun getFirstappearance(): String? {
        return firstappearance
    }

    fun setFirstappearance(firstappearance: String) {
        this.firstappearance = firstappearance
    }

    fun getCreatedby(): String? {
        return createdby
    }

    fun setCreatedby(createdby: String) {
        this.createdby = createdby
    }

    fun getPublisher(): String? {
        return publisher
    }

    fun setPublisher(publisher: String) {
        this.publisher = publisher
    }

    fun getImageurl(): String? {
        return imageurl
    }

    fun setImageurl(imageurl: String) {
        this.imageurl = imageurl
    }

    fun getBio(): String? {
        return bio
    }

    fun setBio(bio: String) {
        this.bio = bio
    }
}