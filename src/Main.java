import model.Doctor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Doctor doctor = new Doctor("Jose", new Date());
        System.out.println(doctor.getFullName());
        doctor.schedule(new Date(), "10 am");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        var formatF = format.parse(new Date().toString());

        ArrayList<Doctor> doctors= new ArrayList<>();
        doctors.add(new Doctor("Jose", new Date()));
        doctors.add(new Doctor("Carlos", new Date()));
        for (var d:doctors){
            System.out.println(d.getFullName());
        }
    }
}