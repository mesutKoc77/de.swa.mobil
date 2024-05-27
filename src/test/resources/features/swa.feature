
@mesut
Feature: Kullanici Aile Butcem Profilininde ilgili degisiklikleri yapabilir ve Gelir ekleyebilir.

  Background: Kullanici Basariyla Giris Yapar
    Given Kullanici Driver Kurulumunu yapar ve "swaAppPackage" "swaAppActivity" ile teste konu uygulamaya yonlendirir.
    Given Ilk ekran ayarlarini yapar ve login sayfasina ulasir
    Then Kullanici D_Ticket'i tiklar



    Then "aileButcemEmail" ve "aileButcemPassword" bilgilerini girerek giris yapar.
    And kullanicnin giris yapabildigini dogrulanir

  Scenario: Kullanici Aile Butcem Profilininde ilgili degisiklikleri yapabilir.
    And Sol kisimdaki "Hesabım" bolumune gidwer
    And Hesabim bolumundeki degisikileri degistirir ve kayit eder.
    And Degisikliklerin basariyla yapildigi dogrulanir
    * Kullanici uygulamayi kapatir

  Scenario: Kullanici basariyla "Gelir" Ekler
    //1.46

    * anasayfadaki arti butonuna tiklayin
    * gelir ekle bolumune tiklayin
    * aciklama,gelir tip, kategori, tarih ve tutari belirleyin ve kaydedin
    * basariyla eklendigini dogrulayin
    * Kullanici uygulamayi kapatir



