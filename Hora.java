package entities;
import java.util.Scanner;


public class Hora {

    Scanner ler = new Scanner(System.in);
    
    private int hora;
    private int min;
    private int seg;

    public  Hora() {
        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    public void setHor(int h) {
        this.hora = h;
    }

    public void setMin(int m) {
        this.min = m;
    }

    public void setSeg(int s) {
        this.seg = s;
    }
    
    public void setHor() {
        do {
            
            System.out.print("Digite a(s) hora(s): ");
            hora = ler.nextInt();
        } while (hora >= 24 || hora < 0);
       
    }

    public void setMin() {
        do {
            System.out.print("Digite o(s) minuto(s): ");
            min = ler.nextInt();
        } while (min >= 60 || min < 0);

    }

    public void setSeg() {
        do {
            System.out.print("Digite o(s) segundo(s): ");
            seg = ler.nextInt();
        } while (seg >= 60 || seg < 0);

    }

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        String hr1 = (this.hora + ":" + this.min + ":" + this.seg);
        return hr1;
    }

    public String getHora2() {
        String hr;
        String periodo;
        int hr2;

        if (this.hora > 12) {
                     
            hr2 = this.hora - 12;
        } else {
            hr2 = this.hora;
        }
        if (hr2 < 10) {
            hr = "0" + hr2;
        } else {
            hr = "" + hr2;
        }

        if (this.hora < 12) {
            periodo = "AM";
        } else {

            periodo = "PM";
        }

        return hr + ":" + min + ":" + seg + "(" + periodo + ")";
        
    }

    public void getSegundos() {
        int calcularH = hora * 3600;
        int calcularM = min * 60;
        int calculoHorario = seg + calcularH + calcularM;
        System.out.println("Quantidade de segundos: " + calculoHorario);

    }

   public static void main(String[] args)
{
    Hora hora = new Hora ();
    hora.getHora1();
    hora.getHora2();
    System.out.println();
    System.out.println("Horario: "+hora.getHora1());
    System.out.println("Horario AM/PM: "+hora.getHora2());
    hora.getSegundos();
}
}

