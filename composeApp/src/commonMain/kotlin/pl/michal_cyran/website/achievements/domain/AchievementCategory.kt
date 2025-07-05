package pl.michal_cyran.website.achievements.domain

enum class AchievementCategory(
    val displayName: String
) {
    MATH("Math Competitions"),
    PROGRAMMING("Programming Awards"),
    SCHOLARSHIP("Scholarships"),
    OTHER("Other Achievements")
}

