# Proje 3
**[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.**

**Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.**

Bu dizide ilk önce 5 sayısını root alalım. 5'i root alalım. root'un sağında 7 solunda ise 4 bulunur.



                                   5
                                  / \
                                 4   7
                                /    / \
                               3     6  8
                              /          \
                             2            9
                            /
                           1
                          /
                         0 
                         
                         
  şeklinde ağaç oluşturulur.
  Farklı olarak 7'yi root olarak ele alırsak;
  5 solunda 8 ise sağında yer alır.
  
  
  
                                 7 
                               /   \
                              5     8
                             / \     \ 
                             1  6     9
                            / \
                            0  3
                              / \
                              2  4
