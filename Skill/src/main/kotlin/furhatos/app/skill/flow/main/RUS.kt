//package furhatos.app.skill.flow.main
//
//import furhatos.app.skill.flow.Parent
//import furhatos.flow.kotlin.*
//import furhatos.flow.kotlin.voice.PollyVoice
//import furhatos.gestures.Gestures
//import furhatos.util.Language
//
//val Rus: State = state(Parent) {
//
//    onEntry {
//        furhat.voice = PollyVoice.Tatyana()
//        furhat.character = "Rena"
//        furhat.attend(users.random)
//        furhat.setInputLanguage(Language.RUSSIAN)
//    }
//
//    onButton("Начать") {
//        furhat.say("Привет. Сегодня мы будем учиться читать. В казахском языке есть 42 букв, 15 гласных и 26 согласных букв и звуков")
//        furhat.say("Сейчас мы научимся читать по этим буквам.")
//    }
//
//    onButton("гласные: а, е, о. согласные: м"){
//        goto(First)
//    }
//
//    onButton("Второе предложение - 2 слова") {
//        goto(Second)
//    }
//
//    onButton("Третье предложение - 2 слова") {
//        goto(Third)
//    }
//
//    onButton("Четвёртое предложение - 3 слова") {
//        goto(Fourth)
//    }
//
//    onButton("Пятое предложение - 3 слова") {
//        goto(Fifth)
//    }
//
//    onButton("Шестое предложение - 3 слова") {
//        goto(Sixth)
//    }
//
//    onButton("Шестое предложение - 3 слова") {
//        goto(Sixth)
//    }
//
//    onButton("Еда") {
//        goto(Food)
//    }
//
//    onButton("Животные") {
//        goto(Animals)
//    }
//
//    onButton("Одежда") {
//        goto(Clothes)
//    }
//
//    onButton("Кухня") {
//        goto(Kitchen)
//    }
//
//    onButton("Самому составлять предложения") {
//        goto(Create)
//    }
//}
//
//var First: State = state(Parent) {
//    onEntry {
//        furhat.say("Давай посмотрим на три согласных букв. Первое - А. Второе - О. И третье - Е")
//        furhat.say("Повтори: А. О. Е.")
//        furhat.say("А теперь, давай попробуем с согласной М.")
//        furhat.say("М и А - МА. М и О - Мо. М и Е - МЕ.")
//    }
//
//    onButton("Повторим") {
//        furhat.say("Давай ещё раз")
//        furhat.say("Повторяй: МА. МО. МЕ")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец")
//        goto(Rus)
//    }
//}
//
//var Second: State = state(Parent) {
//    onEntry {
//        furhat.say("Давай составим предложение - \"Бабушка сидит\"")
//        furhat.say("Первое слово - бабушка. Найди карточку с рисунком бабушки")
//    }
//
//    onButton("Второе слово") {
//        furhat.say("Она сидит. Найди картинку, где человек сидит")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец. Теперь ты составил предложение - \"Бабушка сидит\"")
//        goto(Rus)
//    }
//}
//
//var Third: State = state(Parent) {
//    onEntry {
//        furhat.say("Давай составим ещё одно предложение - \"Дети играют\"")
//        furhat.say("Первое слово - дети. Найди карточку с рисунком детей")
//    }
//
//    onButton("Второе слово") {
//        furhat.say("Они играют. Найди картинку, где люди играют")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец. Теперь ты составил предложение - \"Дети играют\"")
//        goto(Rus)
//    }
//}
//
//var Fourth: State = state(Parent) {
//    onEntry {
//        furhat.say("Давай составим предложение из трёх слов - \"Девочка играет в мяч\"")
//        furhat.say("Первое слово - девочка. Найди карточку с рисунком девочки")
//    }
//
//    onButton("Второе слово") {
//        furhat.say("Она играет. Найди картинку, где человек играет")
//    }
//
//    onButton("Третье слово") {
//        furhat.say("Она играет в мяч. Теперь найди картинку мяча")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец. Теперь ты составил предложение - \"Девочка играет в мяч\"")
//        goto(Rus)
//    }
//}
//
//var Fifth: State = state(Parent) {
//    onEntry {
//        furhat.say("Давай составим предложение из трёх слов - \"Девочка рисует красками\"")
//        furhat.say("Первое слово - девочка. Найди карточку с рисунком девочки")
//    }
//
//    onButton("Второе слово") {
//        furhat.say("Она рисует. Найди картинку, где человек рисует")
//    }
//
//    onButton("Третье слово") {
//        furhat.say("Она рисует красками. Теперь найди картинку красок")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец. Теперь ты составил предложение - \"Девочка рисует красками\"")
//        goto(Rus)
//    }
//}
//
//var Sixth: State = state(Parent) {
//    onEntry {
//        furhat.say("Давай составим предложение из трёх слов - \"Мальчик читает книгу\"")
//        furhat.say("Первое слово - мальчик. Найди карточку с рисунком девочки")
//    }
//
//    onButton("Второе слово") {
//        furhat.say("Он читает. Найди картинку, где человек читает")
//    }
//
//    onButton("Третье слово") {
//        furhat.say("Он читает книгу. Теперь найди картинку книги")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец. Теперь ты составил предложение - \"Мальчик читает книгу\"")
//        goto(Rus)
//    }
//}
//
//var Food: State = state(Parent) {
//    onEntry {
//        furhat.say("А теперь найди картинки едыы, которую ты любишь кушать")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец.")
//        goto(Rus)
//    }
//}
//
//var Animals: State = state(Parent) {
//    onEntry {
//        furhat.say("А теперь найди картинки животных и птиц, которых ты знаешь")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец.")
//        goto(Rus)
//    }
//}
//
//var Clothes: State = state(Parent) {
//    onEntry {
//        furhat.say("А теперь найди картинки одежды, которую ты надеваешь летом когда тепло")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец.")
//        goto(Rus)
//    }
//}
//
//var Kitchen: State = state(Parent) {
//    onEntry {
//        furhat.say("А теперь найди картинки, тех предметов, которые есть у тебя на кухне")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец.")
//        goto(Rus)
//    }
//}
//
//var Create: State = state(Parent) {
//    onEntry {
//        furhat.say("Попробуй теперь сам составить предложения из картинок")
//    }
//
//    onButton("Завершить") {
//        furhat.gesture(Gestures.Smile)
//        furhat.say("Молодец. У тебя хорошо получается")
//        goto(Rus)
//    }
//}