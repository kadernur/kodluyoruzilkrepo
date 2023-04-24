/*Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

*/
public class Student {

	String name,stuNo;
	int classes;
	Course mat; //c1
	Course fizik;
	Course kimya;
	double average;
	boolean isPass;
	
	
	
	
	Student(String name, int classes, String stuMo, Course mat, Course fizik, Course kimya)
	{
		this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;

        this.average = 0.0;
        this.isPass = false;
      
        
       
	}
	
	 public void addBulkExamNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }
	        
	      

	    }
	 
	 
	 
	 public void addBulkQuizNote(int extra1, int extra2, int extra3) {
	        if (extra1 >= 0 && extra1 <= 100) {
	            this.mat.extra = extra1;
	        }
	        if (extra2 >= 0 && extra2 <= 100) {
	            this.fizik.extra = extra2;
	        }
	        if (extra3 >= 0 && extra3 <= 100) {
	            this.kimya.extra = extra3;
	        }
	    }
	 

	  
	    public void NoteAverage(int note1, int note2, int note3, int extra1, int extra2, int extra3) {
	        this.mat.finale = ((note1 * 80)/100) + ((extra1 * 20)/100);
	        this.fizik.finale = ((note2 * 80)/100) + ((extra2 * 20)/100);
	        this.kimya.finale = ((note3 * 80)/100) + ((extra3 * 20)/100);
	    }

	   

	    public boolean isPass() {
	        System.out.println("====================================");
	        this.average = (mat.finale + fizik.finale + kimya.finale) / 3;
	        if (this.average >= 55) {

	            System.out.println("Sınıfı Geçti");
	            printNotes();
	            return true;
	        } else {

	            System.out.println("Sınıfta Kaldı");
	            printNotes();
	            return false;
	        }
	    }


	    void printNotes () {
	        System.out.println("Notlar");
	        System.out.println(mat.name + " Notu\t\t: " + "Sınav : " + this.mat.note + " (" + ((mat.note * 80) / 100) + ")"
	                + " - " + "Sözlü : " + this.mat.extra + " (" + ((mat.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.mat.finale);
	        System.out.println(fizik.name + " Notu\t\t: " + "Sınav : " + this.fizik.note + " (" + ((fizik.note * 80) / 100) + ")"
	                + " - " + "Sözlü : " + this.fizik.extra + " (" + ((fizik.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.fizik.finale);
	        System.out.println(kimya.name + " Notu\t: " + "Sınav : "   + this.kimya.note + " (" + ((kimya.note * 80) / 100) + ")"
	                + " - " + "Sözlü : " + this.kimya.extra + " (" + ((kimya.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.kimya.finale);
	        System.out.println("Ortalama\t\t: " + this.average);
	    }

	
	
}
