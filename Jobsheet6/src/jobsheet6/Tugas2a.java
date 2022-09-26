/*
 created by 21343010-Natasya febriani
 */
package jobsheet6;
import javax.swing.JOptionPane;

public class Tugas2a {

	public static void main(String[] args) {
		String angka = " ";
        
        angka = JOptionPane.showInputDialog("Masukkan Angka ");
        int a = Integer.valueOf(angka).intValue();
        
        String hasil = " ";
        
        if((a>=1) && (a <= 10) ) {
        	System.out.println(hasil += "Valid number");
        }
        else {
        	System.out.println(hasil += "Invalid number");
        }
        JOptionPane.showMessageDialog(null, hasil);
	}

}
