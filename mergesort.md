# Merge Sort Projesi

# Proje 2
**[16,21,11,8,12,22] -> Merge Sort**

**Yukarıdaki dizinin sort  göre aşamalarını yazınız.**
**Big-O gösterimini yazınız.**

İlk etapta diziyi eşit 2 parçaya bölmeliyiz. [16,21,11] ve [8,12,22] olarak iki parça elde ederiz.

Sonraki aşamada ise elemanlar tek kalacak sekilde tekrar bölmeliyiz.

1- **[16], [21], [11], [8], [12], [22]** bu adımdan sonra elemanların sıralanmasını gerçekleştiririz.

2- **[16], [11,21], [8,12], [22]** daha sonra sırayla sıralama işlemine devam ederiz.

3- **[11,16,21], [8,12,22]** bütün dizeyi sırala

4- **[8,11,12,16,21,22]** sıralama tamamlandı.

Big-O = O(nlogn)
