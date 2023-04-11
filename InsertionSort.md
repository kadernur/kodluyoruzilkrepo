 # Proje 1
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.
.


## ÇÖZÜM
insertion sort'ta dizideki en küçük eleman alınarak baştan başlayarak kıyaslama yapılarak sıralama işlemi
gerçekleştirilir.

**1.adım**

2 sayısını ele alalım. 2 22'den küçük olduğu için yer değiştirme işlemi gerçekleştirilir. [2,27,16,22,18,6] elde edilir.

**2.adım**

Diğer küçük sayı olan 6 sayısı ele alınır. 2.eleman 27 ile yer değiştirilir. [2,6,16,22,18,27] sıralaması elde edilir.

**3.adım**

Daha sonra diğer sayı olan 16'ya bakılır ama yer olarak doğru konumdadır.

**4.adım**

Bir diğer aşamada 18 sayısına bakılır. 22 ile yer değiştirir. [2,6,16,18,22,27] sıralaması elde edilir.

**5.adım**

22 sayısına bakılır ama konum olarak doğru yerdedir. 

**6.adım**

27 sayısı da konum olarak doğrudur.

**7.adım**

Sıralamanın en son hali şu şekildedir: [2,6,16,18,22,27]

Big-o gösterimi ise o(n^2)'dir. 18 sayısı ortada olduğundan Average Case kapsamına girmektedir.

# Problem

**[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.**

**1.adım**

En küçük sayı 2 seçilir ve 7 sayısında küçük olduğundan 7 ile yer değiştirilir.[2,3,5,8,7,9,4,15,6] elde edilir.

**2.adım**
Diğer en küçük sayı olan 3 seçilir. Konumu doğru olduğundan dolayı diğer en küçük sayıya geçilir.

**3.adım**

Diğer küçük sayı 4 seçilir. 5 ile yer değiştirir.
[2,3,4,8,7,9,5,15,6]

**4.adım**
Diğer küçük sayı olan 5 seçilir. 8 sayısı ile yer değiştirir.
[2,3,4,5,7,9,8,15,6] İlk dört adımı bu şekildedir.



