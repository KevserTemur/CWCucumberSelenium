Feature: Taglerin kullanımı

  @smoke
  Scenario: Smoke test senaryosu
    Given smoke test için hazırlıklar yapıldı
    When smoke test çalıştığında
    Then smoke test başarılı olmalı

    @regression
    Scenario: regression test senaryosu
      Given regression test için hazırlıklar yapıldı
      When regression test çalıştığında
      Then regression test başarılı olmalı