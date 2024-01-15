package com.example.simpletrain_kotlin.data

import com.example.simpletrain_kotlin.ExerciseItem

class Model {
    private val exerciseValue = mapOf(
        "keyChest" to listOf(
            ExerciseItem("Жим штанги лежа", "https://goo.su/gIUOL7", "8-12 x 4"),
            ExerciseItem("Жим гантелей в наклоне", "https://goo.su/ovsQE", "8-12 x 4"),
            ExerciseItem("Разведение гантелей", "https://goo.su/7IQNz7Z", "15 x 3"),
            ExerciseItem("Пуловер", "https://goo.su/fuFN2X", "8-12 x 4"),
            ExerciseItem("Бабочка", "https://goo.su/5lbQR0", "15 x 3"),
            ExerciseItem("Сведение в кроссовере", "https://goo.su/PUkOr", "15 x 3")
        ),
        "keyBack" to listOf(
            ExerciseItem("Становая тяга", "https://goo.su/2qEtz0", "6-10 x 4"),
            ExerciseItem("Тяга штанги в наклоне", "https://goo.su/CinDJ", "8-12 x 4"),
            ExerciseItem("Тяга гантели одной рукой", "https://goo.su/CMlTcM", "8-12 x 3"),
            ExerciseItem("Подтягивания широким хватом", "https://goo.su/nWfy", "50-70% от макс. x 4"),
            ExerciseItem("Подтягивания параллел. хватом", "https://goo.su/QcqQ", "50-70% от макс. x 4"),
            ExerciseItem("Подтягивания обратным хватом", "https://goo.su/7EUwN", "50-70% от макс. x 4")
        ),
        "keyShoulders" to listOf(
            ExerciseItem("Жим гантелей ввверх сидя", "https://goo.su/htUxLvz", "6-10 x 4"),
            ExerciseItem("Тяга к подбородку", "https://goo.su/Db4YA", "8-12 x 4"),
            ExerciseItem("Махи с гантелями", "https://goo.su/Uc9Kk", "15 x 3"),
            ExerciseItem("Махи в наклоне", "https://goo.su/gYJIT3b", "15 x 3"),
        ),
        "keyBiceps" to listOf(
            ExerciseItem("Подъем штанги на бицепс", "https://goo.su/3re4zsC", "8-12 x 4"),
            ExerciseItem("Подъем гантелей на бицепс", "https://goo.su/KTUk", "8-12 x 4"),
            ExerciseItem("Молотки", "https://goo.su/7IQNz7Z", "8-12 x 4"),
            ExerciseItem("Подъем на бицепс с упором", "https://goo.su/qwdeDU7", "12-15 x 3")
        ),
        "keyTriceps" to listOf(
            ExerciseItem("Жим узким хватом", "https://goo.su/Md7Ej80", "8-12 x 4"),
            ExerciseItem("Французский жим лежа", "https://goo.su/X6or9I", "8-12 x 4"),
            ExerciseItem("Жим гантели из за головы", "https://goo.su/y9uuQ", "8-12 x 4"),
            ExerciseItem("Разгибание с гантелей в наклоне", "https://goo.su/TwjVG", "10-15 x 3 на каждую руку")
        ),
        "keyLegs" to listOf(
            ExerciseItem("Приседания со штангой", "https://goo.su/Uyh7P", "6-10 x 4"),
            ExerciseItem("Выпады с гантелями", "https://goo.su/wrKp", "12-15 x 3 на каждую ногу"),
            ExerciseItem("Обратные выпады с гантелями", "https://goo.su/13z2qM", "15 x 3 на каждую ногу"),
            ExerciseItem("Широкие приседания с гантелей", "https://goo.su/pEhBmD4", "8-10 x 4"),
            ExerciseItem("Мертвая тяга со шатнгой", "https://goo.su/nCoq", "10 x 4"),
            ExerciseItem("Подъем на носки со штангой", "https://goo.su/G3Oxnd", "15-20 x 2-3")
        ),
        "keyEasyLevel" to listOf(
            ExerciseItem("Касание пяток сидя", "https://goo.su/82U8i", "20-50"),
            ExerciseItem("Упрощенный велосипед", "https://goo.su/zN9bXk6", "20-50"),
            ExerciseItem("Скручивания стоя", "https://goo.su/ooOK", "20-40"),
            ExerciseItem("Русский твистер", "https://goo.su/UEMu7PH", "20-40"),
            ExerciseItem("Упрощен. обратные скручивания", "https://goo.su/PZc6", "15-30")
        ),
        "keyMediumLevel" to listOf(
            ExerciseItem("Скручивания", "https://goo.su/ivPJ", "20-50"),
            ExerciseItem("Косые скруч. с велосипедом", "https://goo.su/z6H0OT6", "20-40"),
            ExerciseItem("Обратные скручивания", "https://goo.su/kP6UoC", "15-30"),
            ExerciseItem("Велосипед", "https://goo.su/WINskd", "20-40"),
            ExerciseItem("Маятник", "https://goo.su/85RmupY", "15-30"),
            ExerciseItem("Косой поднос колена в упоре", "https://goo.su/DLu8Cj", "20-50")
        ),
        "keyHardLevel" to listOf(
            ExerciseItem("Скручивания к коленям в упоре", "https://goo.su/wCsUV", "20-50"),
            ExerciseItem("Скручивания в боковой планке", "https://goo.su/sZtkzAb", "20-50"),
            ExerciseItem("Подъем таза в боковой планке", "https://goo.su/h5BRt", "20-40"),
            ExerciseItem("Приведение локтя в бок. планке", "https://goo.su/euJk", "20-40"),
        )
    )
    private val toolbarTitleValue = mapOf(
        "keyChest" to "ГРУДЬ",
        "keyBack" to "СПИНА",
        "keyShoulders" to "ПЛЕЧИ",
        "keyBiceps" to "БИЦЕПС",
        "keyTriceps" to "ТРИЦЕПС",
        "keyLegs" to "НОГИ",
        "keyEasyLevel" to "ЛЕГКИЙ УРОВЕНЬ",
        "keyMediumLevel" to "СРЕДНИЙ УРОВЕНЬ",
        "keyHardLevel" to "СЛОЖНЫЙ УРОВЕНЬ"
        )
    fun getExerciseValue(key: String): List<ExerciseItem>? {
        return exerciseValue[key]
    }
    fun getToolbarTitleValue(key: String): String? {
        return toolbarTitleValue[key]
    }

}