package furhatos.app.skill.flow.main

import furhatos.app.skill.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.PollyVoice
import furhatos.gestures.Gestures
import furhatos.util.Language

val KAZ: State = state(Parent) {

    onEntry {
        furhat.voice = PollyVoice.Tatyana()
        furhat.character = "Rena"
        furhat.attend(users.random)
        furhat.setInputLanguage(Language.KAZAKH)
    }

    onButton("Бастау") {
        furhat.say("Сәлем. Бүгін біз әріптер арқылы оқуды үйренеміз.")
        furhat.say("Қазақ тілінде 42 әріп бар. Оның ішінде 14 дауысты, 27 дауыссыз және дауыстыға да, дауыссызға жататын \"У\" әріптер бар.")
        furhat.say("Ал енді біз оқуды үйренуді бастайық.")
    }

    onButton("дауысты: а, е, о. дауыссыз: м"){
        goto(First)
    }

    onButton("Па, По, Пе") {
        goto(Second)
    }

    onButton("Ра. Ро. Ре") {
        goto(Third)
    }

    onButton("Са. Со. Се") {
        goto(Fourth)
    }

    onButton("Ба. Бо. Бе. Бә") {
        goto(Fifth)
    }

    onButton("Ва. Во. Ве. Вә") {
        goto(Sixth)
    }
    onButton("Га. Го. Ге. Гә. Гё") {
        goto(Seventh)
    }
    onButton("Ға. Ғо. Ғе. Ғә. Ғё") {
        goto(Eighth)
    }
    onButton("Да. До. Де. Дә. Дё. Ди") {
        goto(Nineth)
    }
    onButton("Жа. Жо. Же. Жә. Жё. Жи") {
        goto(Tenth)
    }
    onButton("За. Зо. Зе. Зә. Зё. Зи") {
        goto(Eleven)
    }
    onButton("Ка. Ко. Ке. Кә. Кё. Ки") {
        goto(Twelve)
    }
    onButton("Қа. Қо. Қе. Қә. Қё. Қи. Қу") {
        goto(Thirteen)
    }
    onButton("Ла. Ло. Ле. Лә. Лё. Ли. Лу") {
        goto(Fourteen)
    }
    onButton("Ма. Мо. Ме. Мә. Мё. Ми. Му") {
        goto(Fifteen)
    }
    onButton("На. Но. Не. Нә. Нё. Ни. Ну. Нө") {
        goto(Sixteen)
    }
    onButton("Тә. Тә. Ти. Ту.") {
        goto(Seventeen)
    }
    onButton("Фа. Фо. Фу.") {
        goto(Eighteen)
    }
    onButton("Тү. Бү. Кү") {
        goto(Nineteen)
    }
    onButton("Тұ. Бұ. Құ.") {
        goto(Twenty)
    }
    onButton("Ша. Шо. Шу. Шы.") {
        goto(TwentyOne)
    }
    onButton("Бі. Кі. Ші") {
        goto(TwentyTwo)
    }
    onButton("Сөздер 1") {
        goto(TwentyThree)
    }
    onButton("Сөздер ә") {
        goto(TwentyFour)
    }
}

var First: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Алдымен үш дауысты әріптен бастайық. Олар - А, О. И және де Е")
        furhat.say("Қайтала: А. О. Е.")
        furhat.say("Және дауыссыз әріп - М.")
        furhat.say("М және А - МА. М және О - Мо. М және Е - МЕ.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: МА. МО. МЕ")
    }

    onButton("Ә әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. МӘ")
    }

    onButton("Ё әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мё")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Ми")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Му")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: МА. МО. Ме. Мя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Second: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа дауыссыз дыбысты үйренейік. Ол - П")
        furhat.say("Қайтала: П.")
        furhat.say("П және А - Па. П және О - По. П және Е - Пе.")
        furhat.say("Қайтала: Па. По. Пе")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Па. По. Пе")
    }

    onButton("Ә әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пә")
    }

    onButton("Ё әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пё")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пи")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пу")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Ме. Мы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Па. По. Пе. Пя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Third: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа дауыссыз дыбысты үйренейік. Ол - Р")
        furhat.say("Қайтала: Р.")
        furhat.say("Р және А - Ра. Р және О - Ро. Р және Е - Ре.")
        furhat.say("Қайтала: Ра. Ро. Ре")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре")
    }

    onButton("Ә әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рә")
    }

    onButton("Ё әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рё")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Ри")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Ру")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Ры")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Рю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ра. Ро. Ре. Ря")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Fourth: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа дауыссыз дыбысты үйренейік. Ол - С")
        furhat.say("Қайтала: С.")
        furhat.say("С және А - Са. С және О - Со. С және Е - Се.")
        furhat.say("Қайтала: Са. Со. Се")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Са. Со. Се")
    }

    onButton("Ә әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сә")
    }

    onButton("Ё әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сё")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Си")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Су")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Сю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Са. Со. Се. Ся")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Fifth: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Б.")
        furhat.say("Қайтала. Б")
        furhat.say("Б және А - Ба. Б және О - Бо. Б және Е - Бе.")
        furhat.say("Қайтала: Ба. Бо. Бе.")
    }

    onButton("Ә-ні қосу") {
        furhat.say("Тағы бір дауысты дыбысты үйренейік. Ол - Ә")
        furhat.say("Қайтала. Ә")
        furhat.say("Б және Ә - БӘ.")
        furhat.say("Бәрін қайтала: Ба. Бо. Бе. Бә")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә")
    }

    onButton("Ё әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бё")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Би")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бу")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ба. Бо. Бе. Бә. Бя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Sixth: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Енді тағы бір дауыссыз дыбысты үйренейік. Ол - В")
        furhat.say("Қайтала: В.")
        furhat.say("В және А - Ва. В және О - Во. В және Е - Ве. В және Ә - Вә")
        furhat.say("Қайтала: Ва. Во. Ве. Вә")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә")
    }

    onButton("Ё әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вё")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Ви")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Ву")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Ві")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ва. Во. Ве. Вә. Вя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Seventh: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Г.")
        furhat.say("Қайтала. Г")
        furhat.say("Г және А - Га. Г және О - Го. Г және Е - Ге. Г және Ә - Гә")
        furhat.say("Қайтала: Га. Го. Ге. Гә")
    }

    onButton("Ё-ні қосу") {
        furhat.say("Тағы бір дауысты дыбысты үйренейік. Ол - Ё")
        furhat.say("Қайтала. Ё")
        furhat.say("Г және Ё - Гё")
        furhat.say("Бәрін қайтала: Га. Го. Ге. Гә. Гё.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё.")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Ги")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гу")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Га. Го. Ге. Гә. Гё. Гя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Eighth: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Ғ.")
        furhat.say("Қайтала. Г")
        furhat.say("Ғ және А - Ға. Ғ және О - Ғо. Ғ және Е - Ғе. Ғ және Ә - Ғә. Ғ және Ё - Ғё")
        furhat.say("Қайтала: Ға. Ғо. Ғе. Ғә. Ғё.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё.")
    }

    onButton("И әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғи")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғу")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ға. Ғо. Ғе. Ғә. Ғё. Ғя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Nineth: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Д.")
        furhat.say("Қайтала. Д")
        furhat.say("Д және А - Да. Д және О - До. Г және Е - Де. Д және Ә - Дә. Д және Ё - Дё")
        furhat.say("Қайтала: Да. До. Де. Дә. Дё")
    }

    onButton("И-ді қосу") {
        furhat.say("Тағы бір дауысты дыбысты үйренейік. Ол - И")
        furhat.say("Қайтала. И")
        furhat.say("Д және И - Ди")
        furhat.say("Бәрін қайтала: Да. До. Де. Дә. Дё. Ди.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди.")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Ду")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Дү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Дұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Дө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Ды")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Ді")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Дэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Дю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Да. До. Де. Дә. Дё. Ди. Дя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Tenth: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Ж.")
        furhat.say("Қайтала. Ж")
        furhat.say("Ж және А - Жа. Ж және О - Жо. Ж және Е - Же. Ж және Ә - Жә. Ж және Ё - Жё. Ж және И - Жи.")
        furhat.say("Қайтала: Жа. Жо. Же. Жә. Жё. Жи.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи.")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жу")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Жа. Жо. Же. Жә. Жё. Жи. Жя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Eleven: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - З.")
        furhat.say("Қайтала. З")
        furhat.say("З және А - За. З және О - Зо. З және Е - Зе. З және Ә - Зә. З және Ё - Зё. З және И - Зи.")
        furhat.say("Қайтала: За. Зо. Зе. Зә. Зё. Зи.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи.")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зу")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: За. Зо. Зе. Зә. Зё. Зи. Зя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Twelve: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - К.")
        furhat.say("Қайтала. К")
        furhat.say("К және А - Ка. К және О - Ко. К және Е - Ке. К және Ә - Кә. К және Ё - Кё. К және И - Ки.")
        furhat.say("Қайтала: Ка. Ко. Ке. Кә. Кё. Ки.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки.")
    }

    onButton("У әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Ку")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ка. Ко. Ке. Кә. Кё. Ки. Кя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Thirteen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Қ.")
        furhat.say("Қайтала. Қ")
        furhat.say("Қ және А - Қа. Қ және О - Қо. Қ және Е - Қе. Қ және Ә - Қә. Қ және Ё - Қё. Қ және И - Қи.")
        furhat.say("Қайтала: Қа. Қо. Қе. Қә. Қё. Қи.")
    }

    onButton("У-ды қосу") {
        furhat.say("Тағы бір дауысты дыбысты үйренейік. Ол - У")
        furhat.say("Қайтала. У")
        furhat.say("Қ және У - Қу")
        furhat.say("Бәрін қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу.")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Құ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Қа. Қо. Қе. Қә. Қё. Қи. Қу. Қя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Fourteen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Л.")
        furhat.say("Қайтала. Л")
        furhat.say("Л және А - Ла. Л және О - Ло. Л және Е - Ле. Л және Ә - Лә. Л және Ё - Лё. Л және И - Ли. Л және У - Лу")
        furhat.say("Қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу.")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Лю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ла. Ло. Ле. Лә. Лё. Ли. Лу. Ля")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Fifteen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - М.")
        furhat.say("Қайтала. М")
        furhat.say("М және А - Ма. М және О - Мо. М және Е - Ме. М және Ә - Мә. М және Ё - Мё. М және И - Ми. М және У - Му")
        furhat.say("Қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му.")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мұ")
    }

    onButton("Ө әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мө")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мы")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мі")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мю")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: Ма. Мо. Ме. Мә. Мё. Ми. Му. Мя")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Sixteen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Н.")
        furhat.say("Қайтала. Н")
        furhat.say("Н және А - На. Н және О - Но. Н және Е - Не. Н және Ә - Нә. Н және Ё - Нё. Н және И - Ни. Н және У - Ну")
        furhat.say("Қайтала: На. Но. Не. Нә. Нё. Ни. Ну.")
    }

    onButton("Ө-ды қосу") {
        furhat.say("Тағы бір дауысты дыбысты үйренейік. Ол - Ө")
        furhat.say("Қайтала. Ө")
        furhat.say("Н және Ө - Нө")
        furhat.say("Бәрін қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө.")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Нү")
    }

    onButton("Ұ әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Нұ")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Ны")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Ні")
    }

    onButton("Э әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Нэ")
    }

    onButton("Ю әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Ню")
    }

    onButton("Я әріпімен") {
        furhat.say("Менмен бірге қайтала: На. Но. Не. Нә. Нё. Ни. Ну. Нө. Ня")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Seventeen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Т.")
        furhat.say("Қайтала. Т")
        furhat.say("Т және Е - Те. Т және Ә - Тә. Т және И - Ти. Т және У - Ту")
        furhat.say("Қайтала: Тә. Тә. Ти. Ту.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Те. Тә. Ти. Ту.")
    }

    onButton("Ү әріпімен") {
        furhat.say("Менмен бірге қайтала: Те. Тә. Ти. Ту. Тү")
    }

    onButton("Ы әріпімен") {
        furhat.say("Менмен бірге қайтала: Тә. Ти. Ту. Ты")
    }

    onButton("І әріпімен") {
        furhat.say("Менмен бірге қайтала: Тә. Ти. Ту. Ті")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Eighteen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Ф.")
        furhat.say("Қайтала. Ф")
        furhat.say("Ф және А - Фа. Ф және о - Фо. Ф және У - Фу")
        furhat.say("Қайтала: Фа. Фо. Фу.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Фа. Фо. Фу.")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Nineteen: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауысты дыбысты үйренейік. Ол - Ү.")
        furhat.say("Қайтала. Ү")
        furhat.say("Осы дауыссыз дыбыстырды еске түсірейік: Т. Б. К. Ал енді сен қайтала.")
        furhat.say("Т және Ү - Тү. Б және Ү - Бү. К және Ү - Кү")
        furhat.say("Қайтала: Тү. Бү. Кү.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Тү. Бү. Кү.")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var Twenty: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауысты дыбысты үйренейік. Ол - Ұ.")
        furhat.say("Қайтала. Ұ")
        furhat.say("Осы дауыссыз дыбыстырды еске түсірейік: Т. Б. Қ. Ал енді сен қайтала.")
        furhat.say("Т және Ұ - ТҰ. Б және Ұ - Бү. Қ және Ұ - Құ")
        furhat.say("Қайтала: Тұ. Бұ. Құ.")
    }


    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Тұ. Бұ. Құ.")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var TwentyOne: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауыссыз дыбысты үйренейік. Ол - Ш.")
        furhat.say("Қайтала. Ш")
        furhat.say("Ш және А - Ша. Ш және О - Шо. Ш және У - Шу")
        furhat.say("Қайтала: Ша. Шо. Шу")
    }

    onButton("Ы әріпін қосу") {
        furhat.say("Ад енді Ы әріпін үйренейік")
        furhat.say("Қайтала. Ы")
        furhat.say("Ш және Ы - Шы")
        furhat.say("Қайтала: Ша. Шо. Шу. Шы.")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ша. Шо. Шу. Шы.")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var TwentyTwo: State = state(Parent) {
    onButton("Бастау") {
        furhat.say("Ал енді жаңа бір дауысты дыбысты үйренейік. Ол - І.")
        furhat.say("Қайтала. І")
        furhat.say("Б және І - Бі. К және І - Кі. Ш және І - Ші.")
        furhat.say("Қайтала: Бі. Кі. Ші")
    }

    onButton("Қайталау") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Бі. Кі. Ші.")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var TwentyThree: State = state(Parent) {
    onEntry {
        furhat.say("Ал енді қысқа сөздерді үйренейік.")
    }
    onButton("Мама - Папа") {
        furhat.say("Еске түсірейік. М және А - Ма. П және А - Па")
        furhat.say("Менімен қайтала: Ма-ма. Па-па")
        furhat.say("Тағы да: Ма-ма. Па-па.")
    }
    onButton("Әке, Ана үйрену") {
        furhat.say("Тағы сөздерді үйренейік.")
        furhat.say("К және Е - ол Ке. Оған Ә қоссақ не болады?")
        furhat.say("Ә-ке. Қайталайық. Ә-ке.")
        furhat.say("Н және А - ол На. Алдынан А қосайық. А-на.")
        furhat.say("Тағы да. А-на.")
    }

    onButton("Қайталау, мама - папа") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ма-ма. Па-па")
    }

    onButton("Қайталау, Әке - Ана") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ә-ке. А-на")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}

var TwentyFour: State = state(Parent) {
    onEntry {
        furhat.say("Қысқа сөздерді үйренейік.")
    }
    onButton("Тәте - Аға") {
        furhat.say("Т және А - Та. Т және Е - Те.")
        furhat.say("Та және Те - Тәте. Қайталайық - Тәте")
        furhat.say("Ғ және А - Ға")
        furhat.say("А және Ға. Аға. Қайталайық. Аға")
        furhat.say("Тағы да: Тәте. Тәте. Аға. Аға")
    }
    onButton("Дала - Бала") {
        furhat.say("Тағы сөздерді үйренейік.")
        furhat.say("Б және А - ол Ба. Ба.")
        furhat.say("Л және А - Ла. Ла")
        furhat.say("Ба және Ла - Бала. Тағы да: Бала.")
        furhat.say("Д және А - Да. Да")
        furhat.say("Да және Ла - ол Дала. Дала")
        furhat.say("Тағы да. Дала.")
    }

    onButton("Қайталау, Тәте - Аға") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Тә-те. Аға")
    }

    onButton("Қайталау, Бала - Дала") {
        furhat.say("Қайталайық")
        furhat.say("Менмен бірге қайтала: Ба-ла. Да-ла")
    }

    onButton("Шығу") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Жарайсын")
        goto(KAZ)
    }
}



