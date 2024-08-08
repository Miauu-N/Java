package Basics;
public class meses {
    public static void main(String[] args) {
        int mes = 3;
        String mesL;

        switch (mes) {
            case 1:
                mesL = "Enero";
                break;
            case 2:
                mesL = "Febrero";
                break;
            case 3:
                mesL = "Marzo";
                break;
            case 4:
                mesL = "Abril";
                break;
            case 5:
                mesL = "Mayo";
                break;
            case 6:
                mesL = "Junio";
                break;
            case 7:
                mesL = "Julio";
                break;
            case 8:
                mesL = "Agosto";
                break;
            case 9:
                mesL = "Septiembre";
                break;
            case 10:
                mesL = "Octubre";
                break;
            case 11:
                mesL = "Noviembre";
                break;
            case 12:
                mesL = "Diciembre";
                break;
            default:
                mesL = "Mes incorrecto";
                break;
        }

        System.out.println("El mes ingresado es: " + mesL);
    }
}
