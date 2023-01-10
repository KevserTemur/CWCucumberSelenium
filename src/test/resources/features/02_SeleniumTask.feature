Feature: Google search test
  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuçlar görüntülenmelidir
    Given kullanıcı google sayfasındadır
    When kullanıcı samsung kelimesini arar
    Then kullanıcı sayfada samsung kelimesi geçtiğini doğrular
