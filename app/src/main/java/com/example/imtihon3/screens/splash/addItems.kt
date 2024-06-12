package com.example.imtihon3.screens.splash

import android.content.Context
import com.example.imtihon3.database.AppDatabase
import com.example.imtihon3.database.Item

fun addItems(context: Context) {
    val items = listOf(
        Item(
            name = "Diffuziya",
            description = "Diffuziya (lotincha: diffusio — singish, tarqalish) — molekulalar, atomlar, ionlar va kolloid zarralarning tar-tibsiz issiklik harakati natijasida bir moddaning ikkinchi moddaga oʻz-oʻzidan oʻtishi, birining ikkinchisiga singib ketishi. Diffuziya gaz, suyuklik yoki qattiq jismlarda boʻladi va tezligi moddaning zichligi va qovushoqligi, temperatura, diffuziyalanuvchi zarraning tabiatiga va h. k.ga bogʻliq. Temperatura koʻtarilishi bilan Diffuziya tezlashadi. Bir aralashmali sistema (bir modda)dagi Diffuziya oʻz diffuziya, koʻp aralashmali sistema (gaz, suyuq yoki qattiq eritmalar)dagi Diffuziya geterodiffuziya deyiladi. Fan va texnika sohalarida Diffuziya ning ahamiyati katta; kimyoda Diffuziya usuli erigan moddaning molekulyar ogʻirligini aniqlashda qoʻllaniladi. Biologiyada oziq moddalarning soʻrilishi va yutilishi hamda moddalar almashinuv mahsulotlarining chiqib ketishida Diffuziya ning ahamiyati bor. ",
            image = "https://ifazo.uz/wp-content/uploads/2023/12/photo_2023-12-31_12-14-07.jpg"
        ),
        Item(
            name = "Energiyaning saqlanish qonuni",
            description = "Energiyaning saqlanish qonuni fizikaning asosiy printsipi bo'lib, ajratilgan tizimning umumiy energiyasi vaqt o'tishi bilan doimiy bo'lib qoladi. Boshqacha qilib aytganda, energiyani yaratish yoki yo'q qilish mumkin emas; u faqat bir shakldan boshqasiga o'tkazilishi yoki o'zgartirilishi mumkin.\n" +
                    "\n" +
                    "Energiyaning saqlanish qonuni energiyaning kinetik energiya (harakat energiyasi), potentsial energiya (joylashuvga qarab saqlanadigan energiya), issiqlik energiyasi (issiqlik), kimyoviy energiya va boshqalar kabi turli shakllarga ega ekanligi haqidagi g'oyaga asoslanadi. Ushbu qonunga ko'ra, yopiq tizimdagi barcha energiya shakllarining yig'indisi tizim ichida sodir bo'ladigan jarayonlar yoki o'zaro ta'sirlardan qat'i nazar, doimiy bo'lib qoladi.",
            image = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Lightning_over_Oradea_Romania_zoom.jpg/800px-Lightning_over_Oradea_Romania_zoom.jpg"
        ),
        Item(
            name = "Butunolam tortishish qonuni",
            description = "Butun olam tortishish qonuni, Nyutonning tortishish qonuni — moddiy zarralarning oʻzaro tortishishi toʻgʻrisidagi qonun; tabiatning universal qonuni. Massalari m1 va m2 boʻlgan va bir-biridan r masofada turgan moddiy zarralarning oʻzaro tortishish kuchi ushbu formuladan topiladi: F=Gm1m2/r²; bunda: G — gravitatsion doimiy va G = 6.67*10^(-11) (N*m^2)/kg^2 = (1/1.5) * 10^(-10)(N*m^2/kg^2). Moddiy zarralar deganda oʻlchamlari shu zarralar orasidagi masofadan ancha kichik jismlar, ya’ni moddiy nuqtalar tushuniladi. Real jismlarning oʻzaro tortishish kuchini aniqlash (oʻlchamlari, shakllari va zichliklarini hisobga olgan holda) uchun shu jismlar shartli ravishda parchalanadigan alohida mayda zarralar juftlari orasidagi oʻzaro ta’sir kuchlarining geometrik yigʻindisini topish lozim. Demak, ikki shar orasidagi oʻzaro tortishish kuchini yuqoridagi formuladan topish mumkin ekan (buning uchun g sifatida sharlar markazi orasidagi masofani qabul qilish lozim).",
            image = "https://telegra.ph/file/3fbbb25b43d932b68515c.jpg"
        ),
        Item(
            name = "impulsning saqlanish qonuni",
            description = "N ta moddiy nuqtadan tashkil topgan sistemani qarab chiqaylik. Berilgan jismga\n" +
                    "sistemaning boshqa jismlari ko’rsatadigan ta’sir kuchini ichki kuchlar, sistemaga\n" +
                    "kirmagan jismlarning ta’sir kuchi esa tashqi kuchlar deyiladi.\n" +
                    "Agar tashqi kuchlar bo’lmasa, sistema yopiq sistema deyiladi. Sistemani tashkil\n" +
                    "etuvchi jismlar impulslarning yig’indisi, sistemaning impulsi deyiladi.\n",
            image = "https://i1.wp.com/physics.ru/courses/op25part1/content/chapter1/section/paragraph17/images/1-17-2.gif"
        ),
    )
    val dao = AppDatabase.getInstance(context).getBookDao()
    items.forEach {
        dao.insert(it)
    }
}