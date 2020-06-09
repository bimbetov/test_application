package com.example.beibarys.myapplication.repository

import com.example.beibarys.myapplication.model.Mosque

class FakeMosqueRepository : MosqueRepository {

    private val sheikhZayedMosque = listOf(
        "https://cdn.fishki.net/upload/post/201511/01/1720956/14_1.jpg",
        "https://puteshestvovat.com/wp-content/uploads/2018/10/sheik-zayed-grand-mosque-696x430.jpg",
        "https://cs12.pikabu.ru/post_img/big/2019/09/26/4/1569476013117426254.jpg"
    )
    private val imamsMosqueInIsfahan = listOf(
        "https://img11.postila.ru/data/62/8c/52/63/628c52632a3bcbc703e4b8b65c3c5b895094e93073a1324814d346cf512a36a9.jpg",
        "https://media-exp1.licdn.com/dms/image/C561BAQH4dBu758A1XA/company-background_10000/0?e=2159024400&v=beta&t=cMOmFLoxPn05KRMH7lwakDXO48JcBgCg0MraWWzK50w",
        "https://varlamov.me/img/imammos/01.jpg"
    )
    private val zahirMosque = listOf(
        "https://avatars.mds.yandex.net/get-altay/1632633/2a00000169d6017d9ba3c7da2540f707c379/XXL",
        "https://www.orangesmile.com/extreme/img/main/masjid-zahir_2.jpg",
        "https://avatars.mds.yandex.net/get-pdb/805781/994f7064-d1ec-49a9-a913-3a2256c09eb4/s1200"
    )
    private val theGreatMosqueOfHassan2 = listOf(
        "https://wikipoints.ru/photos/middle/997_e3e0f.jpg",
        "https://lh3.googleusercontent.com/proxy/unp-GJCJob33bvZ6LA2Zc0K0liM9i-Gc_EElI609AApnPyxcfc5U7FTma1cHiSHftmZj1kJs1Bz1lrG7eKfKU-60j9APJPF711UaB8EnmA",
        "https://s3.nat-geo.ru/images/2019/5/17/81656df308dc4dc7bb8b49c198e280e1.max-2500x1500.jpg"
    )
    private val sultanOmarAliSayfuddinMosque = listOf(
        "https://ic.pics.livejournal.com/gpsplace/79300090/5868/5868_original.jpg",
        "https://www.yana.kiev.ua/img/countries/big/16/578911536.jpg",
        "https://www.sunhome.ru/i/wallpapers/165/mechet-sultana-omara-ali-saifuddina-brunei.xxl.jpg"
    )

    private val istanbulBlueMosque= listOf(
        "https://upload.wikimedia.org/wikipedia/commons/3/35/Sultan_Ahmed_Mosque%2C_Istambul.jpg",
        "https://theplanetsworld.com/travel-tips1/blue-mosque-of-istanbul-and-tips-for-entry-3.jpg",
        "https://geographyofrussia.com/wp-content/uploads/2010/08/blue-mosque-istanbul-turkey.jpg"
    )

    override fun getMosque(): List<Mosque> {
        return ArrayList<Mosque>().apply {
            add(Mosque("Мечеть шейха Зайда", descriptionFor1Mosque, sheikhZayedMosque))
            add(Mosque("Мечеть Имама в Исфахане", descriptionFor2Mosque, imamsMosqueInIsfahan))
            add(Mosque("Мечеть Захир", descriptionFor3Mosque, zahirMosque))
            add(Mosque("Великая мечеть Хасана II", descriptionFor4Mosque, theGreatMosqueOfHassan2))
            add(Mosque("Мечеть Султана Омара Али Сайфуддина", descriptionFor5Mosque, sultanOmarAliSayfuddinMosque))
            add(Mosque("Голубая мечеть Стамбула", descriptionFor6Mosque, istanbulBlueMosque))
        }
    }

    companion object{
        const val descriptionFor1Mosque: String = "Это одна из шести самых больших мечетей в мире. Ее назвали в честь шейха Зайда ибн Султана ан-Нахайяна – основателя и первого президента Объединенных Арабских Эмиратов."
        const val descriptionFor2Mosque: String = "До революции 1979 года мечеть XVII века называли Шахской. Ее внутренним и внешним убранством занимался художник Реза Аббаси, служивший при дворе шаха Аббаса I. Для облицовки стен он использовал многоцветные глазурованные плитки, расписанные в технике хафт-ранги, что в переводе с персидского означает “семь цветов” или “небесная радуга”."
        const val descriptionFor3Mosque: String = "Мечеть возвели в 1912 году на месте захоронения воинов Кедаха, погибших в боях с захватчиками из Сиама в 1821 году. Ее главной архитектурной особенностью являются пять черных куполов, которые символизируют основные принципы ислама. Каждый год здесь проводят фестиваль чтецов Корана, который посещают гости со всего мира."
        const val descriptionFor4Mosque: String = "Эта мечеть построена в 1993 году. У нее самый высокий в мире минарет, 210 метров. Это выше, чем, например, пирамида Хеопса. По проекту французского архитектора Мишеля Пинсо на минарете установили лазер, свет от которого направлен на Мекку."
        const val descriptionFor5Mosque: String = "Здание мечети построили в 1958 году в искусственной лагуне на берегу реки Бруней. Это отличный пример современной исламской архитектуры, в которой восточные традиции сочетаются с европейскими. Так, например, главный минарет сделан в духе итальянского Ренессанса, что для мечетей большая редкость."
        const val descriptionFor6Mosque: String = "Первая по значению мечеть Стамбула. Насчитывает шесть минаретов: четыре, как обычно, по сторонам, а два чуть менее высоких — на внешних углах. Считается выдающимся образцом исламской и мировой архитектуры. Мечеть расположена на берегу Мраморного моря, в историческом центре Стамбула в районе Султанахмет, напротив музея Ая-София. Мечеть является одним из символов города."
    }
}