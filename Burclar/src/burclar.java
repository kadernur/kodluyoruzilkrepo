import java.util.Scanner;

public class burclar {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int month, date;
	        boolean isError = false;

	        System.out.println("Ay: ");
	        month = input.nextInt();

	        System.out.println("Gün: ");
	        date = input.nextInt();


	        if (month == 1) {
	            if ((date > 0) && (date < 32)) {
	                if (date < 22) {
	                    System.out.print("oglak");
	                } else {
	                    System.out.print("kova");
	                }

	            } else {
	                isError = true;
	            }
	        } else if (month == 2) {
	            if ((date > 0) && (date < 28)) {
	                if (date < 20) {
	                    System.out.print("kova");
	                } else {
	                    System.out.print("balık");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 3) {
	            if ((date > 0) && (date < 31)) {
	                if (date < 21) {
	                    System.out.print("balık");
	                } else {
	                    System.out.print("koç");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 4) {
	            if ((date > 0) && (date < 30)) {
	                if (date < 21) {
	                    System.out.print("koç");
	                } else {
	                    System.out.print("boga ");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 5) {
	            if ((date > 0) && (date < 31)) {
	                if (date < 22) {
	                    System.out.print("boga");
	                } else {
	                    System.out.print("ikizler");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 6) {
	            if ((date > 0) && (date < 30)) {
	                if (date < 23) {
	                    System.out.print("ikizler");
	                } else {
	                    System.out.print("yengec");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 7) {
	            if ((date > 0) && (date < 31)) {
	                if (date < 23) {
	                    System.out.print("yengec");
	                } else {
	                    System.out.print("aslan");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 8) {
	            if ((date > 0) && (date < 30)) {
	                if (date < 23) {
	                    System.out.print("aslan");
	                } else {
	                    System.out.print("basak");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 9) {
	            if ((date > 0) && (date < 31)) {
	                if (date < 23) {
	                    System.out.print("basak");
	                } else {
	                    System.out.print("terazi");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 10) {
	            if ((date > 0) && (date < 30)) {
	                if (date < 23) {
	                    System.out.print("terazi");
	                } else {
	                    System.out.print("akrep");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 11) {
	            if ((date > 0) && (date < 31)) {
	                if (date < 22) {
	                    System.out.print("akrep");
	                } else {
	                    System.out.print("yay");
	                }
	            } else {
	                isError = true;
	            }
	        } else if (month == 12) {
	            if ((date > 0) && (date < 30)) {
	                if (date < 23) {
	                    System.out.print("yay");
	                } else {
	                    System.out.print("oglak");
	                }
	            }}
	            if (isError) {
	                System.out.print("Hatalı giriş");
	            } else {
	                System.out.println("");
	            }

	}

}
