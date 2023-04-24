/*Öğrenci Not Sistemi
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()



Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

*/
public class Main {

	public static void main(String[] args) {
		
		//Course sınıfına ait nesneler
		Course mat= new Course("Matematik", "MAT101", "MAT");
		Course fizik= new Course("Fizik","FZK101","FZK");
		Course kimya=new Course("Kimya", "KMY101","KMY");
		
		
		//Teacher sınıfına ait nesneler
		
		Teacher t1=new Teacher("Mahmut Hoca", "90550000001","FZK");
		Teacher t2=new Teacher("Fatma ayşe","90550000002","KMY");
		Teacher t3= new Teacher("Ali Veli","90550000002","KMY");
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		 Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
		 s1.addBulkExamNote (100, 80, 50);
	     s1.addBulkQuizNote (90, 70, 80);
	     s1.NoteAverage(100, 80, 50, 90, 70, 80);
	     s1.isPass = s1.isPass();

	     Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
	     s2.addBulkExamNote(50,30,70);
	     s2.addBulkQuizNote(70, 50, 80);
	     s2.NoteAverage(50,30,70,70, 50, 80);
	     s2.isPass();

	     Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
	     s3.addBulkExamNote(50,20,40);
	     s3.addBulkQuizNote(20,10,30);
	     s3.NoteAverage(50,20,40,20, 10, 30);
	     s3.isPass();
		
		
		
	}

}
