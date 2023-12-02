@qd
  Feature: Basarili login olunmali
    Scenario Outline: Kullanici olarak basariyla login olabilmemeliyim


      * Kullanici Browser Driver Kurulumlarini gerceklestiriri
      * Kullanici qualiytdemy sayfasina gider
      * Kullanici Cookiesöeri kabul eder
      * Login e tiklayarak login sayfasina ulastigini dogrular
      * yanlis degerler "<mail>" "<sifre>" girer ve hatali login oldugunu test eder

      Examples:
      | mail  | |  sifre |
      |  yanlisMail | | yanlisSifre  |
      |  yanlisMail1 | |  yanlisSifre1 |
      | yanlisMail2  | | yanlisSifre2  |









