package com.example.simpletrain_kotlin

class Model(private val exerciseDao: ExerciseDao) {

    /*private val dictionary = mapOf(
        "key1" to listOf(
            ExerciseItem("Жим штанги лежа", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D1%88%D1%82%D0%B0%D0%BD%D0%B3%D0%B8-%D0%BB%D0%B5%D0%B6%D0%B0.gif", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BD%D0%B0-%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%BE%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://makefitness.pro/wp-content/uploads/2020/02/%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BB%D1%91%D0%B6%D0%B0.gif", "15 x 3"),
            ExerciseItem("Пуловер", "https://makefitness.pro/wp-content/uploads/2020/09/%D0%BF%D0%BE%D0%BB%D0%BE%D0%B2%D0%B5%D1%80-%D1%81-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Бабочка", "https://makefitness.pro/wp-content/uploads/2020/09/%D1%81%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D1%80%D1%83%D0%BA-%D0%B2-%D1%82%D1%80%D0%B5%D0%BD%D0%B0%D0%B6%D0%B5%D1%80%D0%B5-%D1%81%D0%B8%D0%B4%D1%8F.gif", "15 x 3"),
            ExerciseItem("Сведение в кроссовере", "https://makefitness.pro/wp-content/uploads/2020/09/%D1%81%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D1%80%D1%83%D0%BA-%D0%B2-%D0%BA%D1%80%D0%BE%D1%81%D1%81%D0%BE%D0%B2%D0%B5%D1%80%D0%B5-%D1%81%D1%82%D0%BE%D1%8F.gif", "15 x 3")
        ),
        "key2" to listOf(
            ExerciseItem("Жим штанги лежа", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D1%88%D1%82%D0%B0%D0%BD%D0%B3%D0%B8-%D0%BB%D0%B5%D0%B6%D0%B0.gif", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BD%D0%B0-%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%BE%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://makefitness.pro/wp-content/uploads/2020/02/%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BB%D1%91%D0%B6%D0%B0.gif", "15 x 3"),
            ExerciseItem("Пуловер", "https://makefitness.pro/wp-content/uploads/2020/09/%D0%BF%D0%BE%D0%BB%D0%BE%D0%B2%D0%B5%D1%80-%D1%81-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9.gif", "8-12 x 4")
        ),
        "key3" to listOf(
            ExerciseItem("Жим штанги лежа", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D1%88%D1%82%D0%B0%D0%BD%D0%B3%D0%B8-%D0%BB%D0%B5%D0%B6%D0%B0.gif", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BD%D0%B0-%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%BE%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://makefitness.pro/wp-content/uploads/2020/02/%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BB%D1%91%D0%B6%D0%B0.gif", "15 x 3"),
            ExerciseItem("Пуловер", "https://makefitness.pro/wp-content/uploads/2020/09/%D0%BF%D0%BE%D0%BB%D0%BE%D0%B2%D0%B5%D1%80-%D1%81-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9.gif", "8-12 x 4")
        ),
        "key4" to listOf(
            ExerciseItem("Жим штанги лежа", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D1%88%D1%82%D0%B0%D0%BD%D0%B3%D0%B8-%D0%BB%D0%B5%D0%B6%D0%B0.gif", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BD%D0%B0-%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%BE%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://makefitness.pro/wp-content/uploads/2020/02/%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BB%D1%91%D0%B6%D0%B0.gif", "15 x 3"),
            ExerciseItem("Пуловер", "https://makefitness.pro/wp-content/uploads/2020/09/%D0%BF%D0%BE%D0%BB%D0%BE%D0%B2%D0%B5%D1%80-%D1%81-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9.gif", "8-12 x 4")
        ),
        "key5" to listOf(
            ExerciseItem("Жим штанги лежа", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D1%88%D1%82%D0%B0%D0%BD%D0%B3%D0%B8-%D0%BB%D0%B5%D0%B6%D0%B0.gif", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BD%D0%B0-%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%BE%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://makefitness.pro/wp-content/uploads/2020/02/%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BB%D1%91%D0%B6%D0%B0.gif", "15 x 3"),
            ExerciseItem("Пуловер", "https://makefitness.pro/wp-content/uploads/2020/09/%D0%BF%D0%BE%D0%BB%D0%BE%D0%B2%D0%B5%D1%80-%D1%81-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9.gif", "8-12 x 4")
        ),
        "key6" to listOf(
            ExerciseItem("Жим штанги лежа", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D1%88%D1%82%D0%B0%D0%BD%D0%B3%D0%B8-%D0%BB%D0%B5%D0%B6%D0%B0.gif", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://makefitness.pro/wp-content/uploads/2020/02/%D0%B6%D0%B8%D0%BC-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BD%D0%B0-%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%BE%D0%B9.gif", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://makefitness.pro/wp-content/uploads/2020/02/%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9-%D0%BB%D1%91%D0%B6%D0%B0.gif", "15 x 3"),
            ExerciseItem("Пуловер", "https://makefitness.pro/wp-content/uploads/2020/09/%D0%BF%D0%BE%D0%BB%D0%BE%D0%B2%D0%B5%D1%80-%D1%81-%D0%B3%D0%B0%D0%BD%D1%82%D0%B5%D0%BB%D0%B5%D0%B9.gif", "8-12 x 4")
        ),
    )*/

    //fun getDictionaryValue(key: String): List<ExerciseItem>? {
    //    return dictionary[key] as? List<ExerciseItem>
    //}
    fun getExerciseItems(key: String): List<ExerciseItem> {

        return exerciseDao.getExerciseItems(key)
    }
}