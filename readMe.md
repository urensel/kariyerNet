Java kullanılmasının nedeni, kurumun java-selenium ile ilerlemek istediğini bildirmesidir.

Otomasyon mimarisinde POM kullanılmasının nedeniyse WebElementlerde yapılacak değişikliklerin en kısa sürede otomasyona entegre edilmesinin sağlanmasıdır.

Locator' altında WebElement'lerin yer aldığı "SignUpElements" ve kontrol için kullanılacak ya da kullanıcı tarafından set edilecek dataların yer aldığı "SignUpDatas" yer almaktadır.

TestCaseFunc altında ise fonksiyonların tanımlandığı "SignUpFunc" class'ı bulunmaktadır.
Fonksiyonlar tanımlanırken 2 farklı yapıda tanımlanılarak istenilen tipin kullanılması hedeflenmiştir.

    1) Testler yazılırken fonksiyona gönderilecek değişkenler ile tek fonksiyon, birden çok işlem yapılabilir
    2) Değişkenler fonksiyon içerisine tanımlanarak her işlem için ayrı fonksiyon kullanılabilir.

