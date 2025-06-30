package pl.michal_cyran.website

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform