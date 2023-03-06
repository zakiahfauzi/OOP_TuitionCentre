/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// application team in UTP
public class Main
{
    // application code
	public static void main(String[] args) {
        Student mike = new Student();
        
        Name name = new Name();
        name.setFName("Michael");
        name.setMName("Learns to");
        name.setLName("Rok");
        mike.setName(name);

        Student adila = new Student();
        name = new Name();
        name.setFName("Adila");
        name.setMName("binti");
        name.setLName("Izzat");
        adila.setName(name);
        
        
        Student imran = new Student();
        Name imranName = new Name();
        imranName.setFName("Syed");
        imranName.setLName("Imran");
        imran.setName(imranName);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(mike);
        sb2023.add(adila, 0);       
        
        // declare a method that allows for the following:
        //boolean isIn = sb2023.find("Adlin");

        Teacher cikguminah = new Teacher();
        mike.setName(name);
        
        for (int i=0; i<5; i++) {
            try {
                mike.setMark(100, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        // calculate and print the avg
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Avg = " + avg);
        
        // calculate the min marks for mike
        System.out.println("Min = " + mike.calcMin());        
	}
}
