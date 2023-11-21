
@yukle
Feature: Kullanici Aile Butcem Profilininde ilgili degisiklikleri yapabilir.
    Scenario: Kullanici Aile Butcem Profilininde ilgili degisiklikleri yapabilir.

      Given Kullanici Driver Kurulumunu yapar ve "aileButcemAppPackage" "aileButcemAppActivity" ile teste konu uygulamaya yonlendirir.
      Given Ilk ekran ayarlarini yapar ve login sayfasina ulasir
      Then "aileButcemEmail" ve "aileButcemPassword" bilgilerini girerek giris yapar.
      And kullanicnin giris yapabildigini dogrulanir
      And Sol kisimdaki hesabim bolumune gidwer
      And Hesabim bolumundeki degisikileri degistirir ve kayit eder.
      And Degisikliklerin basariyla yapildigi dogrulanir

